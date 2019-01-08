package ua.devilsega.insurancecustomerapp.osago.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.devilsega.insurancecustomerapp.osago.model.dto.Coefficient;
import ua.devilsega.insurancecustomerapp.osago.service.interfaces.CoefficientSearch;

import java.util.Map;

/**
 * Osago coefficients REST controller
 *
 * @author devilsega
*/
@RestController
@RequestMapping (value = "/api/public/quote/osago/v1")
public class CoefficientRestController {

    CoefficientSearch coefficientsService;

    @Autowired
    public CoefficientRestController(CoefficientSearch coefficientsService) {
        this.coefficientsService = coefficientsService;
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/coefficient/{id}", "/coefficient/{id}/"})
    public ResponseEntity<Coefficient> getCoefficient(
            @PathVariable(value = "id") String id,
            @RequestParam Map<String, String> parameters) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(coefficientsService.getCoefficient(id, parameters));
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}

package ua.devilsega.insurancecustomerapp.osago.service.impl;

import org.springframework.stereotype.Service;
import ua.devilsega.insurancecustomerapp.osago.model.dto.Coefficient;
import ua.devilsega.insurancecustomerapp.osago.service.interfaces.CoefficientSearch;

import java.util.Map;

/**
 * Coefficients service to search and validate OSAGO coefficients for quoting
 *
 * @author devilsega
*/
@Service
public class CoefficientsService implements CoefficientSearch {
    @Override
    public Coefficient getCoefficient(String kId, Map<String, String> paramsMap) throws IllegalArgumentException {
        return null;        //TODO
    }
}

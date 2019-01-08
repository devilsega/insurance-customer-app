package ua.devilsega.insurancecustomerapp.osago.service.interfaces;

import ua.devilsega.insurancecustomerapp.osago.model.dto.Coefficient;

import java.util.Map;

/**
 * Coefficient search and validation service interface
 *
 * @author devilsega
*/

public interface CoefficientSearch {

    Coefficient getCoefficient(String kId, Map<String, String> paramsMap) throws IllegalArgumentException;
}

package ua.devilsega.insurancecustomerapp.osago.model.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Osago quote coefficient DTO objects list.
 * Used for data exchange.
 *
 * @author devilsega
 */
public class CoefficientList {

    private List<Coefficient> coefficientList;

    public CoefficientList() {
        coefficientList = new ArrayList<>();
    }

    public List<Coefficient> getCoefficientList() {
        return coefficientList;
    }

    public void setCoefficientList(List<Coefficient> coefficientList) {
        this.coefficientList = coefficientList;
    }
}

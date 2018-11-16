package ua.devilsega.insurancecustomerapp.osago.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * JPA model class of osago quote coefficient
 *
 * @author devilsega
*/
@Entity
@Table(name = "osago_coefficients")
public class Coefficient {

    @Id
    @NotNull
    @Size(min = 1,max=50)
    private String id;

    @NotNull
    @Size(min = 1,max=50)
    private String group;

    @NotNull
    private double value;

    @NotNull
    @Size(min = 1,max=500)
    private String description;

    @Size(min = 1,max=50)
    private String filterParam;

    @NotNull
    private int sortingWeight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coefficient that = (Coefficient) o;
        return Double.compare(that.value, value) == 0 &&
                sortingWeight == that.sortingWeight &&
                Objects.equals(id, that.id) &&
                Objects.equals(group, that.group) &&
                Objects.equals(description, that.description) &&
                Objects.equals(filterParam, that.filterParam);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, group, value, description, filterParam, sortingWeight);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilterParam() {
        return filterParam;
    }

    public void setFilterParam(String filterParam) {
        this.filterParam = filterParam;
    }

    public int getSortingWeight() {
        return sortingWeight;
    }

    public void setSortingWeight(int sortingWeight) {
        this.sortingWeight = sortingWeight;
    }
}
package ua.devilsega.insurancecustomerapp.osago.model.dto;

import java.util.Objects;

/**
 * Osago quote coefficient DTO object.
 * Used for data exchange.
 *
 * @author devilsega
 */
public class Coefficient {

    private String id;
    private String group;
    private String description;
    private int sortingWeight;

    public Coefficient() {}

    public Coefficient(String id, String group, String description, int sortingWeight) {
        this.id = id;
        this.group = group;
        this.description = description;
        this.sortingWeight = sortingWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coefficient that = (Coefficient) o;
        return Objects.equals(id, that.id)
                && Objects.equals(group, that.group)
                && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, group, description, sortingWeight);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSortingWeight() {
        return sortingWeight;
    }

    public void setSortingWeight(int sortingWeight) {
        this.sortingWeight = sortingWeight;
    }
}

package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBOtherProductType1  {

    private String Name;
    private String Description;

    public OBOtherProductType1 () {
    }

    @JsonProperty("Name")
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBOtherProductType1 OBOtherProductType1 = (OBOtherProductType1) o;

        return Objects.equals(Name, OBOtherProductType1.Name) &&
               Objects.equals(Description, OBOtherProductType1.Description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBOtherProductType1 {\n");
        sb.append("    Name: ").append(toIndentedString(Name)).append("\n");        sb.append("    Description: ").append(toIndentedString(Description)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

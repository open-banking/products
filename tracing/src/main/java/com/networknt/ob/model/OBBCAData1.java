package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBBCAData1  {

    private Object Overdraft;
    private Object ProductDetails;
    private Object CreditInterest;
    private java.util.List<Object> OtherFeesCharges;

    public OBBCAData1 () {
    }

    @JsonProperty("Overdraft")
    public Object getOverdraft() {
        return Overdraft;
    }

    public void setOverdraft(Object Overdraft) {
        this.Overdraft = Overdraft;
    }

    @JsonProperty("ProductDetails")
    public Object getProductDetails() {
        return ProductDetails;
    }

    public void setProductDetails(Object ProductDetails) {
        this.ProductDetails = ProductDetails;
    }

    @JsonProperty("CreditInterest")
    public Object getCreditInterest() {
        return CreditInterest;
    }

    public void setCreditInterest(Object CreditInterest) {
        this.CreditInterest = CreditInterest;
    }

    @JsonProperty("OtherFeesCharges")
    public java.util.List<Object> getOtherFeesCharges() {
        return OtherFeesCharges;
    }

    public void setOtherFeesCharges(java.util.List<Object> OtherFeesCharges) {
        this.OtherFeesCharges = OtherFeesCharges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBBCAData1 OBBCAData1 = (OBBCAData1) o;

        return Objects.equals(Overdraft, OBBCAData1.Overdraft) &&
               Objects.equals(ProductDetails, OBBCAData1.ProductDetails) &&
               Objects.equals(CreditInterest, OBBCAData1.CreditInterest) &&
               Objects.equals(OtherFeesCharges, OBBCAData1.OtherFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Overdraft, ProductDetails, CreditInterest, OtherFeesCharges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBCAData1 {\n");
        sb.append("    Overdraft: ").append(toIndentedString(Overdraft)).append("\n");        sb.append("    ProductDetails: ").append(toIndentedString(ProductDetails)).append("\n");        sb.append("    CreditInterest: ").append(toIndentedString(CreditInterest)).append("\n");        sb.append("    OtherFeesCharges: ").append(toIndentedString(OtherFeesCharges)).append("\n");
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

package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBProduct2  {

    private String SecondaryProductId;
    private String MarketingStateId;
    private OBOtherProductType1 OtherProductType;
    private OBBCAData1 BCA;
    private String AccountId;
    private String ProductName;
    private OBExternalProductType1Code ProductType;
    private String ProductId;
    private OBPCAData1 PCA;

    public OBProduct2 () {
    }

    @JsonProperty("SecondaryProductId")
    public String getSecondaryProductId() {
        return SecondaryProductId;
    }

    public void setSecondaryProductId(String SecondaryProductId) {
        this.SecondaryProductId = SecondaryProductId;
    }

    @JsonProperty("MarketingStateId")
    public String getMarketingStateId() {
        return MarketingStateId;
    }

    public void setMarketingStateId(String MarketingStateId) {
        this.MarketingStateId = MarketingStateId;
    }

    @JsonProperty("OtherProductType")
    public OBOtherProductType1 getOtherProductType() {
        return OtherProductType;
    }

    public void setOtherProductType(OBOtherProductType1 OtherProductType) {
        this.OtherProductType = OtherProductType;
    }

    @JsonProperty("BCA")
    public OBBCAData1 getBCA() {
        return BCA;
    }

    public void setBCA(OBBCAData1 BCA) {
        this.BCA = BCA;
    }

    @JsonProperty("AccountId")
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    @JsonProperty("ProductName")
    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    @JsonProperty("ProductType")
    public OBExternalProductType1Code getProductType() {
        return ProductType;
    }

    public void setProductType(OBExternalProductType1Code ProductType) {
        this.ProductType = ProductType;
    }

    @JsonProperty("ProductId")
    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    @JsonProperty("PCA")
    public OBPCAData1 getPCA() {
        return PCA;
    }

    public void setPCA(OBPCAData1 PCA) {
        this.PCA = PCA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBProduct2 OBProduct2 = (OBProduct2) o;

        return Objects.equals(SecondaryProductId, OBProduct2.SecondaryProductId) &&
               Objects.equals(MarketingStateId, OBProduct2.MarketingStateId) &&
               Objects.equals(OtherProductType, OBProduct2.OtherProductType) &&
               Objects.equals(BCA, OBProduct2.BCA) &&
               Objects.equals(AccountId, OBProduct2.AccountId) &&
               Objects.equals(ProductName, OBProduct2.ProductName) &&
               Objects.equals(ProductType, OBProduct2.ProductType) &&
               Objects.equals(ProductId, OBProduct2.ProductId) &&
               Objects.equals(PCA, OBProduct2.PCA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SecondaryProductId, MarketingStateId, OtherProductType, BCA, AccountId, ProductName, ProductType, ProductId, PCA);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBProduct2 {\n");
        sb.append("    SecondaryProductId: ").append(toIndentedString(SecondaryProductId)).append("\n");        sb.append("    MarketingStateId: ").append(toIndentedString(MarketingStateId)).append("\n");        sb.append("    OtherProductType: ").append(toIndentedString(OtherProductType)).append("\n");        sb.append("    BCA: ").append(toIndentedString(BCA)).append("\n");        sb.append("    AccountId: ").append(toIndentedString(AccountId)).append("\n");        sb.append("    ProductName: ").append(toIndentedString(ProductName)).append("\n");        sb.append("    ProductType: ").append(toIndentedString(ProductType)).append("\n");        sb.append("    ProductId: ").append(toIndentedString(ProductId)).append("\n");        sb.append("    PCA: ").append(toIndentedString(PCA)).append("\n");
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

package com.bullhornsdk.data.model.entity.core.paybill.rate;

import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerAccount;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerSegment1;
import com.bullhornsdk.data.model.entity.core.paybill.generalledger.GeneralLedgerServiceCode;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SimplifiedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "generalLedgerBillAccount", "amount", "calculateAndDisplayOnInvoice", "calculatePriority", "clientCorporation",
    "dateAdded", "dateLastModified", "discountTypeLookup", "effectiveDate", "effectiveEndDate", "generalLedgerSegment1", "generalLedgerSegment2",
    "generalLedgerSegment3", "generalLedgerSegment4", "generalLedgerSegment5", "generalLedgerServiceCode", "ignoreForSalesTaxCalculations", "isDeleted"

})
public class DiscountRate extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, EditHistoryEntity, DateLastModifiedEntity, SoftDeleteEntity {

    private Integer id;
    private GeneralLedgerAccount generalLedgerAccount;
    private BigDecimal amount;
    private Boolean calculateAndDisplayOnInvoice;
    private Integer calculatePriority;
    private ClientCorporation clientCorporation;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private SimplifiedOptionsLookup discountTypeLookup;
    private DateTime effectiveDate;
    private DateTime effectiveEndDate;
    private GeneralLedgerSegment1 generalLedgerSegment1;
    private GeneralLedgerSegment1 generalLedgerSegment2;
    private GeneralLedgerSegment1 generalLedgerSegment3;
    private GeneralLedgerSegment1 generalLedgerSegment4;
    private GeneralLedgerSegment1 generalLedgerSegment5;
    private GeneralLedgerServiceCode generalLedgerServiceCode;
    private Boolean ignoreForSalesTaxCalculations;
    private Boolean isDeleted;

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @ReadOnly
    @Override
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("generalLedgerAccount")
    public GeneralLedgerAccount getGeneralLedgerAccount() {
        return generalLedgerAccount;
    }

    @JsonProperty("generalLedgerAccount")
    public void setGeneralLedgerAccount(GeneralLedgerAccount generalLedgerAccount) {
        this.generalLedgerAccount = generalLedgerAccount;
    }

    @JsonProperty("amount")
    public BigDecimal getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @JsonProperty("calculateAndDisplayOnInvoice")
    public Boolean getCalculateAndDisplayOnInvoice() {
        return calculateAndDisplayOnInvoice;
    }

    @JsonProperty("calculateAndDisplayOnInvoice")
    public void setCalculateAndDisplayOnInvoice(Boolean calculateAndDisplayOnInvoice) {
        this.calculateAndDisplayOnInvoice = calculateAndDisplayOnInvoice;
    }

    @JsonProperty("calculatePriority")
    public Integer getCalculatePriority() {
        return calculatePriority;
    }

    @JsonProperty("calculatePriority")
    public void setCalculatePriority(Integer calculatePriority) {
        this.calculatePriority = calculatePriority;
    }

    @JsonProperty("clientCorporation")
    public ClientCorporation getClientCorporation() {
        return clientCorporation;
    }

    @JsonProperty("clientCorporation")
    public void setClientCorporation(ClientCorporation clientCorporation) {
        this.clientCorporation = clientCorporation;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("discountTypeLookup")
    public SimplifiedOptionsLookup getDiscountTypeLookup() {
        return discountTypeLookup;
    }

    @JsonProperty("discountTypeLookup")
    public void setDiscountTypeLookup(SimplifiedOptionsLookup discountTypeLookup) {
        this.discountTypeLookup = discountTypeLookup;
    }

    @JsonProperty("effectiveDate")
    public DateTime getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(DateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("effectiveEndDate")
    public DateTime getEffectiveEndDate() {
        return effectiveEndDate;
    }

    @JsonProperty("effectiveEndDate")
    public void setEffectiveEndDate(DateTime effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    @JsonProperty("generalLedgerSegment1")
    public GeneralLedgerSegment1 getGeneralLedgerSegment1() {
        return generalLedgerSegment1;
    }

    @JsonProperty("generalLedgerSegment1")
    public void setGeneralLedgerSegment1(GeneralLedgerSegment1 generalLedgerSegment1) {
        this.generalLedgerSegment1 = generalLedgerSegment1;
    }

    @JsonProperty("generalLedgerSegment2")
    public GeneralLedgerSegment1 getGeneralLedgerSegment2() {
        return generalLedgerSegment2;
    }

    @JsonProperty("generalLedgerSegment2")
    public void setGeneralLedgerSegment2(GeneralLedgerSegment1 generalLedgerSegment2) {
        this.generalLedgerSegment2 = generalLedgerSegment2;
    }

    @JsonProperty("generalLedgerSegment3")
    public GeneralLedgerSegment1 getGeneralLedgerSegment3() {
        return generalLedgerSegment3;
    }

    @JsonProperty("generalLedgerSegment3")
    public void setGeneralLedgerSegment3(GeneralLedgerSegment1 generalLedgerSegment3) {
        this.generalLedgerSegment3 = generalLedgerSegment3;
    }

    @JsonProperty("generalLedgerSegment4")
    public GeneralLedgerSegment1 getGeneralLedgerSegment4() {
        return generalLedgerSegment4;
    }

    @JsonProperty("generalLedgerSegment4")
    public void setGeneralLedgerSegment4(GeneralLedgerSegment1 generalLedgerSegment4) {
        this.generalLedgerSegment4 = generalLedgerSegment4;
    }

    @JsonProperty("generalLedgerSegment5")
    public GeneralLedgerSegment1 getGeneralLedgerSegment5() {
        return generalLedgerSegment5;
    }

    @JsonProperty("generalLedgerSegment5")
    public void setGeneralLedgerSegment5(GeneralLedgerSegment1 generalLedgerSegment5) {
        this.generalLedgerSegment5 = generalLedgerSegment5;
    }

    @JsonProperty("generalLedgerServiceCode")
    public GeneralLedgerServiceCode getGeneralLedgerServiceCode() {
        return generalLedgerServiceCode;
    }

    @JsonProperty("generalLedgerServiceCode")
    public void setGeneralLedgerServiceCode(GeneralLedgerServiceCode generalLedgerServiceCode) {
        this.generalLedgerServiceCode = generalLedgerServiceCode;
    }

    @JsonProperty("ignoreForSalesTaxCalculations")
    public Boolean getIgnoreForSalesTaxCalculations() {
        return ignoreForSalesTaxCalculations;
    }

    @JsonProperty("ignoreForSalesTaxCalculations")
    public void setIgnoreForSalesTaxCalculations(Boolean ignoreForSalesTaxCalculations) {
        this.ignoreForSalesTaxCalculations = ignoreForSalesTaxCalculations;
    }

    @Override
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiscountRate that = (DiscountRate) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(generalLedgerAccount, that.generalLedgerAccount) &&
            Objects.equals(amount, that.amount) &&
            Objects.equals(calculateAndDisplayOnInvoice, that.calculateAndDisplayOnInvoice) &&
            Objects.equals(calculatePriority, that.calculatePriority) &&
            Objects.equals(clientCorporation, that.clientCorporation) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(discountTypeLookup, that.discountTypeLookup) &&
            Objects.equals(effectiveDate, that.effectiveDate) &&
            Objects.equals(effectiveEndDate, that.effectiveEndDate) &&
            Objects.equals(generalLedgerSegment1, that.generalLedgerSegment1) &&
            Objects.equals(generalLedgerSegment2, that.generalLedgerSegment2) &&
            Objects.equals(generalLedgerSegment3, that.generalLedgerSegment3) &&
            Objects.equals(generalLedgerSegment4, that.generalLedgerSegment4) &&
            Objects.equals(generalLedgerSegment5, that.generalLedgerSegment5) &&
            Objects.equals(generalLedgerServiceCode, that.generalLedgerServiceCode) &&
            Objects.equals(ignoreForSalesTaxCalculations, that.ignoreForSalesTaxCalculations) &&
            Objects.equals(isDeleted, that.isDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, generalLedgerAccount, amount, calculateAndDisplayOnInvoice, calculatePriority, clientCorporation, dateAdded, dateLastModified, discountTypeLookup, effectiveDate, effectiveEndDate, generalLedgerSegment1, generalLedgerSegment2, generalLedgerSegment3, generalLedgerSegment4, generalLedgerSegment5, generalLedgerServiceCode, ignoreForSalesTaxCalculations, isDeleted);
    }

    @Override
    public String toString() {
        return "DiscountRate{" +
            "id=" + id +
            ", generalLedgerAccount=" + generalLedgerAccount +
            ", amount=" + amount +
            ", calculateAndDisplayOnInvoice=" + calculateAndDisplayOnInvoice +
            ", calculatePriority=" + calculatePriority +
            ", clientCorporation=" + clientCorporation +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", discountTypeLookup=" + discountTypeLookup +
            ", effectiveDate=" + effectiveDate +
            ", effectiveEndDate=" + effectiveEndDate +
            ", generalLedgerSegment1=" + generalLedgerSegment1 +
            ", generalLedgerSegment2=" + generalLedgerSegment2 +
            ", generalLedgerSegment3=" + generalLedgerSegment3 +
            ", generalLedgerSegment4=" + generalLedgerSegment4 +
            ", generalLedgerSegment5=" + generalLedgerSegment5 +
            ", generalLedgerServiceCode=" + generalLedgerServiceCode +
            ", ignoreForSalesTaxCalculations=" + ignoreForSalesTaxCalculations +
            ", isDeleted=" + isDeleted +
            '}';
    }
}

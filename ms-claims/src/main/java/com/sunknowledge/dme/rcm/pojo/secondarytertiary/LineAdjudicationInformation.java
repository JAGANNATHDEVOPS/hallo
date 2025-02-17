package com.sunknowledge.dme.rcm.pojo.secondarytertiary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "otherPayerPrimaryIdentifier", "serviceLinePaidAmount", "serviceIdQualifier", "procedureCode",
		"procedureModifier", "paidServiceUnitCount", "claimAdjustmentInformation", "adjudicationOrPaymentDate",
		"remainingPatientLiability" })
@Generated("jsonschema2pojo")
public class LineAdjudicationInformation {

	@JsonProperty("otherPayerPrimaryIdentifier")
	private String otherPayerPrimaryIdentifier;
	@JsonProperty("serviceLinePaidAmount")
	private String serviceLinePaidAmount;
	@JsonProperty("serviceIdQualifier")
	private String serviceIdQualifier;
	@JsonProperty("procedureCode")
	private String procedureCode;
	@JsonProperty("procedureModifier")
	private List<String> procedureModifier = null;
	@JsonProperty("paidServiceUnitCount")
	private String paidServiceUnitCount;
	@JsonProperty("claimAdjustmentInformation")
	private List<ClaimAdjustmentInformation> claimAdjustmentInformation = null;
	@JsonProperty("adjudicationOrPaymentDate")
	private String adjudicationOrPaymentDate;
	@JsonProperty("remainingPatientLiability")
	private String remainingPatientLiability;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("otherPayerPrimaryIdentifier")
	public String getOtherPayerPrimaryIdentifier() {
		return otherPayerPrimaryIdentifier;
	}

	@JsonProperty("otherPayerPrimaryIdentifier")
	public void setOtherPayerPrimaryIdentifier(String otherPayerPrimaryIdentifier) {
		this.otherPayerPrimaryIdentifier = otherPayerPrimaryIdentifier;
	}

	@JsonProperty("serviceLinePaidAmount")
	public String getServiceLinePaidAmount() {
		return serviceLinePaidAmount;
	}

	@JsonProperty("serviceLinePaidAmount")
	public void setServiceLinePaidAmount(String serviceLinePaidAmount) {
		this.serviceLinePaidAmount = serviceLinePaidAmount;
	}

	@JsonProperty("serviceIdQualifier")
	public String getServiceIdQualifier() {
		return serviceIdQualifier;
	}

	@JsonProperty("serviceIdQualifier")
	public void setServiceIdQualifier(String serviceIdQualifier) {
		this.serviceIdQualifier = serviceIdQualifier;
	}

	@JsonProperty("procedureCode")
	public String getProcedureCode() {
		return procedureCode;
	}

	@JsonProperty("procedureCode")
	public void setProcedureCode(String procedureCode) {
		this.procedureCode = procedureCode;
	}

	@JsonProperty("procedureModifier")
	public List<String> getProcedureModifier() {
		return procedureModifier;
	}

	@JsonProperty("procedureModifier")
	public void setProcedureModifier(List<String> procedureModifier) {
		this.procedureModifier = procedureModifier;
	}

	@JsonProperty("paidServiceUnitCount")
	public String getPaidServiceUnitCount() {
		return paidServiceUnitCount;
	}

	@JsonProperty("paidServiceUnitCount")
	public void setPaidServiceUnitCount(String paidServiceUnitCount) {
		this.paidServiceUnitCount = paidServiceUnitCount;
	}

	@JsonProperty("claimAdjustmentInformation")
	public List<ClaimAdjustmentInformation> getClaimAdjustmentInformation() {
		return claimAdjustmentInformation;
	}

	@JsonProperty("claimAdjustmentInformation")
	public void setClaimAdjustmentInformation(List<ClaimAdjustmentInformation> claimAdjustmentInformation) {
		this.claimAdjustmentInformation = claimAdjustmentInformation;
	}

	@JsonProperty("adjudicationOrPaymentDate")
	public String getAdjudicationOrPaymentDate() {
		return adjudicationOrPaymentDate;
	}

	@JsonProperty("adjudicationOrPaymentDate")
	public void setAdjudicationOrPaymentDate(String adjudicationOrPaymentDate) {
		this.adjudicationOrPaymentDate = adjudicationOrPaymentDate;
	}

	@JsonProperty("remainingPatientLiability")
	public String getRemainingPatientLiability() {
		return remainingPatientLiability;
	}

	@JsonProperty("remainingPatientLiability")
	public void setRemainingPatientLiability(String remainingPatientLiability) {
		this.remainingPatientLiability = remainingPatientLiability;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
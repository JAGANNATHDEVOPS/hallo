package com.sunknowledge.dme.rcm.pojo.common;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "diagnosisTypeCode", "diagnosisCode" })
@Generated("jsonschema2pojo")
public class HealthCareCodeInformation {

	@JsonProperty("diagnosisTypeCode")
	private String diagnosisTypeCode;
	@JsonProperty("diagnosisCode")
	private String diagnosisCode;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("diagnosisTypeCode")
	public String getDiagnosisTypeCode() {
		return diagnosisTypeCode;
	}

	@JsonProperty("diagnosisTypeCode")
	public void setDiagnosisTypeCode(String diagnosisTypeCode) {
		this.diagnosisTypeCode = diagnosisTypeCode;
	}

	@JsonProperty("diagnosisCode")
	public String getDiagnosisCode() {
		return diagnosisCode;
	}

	@JsonProperty("diagnosisCode")
	public void setDiagnosisCode(String diagnosisCode) {
		this.diagnosisCode = diagnosisCode;
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
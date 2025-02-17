package com.sunknowledge.changehealthcare.pojo.professionalclaims;

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
@JsonPropertyOrder({ "qualifier", "identifier", "otherIdentifier" })
@Generated("jsonschema2pojo")
public class OtherPayerReferringProviderIdentifier {

	@JsonProperty("qualifier")
	private String qualifier;
	@JsonProperty("identifier")
	private String identifier;
	@JsonProperty("otherIdentifier")
	private String otherIdentifier;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("qualifier")
	public String getQualifier() {
		return qualifier;
	}

	@JsonProperty("qualifier")
	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}

	@JsonProperty("identifier")
	public String getIdentifier() {
		return identifier;
	}

	@JsonProperty("identifier")
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@JsonProperty("otherIdentifier")
	public String getOtherIdentifier() {
		return otherIdentifier;
	}

	@JsonProperty("otherIdentifier")
	public void setOtherIdentifier(String otherIdentifier) {
		this.otherIdentifier = otherIdentifier;
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
package com.sunknowledge.dme.rcm.dto.icd;

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
@JsonPropertyOrder({
	"@language",
	"@value"
})
@Generated("jsonschema2pojo")
public class Title {
	@JsonProperty("@language")
	private String language;
	@JsonProperty("@value")
	private String value;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("@language")
	public String getLanguage() {
		return language;
	}

	@JsonProperty("@language")
	public void setLanguage(String language) {
		this.language = language;
	}

	@JsonProperty("@value")
	public String getValue() {
		return value;
	}

	@JsonProperty("@value")
	public void setValue(String value) {
		this.value = value;
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

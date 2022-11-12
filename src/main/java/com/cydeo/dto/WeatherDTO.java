
package com.cydeo.dto;

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
    "requestDTO",
    "location",
    "current"
})
@Generated("jsonschema2pojo")
public class WeatherDTO {

    @JsonProperty("requestDTO")
    private RequestDTO requestDTO;
    @JsonProperty("location")
    private LocationDTO locationDTO;
    @JsonProperty("current")
    private CurrentDTO currentDTO;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("requestDTO")
    public RequestDTO getRequestDTO() {
        return requestDTO;
    }

    @JsonProperty("requestDTO")
    public void setRequestDTO(RequestDTO requestDTO) {
        this.requestDTO = requestDTO;
    }

    @JsonProperty("location")
    public LocationDTO getLocation() {
        return locationDTO;
    }

    @JsonProperty("location")
    public void setLocation(LocationDTO locationDTO) {
        this.locationDTO = locationDTO;
    }

    @JsonProperty("current")
    public CurrentDTO getCurrent() {
        return currentDTO;
    }

    @JsonProperty("current")
    public void setCurrent(CurrentDTO currentDTO) {
        this.currentDTO = currentDTO;
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

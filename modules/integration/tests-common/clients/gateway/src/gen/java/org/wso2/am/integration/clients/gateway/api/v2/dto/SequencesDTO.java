/*
 * WSO2 API Manager - Gateway
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Gateway. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/master/components/apimgt/org.wso2.carbon.apimgt.rest.api.gateway/src/main/resources/gateway-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v2
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.gateway.api.v2.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SequencesDTO
 */

public class SequencesDTO {
  @SerializedName("sequences")
  private List<String> sequences = null;

  public SequencesDTO sequences(List<String> sequences) {
    this.sequences = sequences;
    return this;
  }

  public SequencesDTO addSequencesItem(String sequencesItem) {
    if (this.sequences == null) {
      this.sequences = new ArrayList<>();
    }
    this.sequences.add(sequencesItem);
    return this;
  }

   /**
   * The sequences which has been deployed in the gateway 
   * @return sequences
  **/
  @ApiModelProperty(value = "The sequences which has been deployed in the gateway ")
  public List<String> getSequences() {
    return sequences;
  }

  public void setSequences(List<String> sequences) {
    this.sequences = sequences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SequencesDTO sequences = (SequencesDTO) o;
    return Objects.equals(this.sequences, sequences.sequences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequences);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SequencesDTO {\n");
    
    sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


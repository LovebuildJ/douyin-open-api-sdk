/*
 * 团购活动订单汇总信息
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * EnterpriseGrouponGrouponOrderOrderOverviewOrderOverviewSourceCount
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:07:42.971976+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseGrouponGrouponOrderOrderOverviewOrderOverviewSourceCount {
  @JsonProperty("source")
  private String source = null;

  @JsonProperty("count")
  private Integer count = null;

  public EnterpriseGrouponGrouponOrderOrderOverviewOrderOverviewSourceCount source(String source) {
    this.source = source;
    return this;
  }

   /**
   * 订单来源
   * @return source
  **/
  @Schema(required = true, description = "订单来源")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public EnterpriseGrouponGrouponOrderOrderOverviewOrderOverviewSourceCount count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * 订单数量
   * @return count
  **/
  @Schema(required = true, description = "订单数量")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseGrouponGrouponOrderOrderOverviewOrderOverviewSourceCount orderOverviewSourceCount = (EnterpriseGrouponGrouponOrderOrderOverviewOrderOverviewSourceCount) o;
    return Objects.equals(this.source, orderOverviewSourceCount.source) &&
        Objects.equals(this.count, orderOverviewSourceCount.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseGrouponGrouponOrderOrderOverviewOrderOverviewSourceCount {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

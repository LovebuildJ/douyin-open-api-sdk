/*
 * 
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
import com.douyin.open.models.PoiProductProductSpuAttributes4101DetailEntry;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * 电商商品
 */
@Schema(description = "电商商品")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PoiProductProductSpuAttributes4101 {
  @JsonProperty("market_price")
  private Integer marketPrice = null;

  @JsonProperty("discount_price")
  private Integer discountPrice = null;

  @JsonProperty("img")
  private String img = null;

  @JsonProperty("selled_num")
  private Integer selledNum = null;

  @JsonProperty("detail_entry")
  private PoiProductProductSpuAttributes4101DetailEntry detailEntry = null;

  public PoiProductProductSpuAttributes4101 marketPrice(Integer marketPrice) {
    this.marketPrice = marketPrice;
    return this;
  }

   /**
   * 原价 单位：分
   * @return marketPrice
  **/
  @Schema(example = "12121", description = "原价 单位：分")
  public Integer getMarketPrice() {
    return marketPrice;
  }

  public void setMarketPrice(Integer marketPrice) {
    this.marketPrice = marketPrice;
  }

  public PoiProductProductSpuAttributes4101 discountPrice(Integer discountPrice) {
    this.discountPrice = discountPrice;
    return this;
  }

   /**
   * 售价 单位：分
   * @return discountPrice
  **/
  @Schema(example = "12121", description = "售价 单位：分")
  public Integer getDiscountPrice() {
    return discountPrice;
  }

  public void setDiscountPrice(Integer discountPrice) {
    this.discountPrice = discountPrice;
  }

  public PoiProductProductSpuAttributes4101 img(String img) {
    this.img = img;
    return this;
  }

   /**
   * 商品图片
   * @return img
  **/
  @Schema(example = "https://static.dingdandao.com/6ecf79cc9c8aab0e7d8fcc56eaf95342", description = "商品图片")
  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public PoiProductProductSpuAttributes4101 selledNum(Integer selledNum) {
    this.selledNum = selledNum;
    return this;
  }

   /**
   * 销量
   * @return selledNum
  **/
  @Schema(example = "121212", description = "销量")
  public Integer getSelledNum() {
    return selledNum;
  }

  public void setSelledNum(Integer selledNum) {
    this.selledNum = selledNum;
  }

  public PoiProductProductSpuAttributes4101 detailEntry(PoiProductProductSpuAttributes4101DetailEntry detailEntry) {
    this.detailEntry = detailEntry;
    return this;
  }

   /**
   * Get detailEntry
   * @return detailEntry
  **/
  @Schema(description = "")
  public PoiProductProductSpuAttributes4101DetailEntry getDetailEntry() {
    return detailEntry;
  }

  public void setDetailEntry(PoiProductProductSpuAttributes4101DetailEntry detailEntry) {
    this.detailEntry = detailEntry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiProductProductSpuAttributes4101 spuAttributes4101 = (PoiProductProductSpuAttributes4101) o;
    return Objects.equals(this.marketPrice, spuAttributes4101.marketPrice) &&
        Objects.equals(this.discountPrice, spuAttributes4101.discountPrice) &&
        Objects.equals(this.img, spuAttributes4101.img) &&
        Objects.equals(this.selledNum, spuAttributes4101.selledNum) &&
        Objects.equals(this.detailEntry, spuAttributes4101.detailEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketPrice, discountPrice, img, selledNum, detailEntry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiProductProductSpuAttributes4101 {\n");
    
    sb.append("    marketPrice: ").append(toIndentedString(marketPrice)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    selledNum: ").append(toIndentedString(selledNum)).append("\n");
    sb.append("    detailEntry: ").append(toIndentedString(detailEntry)).append("\n");
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
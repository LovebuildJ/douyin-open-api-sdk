/*
 * 动态消息卡片列表
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
import com.douyin.open.models.EnterpriseImFancyCardCardListCardModuleImage;
import com.douyin.open.models.EnterpriseImFancyCardCardListCardSubModule;
import com.douyin.open.models.EnterpriseImFancyCardCardListModuleAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * EnterpriseImFancyCardCardListCardModule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:56.700019+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseImFancyCardCardListCardModule {
  /**
   * Gets or Sets moduleType
   */
  public enum ModuleTypeEnum {
    TEXT("text"),
    IMAGE("image"),
    IMAGE_TEXT("image_text"),
    BUTTONS("buttons"),
    PHONE_LEADS("phone_leads"),
    BUTTON("button"),
    DIV_LINE("div_line");

    private String value;

    ModuleTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ModuleTypeEnum fromValue(String text) {
      for (ModuleTypeEnum b : ModuleTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("module_type")
  private ModuleTypeEnum moduleType = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("image")
  private EnterpriseImFancyCardCardListCardModuleImage image = null;

  @JsonProperty("action")
  private EnterpriseImFancyCardCardListModuleAction action = null;

  @JsonProperty("modules")
  private List<EnterpriseImFancyCardCardListCardSubModule> modules = null;

  @JsonProperty("props")
  private String props = null;

  public EnterpriseImFancyCardCardListCardModule moduleType(ModuleTypeEnum moduleType) {
    this.moduleType = moduleType;
    return this;
  }

   /**
   * Get moduleType
   * @return moduleType
  **/
  @Schema(required = true, description = "")
  public ModuleTypeEnum getModuleType() {
    return moduleType;
  }

  public void setModuleType(ModuleTypeEnum moduleType) {
    this.moduleType = moduleType;
  }

  public EnterpriseImFancyCardCardListCardModule text(String text) {
    this.text = text;
    return this;
  }

   /**
   * 文本
   * @return text
  **/
  @Schema(example = "卡片名", description = "文本")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public EnterpriseImFancyCardCardListCardModule image(EnterpriseImFancyCardCardListCardModuleImage image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @Schema(description = "")
  public EnterpriseImFancyCardCardListCardModuleImage getImage() {
    return image;
  }

  public void setImage(EnterpriseImFancyCardCardListCardModuleImage image) {
    this.image = image;
  }

  public EnterpriseImFancyCardCardListCardModule action(EnterpriseImFancyCardCardListModuleAction action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public EnterpriseImFancyCardCardListModuleAction getAction() {
    return action;
  }

  public void setAction(EnterpriseImFancyCardCardListModuleAction action) {
    this.action = action;
  }

  public EnterpriseImFancyCardCardListCardModule modules(List<EnterpriseImFancyCardCardListCardSubModule> modules) {
    this.modules = modules;
    return this;
  }

  public EnterpriseImFancyCardCardListCardModule addModulesItem(EnterpriseImFancyCardCardListCardSubModule modulesItem) {
    if (this.modules == null) {
      this.modules = new ArrayList<>();
    }
    this.modules.add(modulesItem);
    return this;
  }

   /**
   * 子模块
   * @return modules
  **/
  @Schema(description = "子模块")
  public List<EnterpriseImFancyCardCardListCardSubModule> getModules() {
    return modules;
  }

  public void setModules(List<EnterpriseImFancyCardCardListCardSubModule> modules) {
    this.modules = modules;
  }

  public EnterpriseImFancyCardCardListCardModule props(String props) {
    this.props = props;
    return this;
  }

   /**
   * 卡片属性 json string
   * @return props
  **/
  @Schema(example = "{\"text\": \"文本内容\"}", description = "卡片属性 json string")
  public String getProps() {
    return props;
  }

  public void setProps(String props) {
    this.props = props;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseImFancyCardCardListCardModule cardModule = (EnterpriseImFancyCardCardListCardModule) o;
    return Objects.equals(this.moduleType, cardModule.moduleType) &&
        Objects.equals(this.text, cardModule.text) &&
        Objects.equals(this.image, cardModule.image) &&
        Objects.equals(this.action, cardModule.action) &&
        Objects.equals(this.modules, cardModule.modules) &&
        Objects.equals(this.props, cardModule.props);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moduleType, text, image, action, modules, props);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseImFancyCardCardListCardModule {\n");
    
    sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
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
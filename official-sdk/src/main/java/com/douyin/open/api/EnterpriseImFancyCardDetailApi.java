package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.EnterpriseImFancyCardCardDetailInlineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:10:01.728939+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.EnterpriseImFancyCardDetailApi")
public class EnterpriseImFancyCardDetailApi {
    private ApiClient apiClient;

    public EnterpriseImFancyCardDetailApi() {
        this(new ApiClient());
    }

    @Autowired
    public EnterpriseImFancyCardDetailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 获取指定动态卡片模版
     * * Scope: &#x60;enterprise.im&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param cardId 卡片id
     * @return EnterpriseImFancyCardCardDetailInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseImFancyCardCardDetailInlineResponse200 enterpriseImFancyCardDetailGet(String openId, String accessToken, String cardId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseImFancyCardDetailGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseImFancyCardDetailGet");
        }
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cardId' when calling enterpriseImFancyCardDetailGet");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/im/fancy/card/detail/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "card_id", cardId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EnterpriseImFancyCardCardDetailInlineResponse200> returnType = new ParameterizedTypeReference<EnterpriseImFancyCardCardDetailInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.EnterpriseGrouponGrouponGrouponDetailInlineResponse200;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:07:48.970677+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.EnterpriseGrouponDetailApi")
public class EnterpriseGrouponDetailApi {
    private ApiClient apiClient;

    public EnterpriseGrouponDetailApi() {
        this(new ApiClient());
    }

    @Autowired
    public EnterpriseGrouponDetailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 团购活动详情
     * * Scope: &#x60;enterprise.groupon&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param grouponIds 团购活动的Id
     * @return EnterpriseGrouponGrouponGrouponDetailInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseGrouponGrouponGrouponDetailInlineResponse200 enterpriseGrouponDetailGet(String accessToken, String openId, List<String> grouponIds) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseGrouponDetailGet");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseGrouponDetailGet");
        }
        // verify the required parameter 'grouponIds' is set
        if (grouponIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'grouponIds' when calling enterpriseGrouponDetailGet");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/groupon/detail/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "groupon_ids", grouponIds));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EnterpriseGrouponGrouponGrouponDetailInlineResponse200> returnType = new ParameterizedTypeReference<EnterpriseGrouponGrouponGrouponDetailInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

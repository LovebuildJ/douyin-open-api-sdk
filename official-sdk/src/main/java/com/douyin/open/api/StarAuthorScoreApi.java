package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.StarAuthorStarAuthorInlineResponse200;
import com.douyin.open.models.StarAuthorStarAuthorInlineResponse2001;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:16.546471+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.StarAuthorScoreApi")
public class StarAuthorScoreApi {
    private ApiClient apiClient;

    public StarAuthorScoreApi() {
        this(new ApiClient());
    }

    @Autowired
    public StarAuthorScoreApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 获取抖音星图达人指数
     * * Scope: &#x60;star_top_score_display&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @return StarAuthorStarAuthorInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StarAuthorStarAuthorInlineResponse200 starAuthorScoreGet(String openId, String accessToken) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling starAuthorScoreGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling starAuthorScoreGet");
        }
        String path = UriComponentsBuilder.fromPath("/star/author_score/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<StarAuthorStarAuthorInlineResponse200> returnType = new ParameterizedTypeReference<StarAuthorStarAuthorInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取抖音星图达人指数数据V2
     * * Scope: &#x60;star_author_score_display&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param uniqueId 达人抖音号
     * @return StarAuthorStarAuthorInlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StarAuthorStarAuthorInlineResponse2001 starAuthorScoreV2Get(String accessToken, String uniqueId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling starAuthorScoreV2Get");
        }
        // verify the required parameter 'uniqueId' is set
        if (uniqueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uniqueId' when calling starAuthorScoreV2Get");
        }
        String path = UriComponentsBuilder.fromPath("/star/author_score_v2/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "unique_id", uniqueId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<StarAuthorStarAuthorInlineResponse2001> returnType = new ParameterizedTypeReference<StarAuthorStarAuthorInlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

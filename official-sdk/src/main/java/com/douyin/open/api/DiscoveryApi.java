package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.DiscoveryEntRankRankInlineResponse200;
import com.douyin.open.models.DiscoveryEntRankRankInlineResponse2001;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:23.248623+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.DiscoveryApi")
public class DiscoveryApi {
    private ApiClient apiClient;

    public DiscoveryApi() {
        this(new ApiClient());
    }

    @Autowired
    public DiscoveryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 获取抖音电影榜、抖音电视剧榜、抖音综艺榜
     * * Scope: &#x60;discovery.ent&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param type 榜单类型：   * 1 - 电影    * 2 - 电视剧    * 3 - 综艺 
     * @param version 榜单版本：空值默认为本周榜单
     * @return DiscoveryEntRankRankInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DiscoveryEntRankRankInlineResponse200 discoveryEntRankItemGet(String accessToken, Integer type, Integer version) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling discoveryEntRankItemGet");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling discoveryEntRankItemGet");
        }
        String path = UriComponentsBuilder.fromPath("/discovery/ent/rank/item/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<DiscoveryEntRankRankInlineResponse200> returnType = new ParameterizedTypeReference<DiscoveryEntRankRankInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取抖音影视综榜单版本
     * * Scope: &#x60;discovery.ent&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param count 每页数量
     * @param type 榜单类型：   * 1 - 电影    * 2 - 电视剧    * 3 - 综艺 
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
     * @return DiscoveryEntRankRankInlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DiscoveryEntRankRankInlineResponse2001 discoveryEntRankVersionGet(String accessToken, Integer count, Integer type, Long cursor) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling discoveryEntRankVersionGet");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling discoveryEntRankVersionGet");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling discoveryEntRankVersionGet");
        }
        String path = UriComponentsBuilder.fromPath("/discovery/ent/rank/version/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<DiscoveryEntRankRankInlineResponse2001> returnType = new ParameterizedTypeReference<DiscoveryEntRankRankInlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

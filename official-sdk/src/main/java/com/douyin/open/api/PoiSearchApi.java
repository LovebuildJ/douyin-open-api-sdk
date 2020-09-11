package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.VideoPoiVideoPoiInlineResponse200;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:04:15.867378+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.PoiSearchApi")
public class PoiSearchApi {
    private ApiClient apiClient;

    public PoiSearchApi() {
        this(new ApiClient());
    }

    @Autowired
    public PoiSearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 查询POI信息
     * * Scope: &#x60;poi.search&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param count 每页数量
     * @param keyword 查询关键字，例如美食
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
     * @param city 查询城市，例如上海、北京
     * @return VideoPoiVideoPoiInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoPoiVideoPoiInlineResponse200 poiSearchKeywordGet(String accessToken, Integer count, String keyword, Long cursor, String city) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling poiSearchKeywordGet");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling poiSearchKeywordGet");
        }
        // verify the required parameter 'keyword' is set
        if (keyword == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyword' when calling poiSearchKeywordGet");
        }
        String path = UriComponentsBuilder.fromPath("/poi/search/keyword/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "keyword", keyword));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "city", city));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<VideoPoiVideoPoiInlineResponse200> returnType = new ParameterizedTypeReference<VideoPoiVideoPoiInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.StarDataStarDataInlineResponse200;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:10.297280+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.StarHotListApi")
public class StarHotListApi {
    private ApiClient apiClient;

    public StarHotListApi() {
        this(new ApiClient());
    }

    @Autowired
    public StarHotListApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 获取抖音星图达人热榜
     * * Scope: &#x60;star_tops&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param hotListType 达人热榜类型 * &#x60;1&#x60; - 星图指数榜 * &#x60;2&#x60; - 涨粉指数榜 * &#x60;3&#x60; - 性价比指数榜 * &#x60;4&#x60; - 种草指数榜 * &#x60;5&#x60; - 精选指数榜 * &#x60;6&#x60; - 传播指数榜
     * @return StarDataStarDataInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StarDataStarDataInlineResponse200 starHotListGet(String accessToken, Integer hotListType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling starHotListGet");
        }
        // verify the required parameter 'hotListType' is set
        if (hotListType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hotListType' when calling starHotListGet");
        }
        String path = UriComponentsBuilder.fromPath("/star/hot_list/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "hot_list_type", hotListType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<StarDataStarDataInlineResponse200> returnType = new ParameterizedTypeReference<StarDataStarDataInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

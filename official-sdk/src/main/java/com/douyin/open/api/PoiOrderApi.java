package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.PoiOrderOrderBody;
import com.douyin.open.models.PoiOrderOrderBody1;
import com.douyin.open.models.PoiOrderOrderBody2;
import com.douyin.open.models.PoiOrderOrderBody3;
import com.douyin.open.models.PoiOrderOrderInlineResponse200;
import com.douyin.open.models.PoiOrderOrderInlineResponse2001;
import com.douyin.open.models.PoiOrderOrderInlineResponse2002;
import com.douyin.open.models.PoiOrderOrderInlineResponse2003;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:06.711814+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.PoiOrderApi")
public class PoiOrderApi {
    private ApiClient apiClient;

    public PoiOrderApi() {
        this(new ApiClient());
    }

    @Autowired
    public PoiOrderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 取消订单(该接口由接入方实现)
     * # 该接口由接入方实现 
     * <p><b>200</b>
     * @param body The body parameter
     * @return PoiOrderOrderInlineResponse2003
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiOrderOrderInlineResponse2003 poiExtHotelOrderCancelPost(PoiOrderOrderBody3 body) throws RestClientException {
        Object postBody = body;
        String path = UriComponentsBuilder.fromPath("/poi/ext/hotel/order/cancel/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PoiOrderOrderInlineResponse2003> returnType = new ParameterizedTypeReference<PoiOrderOrderInlineResponse2003>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 下单接口(该接口由接入方实现)
     * # 该接口由接入方实现 
     * <p><b>200</b>
     * @param body The body parameter
     * @return PoiOrderOrderInlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiOrderOrderInlineResponse2001 poiExtHotelOrderCommitPost(PoiOrderOrderBody1 body) throws RestClientException {
        Object postBody = body;
        String path = UriComponentsBuilder.fromPath("/poi/ext/hotel/order/commit/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PoiOrderOrderInlineResponse2001> returnType = new ParameterizedTypeReference<PoiOrderOrderInlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 支付状态通知(该接口由接入方实现)
     * # 该接口由接入方实现 
     * <p><b>200</b>
     * @param body The body parameter
     * @return PoiOrderOrderInlineResponse2002
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiOrderOrderInlineResponse2002 poiExtHotelOrderStatusPost(PoiOrderOrderBody2 body) throws RestClientException {
        Object postBody = body;
        String path = UriComponentsBuilder.fromPath("/poi/ext/hotel/order/status/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PoiOrderOrderInlineResponse2002> returnType = new ParameterizedTypeReference<PoiOrderOrderInlineResponse2002>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 订单状态同步接口
     * * Scope: &#x60;poi.product&#x60; 
     * <p><b>200</b>
     * @param body The body parameter
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @return PoiOrderOrderInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiOrderOrderInlineResponse200 poiOrderStatusPost(PoiOrderOrderBody body, String accessToken) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling poiOrderStatusPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling poiOrderStatusPost");
        }
        String path = UriComponentsBuilder.fromPath("/poi/order/status/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PoiOrderOrderInlineResponse200> returnType = new ParameterizedTypeReference<PoiOrderOrderInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

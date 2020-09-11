package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.PoiSupplierSupplierBody;
import com.douyin.open.models.PoiSupplierSupplierBody1;
import com.douyin.open.models.PoiSupplierSupplierBody2;
import com.douyin.open.models.PoiSupplierSupplierInlineResponse200;
import com.douyin.open.models.PoiSupplierSupplierInlineResponse2001;
import com.douyin.open.models.PoiSupplierSupplierInlineResponse2002;
import com.douyin.open.models.PoiSupplierSupplierInlineResponse2003;
import com.douyin.open.models.PoiSupplierSupplierInlineResponse2004;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:47.759385+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.PoiSupplierApi")
public class PoiSupplierApi {
    private ApiClient apiClient;

    public PoiSupplierApi() {
        this(new ApiClient());
    }

    @Autowired
    public PoiSupplierApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 获取抖音POI ID
     * * Scope: &#x60;poi.product&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param amapId The amapId parameter
     * @return PoiSupplierSupplierInlineResponse2002
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiSupplierSupplierInlineResponse2002 poiQueryGet(String accessToken, String amapId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling poiQueryGet");
        }
        // verify the required parameter 'amapId' is set
        if (amapId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'amapId' when calling poiQueryGet");
        }
        String path = UriComponentsBuilder.fromPath("/poi/query/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "amap_id", amapId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PoiSupplierSupplierInlineResponse2002> returnType = new ParameterizedTypeReference<PoiSupplierSupplierInlineResponse2002>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 店铺匹配
     * * Scope: &#x60;poi.product&#x60; 
     * <p><b>200</b>
     * @param body The body parameter
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @return PoiSupplierSupplierInlineResponse2003
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiSupplierSupplierInlineResponse2003 poiSupplierMatchPost(PoiSupplierSupplierBody1 body, String accessToken) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling poiSupplierMatchPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling poiSupplierMatchPost");
        }
        String path = UriComponentsBuilder.fromPath("/poi/supplier/match/").build().toUriString();
        
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

        ParameterizedTypeReference<PoiSupplierSupplierInlineResponse2003> returnType = new ParameterizedTypeReference<PoiSupplierSupplierInlineResponse2003>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 店铺匹配结果查询
     * * Scope: &#x60;poi.product&#x60; 
     * <p><b>200</b>
     * @param body The body parameter
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @return PoiSupplierSupplierInlineResponse2004
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiSupplierSupplierInlineResponse2004 poiSupplierMatchQueryGet(PoiSupplierSupplierBody2 body, String accessToken) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling poiSupplierMatchQueryGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling poiSupplierMatchQueryGet");
        }
        String path = UriComponentsBuilder.fromPath("/poi/supplier/match/query/").build().toUriString();
        
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

        ParameterizedTypeReference<PoiSupplierSupplierInlineResponse2004> returnType = new ParameterizedTypeReference<PoiSupplierSupplierInlineResponse2004>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 查询店铺
     * * Scope: &#x60;poi.product&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param supplierExtId The supplierExtId parameter
     * @return PoiSupplierSupplierInlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiSupplierSupplierInlineResponse2001 poiSupplierQueryGet(String accessToken, String supplierExtId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling poiSupplierQueryGet");
        }
        // verify the required parameter 'supplierExtId' is set
        if (supplierExtId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'supplierExtId' when calling poiSupplierQueryGet");
        }
        String path = UriComponentsBuilder.fromPath("/poi/supplier/query/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "supplier_ext_id", supplierExtId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PoiSupplierSupplierInlineResponse2001> returnType = new ParameterizedTypeReference<PoiSupplierSupplierInlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 商铺同步
     * * Scope: &#x60;poi.product&#x60; 
     * <p><b>200</b>
     * @param body The body parameter
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @return PoiSupplierSupplierInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiSupplierSupplierInlineResponse200 poiSupplierSyncPost(PoiSupplierSupplierBody body, String accessToken) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling poiSupplierSyncPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling poiSupplierSyncPost");
        }
        String path = UriComponentsBuilder.fromPath("/poi/supplier/sync/").build().toUriString();
        
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

        ParameterizedTypeReference<PoiSupplierSupplierInlineResponse200> returnType = new ParameterizedTypeReference<PoiSupplierSupplierInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

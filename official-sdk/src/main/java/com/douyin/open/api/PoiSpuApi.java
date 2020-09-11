package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.PoiProductProductBody;
import com.douyin.open.models.PoiProductProductBody1;
import com.douyin.open.models.PoiProductProductInlineResponse200;
import com.douyin.open.models.PoiProductProductInlineResponse2001;
import com.douyin.open.models.PoiProductProductInlineResponse2002;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.PoiSpuApi")
public class PoiSpuApi {
    private ApiClient apiClient;

    public PoiSpuApi() {
        this(new ApiClient());
    }

    @Autowired
    public PoiSpuApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * SKU同步
     * * Scope: &#x60;poi.product&#x60; 
     * <p><b>200</b>
     * @param body The body parameter
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @return PoiProductProductInlineResponse2002
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiProductProductInlineResponse2002 poiSkuSyncPost(PoiProductProductBody1 body, String accessToken) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling poiSkuSyncPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling poiSkuSyncPost");
        }
        String path = UriComponentsBuilder.fromPath("/poi/sku/sync/").build().toUriString();
        
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

        ParameterizedTypeReference<PoiProductProductInlineResponse2002> returnType = new ParameterizedTypeReference<PoiProductProductInlineResponse2002>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 查询SPU
     * * Scope: &#x60;poi.product&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param spuExtId The spuExtId parameter
     * @return PoiProductProductInlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiProductProductInlineResponse2001 poiSpuQueryGet(String accessToken, String spuExtId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling poiSpuQueryGet");
        }
        // verify the required parameter 'spuExtId' is set
        if (spuExtId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'spuExtId' when calling poiSpuQueryGet");
        }
        String path = UriComponentsBuilder.fromPath("/poi/spu/query/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "spu_ext_id", spuExtId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PoiProductProductInlineResponse2001> returnType = new ParameterizedTypeReference<PoiProductProductInlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * SPU同步
     * * Scope: &#x60;poi.product&#x60; 
     * <p><b>200</b>
     * @param body The body parameter
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @return PoiProductProductInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiProductProductInlineResponse200 poiSpuSyncPost(PoiProductProductBody body, String accessToken) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling poiSpuSyncPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling poiSpuSyncPost");
        }
        String path = UriComponentsBuilder.fromPath("/poi/spu/sync/").build().toUriString();
        
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

        ParameterizedTypeReference<PoiProductProductInlineResponse200> returnType = new ParameterizedTypeReference<PoiProductProductInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

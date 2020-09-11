package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.DouyinPayDouyinPayInlineResponse2002;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:01.836807+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.DouyinPayAccountQueryApi")
public class DouyinPayAccountQueryApi {
    private ApiClient apiClient;

    public DouyinPayAccountQueryApi() {
        this(new ApiClient());
    }

    @Autowired
    public DouyinPayAccountQueryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 账户余额查询
     * * Scope: &#x60;douyin.pay.op&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param merchantId 商户id
     * @param liveId 业务id
     * @return DouyinPayDouyinPayInlineResponse2002
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DouyinPayDouyinPayInlineResponse2002 douyinPayAccountQueryGet(String accessToken, Integer merchantId, Integer liveId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling douyinPayAccountQueryGet");
        }
        // verify the required parameter 'merchantId' is set
        if (merchantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'merchantId' when calling douyinPayAccountQueryGet");
        }
        // verify the required parameter 'liveId' is set
        if (liveId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'liveId' when calling douyinPayAccountQueryGet");
        }
        String path = UriComponentsBuilder.fromPath("/douyin-pay/account-query/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "merchant_id", merchantId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "live_id", liveId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<DouyinPayDouyinPayInlineResponse2002> returnType = new ParameterizedTypeReference<DouyinPayDouyinPayInlineResponse2002>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.Oauth2RefreshTokenInlineResponse200;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:02:41.405555+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.RefreshTokenApi")
public class RefreshTokenApi {
    private ApiClient apiClient;

    public RefreshTokenApi() {
        this(new ApiClient());
    }

    @Autowired
    public RefreshTokenApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 刷新access_token
     * 
     * <p><b>200</b>
     * @param clientKey 应用唯一标识
     * @param grantType 填refresh_token
     * @param refreshToken 填写通过access_token获取到的refresh_token参数
     * @return Oauth2RefreshTokenInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Oauth2RefreshTokenInlineResponse200 oauthRefreshTokenGet(String clientKey, String grantType, String refreshToken) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'clientKey' is set
        if (clientKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientKey' when calling oauthRefreshTokenGet");
        }
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'grantType' when calling oauthRefreshTokenGet");
        }
        // verify the required parameter 'refreshToken' is set
        if (refreshToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'refreshToken' when calling oauthRefreshTokenGet");
        }
        String path = UriComponentsBuilder.fromPath("/oauth/refresh_token/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "client_key", clientKey));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "grant_type", grantType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "refresh_token", refreshToken));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Oauth2RefreshTokenInlineResponse200> returnType = new ParameterizedTypeReference<Oauth2RefreshTokenInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

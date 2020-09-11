package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.Oauth2UserTokenInlineResponse200;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:03:01.574845+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.AccessTokenApi")
public class AccessTokenApi {
    private ApiClient apiClient;

    public AccessTokenApi() {
        this(new ApiClient());
    }

    @Autowired
    public AccessTokenApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 获取access_token
     * 
     * <p><b>200</b>
     * @param clientKey 应用唯一标识
     * @param clientSecret 应用唯一标识对应的密钥
     * @param code 授权码
     * @param grantType 写死\&quot;authorization_code\&quot;即可
     * @return Oauth2UserTokenInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Oauth2UserTokenInlineResponse200 oauthAccessTokenGet(String clientKey, String clientSecret, String code, String grantType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'clientKey' is set
        if (clientKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientKey' when calling oauthAccessTokenGet");
        }
        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientSecret' when calling oauthAccessTokenGet");
        }
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'code' when calling oauthAccessTokenGet");
        }
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'grantType' when calling oauthAccessTokenGet");
        }
        String path = UriComponentsBuilder.fromPath("/oauth/access_token/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "client_key", clientKey));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "client_secret", clientSecret));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "code", code));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "grant_type", grantType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Oauth2UserTokenInlineResponse200> returnType = new ParameterizedTypeReference<Oauth2UserTokenInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

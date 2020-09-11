package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.ToutiaoOauth2Oauth2InlineResponse2002;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:03:07.108677+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.ToutiaoClientTokenApi")
public class ToutiaoClientTokenApi {
    private ApiClient apiClient;

    public ToutiaoClientTokenApi() {
        this(new ApiClient());
    }

    @Autowired
    public ToutiaoClientTokenApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 生成client_token
     * 
     * <p><b>200</b>
     * @param clientKey 应用唯一标识
     * @param clientSecret 应用唯一标识对应的密钥
     * @param grantType 传client_credential
     * @return ToutiaoOauth2Oauth2InlineResponse2002
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ToutiaoOauth2Oauth2InlineResponse2002 oauthClientTokenGet(String clientKey, String clientSecret, String grantType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'clientKey' is set
        if (clientKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientKey' when calling oauthClientTokenGet");
        }
        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientSecret' when calling oauthClientTokenGet");
        }
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'grantType' when calling oauthClientTokenGet");
        }
        String path = UriComponentsBuilder.fromPath("/oauth/client_token/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "client_key", clientKey));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "client_secret", clientSecret));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "grant_type", grantType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ToutiaoOauth2Oauth2InlineResponse2002> returnType = new ParameterizedTypeReference<ToutiaoOauth2Oauth2InlineResponse2002>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

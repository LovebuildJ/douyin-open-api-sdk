package com.douyin.open.api;

import com.douyin.open.ApiClient;


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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:02:45.924663+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.AuthorizeV2Api")
public class AuthorizeV2Api {
    private ApiClient apiClient;

    public AuthorizeV2Api() {
        this(new ApiClient());
    }

    @Autowired
    public AuthorizeV2Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 获取授权码(code)
     * 注意该URL要在抖音端内的h5页面请求，这样才能带上抖音的登录态来获取用户的OpenId。 一旦clientKey有静默授权权限login_id，接口会以重定向的方式跳转到redirect_uri，并返回code。 拿到code之后再去调用https://open.douyin.com/oauth/access_token/。
     * <p><b>302</b> - 用户允许授权后，将会重定向到redirect_uri的网址上，并且带上code和state参数
     * @param clientKey 应用唯一标识
     * @param responseType 填写code
     * @param scope 填login_id
     * @param redirectUri 授权成功后的回调地址，必须以http/https开头。域名要跟申请应用时填写的授权回调域一致。用于调用https://open.douyin.com/oauth/access_token/换token。
     * @param state 用于保持请求和回调状态，授权请求后会原样返回给接入方,如果是App则不用传该参数
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void oauthAuthorizeV2Get(String clientKey, String responseType, String scope, String redirectUri, String state) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'clientKey' is set
        if (clientKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientKey' when calling oauthAuthorizeV2Get");
        }
        // verify the required parameter 'responseType' is set
        if (responseType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'responseType' when calling oauthAuthorizeV2Get");
        }
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scope' when calling oauthAuthorizeV2Get");
        }
        // verify the required parameter 'redirectUri' is set
        if (redirectUri == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'redirectUri' when calling oauthAuthorizeV2Get");
        }
        String path = UriComponentsBuilder.fromPath("/oauth/authorize/v2/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "client_key", clientKey));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "response_type", responseType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "scope", scope));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "redirect_uri", redirectUri));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "state", state));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

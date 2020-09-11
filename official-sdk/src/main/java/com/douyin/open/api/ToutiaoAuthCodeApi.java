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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:03:07.108677+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.ToutiaoAuthCodeApi")
public class ToutiaoAuthCodeApi {
    private ApiClient apiClient;

    public ToutiaoAuthCodeApi() {
        this(new ApiClient());
    }

    @Autowired
    public ToutiaoAuthCodeApi(ApiClient apiClient) {
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
     * 注意该URL不是用来请求的, 需要展示给用户用于扫码。  在抖音APP支持端内唤醒的版本内打开的话会弹出客户端原生授权页面。  使用本接口前提:    1. 首先你需要去官网申请，使你的应用可以使用特定的Scope，具体需要哪些Scope，请查看各接口定义。    2. 其次你需要在本URL的scope字段中填上用户需要授权给你的Scope。    3. 用户授权通过后，你才可以调用相应的接口。 
     * <p><b>302</b> - 用户允许授权后，将会重定向到redirect_uri的网址上，并且带上code和state参数
     * @param clientKey 应用唯一标识
     * @param responseType 填写code
     * @param scope 应用授权作用域,多个授权作用域以英文逗号（,）分隔
     * @param redirectUri 授权成功后的回调地址，必须以http/https开头。
     * @param state 用于保持请求和回调的状态
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void oauthAuthorizeGet(String clientKey, String responseType, String scope, String redirectUri, String state) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'clientKey' is set
        if (clientKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientKey' when calling oauthAuthorizeGet");
        }
        // verify the required parameter 'responseType' is set
        if (responseType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'responseType' when calling oauthAuthorizeGet");
        }
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scope' when calling oauthAuthorizeGet");
        }
        // verify the required parameter 'redirectUri' is set
        if (redirectUri == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'redirectUri' when calling oauthAuthorizeGet");
        }
        String path = UriComponentsBuilder.fromPath("/oauth/authorize/").build().toUriString();
        
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

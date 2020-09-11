package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.EnterprisePersonaPersonaConvDeleteBody;
import com.douyin.open.models.EnterprisePersonaPersonaConvDeleteInlineResponse200;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:46.137934+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.EnterpriseImConversationDeleteApi")
public class EnterpriseImConversationDeleteApi {
    private ApiClient apiClient;

    public EnterpriseImConversationDeleteApi() {
        this(new ApiClient());
    }

    @Autowired
    public EnterpriseImConversationDeleteApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 删除客服会话
     * * Scope: &#x60;enterprise.im&#x60; 
     * <p><b>200</b>
     * @param body The body parameter
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @return EnterprisePersonaPersonaConvDeleteInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterprisePersonaPersonaConvDeleteInlineResponse200 enterpriseImPersonaConversationDeletePost(EnterprisePersonaPersonaConvDeleteBody body, String openId, String accessToken) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling enterpriseImPersonaConversationDeletePost");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseImPersonaConversationDeletePost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseImPersonaConversationDeletePost");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/im/persona/conversation/delete/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
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

        ParameterizedTypeReference<EnterprisePersonaPersonaConvDeleteInlineResponse200> returnType = new ParameterizedTypeReference<EnterprisePersonaPersonaConvDeleteInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

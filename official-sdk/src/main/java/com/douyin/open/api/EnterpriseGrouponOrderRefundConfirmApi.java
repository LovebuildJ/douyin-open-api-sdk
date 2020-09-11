package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.EnterpriseGrouponGrouponOrderOrderRefundConfirmBody;
import com.douyin.open.models.EnterpriseGrouponGrouponOrderOrderRefundConfirmInlineResponse200;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:07:24.382556+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.EnterpriseGrouponOrderRefundConfirmApi")
public class EnterpriseGrouponOrderRefundConfirmApi {
    private ApiClient apiClient;

    public EnterpriseGrouponOrderRefundConfirmApi() {
        this(new ApiClient());
    }

    @Autowired
    public EnterpriseGrouponOrderRefundConfirmApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 确认退款
     * * Scope: &#x60;enterprise.groupon&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param body The body parameter
     * @return EnterpriseGrouponGrouponOrderOrderRefundConfirmInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseGrouponGrouponOrderOrderRefundConfirmInlineResponse200 enterpriseGrouponOrderRefundConfirmPost(String accessToken, String openId, EnterpriseGrouponGrouponOrderOrderRefundConfirmBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseGrouponOrderRefundConfirmPost");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseGrouponOrderRefundConfirmPost");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/groupon/order/refund/confirm/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EnterpriseGrouponGrouponOrderOrderRefundConfirmInlineResponse200> returnType = new ParameterizedTypeReference<EnterpriseGrouponGrouponOrderOrderRefundConfirmInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

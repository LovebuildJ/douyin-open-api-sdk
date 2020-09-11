package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:07:42.971976+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.EnterpriseGrouponOrderOverviewApi")
public class EnterpriseGrouponOrderOverviewApi {
    private ApiClient apiClient;

    public EnterpriseGrouponOrderOverviewApi() {
        this(new ApiClient());
    }

    @Autowired
    public EnterpriseGrouponOrderOverviewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 团购活动订单汇总信息
     * * Scope: &#x60;enterprise.groupon&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param startTime 订单开始时间，unix时间戳
     * @param endTime 订单结束时间，unix时间戳
     * @return EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200 enterpriseGrouponOrderOverviewGet(String accessToken, String openId, Integer startTime, Integer endTime) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseGrouponOrderOverviewGet");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseGrouponOrderOverviewGet");
        }
        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startTime' when calling enterpriseGrouponOrderOverviewGet");
        }
        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endTime' when calling enterpriseGrouponOrderOverviewGet");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/groupon/order/overview/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_time", endTime));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200> returnType = new ParameterizedTypeReference<EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

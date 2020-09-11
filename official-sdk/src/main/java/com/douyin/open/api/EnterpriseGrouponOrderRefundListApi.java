package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:07:30.282044+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.EnterpriseGrouponOrderRefundListApi")
public class EnterpriseGrouponOrderRefundListApi {
    private ApiClient apiClient;

    public EnterpriseGrouponOrderRefundListApi() {
        this(new ApiClient());
    }

    @Autowired
    public EnterpriseGrouponOrderRefundListApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 团购活动用户申请退款订单列表
     * * Scope: &#x60;enterprise.groupon&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param count 每页数量
     * @param startTime 退款申请开始时间，unix时间戳
     * @param endTime 退款申请结束时间，unix时间戳
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
     * @param status * 状态筛选   * 1: 待确认   * 2: 已确认 
     * @return EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200 enterpriseGrouponOrderRefundApplyListGet(String accessToken, String openId, Integer count, Integer startTime, Integer endTime, Long cursor, Integer status) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseGrouponOrderRefundApplyListGet");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseGrouponOrderRefundApplyListGet");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling enterpriseGrouponOrderRefundApplyListGet");
        }
        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startTime' when calling enterpriseGrouponOrderRefundApplyListGet");
        }
        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endTime' when calling enterpriseGrouponOrderRefundApplyListGet");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/groupon/order/refund/apply/list/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_time", endTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200> returnType = new ParameterizedTypeReference<EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

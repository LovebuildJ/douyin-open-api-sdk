package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.ExternalDataSdkShareExternalDataSdkShareInlineResponse200;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:30.168960+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.DataShareSdkShareApi")
public class DataShareSdkShareApi {
    private ApiClient apiClient;

    public DataShareSdkShareApi() {
        this(new ApiClient());
    }

    @Autowired
    public DataShareSdkShareApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 获取SDK分享视频数据
     * * Scope: &#x60;data.external.sdk_share&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param beginDate 最近30天，开始日期(yyyy-MM-dd)
     * @param endDate 最近30天，结束日期(yyyy-MM-dd)
     * @return ExternalDataSdkShareExternalDataSdkShareInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataSdkShareExternalDataSdkShareInlineResponse200 dataExternalSdkShareGet(String accessToken, String beginDate, String endDate) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalSdkShareGet");
        }
        // verify the required parameter 'beginDate' is set
        if (beginDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'beginDate' when calling dataExternalSdkShareGet");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling dataExternalSdkShareGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/sdk_share/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "begin_date", beginDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataSdkShareExternalDataSdkShareInlineResponse200> returnType = new ParameterizedTypeReference<ExternalDataSdkShareExternalDataSdkShareInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.ExternalDataPoiExternalDataPoiInlineResponse2002;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:15.723137+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.DataExternalPoiServiceBaseApi")
public class DataExternalPoiServiceBaseApi {
    private ApiClient apiClient;

    public DataExternalPoiServiceBaseApi() {
        this(new ApiClient());
    }

    @Autowired
    public DataExternalPoiServiceBaseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * POI服务基础数据
     * * Scope: &#x60;data.external.poi&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param poiId 抖音poi_id
     * @param beginDate 最近30天，开始日期(yyyy-MM-dd)
     * @param endDate 最近30天，结束日期(yyyy-MM-dd)
     * @param serviceType 服务类型，40:民宿
     * @return ExternalDataPoiExternalDataPoiInlineResponse2002
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataPoiExternalDataPoiInlineResponse2002 dataExternalPoiServiceBaseGet(String accessToken, String poiId, String beginDate, String endDate, Integer serviceType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalPoiServiceBaseGet");
        }
        // verify the required parameter 'poiId' is set
        if (poiId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'poiId' when calling dataExternalPoiServiceBaseGet");
        }
        // verify the required parameter 'beginDate' is set
        if (beginDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'beginDate' when calling dataExternalPoiServiceBaseGet");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling dataExternalPoiServiceBaseGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/poi/service_base/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "poi_id", poiId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "service_type", serviceType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "begin_date", beginDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataPoiExternalDataPoiInlineResponse2002> returnType = new ParameterizedTypeReference<ExternalDataPoiExternalDataPoiInlineResponse2002>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

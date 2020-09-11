package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.PoiProductProductInlineResponse2003;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.PoiSkuApi")
public class PoiSkuApi {
    private ApiClient apiClient;

    public PoiSkuApi() {
        this(new ApiClient());
    }

    @Autowired
    public PoiSkuApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * sku拉取(该接口由接入方实现)
     * # 该接口由接入方实现 
     * <p><b>200</b>
     * @param spuExtId 接入方SPU ID 列表
     * @param startDate 拉取价格时间区间[start_date, end_date)
     * @param endDate 拉取价格时间区间[start_date, end_date)
     * @return PoiProductProductInlineResponse2003
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PoiProductProductInlineResponse2003 poiExtHotelSkuGet(List<String> spuExtId, String startDate, String endDate) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'spuExtId' is set
        if (spuExtId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'spuExtId' when calling poiExtHotelSkuGet");
        }
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling poiExtHotelSkuGet");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling poiExtHotelSkuGet");
        }
        String path = UriComponentsBuilder.fromPath("/poi/ext/hotel/sku/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "spu_ext_id", spuExtId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PoiProductProductInlineResponse2003> returnType = new ParameterizedTypeReference<PoiProductProductInlineResponse2003>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

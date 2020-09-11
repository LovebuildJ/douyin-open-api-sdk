package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.ShareIdShareIdInlineResponse200;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:04:09.800353+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.ShareIdApi")
public class ShareIdApi {
    private ApiClient apiClient;

    public ShareIdApi() {
        this(new ApiClient());
    }

    @Autowired
    public ShareIdApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 获取share-id
     * * Scope: &#x60;aweme.share&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param needCallback 如果需要知道视频分享成功的结果，need_callback设置为true
     * @param sourceStyleId 多来源样式id（暂未开放）
     * @param defaultHashtag 追踪分享默认hashtag
     * @param linkParam 分享来源url附加参数（暂未开放）
     * @return ShareIdShareIdInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ShareIdShareIdInlineResponse200 shareIdGet(String accessToken, Boolean needCallback, String sourceStyleId, String defaultHashtag, String linkParam) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling shareIdGet");
        }
        String path = UriComponentsBuilder.fromPath("/share-id/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "need_callback", needCallback));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source_style_id", sourceStyleId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "default_hashtag", defaultHashtag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "link_param", linkParam));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ShareIdShareIdInlineResponse200> returnType = new ParameterizedTypeReference<ShareIdShareIdInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

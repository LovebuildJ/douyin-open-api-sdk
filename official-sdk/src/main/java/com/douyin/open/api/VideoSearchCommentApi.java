package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.VideoSearchCommentVideoSearchCommentBody;
import com.douyin.open.models.VideoSearchCommentVideoSearchCommentInlineResponse200;
import com.douyin.open.models.VideoSearchCommentVideoSearchCommentInlineResponse2001;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:05:33.306577+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.VideoSearchCommentApi")
public class VideoSearchCommentApi {
    private ApiClient apiClient;

    public VideoSearchCommentApi() {
        this(new ApiClient());
    }

    @Autowired
    public VideoSearchCommentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 评论列表
     * * Scope: &#x60;video.search.comment&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param count 每页数量
     * @param secItemId 视频搜索接口返回的加密的视频id
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
     * @return VideoSearchCommentVideoSearchCommentInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoSearchCommentVideoSearchCommentInlineResponse200 videoSearchCommentListGet(String accessToken, Integer count, String secItemId, Long cursor) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling videoSearchCommentListGet");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling videoSearchCommentListGet");
        }
        // verify the required parameter 'secItemId' is set
        if (secItemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'secItemId' when calling videoSearchCommentListGet");
        }
        String path = UriComponentsBuilder.fromPath("/video/search/comment/list/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sec_item_id", secItemId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<VideoSearchCommentVideoSearchCommentInlineResponse200> returnType = new ParameterizedTypeReference<VideoSearchCommentVideoSearchCommentInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 评论回复列表
     * * Scope: &#x60;video.search.comment&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param count 每页数量
     * @param secItemId 视频搜索接口返回的加密的视频id
     * @param commentId 评论id
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
     * @return VideoSearchCommentVideoSearchCommentInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoSearchCommentVideoSearchCommentInlineResponse200 videoSearchCommentReplyListGet(String accessToken, Integer count, String secItemId, String commentId, Long cursor) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling videoSearchCommentReplyListGet");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling videoSearchCommentReplyListGet");
        }
        // verify the required parameter 'secItemId' is set
        if (secItemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'secItemId' when calling videoSearchCommentReplyListGet");
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling videoSearchCommentReplyListGet");
        }
        String path = UriComponentsBuilder.fromPath("/video/search/comment/reply/list/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sec_item_id", secItemId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "comment_id", commentId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<VideoSearchCommentVideoSearchCommentInlineResponse200> returnType = new ParameterizedTypeReference<VideoSearchCommentVideoSearchCommentInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 回复视频评论
     * * Scope: &#x60;video.search.comment&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param body The body parameter
     * @return VideoSearchCommentVideoSearchCommentInlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoSearchCommentVideoSearchCommentInlineResponse2001 videoSearchCommentReplyPost(String openId, String accessToken, VideoSearchCommentVideoSearchCommentBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling videoSearchCommentReplyPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling videoSearchCommentReplyPost");
        }
        String path = UriComponentsBuilder.fromPath("/video/search/comment/reply/").build().toUriString();
        
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

        ParameterizedTypeReference<VideoSearchCommentVideoSearchCommentInlineResponse2001> returnType = new ParameterizedTypeReference<VideoSearchCommentVideoSearchCommentInlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.VideoCommentVideoCommentBody;
import com.douyin.open.models.VideoCommentVideoCommentBody1;
import com.douyin.open.models.VideoCommentVideoCommentCommonResponse;
import com.douyin.open.models.VideoCommentVideoCommentInlineResponse200;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:05:12.559217+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.VideoCommentApi")
public class VideoCommentApi {
    private ApiClient apiClient;

    public VideoCommentApi() {
        this(new ApiClient());
    }

    @Autowired
    public VideoCommentApi(ApiClient apiClient) {
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
     * * Scope: &#x60;video.comment&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param count 每页数量
     * @param itemId 视频id
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
     * @return VideoCommentVideoCommentInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoCommentVideoCommentInlineResponse200 videoCommentListGet(String openId, String accessToken, Integer count, String itemId, Long cursor) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling videoCommentListGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling videoCommentListGet");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling videoCommentListGet");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemId' when calling videoCommentListGet");
        }
        String path = UriComponentsBuilder.fromPath("/video/comment/list/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "item_id", itemId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<VideoCommentVideoCommentInlineResponse200> returnType = new ParameterizedTypeReference<VideoCommentVideoCommentInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 评论回复列表
     * * Scope: &#x60;video.comment&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param count 每页数量
     * @param itemId 视频id
     * @param commentId 评论id
     * @param cursor 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
     * @return VideoCommentVideoCommentInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoCommentVideoCommentInlineResponse200 videoCommentReplyListGet(String openId, String accessToken, Integer count, String itemId, String commentId, Long cursor) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling videoCommentReplyListGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling videoCommentReplyListGet");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling videoCommentReplyListGet");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemId' when calling videoCommentReplyListGet");
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling videoCommentReplyListGet");
        }
        String path = UriComponentsBuilder.fromPath("/video/comment/reply/list/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "item_id", itemId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "comment_id", commentId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<VideoCommentVideoCommentInlineResponse200> returnType = new ParameterizedTypeReference<VideoCommentVideoCommentInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 回复视频评论
     * * Scope: &#x60;video.comment&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param body The body parameter
     * @return VideoCommentVideoCommentCommonResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoCommentVideoCommentCommonResponse videoCommentReplyPost(String openId, String accessToken, VideoCommentVideoCommentBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling videoCommentReplyPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling videoCommentReplyPost");
        }
        String path = UriComponentsBuilder.fromPath("/video/comment/reply/").build().toUriString();
        
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

        ParameterizedTypeReference<VideoCommentVideoCommentCommonResponse> returnType = new ParameterizedTypeReference<VideoCommentVideoCommentCommonResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 置顶视频评论(企业号)
     * * Scope: &#x60;video.comment&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param body The body parameter
     * @return VideoCommentVideoCommentCommonResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoCommentVideoCommentCommonResponse videoCommentTopPost(String openId, String accessToken, VideoCommentVideoCommentBody1 body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling videoCommentTopPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling videoCommentTopPost");
        }
        String path = UriComponentsBuilder.fromPath("/video/comment/top/").build().toUriString();
        
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

        ParameterizedTypeReference<VideoCommentVideoCommentCommonResponse> returnType = new ParameterizedTypeReference<VideoCommentVideoCommentCommonResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

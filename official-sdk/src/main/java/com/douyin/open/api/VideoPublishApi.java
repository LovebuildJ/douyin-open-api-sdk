package com.douyin.open.api;

import com.douyin.open.ApiClient;

import java.io.File;
import com.douyin.open.models.VideoCreateAwemeCreateBody1;
import com.douyin.open.models.VideoCreateAwemeCreateInlineResponse200;
import com.douyin.open.models.VideoCreateAwemeCreateInlineResponse2001;
import com.douyin.open.models.VideoCreateAwemeCreateInlineResponse2002;
import com.douyin.open.models.VideoCreateAwemeCreateInlineResponse2003;
import com.douyin.open.models.VideoCreateAwemeCreateInlineResponse2004;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-19T14:21:48.922886+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.VideoPublishApi")
public class VideoPublishApi {
    private ApiClient apiClient;

    public VideoPublishApi() {
        this(new ApiClient());
    }

    @Autowired
    public VideoPublishApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 创建抖音视频
     * * Scope: &#x60;video.create&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param body The body parameter
     * @return VideoCreateAwemeCreateInlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoCreateAwemeCreateInlineResponse2001 videoCreatePost(String openId, String accessToken, VideoCreateAwemeCreateBody1 body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling videoCreatePost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling videoCreatePost");
        }
        String path = UriComponentsBuilder.fromPath("/video/create/").build().toUriString();
        
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

        ParameterizedTypeReference<VideoCreateAwemeCreateInlineResponse2001> returnType = new ParameterizedTypeReference<VideoCreateAwemeCreateInlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 完成上传
     * * Scope: &#x60;video.create&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param uploadId 分片上传的标记。有限时间为2小时。
     * @return VideoCreateAwemeCreateInlineResponse2004
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoCreateAwemeCreateInlineResponse2004 videoPartCompletePost(String openId, String accessToken, String uploadId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling videoPartCompletePost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling videoPartCompletePost");
        }
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadId' when calling videoPartCompletePost");
        }
        String path = UriComponentsBuilder.fromPath("/video/part/complete/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "upload_id", uploadId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<VideoCreateAwemeCreateInlineResponse2004> returnType = new ParameterizedTypeReference<VideoCreateAwemeCreateInlineResponse2004>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 初始化上传
     * * Scope: &#x60;video.create&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @return VideoCreateAwemeCreateInlineResponse2002
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoCreateAwemeCreateInlineResponse2002 videoPartInitPost(String openId, String accessToken) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling videoPartInitPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling videoPartInitPost");
        }
        String path = UriComponentsBuilder.fromPath("/video/part/init/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<VideoCreateAwemeCreateInlineResponse2002> returnType = new ParameterizedTypeReference<VideoCreateAwemeCreateInlineResponse2002>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 上传视频分片到文件服务器
     * * Scope: &#x60;video.create&#x60; 
     * <p><b>200</b>
     * @param video The video parameter
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param uploadId 分片上传的标记。有限时间为2小时。
     * @param partNumber 第几个分片，从1开始 
     * @return VideoCreateAwemeCreateInlineResponse2003
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoCreateAwemeCreateInlineResponse2003 videoPartUploadPost(File video, String openId, String accessToken, String uploadId, Integer partNumber) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'video' is set
        if (video == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'video' when calling videoPartUploadPost");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling videoPartUploadPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling videoPartUploadPost");
        }
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadId' when calling videoPartUploadPost");
        }
        // verify the required parameter 'partNumber' is set
        if (partNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partNumber' when calling videoPartUploadPost");
        }
        String path = UriComponentsBuilder.fromPath("/video/part/upload/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "upload_id", uploadId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "part_number", partNumber));
        if (video != null)
            formParams.add("video", new FileSystemResource(video));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<VideoCreateAwemeCreateInlineResponse2003> returnType = new ParameterizedTypeReference<VideoCreateAwemeCreateInlineResponse2003>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 上传视频到文件服务器
     * * Scope: &#x60;video.create&#x60; 
     * <p><b>200</b>
     * @param video The video parameter
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @return VideoCreateAwemeCreateInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VideoCreateAwemeCreateInlineResponse200 videoUploadPost(File video, String openId, String accessToken) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'video' is set
        if (video == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'video' when calling videoUploadPost");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling videoUploadPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling videoUploadPost");
        }
        String path = UriComponentsBuilder.fromPath("/video/upload/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        if (video != null)
            formParams.add("video", new FileSystemResource(video));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<VideoCreateAwemeCreateInlineResponse200> returnType = new ParameterizedTypeReference<VideoCreateAwemeCreateInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

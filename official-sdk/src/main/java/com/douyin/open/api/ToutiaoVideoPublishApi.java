package com.douyin.open.api;

import com.douyin.open.ApiClient;

import java.io.File;
import com.douyin.open.models.ToutiaoVideoCreateCreateBody1;
import com.douyin.open.models.ToutiaoVideoCreateCreateInlineResponse200;
import com.douyin.open.models.ToutiaoVideoCreateCreateInlineResponse2001;
import com.douyin.open.models.ToutiaoVideoCreateCreateInlineResponse2002;
import com.douyin.open.models.ToutiaoVideoCreateCreateInlineResponse2003;
import com.douyin.open.models.ToutiaoVideoCreateCreateInlineResponse2004;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:04:22.286450+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.ToutiaoVideoPublishApi")
public class ToutiaoVideoPublishApi {
    private ApiClient apiClient;

    public ToutiaoVideoPublishApi() {
        this(new ApiClient());
    }

    @Autowired
    public ToutiaoVideoPublishApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 创建头条视频
     * * Scope: &#x60;toutiao.video.create&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param body The body parameter
     * @return ToutiaoVideoCreateCreateInlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ToutiaoVideoCreateCreateInlineResponse2001 toutiaoVideoCreatePost(String openId, String accessToken, ToutiaoVideoCreateCreateBody1 body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling toutiaoVideoCreatePost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling toutiaoVideoCreatePost");
        }
        String path = UriComponentsBuilder.fromPath("/toutiao/video/create/").build().toUriString();
        
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

        ParameterizedTypeReference<ToutiaoVideoCreateCreateInlineResponse2001> returnType = new ParameterizedTypeReference<ToutiaoVideoCreateCreateInlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 完成上传
     * * Scope: &#x60;toutiao.video.create&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param uploadId 分片上传的标记。有限时间为2小时。
     * @return ToutiaoVideoCreateCreateInlineResponse2004
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ToutiaoVideoCreateCreateInlineResponse2004 toutiaoVideoPartCompletePost(String openId, String accessToken, String uploadId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling toutiaoVideoPartCompletePost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling toutiaoVideoPartCompletePost");
        }
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadId' when calling toutiaoVideoPartCompletePost");
        }
        String path = UriComponentsBuilder.fromPath("/toutiao/video/part/complete/").build().toUriString();
        
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

        ParameterizedTypeReference<ToutiaoVideoCreateCreateInlineResponse2004> returnType = new ParameterizedTypeReference<ToutiaoVideoCreateCreateInlineResponse2004>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 初始化上传
     * * Scope: &#x60;toutiao.video.create&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @return ToutiaoVideoCreateCreateInlineResponse2002
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ToutiaoVideoCreateCreateInlineResponse2002 toutiaoVideoPartInitPost(String openId, String accessToken) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling toutiaoVideoPartInitPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling toutiaoVideoPartInitPost");
        }
        String path = UriComponentsBuilder.fromPath("/toutiao/video/part/init/").build().toUriString();
        
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

        ParameterizedTypeReference<ToutiaoVideoCreateCreateInlineResponse2002> returnType = new ParameterizedTypeReference<ToutiaoVideoCreateCreateInlineResponse2002>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 上传视频分片到文件服务器
     * * Scope: &#x60;toutiao.video.create&#x60; 
     * <p><b>200</b>
     * @param video The video parameter
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param uploadId 分片上传的标记。有限时间为2小时。
     * @param partNumber 第几个分片，从1开始 
     * @return ToutiaoVideoCreateCreateInlineResponse2003
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ToutiaoVideoCreateCreateInlineResponse2003 toutiaoVideoPartUploadPost(File video, String openId, String accessToken, String uploadId, Integer partNumber) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'video' is set
        if (video == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'video' when calling toutiaoVideoPartUploadPost");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling toutiaoVideoPartUploadPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling toutiaoVideoPartUploadPost");
        }
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadId' when calling toutiaoVideoPartUploadPost");
        }
        // verify the required parameter 'partNumber' is set
        if (partNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partNumber' when calling toutiaoVideoPartUploadPost");
        }
        String path = UriComponentsBuilder.fromPath("/toutiao/video/part/upload/").build().toUriString();
        
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

        ParameterizedTypeReference<ToutiaoVideoCreateCreateInlineResponse2003> returnType = new ParameterizedTypeReference<ToutiaoVideoCreateCreateInlineResponse2003>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 上传视频到文件服务器
     * * Scope: &#x60;toutiao.video.create&#x60; 
     * <p><b>200</b>
     * @param video The video parameter
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @return ToutiaoVideoCreateCreateInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ToutiaoVideoCreateCreateInlineResponse200 toutiaoVideoUploadPost(File video, String openId, String accessToken) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'video' is set
        if (video == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'video' when calling toutiaoVideoUploadPost");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling toutiaoVideoUploadPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling toutiaoVideoUploadPost");
        }
        String path = UriComponentsBuilder.fromPath("/toutiao/video/upload/").build().toUriString();
        
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

        ParameterizedTypeReference<ToutiaoVideoCreateCreateInlineResponse200> returnType = new ParameterizedTypeReference<ToutiaoVideoCreateCreateInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

package com.douyin.open.api;

import com.douyin.open.ApiClient;

import java.io.File;
import com.douyin.open.models.XiguaVideoCreateBody1;
import com.douyin.open.models.XiguaVideoCreateInlineResponse200;
import com.douyin.open.models.XiguaVideoCreateInlineResponse2001;
import com.douyin.open.models.XiguaVideoCreateInlineResponse2002;
import com.douyin.open.models.XiguaVideoCreateInlineResponse2003;
import com.douyin.open.models.XiguaVideoCreateInlineResponse2004;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:04:43.516417+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.XiguaVideoPublishApi")
public class XiguaVideoPublishApi {
    private ApiClient apiClient;

    public XiguaVideoPublishApi() {
        this(new ApiClient());
    }

    @Autowired
    public XiguaVideoPublishApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 创建西瓜视频
     * * Scope: &#x60;xigua.video.create&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param body The body parameter
     * @return XiguaVideoCreateInlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XiguaVideoCreateInlineResponse2001 xiguaVideoCreatePost(String openId, String accessToken, XiguaVideoCreateBody1 body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling xiguaVideoCreatePost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling xiguaVideoCreatePost");
        }
        String path = UriComponentsBuilder.fromPath("/xigua/video/create/").build().toUriString();
        
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

        ParameterizedTypeReference<XiguaVideoCreateInlineResponse2001> returnType = new ParameterizedTypeReference<XiguaVideoCreateInlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 完成上传
     * * Scope: &#x60;xigua.video.create&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param uploadId 分片上传的标记。有限时间为2小时。
     * @return XiguaVideoCreateInlineResponse2004
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XiguaVideoCreateInlineResponse2004 xiguaVideoPartCompletePost(String openId, String accessToken, String uploadId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling xiguaVideoPartCompletePost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling xiguaVideoPartCompletePost");
        }
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadId' when calling xiguaVideoPartCompletePost");
        }
        String path = UriComponentsBuilder.fromPath("/xigua/video/part/complete/").build().toUriString();
        
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

        ParameterizedTypeReference<XiguaVideoCreateInlineResponse2004> returnType = new ParameterizedTypeReference<XiguaVideoCreateInlineResponse2004>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 初始化上传
     * * Scope: &#x60;xigua.video.create&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @return XiguaVideoCreateInlineResponse2002
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XiguaVideoCreateInlineResponse2002 xiguaVideoPartInitPost(String openId, String accessToken) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling xiguaVideoPartInitPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling xiguaVideoPartInitPost");
        }
        String path = UriComponentsBuilder.fromPath("/xigua/video/part/init/").build().toUriString();
        
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

        ParameterizedTypeReference<XiguaVideoCreateInlineResponse2002> returnType = new ParameterizedTypeReference<XiguaVideoCreateInlineResponse2002>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 上传视频分片到文件服务器
     * * Scope: &#x60;xigua.video.create&#x60; 
     * <p><b>200</b>
     * @param video The video parameter
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param uploadId 分片上传的标记。有限时间为2小时。
     * @param partNumber 第几个分片，从1开始 
     * @return XiguaVideoCreateInlineResponse2003
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XiguaVideoCreateInlineResponse2003 xiguaVideoPartUploadPost(File video, String openId, String accessToken, String uploadId, Integer partNumber) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'video' is set
        if (video == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'video' when calling xiguaVideoPartUploadPost");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling xiguaVideoPartUploadPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling xiguaVideoPartUploadPost");
        }
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadId' when calling xiguaVideoPartUploadPost");
        }
        // verify the required parameter 'partNumber' is set
        if (partNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partNumber' when calling xiguaVideoPartUploadPost");
        }
        String path = UriComponentsBuilder.fromPath("/xigua/video/part/upload/").build().toUriString();
        
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

        ParameterizedTypeReference<XiguaVideoCreateInlineResponse2003> returnType = new ParameterizedTypeReference<XiguaVideoCreateInlineResponse2003>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 上传视频到文件服务器
     * * Scope: &#x60;xigua.video.create&#x60; 
     * <p><b>200</b>
     * @param video The video parameter
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @return XiguaVideoCreateInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XiguaVideoCreateInlineResponse200 xiguaVideoUploadPost(File video, String openId, String accessToken) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'video' is set
        if (video == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'video' when calling xiguaVideoUploadPost");
        }
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling xiguaVideoUploadPost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling xiguaVideoUploadPost");
        }
        String path = UriComponentsBuilder.fromPath("/xigua/video/upload/").build().toUriString();
        
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

        ParameterizedTypeReference<XiguaVideoCreateInlineResponse200> returnType = new ParameterizedTypeReference<XiguaVideoCreateInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

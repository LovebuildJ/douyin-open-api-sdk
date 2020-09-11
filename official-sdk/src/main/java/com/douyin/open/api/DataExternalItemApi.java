package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.ExternalDataItemExternalDataItemInlineResponse200;
import com.douyin.open.models.ExternalDataItemExternalDataItemInlineResponse2001;
import com.douyin.open.models.ExternalDataItemExternalDataItemInlineResponse2002;
import com.douyin.open.models.ExternalDataItemExternalDataItemInlineResponse2003;
import com.douyin.open.models.ExternalDataItemExternalDataItemInlineResponse2004;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:05:48.688040+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.DataExternalItemApi")
public class DataExternalItemApi {
    private ApiClient apiClient;

    public DataExternalItemApi() {
        this(new ApiClient());
    }

    @Autowired
    public DataExternalItemApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 获取视频基础数据
     * * Scope: &#x60;data.external.item&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param itemId item_id，仅能查询access_token对应用户上传的视频
     * @return ExternalDataItemExternalDataItemInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataItemExternalDataItemInlineResponse200 dataExternalItemBaseGet(String openId, String accessToken, String itemId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling dataExternalItemBaseGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalItemBaseGet");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemId' when calling dataExternalItemBaseGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/item/base/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "item_id", itemId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataItemExternalDataItemInlineResponse200> returnType = new ParameterizedTypeReference<ExternalDataItemExternalDataItemInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取视频评论数据
     * * Scope: &#x60;data.external.item&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param itemId item_id，仅能查询access_token对应用户上传的视频
     * @param dateType 近7/15天；输入7代表7天、15代表15天
     * @return ExternalDataItemExternalDataItemInlineResponse2002
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataItemExternalDataItemInlineResponse2002 dataExternalItemCommentGet(String openId, String accessToken, String itemId, Integer dateType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling dataExternalItemCommentGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalItemCommentGet");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemId' when calling dataExternalItemCommentGet");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateType' when calling dataExternalItemCommentGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/item/comment/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "item_id", itemId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_type", dateType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataItemExternalDataItemInlineResponse2002> returnType = new ParameterizedTypeReference<ExternalDataItemExternalDataItemInlineResponse2002>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取视频点赞数据
     * * Scope: &#x60;data.external.item&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param itemId item_id，仅能查询access_token对应用户上传的视频
     * @param dateType 近7/15天；输入7代表7天、15代表15天
     * @return ExternalDataItemExternalDataItemInlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataItemExternalDataItemInlineResponse2001 dataExternalItemLikeGet(String openId, String accessToken, String itemId, Integer dateType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling dataExternalItemLikeGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalItemLikeGet");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemId' when calling dataExternalItemLikeGet");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateType' when calling dataExternalItemLikeGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/item/like/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "item_id", itemId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_type", dateType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataItemExternalDataItemInlineResponse2001> returnType = new ParameterizedTypeReference<ExternalDataItemExternalDataItemInlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取视频播放数据
     * * Scope: &#x60;data.external.item&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param itemId item_id，仅能查询access_token对应用户上传的视频
     * @param dateType 近7/15天；输入7代表7天、15代表15天
     * @return ExternalDataItemExternalDataItemInlineResponse2003
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataItemExternalDataItemInlineResponse2003 dataExternalItemPlayGet(String openId, String accessToken, String itemId, Integer dateType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling dataExternalItemPlayGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalItemPlayGet");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemId' when calling dataExternalItemPlayGet");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateType' when calling dataExternalItemPlayGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/item/play/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "item_id", itemId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_type", dateType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataItemExternalDataItemInlineResponse2003> returnType = new ParameterizedTypeReference<ExternalDataItemExternalDataItemInlineResponse2003>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取视频分享数据
     * * Scope: &#x60;data.external.item&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param itemId item_id，仅能查询access_token对应用户上传的视频
     * @param dateType 近7/15天；输入7代表7天、15代表15天
     * @return ExternalDataItemExternalDataItemInlineResponse2004
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataItemExternalDataItemInlineResponse2004 dataExternalItemShareGet(String openId, String accessToken, String itemId, Integer dateType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling dataExternalItemShareGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalItemShareGet");
        }
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemId' when calling dataExternalItemShareGet");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateType' when calling dataExternalItemShareGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/item/share/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "item_id", itemId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_type", dateType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataItemExternalDataItemInlineResponse2004> returnType = new ParameterizedTypeReference<ExternalDataItemExternalDataItemInlineResponse2004>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

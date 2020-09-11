package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.ExternalDataUserExternalDataUserInlineResponse200;
import com.douyin.open.models.ExternalDataUserExternalDataUserInlineResponse2001;
import com.douyin.open.models.ExternalDataUserExternalDataUserInlineResponse2002;
import com.douyin.open.models.ExternalDataUserExternalDataUserInlineResponse2003;
import com.douyin.open.models.ExternalDataUserExternalDataUserInlineResponse2004;
import com.douyin.open.models.ExternalDataUserExternalDataUserInlineResponse2005;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:05:40.426937+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.DataExternalUserApi")
public class DataExternalUserApi {
    private ApiClient apiClient;

    public DataExternalUserApi() {
        this(new ApiClient());
    }

    @Autowired
    public DataExternalUserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 获取用户评论数
     * * Scope: &#x60;data.external.user&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param dateType 近7/15天；输入7代表7天、15代表15天、30代表30天
     * @return ExternalDataUserExternalDataUserInlineResponse2003
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataUserExternalDataUserInlineResponse2003 dataExternalUserCommentGet(String openId, String accessToken, Integer dateType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling dataExternalUserCommentGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalUserCommentGet");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateType' when calling dataExternalUserCommentGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/user/comment/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_type", dateType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataUserExternalDataUserInlineResponse2003> returnType = new ParameterizedTypeReference<ExternalDataUserExternalDataUserInlineResponse2003>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取用户粉丝数
     * * Scope: &#x60;data.external.user&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param dateType 近7/15天；输入7代表7天、15代表15天、30代表30天
     * @return ExternalDataUserExternalDataUserInlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataUserExternalDataUserInlineResponse2001 dataExternalUserFansGet(String openId, String accessToken, Integer dateType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling dataExternalUserFansGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalUserFansGet");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateType' when calling dataExternalUserFansGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/user/fans/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_type", dateType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataUserExternalDataUserInlineResponse2001> returnType = new ParameterizedTypeReference<ExternalDataUserExternalDataUserInlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取用户视频情况
     * * Scope: &#x60;data.external.user&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param dateType 近7/15天；输入7代表7天、15代表15天、30代表30天
     * @return ExternalDataUserExternalDataUserInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataUserExternalDataUserInlineResponse200 dataExternalUserItemGet(String openId, String accessToken, Integer dateType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling dataExternalUserItemGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalUserItemGet");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateType' when calling dataExternalUserItemGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/user/item/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_type", dateType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataUserExternalDataUserInlineResponse200> returnType = new ParameterizedTypeReference<ExternalDataUserExternalDataUserInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取用户点赞数
     * * Scope: &#x60;data.external.user&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param dateType 近7/15天；输入7代表7天、15代表15天、30代表30天
     * @return ExternalDataUserExternalDataUserInlineResponse2002
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataUserExternalDataUserInlineResponse2002 dataExternalUserLikeGet(String openId, String accessToken, Integer dateType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling dataExternalUserLikeGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalUserLikeGet");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateType' when calling dataExternalUserLikeGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/user/like/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_type", dateType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataUserExternalDataUserInlineResponse2002> returnType = new ParameterizedTypeReference<ExternalDataUserExternalDataUserInlineResponse2002>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取用户主页访问数
     * * Scope: &#x60;data.external.user&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param dateType 近7/15天；输入7代表7天、15代表15天、30代表30天
     * @return ExternalDataUserExternalDataUserInlineResponse2005
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataUserExternalDataUserInlineResponse2005 dataExternalUserProfileGet(String openId, String accessToken, Integer dateType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling dataExternalUserProfileGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalUserProfileGet");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateType' when calling dataExternalUserProfileGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/user/profile/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_type", dateType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataUserExternalDataUserInlineResponse2005> returnType = new ParameterizedTypeReference<ExternalDataUserExternalDataUserInlineResponse2005>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取用户分享数
     * * Scope: &#x60;data.external.user&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param dateType 近7/15天；输入7代表7天、15代表15天、30代表30天
     * @return ExternalDataUserExternalDataUserInlineResponse2004
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataUserExternalDataUserInlineResponse2004 dataExternalUserShareGet(String openId, String accessToken, Integer dateType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling dataExternalUserShareGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalUserShareGet");
        }
        // verify the required parameter 'dateType' is set
        if (dateType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateType' when calling dataExternalUserShareGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/user/share/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_type", dateType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataUserExternalDataUserInlineResponse2004> returnType = new ParameterizedTypeReference<ExternalDataUserExternalDataUserInlineResponse2004>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

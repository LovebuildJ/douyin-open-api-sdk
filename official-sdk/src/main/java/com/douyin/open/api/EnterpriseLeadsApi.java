package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.EnterpriseLeadsLeadsUserBody;
import com.douyin.open.models.EnterpriseLeadsLeadsUserBody1;
import com.douyin.open.models.EnterpriseLeadsLeadsUserBody2;
import com.douyin.open.models.EnterpriseLeadsLeadsUserBody3;
import com.douyin.open.models.EnterpriseLeadsLeadsUserInlineResponse200;
import com.douyin.open.models.EnterpriseLeadsLeadsUserInlineResponse2001;
import com.douyin.open.models.EnterpriseLeadsLeadsUserInlineResponse2002;
import com.douyin.open.models.EnterpriseLeadsLeadsUserInlineResponse2003;
import com.douyin.open.models.EnterpriseLeadsLeadsUserInlineResponse2004;
import com.douyin.open.models.EnterpriseLeadsLeadsUserInlineResponse2005;
import com.douyin.open.models.EnterpriseLeadsLeadsUserInlineResponse2006;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:36.469880+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.EnterpriseLeadsApi")
public class EnterpriseLeadsApi {
    private ApiClient apiClient;

    public EnterpriseLeadsApi() {
        this(new ApiClient());
    }

    @Autowired
    public EnterpriseLeadsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 创建标签
     * * Scope: &#x60;enterprise.data&#x60; * 一个企业号最多创建100个标签 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param body The body parameter
     * @return EnterpriseLeadsLeadsUserInlineResponse2005
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseLeadsLeadsUserInlineResponse2005 enterpriseLeadsTagCreatePost(String openId, String accessToken, EnterpriseLeadsLeadsUserBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseLeadsTagCreatePost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseLeadsTagCreatePost");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/leads/tag/create/").build().toUriString();
        
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

        ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2005> returnType = new ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2005>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 删除标签
     * * Scope: &#x60;enterprise.data&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param body The body parameter
     * @return EnterpriseLeadsLeadsUserInlineResponse2006
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseLeadsLeadsUserInlineResponse2006 enterpriseLeadsTagDeletePost(String openId, String accessToken, EnterpriseLeadsLeadsUserBody2 body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseLeadsTagDeletePost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseLeadsTagDeletePost");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/leads/tag/delete/").build().toUriString();
        
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

        ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2006> returnType = new ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2006>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取标签列表
     * * Scope: &#x60;enterprise.data&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param count 每页数量
     * @param cursor 分页游标
     * @return EnterpriseLeadsLeadsUserInlineResponse2003
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseLeadsLeadsUserInlineResponse2003 enterpriseLeadsTagListGet(String openId, String accessToken, Integer count, Long cursor) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseLeadsTagListGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseLeadsTagListGet");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling enterpriseLeadsTagListGet");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/leads/tag/list/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2003> returnType = new ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2003>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 编辑标签
     * * Scope: &#x60;enterprise.data&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param body The body parameter
     * @return EnterpriseLeadsLeadsUserInlineResponse2005
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseLeadsLeadsUserInlineResponse2005 enterpriseLeadsTagUpdatePost(String openId, String accessToken, EnterpriseLeadsLeadsUserBody1 body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseLeadsTagUpdatePost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseLeadsTagUpdatePost");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/leads/tag/update/").build().toUriString();
        
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

        ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2005> returnType = new ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2005>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取打标签的用户列表
     * * Scope: &#x60;enterprise.data&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param count 每页数量
     * @param tagId The tagId parameter
     * @param cursor 分页游标
     * @return EnterpriseLeadsLeadsUserInlineResponse2004
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseLeadsLeadsUserInlineResponse2004 enterpriseLeadsTagUserListGet(String openId, String accessToken, Integer count, Integer tagId, Long cursor) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseLeadsTagUserListGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseLeadsTagUserListGet");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling enterpriseLeadsTagUserListGet");
        }
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tagId' when calling enterpriseLeadsTagUserListGet");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/leads/tag/user/list/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tag_id", tagId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2004> returnType = new ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2004>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 给用户设置标签
     * * Scope: &#x60;enterprise.data&#x60; * 一个用户最多设置5个标签 
     * <p><b>200</b> - * Scope: &#x60;enterprise.data&#x60; 
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param body The body parameter
     * @return EnterpriseLeadsLeadsUserInlineResponse2006
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseLeadsLeadsUserInlineResponse2006 enterpriseLeadsTagUserUpdatePost(String openId, String accessToken, EnterpriseLeadsLeadsUserBody3 body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseLeadsTagUserUpdatePost");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseLeadsTagUserUpdatePost");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/leads/tag/user/update/").build().toUriString();
        
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

        ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2006> returnType = new ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2006>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取意向用户互动记录
     * * Scope: &#x60;enterprise.data&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param count 每页数量
     * @param userId The userId parameter
     * @param cursor The cursor parameter
     * @param actionType The actionType parameter
     * @return EnterpriseLeadsLeadsUserInlineResponse2002
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseLeadsLeadsUserInlineResponse2002 enterpriseLeadsUserActionListGet(String openId, String accessToken, Integer count, String userId, String cursor, Integer actionType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseLeadsUserActionListGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseLeadsUserActionListGet");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling enterpriseLeadsUserActionListGet");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling enterpriseLeadsUserActionListGet");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/leads/user/action/list/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "user_id", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "action_type", actionType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2002> returnType = new ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2002>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取意向用户详情
     * * Scope: &#x60;enterprise.data&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param userId The userId parameter
     * @return EnterpriseLeadsLeadsUserInlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseLeadsLeadsUserInlineResponse2001 enterpriseLeadsUserDetailGet(String openId, String accessToken, String userId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseLeadsUserDetailGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseLeadsUserDetailGet");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling enterpriseLeadsUserDetailGet");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/leads/user/detail/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "user_id", userId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2001> returnType = new ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 获取意向用户列表
     * * Scope: &#x60;enterprise.data&#x60; 
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param count 每页数量
     * @param startTime The startTime parameter
     * @param endTime The endTime parameter
     * @param actionType 分类:   * &#x60;0&#x60; - 全部   * &#x60;1&#x60; - 私信互动   * &#x60;2&#x60; - 组件互动   * &#x60;3&#x60; - 主页互动 
     * @param cursor 分页游标
     * @param leadsLevel 用户状态:   * &#x60;-1&#x60; - 没兴趣   * &#x60;0&#x60; - 了解   * &#x60;1&#x60; - 有兴趣   * &#x60;2&#x60; - 有意愿   * &#x60;10&#x60; - 已转化 
     * @return EnterpriseLeadsLeadsUserInlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnterpriseLeadsLeadsUserInlineResponse200 enterpriseLeadsUserListGet(String openId, String accessToken, Integer count, Integer startTime, Integer endTime, Integer actionType, Long cursor, Integer leadsLevel) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'openId' is set
        if (openId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'openId' when calling enterpriseLeadsUserListGet");
        }
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling enterpriseLeadsUserListGet");
        }
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling enterpriseLeadsUserListGet");
        }
        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startTime' when calling enterpriseLeadsUserListGet");
        }
        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endTime' when calling enterpriseLeadsUserListGet");
        }
        // verify the required parameter 'actionType' is set
        if (actionType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'actionType' when calling enterpriseLeadsUserListGet");
        }
        String path = UriComponentsBuilder.fromPath("/enterprise/leads/user/list/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "open_id", openId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_time", endTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "leads_level", leadsLevel));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "action_type", actionType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse200> returnType = new ParameterizedTypeReference<EnterpriseLeadsLeadsUserInlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}

/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.api;

import com.douyin.open.models.ExternalDataSdkShareExternalDataSdkShareInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataShareSdkShareApi
 */
@Ignore
public class DataShareSdkShareApiTest {

    private final DataShareSdkShareApi api = new DataShareSdkShareApi();

    /**
     * 获取SDK分享视频数据
     *
     * * Scope: &#x60;data.external.sdk_share&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalSdkShareGetTest() {
        String accessToken = null;
        String beginDate = null;
        String endDate = null;
        ExternalDataSdkShareExternalDataSdkShareInlineResponse200 response = api.dataExternalSdkShareGet(accessToken, beginDate, endDate);

        // TODO: test validations
    }
}
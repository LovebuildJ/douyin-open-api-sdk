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

import com.douyin.open.models.PoiProductProductInlineResponse2003;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PoiSkuApi
 */
@Ignore
public class PoiSkuApiTest {

    private final PoiSkuApi api = new PoiSkuApi();

    /**
     * sku拉取(该接口由接入方实现)
     *
     * # 该接口由接入方实现 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiExtHotelSkuGetTest() {
        List<String> spuExtId = null;
        String startDate = null;
        String endDate = null;
        PoiProductProductInlineResponse2003 response = api.poiExtHotelSkuGet(spuExtId, startDate, endDate);

        // TODO: test validations
    }
}

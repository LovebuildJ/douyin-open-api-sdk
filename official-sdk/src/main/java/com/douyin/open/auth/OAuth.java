package com.douyin.open.auth;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-19T14:21:48.922886+08:00[Asia/Shanghai]")public class OAuth implements Authentication {
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public void applyToParams(MultiValueMap<String, String> queryParams, HttpHeaders headerParams) {
        if (accessToken != null) {
            headerParams.add(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        }
    }
}

package com.jason.open.api.account;

import cn.hutool.core.util.StrUtil;
import com.douyin.open.api.*;
import com.douyin.open.models.Oauth2NewRefreshTokenInlineResponse200;
import com.douyin.open.models.Oauth2RefreshTokenInlineResponse200;
import com.douyin.open.models.ToutiaoOauth2Oauth2InlineResponse200;
import com.douyin.open.models.ToutiaoOauth2Oauth2InlineResponse2002;
import com.jason.open.api.utils.DouyinConfig;
import com.jason.open.api.utils.exception.AccountException;
import org.apache.log4j.Logger;
import org.springframework.web.client.RestClientException;

/**
 * @Description 账号授权
 * @Date 2020/9/11 11:10
 * @Author by 尘心
 */
public class AccountAuth {

    /** 日志打印 */
    private static Logger log = Logger.getLogger(AccountAuth.class);

    /** 抖音官方授权api */
    private OauthCodeApi api;

    /** 头条官方授权api */
    private ToutiaoAuthCodeApi toutiaoApi;

    /** 获取access token 的api */
    private DefaultApi defaultApi;

    /** 获取刷新 refresh token */
    private RenewRefreshTokenApi refreshTokenApi;

    /** 获取刷新 access token */
    private RefreshTokenApi tokenApi;

    /** client token api */
    private ToutiaoClientTokenApi clientTokenApi;

    /** 读取配置文件 */
    private DouyinConfig config ;

    /** 初始构造器 */
    public AccountAuth() {
        init();
    }

    /** 初始化 */
    private void init() {
        if (api == null) {
            api = new OauthCodeApi();
        }

        if (config == null) {
            config = new DouyinConfig();
        }

        if (toutiaoApi == null) {
            toutiaoApi = new ToutiaoAuthCodeApi();
        }

        if (refreshTokenApi == null) {
            refreshTokenApi = new RenewRefreshTokenApi();
        }

        if (defaultApi == null) {
            defaultApi = new DefaultApi();
        }

        if (clientTokenApi == null) {
            clientTokenApi = new ToutiaoClientTokenApi();
        }
    }


    /**
     * 获取抖音授权码(code)
     * <p>
     *     注意该URL不是用来请求的, 需要展示给用户用于扫码。 在抖音APP支持端内唤醒的版本内打开的话会弹出客户端原生授权页面。
     *     获取的code可以用来调用获取acccess_token
     * </p>
     * <p>
     *     使用本接口前提:
     *      1. 首先你需要去官网申请，使你的应用可以使用特定的Scope，具体需要哪些Scope，请查看各接口定义。
     *      2. 其次你需要在本URL的scope字段中填上用户需要授权给你的Scope。
     *      3. 用户授权通过后，你才可以调用相应的接口。
     * </p>
     */
    public void getDouyinCode() {
        try {
            api.platformOauthConnectGet(config.getClientKey(),config.getResponseType(),config.getScope(),config.getRedirectUri(),config.getState());
        } catch (RestClientException e) {
            log.info("获取授权码异常：Exception when calling OauthCodeApi#platformOauthConnectGet");
            e.printStackTrace();
        }
    }

    /**
     * 获取头条授权码(code)
     *
     */
    public void getToutiaoCode() {
        try {
            toutiaoApi.oauthAuthorizeGet(config.getClientKey(),config.getResponseType(),config.getScope(),config.getRedirectUri(),config.getState());
        } catch (RestClientException e) {
            log.info("获取授权码异常：Exception when calling ToutiaoAuthCodeApi#oauthAuthorizeGet");
            e.printStackTrace();
        }
    }

    /**
     * 获取access token
     * @param code 授权码
     */
    public ToutiaoOauth2Oauth2InlineResponse200 getAccessToken(String code) {

        ToutiaoOauth2Oauth2InlineResponse200 result = null;
        if (StrUtil.isBlank(code)) {
            throw new AccountException("授权码不能为空!!");
        }

        try {
            result = defaultApi.oauthAccessTokenGet(config.getClientKey(),config.getClientSecret(),code,config.getGrantType());
        } catch (RestClientException e) {
            log.error("获取Access Token 失败：Exception when calling DefaultApi#oauthAccessTokenGet");
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 刷新refresh token
     * @param refreshToken 填写通过access_token获取到的refresh_token参数
     */
    public Oauth2NewRefreshTokenInlineResponse200 refreshRefreshToken(String refreshToken) {
        if (StrUtil.isBlank(refreshToken)) {
            throw new AccountException("refresh token 不能为空!!");
        }

        return refreshTokenApi.oauthRenewRefreshTokenGet(config.getClientKey(), refreshToken);
    }

    /**
     * 生成client_token
     */
    public ToutiaoOauth2Oauth2InlineResponse2002 createClientToken() {
        ToutiaoOauth2Oauth2InlineResponse2002 result = null;
        try {
            result = clientTokenApi.oauthClientTokenGet(config.getClientKey(),config.getClientSecret(),config.getGrantType());
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 刷新 access token
     * @param refreshToken 填写通过access_token获取到的refresh_token参数
     */
    public Oauth2RefreshTokenInlineResponse200 refreshAccessToken(String refreshToken) {
        if (StrUtil.isBlank(refreshToken)) {
            throw new AccountException("refresh token 不能为空!!");
        }

        Oauth2RefreshTokenInlineResponse200 result = null;
        try {
            result = tokenApi.oauthRefreshTokenGet(config.getClientKey(),config.getGrantType(),refreshToken);
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        return result;
    }
}

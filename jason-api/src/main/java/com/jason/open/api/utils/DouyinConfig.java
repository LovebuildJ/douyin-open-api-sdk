package com.jason.open.api.utils;

import cn.hutool.setting.dialect.Props;

/**
 * @Description 抖音api配置类
 * @Date 2020/9/11 11:59
 * @Author by 尘心
 */
public class DouyinConfig {

    private static Props props;

    private String state;

    public DouyinConfig() {
        if (props == null) {
            props = new Props(DouyinConstant.CONFIG_PATH);
        }
    }

    public String getClientKey() {
        return props.getStr("CLIENT_KEY");
    }


    public String getResponseType() {
        return props.getStr("RESPONSE_TYPE");
    }


    public String getScope() {
        return props.getStr("SCOPE");
    }


    public String getRedirectUri() {
        return props.getStr("REDIRECT_URI");
    }

    public String getClientSecret() {
        return props.getStr("CLIENT_SECRET");
    }


    public String getGrantType() {
        return props.getStr("GRANT_TYPE");
    }
    
    
    public String getState() {
        return state == null?"":state;
    }

    public void setState(String state) {
        this.state = state;
    }

}

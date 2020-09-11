package com.jason.open.api.user;

import cn.hutool.core.util.StrUtil;
import com.douyin.open.api.FansListApi;
import com.douyin.open.api.UserInfoApi;
import com.douyin.open.models.UserUserInfoUserInfoInlineResponse200;
import com.jason.open.api.utils.exception.UserException;
import org.springframework.web.client.RestClientException;

/**
 * @Description 用户管理
 * @Date 2020/9/11 14:15
 * @Author by 尘心
 */
public class UserManager {

    private UserInfoApi userInfoApi;

    private FansListApi fansListApi;

    public UserManager() {
        if (userInfoApi == null) {
            userInfoApi = new UserInfoApi();
        }

        if (fansListApi == null) {
            fansListApi = new FansListApi();
        }
    }

    /**
     * 获取用户公开信息
     * @return
     */
    public UserUserInfoUserInfoInlineResponse200 getUserInfo(String openId, String accessToken) {
        if (StrUtil.isBlank(openId)||StrUtil.isBlank(accessToken)) {
            throw new UserException("openId 或者 accessToken 不能为空!!");
        }

        UserUserInfoUserInfoInlineResponse200 result = null;
        try {
            result = userInfoApi.oauthUserinfoGet(openId, accessToken);
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        return result;
    }


}

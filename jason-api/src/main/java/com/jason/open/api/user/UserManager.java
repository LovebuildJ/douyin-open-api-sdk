package com.jason.open.api.user;

import cn.hutool.core.util.StrUtil;
import com.douyin.open.api.FansListApi;
import com.douyin.open.api.FollowingListApi;
import com.douyin.open.api.UserInfoApi;
import com.douyin.open.models.UserFansFansInlineResponse200;
import com.douyin.open.models.UserFollowingFollowingInlineResponse200;
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

    private FollowingListApi followingListApi;

    /**
     * 初始构造
     */
    public UserManager() {
        if (userInfoApi == null) {
            userInfoApi = new UserInfoApi();
        }

        if (fansListApi == null) {
            fansListApi = new FansListApi();
        }

        if (followingListApi == null) {
            followingListApi = new FollowingListApi();
        }
    }

    /**
     * 获取用户公开信息 Scope: `user_info`需要用户授权
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

    /**
     * 获取粉丝列表 Scope: `fans.list`需要用户授权
     * @param openId        用户唯一标志
     * @param accessToken   accessToken
     * @param pageNum       当前页
     * @param pageSize      每页总记录数
     */
    public UserFansFansInlineResponse200 getFansList(String openId, String accessToken,Integer pageNum,Integer pageSize) {
        if (StrUtil.isBlank(openId)||StrUtil.isBlank(accessToken)) {
            throw new UserException("openId 或者 accessToken 不能为空!!");
        }

        long pageRow = 0;
        if (pageNum!=null&&pageNum>0) {
            pageRow = (long)(pageNum*pageSize - pageSize);
        }

        UserFansFansInlineResponse200 result = null;

        try {
            result = fansListApi.fansListGet(openId,accessToken,pageSize,pageRow);
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 获取关注列表 Scope: `following.list`需要用户授权
     * @param openId        用户唯一标志
     * @param accessToken   accessToken
     * @param pageNum       当前页
     * @param pageSize      每页总记录数
     */
    public UserFollowingFollowingInlineResponse200 getUserFollow(String openId, String accessToken,Integer pageNum,Integer pageSize) {
        if (StrUtil.isBlank(openId)||StrUtil.isBlank(accessToken)) {
            throw new UserException("openId 或者 accessToken 不能为空!!");
        }

        long pageRow = 0;
        if (pageNum!=null&&pageNum>0) {
            pageRow = (long)(pageNum*pageSize - pageSize);
        }

        UserFollowingFollowingInlineResponse200 result = null;

        try {
            result = followingListApi.followingListGet(openId,accessToken,pageSize,pageRow);
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        return result;
    }

}

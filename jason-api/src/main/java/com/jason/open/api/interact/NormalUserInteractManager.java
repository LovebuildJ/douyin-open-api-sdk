package com.jason.open.api.interact;

import com.douyin.open.api.ItemCommentApi;
import com.douyin.open.models.ItemCommentItemCommentBody;
import com.douyin.open.models.ItemCommentItemCommentInlineResponse200;
import com.douyin.open.models.ItemCommentItemCommentInlineResponse2001;
import org.springframework.web.client.RestClientException;

/**
 * @Description 普通用户互动管理API
 * @Date 2020/9/15 15:23
 * @Author by 尘心
 */
public class NormalUserInteractManager {

    private ItemCommentApi itemCommentApi;

    public NormalUserInteractManager() {
        itemCommentApi = new ItemCommentApi();
    }

    /**
     * 评论列表
     * * Scope: item.comment
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param pageSize 每页数量
     * @param itemId 视频id
     * @param pageNum 第几页
     */
    public ItemCommentItemCommentInlineResponse200 getCommentList(String openId, String accessToken,String itemId, Integer pageNum,Integer pageSize) {
        long pageRow = 0;
        if (pageNum!=null&&pageNum>0) {
            pageRow = (long)(pageNum*pageSize - pageSize);
        }

        ItemCommentItemCommentInlineResponse200 result = null;
        try {
            result = itemCommentApi.itemCommentListGet(openId, accessToken, pageSize, itemId, pageRow);
        } catch (RestClientException e) {
            e.printStackTrace();
        }
        return result;
    }

     /**
     * 评论回复列表
     * * Scope: &#x60;item.comment&#x60;
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param pageSize 每页数量
     * @param itemId 视频id
     * @param commentId 评论id
     * @param pageNum 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
     */
    public ItemCommentItemCommentInlineResponse200 getItemCommentReplyList(String openId, String accessToken,String itemId,String commentId, Integer pageNum,Integer pageSize) {
        long pageRow = 0;
        if (pageNum!=null&&pageNum>0) {
            pageRow = (long)(pageNum*pageSize - pageSize);
        }

        ItemCommentItemCommentInlineResponse200 result = null;
        try {
            result = itemCommentApi.itemCommentReplyListGet(openId, accessToken, pageSize, itemId, commentId, pageRow);
        } catch (RestClientException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     *
     * 回复视频评论
     * * Scope: item.comment
     * <p><b>200</b>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param body The body parameter
     */
    public ItemCommentItemCommentInlineResponse2001 getCommentReplyPost(String openId, String accessToken ,ItemCommentItemCommentBody body) {
        ItemCommentItemCommentInlineResponse2001 result = null;
        try {
            result = itemCommentApi.itemCommentReplyPost(openId, accessToken, body);
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        return result;
    }
}

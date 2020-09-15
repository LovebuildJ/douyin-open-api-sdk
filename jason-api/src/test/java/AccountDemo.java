import com.douyin.open.models.Oauth2NewRefreshTokenInlineResponse200;
import com.douyin.open.models.Oauth2RefreshTokenInlineResponse200;
import com.douyin.open.models.ToutiaoOauth2Oauth2InlineResponse200;
import com.douyin.open.models.ToutiaoOauth2Oauth2InlineResponse2002;
import com.jason.open.api.account.AccountAuth;

/**
 * @Description 账号授权
 * @Date 2020/9/15 15:44
 * @Author by 尘心
 */
public class AccountDemo {

    public static void main(String[] args) {
        AccountAuth auth = new AccountAuth();
        // 获取抖音授权码(code)
        auth.getDouyinCode();
        // 生成 client_token
        ToutiaoOauth2Oauth2InlineResponse2002 clientToken = auth.createClientToken();
        // 获取access token
        ToutiaoOauth2Oauth2InlineResponse200 code = auth.getAccessToken("your code");
        // 刷新 access token
        Oauth2RefreshTokenInlineResponse200 accessToken = auth.refreshAccessToken("refreshToken");
        // 刷新 refreshToken
        Oauth2NewRefreshTokenInlineResponse200 refreshToken = auth.refreshRefreshToken("refreshToken");
    }
}

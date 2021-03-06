package edu.gdut.auto.Controller.wxPackage;

import edu.gdut.auto.Result.Result;
import edu.gdut.auto.Result.ResultUtil;
import edu.gdut.auto.Uitls.RequestUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSONObject;

import java.net.URI;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;

@Controller
@RequestMapping("/wxLogin")
public class wxLoginController {

    @Value("${wechat.appid}")
    private String appid;
    @Value("${wechat.appsecret}")
    private String appsecret;

    private String openid;
    private String session_key;

    /**
     * 获取小程序发过来的code
     * 如果检验正确将绑定微信。
     * @param code
     * @return
     */
    @GetMapping("/LoginCode")
    @ResponseBody
    public String login(@RequestParam("code") String code) {
        // 创建Httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String resultString = "";
        CloseableHttpResponse response = null;
        String url="https://api.weixin.qq.com/sns/jscode2session?appid="+appid+"&secret="+appsecret+"&js_code="+code+"&grant_type=authorization_code";
        try {
            // 创建uri
            URIBuilder builder = new URIBuilder(url);
            URI uri = builder.build();

            // 创建http GET请求
            HttpGet httpGet = new HttpGet(uri);

            // 执行请求
            response = httpclient.execute(httpGet);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 解析json
        JSONObject jsonObject = (JSONObject) JSONObject.parse(resultString);
        session_key = jsonObject.get("session_key")+"";
        openid = jsonObject.get("openid")+"";

        System.out.println("session_key=="+session_key);
        System.out.println("openid=="+openid);
        return resultString;
    }


    @PostMapping("/studentName")
    @ResponseBody
    public Result studentName(@RequestParam("stuId")String stuId){
        return ResultUtil.success(stuId);
    }

}

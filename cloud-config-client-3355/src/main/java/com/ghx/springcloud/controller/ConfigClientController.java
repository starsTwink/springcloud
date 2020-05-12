package com.ghx.springcloud.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author：ghx
 * @date：2020/5/8 15:37
 * @describe：将配置中心以REST接口的形式暴露，然后客户端访问
 */

@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;  //要访问的3344上的信息

    @GetMapping("/configInfo")	//请求地址
    public String getConfigInfo(){
        return configInfo;
    }
}

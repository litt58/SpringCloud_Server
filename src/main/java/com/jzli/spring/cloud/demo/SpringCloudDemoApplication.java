package com.jzli.spring.cloud.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * =======================================================
 *
 * @Company 金色家网络科技有限公司-开发测试云服务部
 * @Date ：2016/8/4
 * @Author ：li.jinzhao
 * @Version ：0.0.1
 * @Description ：
 * ========================================================
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudDemoApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudDemoApplication.class).web(true).run(args);
    }

}

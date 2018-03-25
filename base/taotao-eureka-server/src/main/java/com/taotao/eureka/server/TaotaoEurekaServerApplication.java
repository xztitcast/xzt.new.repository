package com.taotao.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 滔滔eureka server入口
 * @author xiangzuotao
 * @date 2018年3月24日 下午11:16:52
 * @version
 */
@SpringBootApplication
@EnableEurekaServer
public class TaotaoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaotaoEurekaServerApplication.class, args);
	}

}

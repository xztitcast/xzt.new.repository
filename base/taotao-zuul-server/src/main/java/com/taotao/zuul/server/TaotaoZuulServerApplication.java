package com.taotao.zuul.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 滔滔网关入口
 * @author xiangzuotao
 * @date 2018年3月24日 下午10:18:06
 * @version 1.0.0
 */
@SpringBootApplication
@EnableZuulProxy
public class TaotaoZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaotaoZuulServerApplication.class, args);
	}

}

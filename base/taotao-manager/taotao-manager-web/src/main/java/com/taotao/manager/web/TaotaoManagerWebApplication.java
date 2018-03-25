package com.taotao.manager.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 滔滔商城管理入口
 * @author xiangzuotao
 * @date 2018年3月24日 下午9:58:59
 * @version
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.taotao.manager"})
@EnableJpaRepositories(basePackages = {"com.taotao.manager.dao"})
@MapperScan(basePackages = {"com.taotao.manager.mapper"})
@EntityScan(basePackages = {"com.taotao.manager.entity"})
public class TaotaoManagerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaotaoManagerWebApplication.class, args);
	}

}

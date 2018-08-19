package com.imooc.swagger;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootConfiguration
public class SwaggerConfig {
	
	//只显示指定包下面的接口(否则会把所有的接口和endpoint都显示出来包括spring内置的的控制器)
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.imooc"))
				.paths(PathSelectors.any())
				.build();
	}
}

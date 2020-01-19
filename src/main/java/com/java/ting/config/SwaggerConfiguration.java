package com.java.ting.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


/**
 * Swagger配置类
 *
 * @author LISHUANG
 * @date 2019/12/27
 */
@Configuration
public class SwaggerConfiguration {

    @Bean
    public Docket createRestApi() {
        Docket build = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.java.ting.controller.web"))
                .paths(PathSelectors.any())
                .build();
        return build;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("Spring Boot中使用Swagger2构建Restful APIs")
                //描述
                .description("Restful 风格接口")
                .contact(new Contact("test", "", "null"))
                //服务条款网址
//                .termsOfServiceUrl("")
                //版本号
                .version("1.0")
                .build();
    }

}
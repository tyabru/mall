package com.xjtu.mall.config;

import com.xjtu.mall.common.config.BaseSwaggerConfig;
import com.xjtu.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by xjtu on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.xjtu.mall.modules")
                .title("图灵商城基础版项目后台管理系统")
                .description("tuling_mall项目后台管理接口文档")
                .contactName("xushu")
                .version("1.0")
                .build();
    }
}

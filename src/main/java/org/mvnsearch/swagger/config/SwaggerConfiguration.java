package org.mvnsearch.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

/**
 * swagger configuration
 *
 * @author linux_china
 */
@EnableSwagger2WebFlux
@Import(BeanValidatorPluginsConfiguration.class)
@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .paths(path -> path.startsWith("/user") || path.startsWith("/person"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring REST Sample with Swagger")
                .description("Spring REST Sample with Swagger")
                .termsOfServiceUrl("http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open")
                .contact(new Contact("Jacky Chan", "https://twitter.com/linux_china", "libing.chen@gmail.com"))
                .license("Apache License Version 2.0")
                .version("2.0")
                .build();
    }
}

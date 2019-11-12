package za.co.portfolio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Profile(value = {"local","dev", "qa"})
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiDocsConfig() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("za.co.portfolio")).paths(PathSelectors.any()).build().apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfo("Portfolio API layer.", "API layer for the Portfolio, including interfaces and objects (data) that flow across the API.", "1.0", "Terms of service", new Contact("Dimakatso Bopape", "https://springframework.guru/about/", "dimakzela@gmail.com"), "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());
    }
}

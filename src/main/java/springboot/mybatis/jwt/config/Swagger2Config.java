package springboot.mybatis.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class Swagger2Config {

  @Bean
  public Docket createRestApi() {
	ParameterBuilder tokenPar = new ParameterBuilder();
	List<Parameter> pars = new ArrayList<>();
	tokenPar.name("Authorization")
			.description("Token")
			.modelRef(new ModelRef("string"))
			.parameterType("header")
			.required(false)
			.build();
	pars.add(tokenPar.build());

	return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage("springboot.mybatis.jwt.controller"))
			.paths(PathSelectors.any())
			.build()
			.globalOperationParameters(pars)
			.apiInfo(apiInfo());

  }

//	@Bean
//	public Docket createRestApi() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.apiInfo(apiInfo())
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("springbootjwt.springbootjwt.controller"))
//				.paths(PathSelectors.any())
//				.build();
//	}

  private ApiInfo apiInfo() {
	return new ApiInfoBuilder()
			.title("Spring Boot Mybatis with JWT Token")
			.description("This application just the example of how to you set up spring boot mybatis with JWT authencation.")
			.termsOfServiceUrl("sophonaratouch@gmail.com")
			.version("1.0")
			.build();
  }
}
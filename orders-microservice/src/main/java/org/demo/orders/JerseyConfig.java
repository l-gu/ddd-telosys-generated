package org.demo.orders;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

//import io.swagger.jaxrs.listing.ApiListingResource;

/**
 * Jersey doesn't always work with Spring Boot fat jars issue and workaround:
 * https://github.com/spring-projects/spring-boot/issues/1468
 * https://www.ivankrizsan.se/2016/12/06/jersey-and-spring-boot-standalone-jar-files/
 *
 * @author ABRISARD
 *
 */
@Configuration
public class JerseyConfig extends ResourceConfig {

	@Autowired
	// value : package root in property (application.properties)
	public JerseyConfig(@Value("${jersey.basePackage}") String basePackage) {
		System.out.println("JerseyConfig *****");
		// register custom resources
		register(basePackage, new AnnotationTypeFilter(RestController.class));
		// configure Jersey
		// property(ServerProperties.WADL_FEATURE_DISABLE, true);
	}

	private void register(String basePackage, TypeFilter typeFilter) {
		ClassPathScanningCandidateComponentProvider customResourceScanner = new ClassPathScanningCandidateComponentProvider(
				false);
		customResourceScanner.addIncludeFilter(typeFilter);
		registerClasses(customResourceScanner.findCandidateComponents(basePackage).stream()
				.map(beanDefinition -> ClassUtils.resolveClassName(beanDefinition.getBeanClassName(), getClassLoader()))
				.collect(Collectors.toSet()));
	}

}

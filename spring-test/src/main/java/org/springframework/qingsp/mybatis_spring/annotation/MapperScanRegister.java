package org.springframework.qingsp.mybatis_spring.annotation;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.qingsp.mybatis_spring.scan.ClassPathMapperScanner;

import java.lang.annotation.Annotation;

/**
 * @author qingshanpeng
 * @date 2021/8/5 16:26
 * @since 标果工厂-脱骨李
 */
public class MapperScanRegister implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(importingClassMetadata.getAnnotationAttributes(MapperScan.class.getName()));
		ClassPathMapperScanner scanner = new ClassPathMapperScanner(registry);

		Class<? extends Annotation> annotation = annotationAttributes.getClass("annotation");
		if (!Annotation.class.equals(annotation)) {
			scanner.addIncludeFilter(new AnnotationTypeFilter(annotation));
		} else {
			scanner.addIncludeFilter((metadataReader, metadataReaderFactory) -> true);
		}

		String basePackage = annotationAttributes.getString("basePackage");

		scanner.doScan(basePackage);
	}
}

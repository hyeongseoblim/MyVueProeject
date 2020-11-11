package com.web.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

@Component
public class BookServiceRunner implements ApplicationRunner {


    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    ResourceLoader resourceLoader;

    @Autowired
    ApplicationContext ctx;
    // 결국 ApplicationContext 임..
    


    @Override
    public void run(ApplicationArguments args) throws Exception {
        applicationEventPublisher.publishEvent(new MyEvent(this, 100));
        Resource resource = resourceLoader.getResource("classpath:/text.txt");
        System.out.println(resource.exists());
        System.out.println(resource.getDescription());
        System.out.println(Files.readString(Path.of(resource.getURI())));
        Resource re1 = resourceLoader.getResource("file:///x.xml");
        Resource re2 = resourceLoader.getResource("classpath:x.xml");
//        String[] beanNames = ctx.getBeanDefinitionNames();
//
//        Arrays.sort(beanNames);
//        for (String s : beanNames) {
//            System.out.println(s);
//        }
    }
//    @Autowired
//    MessageSource messageSource;
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        Environment environment = ctx.getEnvironment();
//        System.out.println(Arrays.toString(environment.getActiveProfiles()));
//        System.out.println(Arrays.toString(environment.getDefaultProfiles()));
//
//    }
}

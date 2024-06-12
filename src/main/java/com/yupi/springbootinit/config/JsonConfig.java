package com.yupi.springbootinit.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * Spring MVC Json 配置
 */
//@JsonComponent
//@Configuration
//public class JsonConfig {
//
//    /**
//     * 添加 Long 转 json 精度丢失的配置
//     */
//    @Bean
//    public ObjectMapper jacksonObjectMapper( Jackson2ObjectMapperBuilder builder) {
//        ObjectMapper objectMapper = builder.createXmlMapper(false).build();
//        SimpleModule module = new SimpleModule();
//        module.addSerializer(Long.class, ToStringSerializer.instance);
//        module.addSerializer(Long.TYPE, ToStringSerializer.instance);
//        objectMapper.registerModule(module);
//        return objectMapper;
//    }
//}
@Configuration
public class JsonConfig {

    /**
     * 配置 ObjectMapper 以避免 Long 类型在转换为 json 时精度丢失
     */
    @Bean
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder.build(); // 直接构建 ObjectMapper
        SimpleModule module = new SimpleModule();
        module.addSerializer(Long.class, ToStringSerializer.instance); // Long 类的实例
        module.addSerializer(Long.TYPE, ToStringSerializer.instance); // Long 原始类型的实例
        objectMapper.registerModule(module); // 注册模块
        return objectMapper;
    }
}
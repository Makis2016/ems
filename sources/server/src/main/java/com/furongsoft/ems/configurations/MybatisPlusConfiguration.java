package com.furongsoft.ems.configurations;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;

/**
 * MybatisPlus配置文件
 *
 * @author Alex
 */
@MapperScan("com.furongsoft.*.mappers")
public class MybatisPlusConfiguration {
    /**
     * 分页插件，自动识别数据库类型
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}

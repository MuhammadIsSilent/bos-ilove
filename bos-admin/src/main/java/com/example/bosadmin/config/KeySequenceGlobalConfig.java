package com.example.bosadmin.config;


import com.baomidou.mybatisplus.extension.incrementer.OracleKeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeySequenceGlobalConfig {


    /**
     * mybatis plus  配置  oracle 主键自增
     */
    @Bean
    public OracleKeyGenerator oracleKeyGenerator() {
        return new OracleKeyGenerator();
    }

//    @Bean
//    public GlobalConfiguration globalConfiguration() {
//        GlobalConfiguration conf = new GlobalConfiguration();
//        conf.setKeyGenerator(new OracleKeyGenerator());
//        return conf;
//    }

}

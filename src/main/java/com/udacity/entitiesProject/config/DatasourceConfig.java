package com.udacity.entitiesProject.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {
    @Bean
    @Primary
    @ConfigurationProperties(prefix="mypractice")
    public DataSource getDatasource() {
        DataSourceBuilder dsb = DataSourceBuilder.create();
        //dsb.username("sa2");
        //dsb.password(securePasswordService());
        dsb.url("jdbc:mysql://localhost:3306/plant");
        return dsb.build();
    }

    private String securePasswordService() {
        return "sa1234";
    }
}

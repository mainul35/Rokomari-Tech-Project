package com.rokomari.techieHunt;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Mainul35 on 2/28/2017.
 */
@Configuration
@EnableTransactionManagement
public class Config {
    @Autowired
    private Environment environment;
    @Autowired
    private DataSource dataSource;
//    @Autowired
//    private LocalContainerEntityManagerFactor managerFactoryBean;
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("db.driver"));
        return null;
    }
}

package com.sxg.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by shaoxiangen 2018/2/3
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {
        JdbcTemplateAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        DataSourceAutoConfiguration.class,
        JmsAutoConfiguration.class})
@ComponentScan("com.sxg.web")
@ImportResource("classpath:spring/*.xml")
@EnableAsync
@EnableAspectJAutoProxy
public class WebInitiallizer extends SpringBootServletInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebInitiallizer.class);

    public WebInitiallizer() {
        super();
        System.setProperty("java.net.preferIPv4Stack", "true");
        System.setProperty("spring.jndi.ignore", "true");
        System.setProperty("logging.config", "classpath:/logback-spring.xml");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}

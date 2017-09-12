package org.jigsaw.payment.fastpay;

import javax.validation.Validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * 
 * @author shamphone@gmail.com
 * @version 1.0.0
 * @date 2017年9月1日
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Application  {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

@Primary
@Bean
    public Validator validator(){
        return new LocalValidatorFactoryBean();
    }
}
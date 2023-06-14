package com.fullstack;

import com.fullstack.customer.CustomerController;
import com.fullstack.customer.CustomerDataAccessService;
import com.fullstack.customer.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        /*
        CustomerService customerService =
                new CustomerService(new CustomerDataAccessService());
        CustomerController customerController =
                new CustomerController(customerService);
        */

        SpringApplication.run(Main.class, args);

        /*
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(Main.class, args);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
         */
    }

}

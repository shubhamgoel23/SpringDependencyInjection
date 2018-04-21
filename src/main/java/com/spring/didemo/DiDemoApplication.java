package com.spring.didemo;

import com.spring.didemo.controller.ConstructorInjectedController;
import com.spring.didemo.controller.MyController;
import com.spring.didemo.controller.PropertyInjectedController;
import com.spring.didemo.controller.SetterInjectedController;
import com.spring.didemo.model.FakeDatasource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");

        FakeDatasource fakeDatasource = (FakeDatasource) ctx.getBean(FakeDatasource.class);

        System.out.println(fakeDatasource.getUser());
        System.out.println(controller.hello());

//        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }
}

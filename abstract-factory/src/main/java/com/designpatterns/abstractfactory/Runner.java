package com.designpatterns.abstractfactory;

import lombok.Setter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Setter
@Component
public class Runner implements CommandLineRunner {

    private final ConfigurableApplicationContext ctx;

    public Runner(ConfigurableApplicationContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public void run(String... args) throws Exception {

        AbstractWidgetFactory factory = null;
        Widget widget1 = null;
        Widget widget2 = null;

        // get input from user
        Scanner scan = new Scanner(System.in);

        System.out.print("Input A or B: ");
        String value = scan.nextLine();
        value = value.trim();

        if ("A".equals(value)) {
            factory = new WidgetFactoryA();
        } else if ("B".equals(value)) {
            factory = new WidgetFactoryB();
        }

        widget1 = factory.createWidgetA("1");
        widget2 = factory.createWidgetB("2");

        System.out.println("widget1: " + widget1.getClass().getName());
        System.out.println(widget1);
        System.out.println("widget2: " + widget2.getClass().getName());
        System.out.println(widget2);

        ctx.close();
    }
}

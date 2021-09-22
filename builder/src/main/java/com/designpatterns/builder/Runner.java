package com.designpatterns.builder;

import lombok.Setter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Setter
@Component
public class Runner implements CommandLineRunner {

    private final ConfigurableApplicationContext ctx;

    public Runner(ConfigurableApplicationContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public void run(String... args) throws Exception {

        Widget widget = Widget.builder()
                .withValueA(1)
                .withValueB(2.0)
                .withValueC("C")
                .withValueD("D")
                .build();
        System.out.println(widget);

        ctx.close();
    }
}

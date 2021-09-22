package com.designpatterns.chainofresponsibility;

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

        EmailClient client = new EmailClient();

        Email gmail = new Email();

        ctx.close();
    }
}

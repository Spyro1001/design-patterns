package com.designpatterns.bridge;

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

        RemoteControl sonyRemote = new ConcreteRemoteControl(new Sony());
        RemoteControl philipsRemote = new ConcreteRemoteControl(new Philips());
        RemoteControl samsungRemote = new ConcreteRemoteControl(new Samsung());

        ctx.close();
    }
}

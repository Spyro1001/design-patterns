package com.designpatterns.adapter;

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

        int[] numbers = new int[] {34, 2, 4, 12, 1};
        Sorter sorter = new SortListAdapter();
        int[] sortedNumbers = sorter.sort(numbers);

        int count = 0;
        for (int number : sortedNumbers) {
            System.out.print(number + ((++count == sortedNumbers.length) ? "" : ", "));
        }

        ctx.close();
    }
}

package com.designpatterns.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <h2>Example of the creational Builder pattern.</h2>
 * <p>
 * <h4>Advantage of Builder Design Pattern</h4> <ul> <li>It provides clear separation between the
 * construction and representation of an object.</li> <li>It provides better control over
 * construction process.</li> <li>It supports to change the internal representation of objects.</li>
 * </ul>
 *
 * @see <a href="http://www.journaldev.com/1425/builder-design-pattern-in-java">http://www.journaldev.com/1425/builder-design-pattern-in-java</a>
 * @see <a href="https://www.javatpoint.com/builder-design-pattern">https://www.javatpoint.com/builder-design-pattern</a>
 */
@SpringBootApplication
public class BuilderClient {

    public static void main(String[] args) {

        SpringApplication.run(BuilderClient.class, args);
    }
}

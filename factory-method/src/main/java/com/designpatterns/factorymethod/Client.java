package com.designpatterns.factorymethod;

/**
 * <h2>Example of Factory Method pattern</h2>
 * <p>
 *
 * @see <a href="https://dzone.com/articles/design-patterns-factory">https://dzone.com/articles/design-patterns-factory</a>
 * <p>
 * Define an interface for creating an object, but let the subclasses decide which class to
 * instantiate. The Factory method lets a class defer instantiation to subclasses
 * <p>
 * The idea behind the Factory Method pattern is that it allows for the case where a client doesn't
 * know what concrete classes it will be required to create at runtime, but just wants to get a
 * class that will do the job. The FactoryMethod builds on the concept of a simple Factory, but lets
 * the subclasses decide which implementation of the concrete class to use.  You'll see factories
 * used in logging frameworks, and in a lot of scenarios where the client doesn't need to know about
 * the concrete implementations. It's a good approach to encapsulation.
 * <p>
 * @see <a href="https://www.javatpoint.com/factory-method-design-pattern">https://www.javatpoint.com/factory-method-design-pattern</a>
 * <p>
 * <h4>Advantage of Factory Design Pattern</h4> <ul> <li>Factory Method Pattern allows the
 * sub-classes to choose the type of objects to create.</li> <li>It promotes the loose-coupling by
 * eliminating the need to bind application-specific classes into the code. That means the code
 * interacts solely with the resultant interface or abstract class, so that it will work with any
 * classes that implement that interface or that extends that abstract class.</li> </ul>
 * <p>
 * <h4>Usage of Factory Design Pattern</h4> <ul> <li>When a class doesn't know what sub-classes will
 * be required to create.</li> <li>When a class wants that its sub-classes specify the objects to be
 * created.</li> <li>When the parent classes choose the creation of objects to its sub-classes.</li>
 * </ul>
 */
public class Client {

    public static void main(String[] args) {

        Logger xmlLogger = LoggerFactory.getLogger("XML");
        xmlLogger.log("xml message");
        xmlLogger.error("xml error message");

        System.out.println();

        Logger textLogger = LoggerFactory.getLogger("TEXT");
        textLogger.log("text message");
        textLogger.error("text error message");

    }

}


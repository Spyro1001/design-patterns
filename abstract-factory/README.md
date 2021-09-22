# Abstract Factory Pattern
[DZone](https://dzone.com/articles/design-patterns-abstract-factory)

## Factories in the Real World

It's easy to think of factories in the real world - a factory is just somewhere that items gets produced such as cars, computers or TVs. Wikipedia's definition of a real world factory is:

```text
A factory or manufacturing plant is an industrial building 
where workers manufacture goods or supervise machines 
processing one product into another.
```

It's pretty clear what a factory does, so how does the pattern work?

## The Abstract Factory Pattern

The Abstract Factory is known as a creational pattern - it's used to construct objects such that they can be decoupled from the implementing system. The definition of Abstract Factory provided in the original Gang of Four book on DesignPatterns states:

```text
Provides an interface for creating families of related
or dependent objects without specifying their concrete classes.
```

The AbstractFactory defines the interface that all of the concrete factories will need to implement in order to product Products. ConcreteFactoryA and ConcreteFactoryB have both implemented this interface here, creating two separate families of product. Meanwhile, AbstractProductA and AbstractProductB are interfaces for the different types of product. Each factory will create one of each of these AbstractProducts.

The Client deals with AbstractFactory, AbstractProductA and AbstractProductB. It doesn't know anything about the implementations. The actual implementation of AbstractFactory that the Client uses is determined at runtime.

As you can see, one of the main benefits of this pattern is that the client is totally decoupled from the concrete products. Also, new product families can be easily added into the system, by just adding in a new type of ConcreteFactory that implements AbstractFactory, and creating the specific Product implementations.

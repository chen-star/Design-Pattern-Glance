# Design Pattern Glance

---
- **Behavioral Patterns**
	- Strategy
	- Observer

- **Creational Patterns**
	- Simple Factory
	- Factory Method
	- Abstract Factory
	- Singleton
	- Builder
	- Prototype
	
- **Structure Patterns**
	- Decorator 

---

## Behavioral Patterns

### Strategy Pattern

![](./src/main/resources/img/strategy-definition.png)
![](./src/main/resources/img/strategy-uml.png)

- The strategy pattern is formally defined as ***encapsulating algorithms belonging to the same family*** and making them interchangeable. 

- The consumers are allowed to switch out one algorithm for another seamlessly.

---

### Observer Pattern

![](./src/main/resources/img/observer-definition.png)
![](./src/main/resources/img/observer-uml.png)

- The strategy pattern is formally defined as ***a one to many dependency between objects, so that when one object changes state all the dependents are notified***.

- Eg. 
	- In the stock market,
		- Subject (publisher): sends many stocks to the observerss
		- Observer (subscriber): takes the ones they want and use them

- Main Points:
	- Subject maintains a list of observers and provide `register(), unregister(), notifyAll()`
	- Observer provides `onUpdate()`

- Pros & Cons:
	- Pro: loose coupling - Subject doesn't need to know anything about the Observers.
	- Cons: Subject may send updates that don't matter to the Observer. 


---

## Creational Patterns

### Simple Factory Pattern

![](./src/main/resources/img/simple-factory-uml.png)

- One factory creates all products
- We create obj without exposing the creation logic to the client
- refer to newly created obj using a common interface

-	Cons
	- If a new product is added, we'll have to modify factory

---

### Factory Method Pattern

![](./src/main/resources/img/factory-method-definition.png)
![](./src/main/resources/img/factory-method-uml.png)


- Concrete factories create products
- Open-closed principal

-	Cons
	- If a new product is added, we'll have to add in its factory along with => extra overhead
	
---

### Abstract Factory Pattern

![](https://design-patterns.readthedocs.io/zh_CN/latest/_images/AbatractFactory.jpg)
![](./src/main/resources/img/abstract-factory-uml.png)


- solves the problem of creating families of related products
- Open-closed principal

-	Cons
	- If a new product is added, we'll have to modify AbstractFactory interface => violate open-close principal
	- Can gets complicated

---

### Singleton Pattern


- Ensure that only a single instance of a class exists and a global point of access to it exists.

- Lazy: 
	 - Single thread
	 - Synchronized
	 - Double-checked locking

- Eager:
	- Simple Eager
	- Enum


---

### Builder Pattern

![](https://segmentfault.com/img/remote/1460000015153333?w=976&h=454)

- Used to create objects made from a bunch of other objs
	- Hide the process of building a complex obj

	
---

### Prototype Pattern

![](https://www.baeldung.com/wp-content/uploads/2019/10/Prototype-Pattern.png)

- Creating new objs by cloning other objs


---

## Behavioral Patterns

### Decorator Pattern

![](https://segmentfault.com/img/remote/1460000016508995?w=799&h=538)
![](./src/main/resources/img/decorator-uml.png)

- Add new functionality without modifying existing code


# Design Pattern Glance

---
- **Behavioral Patterns**
	- Strategy
	- Observer

---

## Behavioral Patterns

### Strategy Pattern

![](./src/main/resources/img/strategy-definition.png)
![](./src/main/resources/img/strategy-uml.png)

- The strategy pattern is formally defined as ***encapsulating algorithms belonging to the same family*** and making them interchangeable. 

- The consumers are allowed to switch out one algorithm for another seamlessly.

--

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


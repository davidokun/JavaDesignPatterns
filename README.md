# Java Design Patterns

This repository contains several examples of the most used and common design patterns used in Java. It groups these 
patterns in 3 main categories.

* Creational.
* Structural.
* Behavioral.

It presents a simple examples or use cases for each of these design patterns.

Patterns Included:

# Creational Patterns
---
### 1. Singleton.
---
##### _Intent_
* Ensure a class only has **one instance**, and provide a **global point of access to it**.

##### _When_
* Only one instance of a class required.
* Must be one access point.
* Need to manage object instances.

##### _Benefits_
* Controlled access to one instance.
* Reduce name space -> avoid global variables.
* The ability to subclass the Singleton class.
* Configure the number of instances you need.

##### _Structure_

![Alt text](images/creational/singleton.png?raw=true)

---
### 2. Builder
---
##### _Intent_
* **Separate** the **construction** of a **complex object** from its **representation** so that the **same construction**
process can create **different representations**.

##### _When_
* Separate construction with internal representation.
* One process -> multiple object representation.
* Object construction <> object assembling.

##### _Benefits_
* Uniform production creation via an interface.
* Abstract building process.
* Loose coupling. Separate construction from representation.
* Finer control on the build process. Allow multiple steps.
* One build process for multiple similar objects.

![Alt text](images/creational/builder.png?raw=true)

---
### 3. Factory Method
---
##### _Intent_
* Define an **interface** for **creating an object** but let subclasses decide which class to instantiate.
Factory Method lets a class **defer instantiation** to **subclasses**.

##### _When_
* Class can't expect the type of object it must create.
* Subclasses must decide what types of objects are created.

##### _Benefits_
* Delegate object creation.
* Hooks for subclasses.
* Base class can provide a default implementation.
* Delegate object creation at runtime.

---
### 4. Abstract Factory
---
##### _Intent_
* Provide an **interface for creating families** of related of dependent objects **without specifying their concrete 
classes**.

##### _When_
* Creation of products independent from the application.
* Configuration of product families is required.
* Hide product implementation -> only provide interface.

##### _Benefits_
* Control the classes of objects to be created.
* Exchanging product families easy.
* Promote consistency among products.

---
### 5. Prototype
---
##### _Intent_
* Specify the kinds of objects to create using a **prototypical instance**, and create new objects by
**copying this prototype**.

##### _When_
* Classes to instantiate are specific at runtime.
* Avoid building classes hierarchies.
* A class can have multiple instances of state.

##### _Benefits_
* Add/Remove products at runtime.
* Reduce subclassing.
* Configure application dynamically.
* Different values for new objects.

---
# Structural Patterns
---
### 1. Facade
---
##### _Intent_
* Provide a **unified interface** to a set of interfaces in a subsystem. Facade defines a **higher-level
interface** that makes the **subsystem easier to use**.

##### _When_
* Decouple clients from subsystems.
* Provide simple interface.
* Subsystem layering (business, data and client services)

##### _Benefits_
* Subsystem easier to use. Client don't require specific knowledge.
* Loose coupling.
* Subsystem can still use directly (if necessary).

---
### 2. Adapter
---
##### _Intent_
* **Convert** the interface of a class into another interface the clients expect. Adapter **lets classes work together** 
that could'nt otherwise because of incompatible interfaces.

##### _When_
* Re-use an existing class.
* Combine unrelated classes with an incompatible interface.

##### _Benefits_
* Adapter can override adaptee behaviour. By inheritance or composition.
* One adapter -> Many adaptees.
* Connect to legacy systems.
* Adapt one interface to another.

---
### 3. Decorator
---
##### _Intent_
* **Attach** additional **responsibilities** to an **object dynamically**. Decorators provide a **flexible alternative**
to **subclassing** for extending functionality. 

##### _When_
* Add functionality to objects, without affecting other objects.
* Functionality can be taken away in the future.
* Extension by subclassing is difficult.

##### _Benefits_
* More flexible than inheritance.
* Implement functionality when you need it.

---
### 4. Bridge
---
##### _Intent_
* **Decouple** and **abstraction** from its **implementation** so that the two can vary independently.

##### _When_
* Avoid binding between interface and implementation.
* Possible subclasses for abstraction and implementation.
* Must be possible to change implementation at runtime without affecting clients.

##### _Benefits_
* Decouple interface and implementation
* Improve extensibility
* Hide implementation details.

---
### 5. Composite
---
##### _Intent_
* Compose **objects into tree structures** to represent part-whole hierarchies. Composite lets clients **treat 
individual objects** and compositions of objects **uniformly**.

##### _When_
* Ignore differences between compositions and individual items.
* Represent part-whole hierarchies of objects.

##### _Benefits_
* Define class hierarchies of consistent objects.
* Client is simplified.
* No distinction between child composite objects.
* Easy to add new components.

---
### 6. Proxy
---
##### _Intent_
* Provide a **surrogate** or **placeholder** for another object to control access to it.

##### _When_
* Extra functionality is required. (Transparency, More than just a reference).
* Remote proxy (access network separated classes).
* Virtual proxy (create expensive objects on demand).
* Protection proxy (access management).
* Added functionality e.g count number of references.

##### _Benefits_
* Adds indirection.
* Adding extra functionality.

---
### 7. Flyweight
---
##### _Intent_
* Use Sharing to support large numbers of fine-gained objects efficiently.

##### _When_
* Large number of objects.
* High storage costs.
* Extrinsic state (shareable).
* Many objects -> replaced by few objects.
* Object identity is not necessary.

##### _Benefits_
* Reduce the total number of instances.
* Shared intrinsic state per object.

---
# Behavioral Patterns
---
### 1. Command
---
##### _Intent_
* Encapsulate a request as an object, thereby letting you **parametrize clients** with different
**requests, queue** or **log requests**, and support **undoable operations**.

##### _When_
* Command as a parameter
* Pass command like general object
* Queue Request.
* Save request state
* Undo functionality
* Support logging
* Re-execute code in case of failure.

##### _Benefits_
* Decoupling between objects that invokes the operation and objects that know hoe to perform it.
* Commands are Objects, All OO rules apply to them.
* Creating new Commands is easy. Just add a new class.

---
### 2. Strategy
---
##### _Intent_
* Define a **family of algorithms**, encapsulate each one, and make them interchangeable. Strategy lets the
**algorithm vary independently from clients** that use it.

##### _When_
* Classes only change in behaviour.
* Different variants of an algorithm.
* Algorithms that use complex data that clients should't be aware of.

##### _Benefits_
* Algorithm families use inheritance for common parts.
* Avoid conditional statements using this pattern.
* Clients can choose the required behaviour.
* Encapsulate an algorithm.
* Change algorithm at runtime.

---
### 3. Visitor
---
##### _Intent_
* Represent an **operation** to be **performed** on the **elements** of **an object structure**. Visitor
lets you **define a new operation** without changing the classes of the elements on which it operates.

##### _When_
* Visit complex object structure (Inheritance).
* Perform operations of concrete classes.
* Avoid pollution of concrete classes with many different operations. Visitor groups this functionality.
* Ability to easily define new operations without changing concrete classes.

##### _Benefits_
* Adding new operations is easy.
* Visitor separates operations that don't belong together.
* Accumulate state. Visitors can maintain state across the hierarchy.
* Centralize logic.

---
### 4. Observer
---
##### _Intent_
* Define a **one-to-many dependency** between objects so that when one object changes state, **all** its **dependents**
are **notified** and updated automatically.

##### _When_
* Change one object -> changes others.
* No idea how many objects need to be changed.
* Object change notification. With preserving loose coupling.
* One object may notify another without knowing them directly.

##### _Benefits_
* Loose coupling between observers and subjects.
* Supporting a broadcast model.
* Observe state in other objects.

---
### 5. Memento
---
##### _Intent_
* Without violating encapsulation, **capture and externalize an object's internal state** so that the object can be
**restored** to this state later.

##### _When_
* Save a snapshot of an objects state.
* Direct interface to object state would violate encapsulation.

##### _Benefits_
* Preserve encapsulation.
* Simplifies originator.
* Accesses state but preserve encapsulation.
* Save snapshot of object data.

---
### 6. Mediator
---
##### _Intent_
* Define an object that **encapsulates** how a **set of objects interact**. Mediator **promotes loose coupling** by
keeping objects from referring to each other explicitly, and lets you vary their interaction independently.

##### _When_
* Objects have complex communication, but it's well defined.
* Hard to identify how the communication actually works.
* Objects re-use is difficult.
* Centralize behaviour between classes.

##### _Benefits_
* Centralize behaviour.
* Decoupling of colleagues.
* Changes many-to-many interaction to one-to-many interaction.
* Object collaboration is abstracted.
* Centralize control.

---
### 7. Chain of Responsibility
---
##### _Intent_
* **Avoid coupling** the **sender** of a **request** to its **receiver** by giving **more than one object** a
chance to **handle the request**. Chain the receiving objects and pass the request along the chain until an object 
handles it.

##### _When_
* Multiple objects need to handle a request.
* Is'nt clear upfront who will handle it.
* Who can handle the request should be dynamic.

##### _Benefits_
* Loose coupling between requester and receiver.
* Objects can spread responsibility in handling requests.
* Handles requests dynamically.

---
### 8. State
---
##### _Intent_
* Allow an object **to alter its behaviour** when its internal **state change**. The object will appear to change
its class.

##### _When_
* Object behaviour depends on object state.
* Avoid complex if-else structures.
* When state changes, simply change the state object.
* Implementation is done in the state object.

##### _Benefits_
* All state behaviour is delegated to the state implementation.
* Arguments can be past from context to state.
* Only context is available for clients to see.

---
### 9. Template
---
##### _Intent_
* Define the **skeleton of an algorithm** in an operation, deferring some steps to subclasses. Template Method **lets
subclasses redefine certain steps** of an algorithm without changing the algorithm's structure.

##### _When_
* Implement an algorithm once. Subclasses can provide different implementation.
* Avoid code duplication.
* Define how a class should be extended.Implementing hooks.

##### _Benefits_
* Ultimate code re-use
* Provide hooks.
* The abstract base class generally does't implement a hook -> forces clients to have an implementation.

---
# Additional Patterns
---
### 1. Inversion of Control (IoC)
---
##### _Intent_
* Allow a system to **release control** of **object creation** by allowing other components to manage creation
of objects and its **dependencies**.

##### _When_
* Don't know in advance which objects need to be created.
* Need a flexible run-time environment that can be configured.
* Creation of objects is difficult e.g in an enterprise context.
* Need loose coupling.

##### _Benefits_
* A fully configurable runtime system.
* Increased loose coupling.

---
### 2. Data Transfer Object - DTO
---
##### _Intent_
* **Bundle** the **required data** that must be **transferred** from one process to another.

##### _When_
* Reduce process interaction overhead. Network transfer reduction.
* Avoid transferring extra unwanted data, that may be be the result of interface design.

##### _Benefits_
* When correctly applied it gives you a performance boost.
* You can limit the need to know data.

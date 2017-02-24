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
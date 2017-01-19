# Java Design Patterns

This repository contains several examples of the most used and common design patterns used in Java. It groups these patterns in 3 main categories.

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
* Provide an **interface for creating families** of related of dependent objects **without specifying their concrete classes**.

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
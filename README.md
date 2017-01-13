# Java Design Patterns

Examples of Design Patterns in Java.

Patterns Included:

# Creational Patterns

###1. Singleton.
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

###2. Builder
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

###2. Factory Method
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

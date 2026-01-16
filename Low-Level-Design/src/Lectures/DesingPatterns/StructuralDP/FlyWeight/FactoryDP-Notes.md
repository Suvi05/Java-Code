# Factory Design Pattern – Complete Guide (Simple → Factory Method → Abstract Factory)

This document covers **all variants of the Factory Design Pattern** in a single place:
- Simple Factory
- Factory Method
- Abstract Factory

The goal is to clearly explain:
- Why Factory patterns exist
- How each variant differs
- When to use which pattern
- Why they sometimes look similar in code

---

## 🧠 Core Idea (Applies to ALL Factory Patterns)

> **Factory patterns move object creation logic away from the client.**

Client should depend on **abstractions**, not concrete classes.

---

# 1️⃣ Simple Factory

## 📌 What it is
A single factory class that creates objects using `if / switch` logic.

> ⚠️ **Not an official GoF pattern** (often called a *pseudo-pattern*)

---

## 🧱 Structure (Simple Factory)

``````
          Client
            ↓
      SimpleFactory
            ↓
| Product A | Product B |
``````

---

## ✅ What Problem It Solves
- Removes `new` from client
- Centralizes object creation

---

## ❌ Problems
- Factory grows with `if / else`
- Violates **Open–Closed Principle**
- Hard to extend

---

## 🧠 Key Takeaways
- Quick & simple solution
- Good for small or demo systems
- Not scalable

---

## 🎯 When to Use
- Very small systems
- Few object types
- No frequent changes expected

---

# 2️⃣ Factory Method

## 📌 What it is
Defines a **method for object creation**, but lets **subclasses decide** which object to create.

> **Creation decision is delegated to subclasses**

---

## 🧱 Structure (Factory Method)
``````
                  Client
                    ↓
             AbstractFactory
                    ↓
| ConcreteFactory A | ConcreteFactory B |
                    ↓
                 Product

``````

---

## ✅ What Changed from Simple Factory
- ❌ No `if / else`
- ✅ Follows Open–Closed Principle
- ✅ Easier to extend

---

## 🧠 Key Takeaways
- Focuses on **how** an object is created
- Usually creates **one product**
- Uses inheritance

---

## ❗ Important Clarification
> Factory Method hides **product instantiation**,  
> not **factory instantiation**.

---

## 🎯 When to Use
- Object types will grow
- Framework / library design
- Need OCP compliance

---

# 3️⃣ Abstract Factory

## 📌 What it is
Provides an interface to create **families of related objects**.

> **Guarantees consistency across related products**

---

## 🧱 Structure (Abstract Factory)

``````
                  Client
                    ↓
             AbstractFactory
                    ↓
| ConcreteFactory A | ConcreteFactory B |
       ↓        ↓        ↓        ↓
   ProductA ProductB ProductA ProductB

``````

---

## ✅ What Changed from Factory Method
- Creates **multiple related products**
- Enforces **matching product families**
- Prevents mixing incompatible objects

---

## 🧠 Key Takeaways
- Focuses on **which family** of products
- Often uses Factory Method internally
- Powerful but complex

---

## ❌ Why Abstract Factory Can Feel Like Overkill
- Too many interfaces/classes
- Harder to add new product types
- Unnecessary for small systems

---

## 🎯 When to Use
- UI frameworks (themes)
- Cross-platform systems
- When consistency is critical

---

# 🔄 Comparison Summary

| Aspect | Simple Factory | Factory Method | Abstract Factory |
|------|---------------|----------------|------------------|
| GoF Pattern | ❌ No | ✅ Yes | ✅ Yes |
| Uses if/else | ✅ Yes | ❌ No | ❌ No |
| Focus | Creation hiding | Creation delegation | Product families |
| Products | One or many | Usually one | Multiple related |
| OCP | ❌ Violated | ✅ Followed | ✅ Followed |
| Complexity | Low | Medium | High |

---

## 🧠 Memory Trick (VERY IMPORTANT)

``````
Simple Factory    →  IF decides
Factory Method    →  SUBCLASS decides
Abstract Factory  →  FAMILY decides
``````

---

## 🎤 Interview One-Liners

**Simple Factory**
> Centralizes object creation but violates OCP.

**Factory Method**
> Delegates object creation to subclasses to follow OCP.

**Abstract Factory**
> Creates consistent families of related objects.

---

## 🏁 Final Notes

- Abstract Factory often **uses Factory Method internally**
- Code structure may look similar, **intent is different**
- In real projects, **Spring DI replaces most factory code**
- Choose the **simplest pattern that solves the problem**

---

Happy revising 🚀
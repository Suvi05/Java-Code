# Facade Design Pattern – Before & After

This repository demonstrates the **Facade Design Pattern** using a simple  
**Home Theatre / Movie Watching** example.

The goal is to show:
- Why Facade is needed
- What problem it solves
- How the code looks **before** and **after** applying Facade
- How client complexity is reduced

---

## 📌 Problem Statement (Before Facade)

In real systems, a client often needs to interact with **multiple subsystem classes**
to perform a single logical task.

**Example:** *Watching a movie*

The client must:
- Turn ON the TV
- Configure the sound system
- Dim the lights
- Login to streaming service
- Start the movie

This leads to:
- Tight coupling
- Too much knowledge in client
- Hard-to-maintain code

---

## ❌ Before Facade (Issues)

### Characteristics
- Client directly interacts with **multiple subsystem classes**
- Client controls the **order of operations**
- Any internal change breaks client code

### Problems
- ❌ High coupling
- ❌ Low readability
- ❌ Poor maintainability
- ❌ Difficult to extend

---

## ✅ After Facade (Solution)

The **Facade pattern** introduces a single high-level class that:
- Hides subsystem complexity
- Exposes a simple, meaningful operation

### Example
```java
theatre.watchMovie("Inception");
```
The client no longer cares about:
- Which subsystems exist
- In what order methods are called

---

## 🧱 Structure (After Facade)
``````
                    Client
                      ↓
              HomeTheatreFacade
↓
| TV | SoundSystem | Lights | StreamingService |
---
```````

## 🔄 WHAT CHANGED (Before vs After)

| Aspect | Before Facade | After Facade |
|------|---------------|--------------|
| Client dependency | Multiple classes | Single facade |
| Method calls | Many | One |
| Knowledge required | High | Minimal |
| Coupling | Tight | Loose |
| Readability | Poor | Clean |

---

## 🧠 Key Takeaways

- Facade does **NOT** remove subsystems
- Facade does **NOT** change subsystem behavior
- Facade **only simplifies access**
- Subsystems can still be used directly if needed
- Facade improves **readability, maintainability, and decoupling**

---

## 🎯 When to Use Facade

- ✅ Complex subsystems
- ✅ Legacy systems
- ✅ Backward compatibility
- ✅ Client simplicity is important

---

## ❌ When NOT to Use Facade

- ❌ Very small or simple systems
- ❌ Single-class logic
- ❌ Over-abstraction without benefit

---

## 🎤 Interview One-Liner

> **Facade provides a unified interface to a set of interfaces in a subsystem, making it easier to use and reducing client complexity.**

---

## 🧩 Pattern Comparison (Quick)

| Pattern | Purpose |
|------|--------|
| Facade | Simplifies usage |
| Adapter | Changes interface |
| Proxy | Controls access |

---

## 🏁 Final Note

Facade is a **structural design pattern** focused on **usability**, not creation.  
It is commonly used in:
- Frameworks
- SDKs
- Libraries
- Service layers  

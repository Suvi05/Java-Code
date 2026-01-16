# Strategy Design Pattern – Google Maps Example (Before → After)

This repository demonstrates the **Strategy Design Pattern** using a  **Google Maps path calculation** example.
The goal is to show:

- Why Strategy is needed
- Problems with conditional logic
- How behavior is moved out of the main class
- How runtime algorithm selection is achieved

---

## 🧠 Core Idea of Strategy Pattern

> **Strategy pattern allows selecting an algorithm at runtime by encapsulating it inside separate classes.**

In simple words:

- Separate **what varies** from **what stays the same**
- Replace `if / else` with polymorphism

---

## 📌 Problem Context

Google Maps needs to calculate paths based on transport mode:

- 🚗 CAR
- 🚲 BIKE
- 🚶 WALK

Each mode has a **different algorithm**, but Google Maps logic remains the same.

---

## ❌ BEFORE STRATEGY

### Characteristics

- All logic inside `GoogleMaps`
- Heavy use of `if / else`
- Algorithm selection tightly coupled to client

### Typical Code Smell

```java
if(mode ==CAR){...}
        else if(mode ==BIKE){...}
        else if(mode ==WALK){...}
```

### Problems

- ❌ Violates Open–Closed Principle
- ❌ Hard to extend
- ❌ Difficult to test
- ❌ GoogleMaps doing too much

## ✅ AFTER STRATEGY – VERSION 1

### What Changed

- Algorithm moved into separate classes
- Each path calculation became a strategy
- GoogleMaps delegates work to strategy

### Structure

```
       GoogleMaps
           ↓
 PathCalculationStrategy
           ↓
-------------------------
  | Car | Bike | Walk |
-------------------------
```

### Improvements

- ✔ Cleaner GoogleMaps
- ✔ Algorithm encapsulated

- ❌ Still uses if-else in factory

## ✅ AFTER STRATEGY – VERSION 2 (BEST VERSION)

### What Changed Further

- Removed factory if / else
- Introduced Strategy Registry
- Fully OCP compliant

### Structure
``````
       GoogleMaps
           ↓
    StrategyRegistry
           ↓
-------------------------
  | Car | Bike | Walk |
-------------------------
``````

### Benefits

- ✔ No conditional logic
- ✔ Easy to add new transport modes
- ✔ Production-ready design

## 🔄 WHAT CHANGED (Before vs After)

| Aspect | Before | After |
|------|--------|-------|
| Algorithm selection | if / else | Polymorphism |
| Extensibility | Poor | Excellent |
| OCP | ❌ Violated | ✅ Followed |
| Readability | Low | High |
| Testing | Hard | Easy |

## 🧠 Key Takeaways

- Strategy pattern removes conditional logic
- Behavior is selected at runtime
- Client depends only on abstraction
- New strategies can be added without modifying existing code

## 🎯 When to Use Strategy

- Multiple algorithms for same task
- Frequent behavior changes
- Runtime selection required
- Conditional logic growing

## ❌ When NOT to Use Strategy

- Only one algorithm
- No variation expected
- Over-engineering risk

## 🧠 Memory Trick

- **Factory → chooses OBJECT**
- **Strategy → chooses BEHAVIOR**

## 🎤 Interview One-Liner

Strategy pattern encapsulates algorithms and allows them to be selected at runtime without changing the client.

## 🏁 Final Note

- Strategy focuses on behavior
- Often used with Factory or DI frameworks
- Common in pricing engines, routing, sorting, payment processing

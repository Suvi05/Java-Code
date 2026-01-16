# Observer Design Pattern

This repository demonstrates the **Observer Design Pattern** using a clean,
step-by-step Java example.

---

## 📌 Problem Statement (Before Observer)

In many systems, a single object (Subject) needs to notify multiple dependent
objects when its state changes.

Typical examples:

- Order placed → Email, SMS, Analytics
- Stock price update → Dashboards, Alerts
- Weather change → Displays, Logs

### ❌ Problems Without Observer

- Tight coupling between subject and dependents
- Violation of Open/Closed Principle
- Hard to test and extend
- Subject becomes bloated with responsibilities

---

## ✅ Solution: Observer Design Pattern

Observer pattern defines a **one-to-many dependency** so that when one object
changes state, all its dependents are notified automatically.

---

## 🧱 Core Components

### 1️⃣ Observer (Interface)

```java
public interface Observer {
    void update();
}
```

### 2️⃣ ConcreteObserver

```java
public class EmailObserver implements Observer {

    @Override
    public void update() {
        System.out.println("Email notification sent");
    }
}
```

### 3️⃣ Subject (Interface)

```java
public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();
}
```

### 4️⃣ ConcreteSubject

```java
public class OrderService implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public void placeOrder() {
        System.out.println("Order placed");
        notifyObservers();
    }
}
```

## 🔄 Execution Flow

``````
            Client
               ↓
   ConcreteSubject (state change)
               ↓
      notifyObservers()
               ↓
All registered Observers.update()
``````

## 🔄 Before vs After Comparison

| Aspect         | Before Observer | After Observer |
|----------------|-----------------|----------------|
| Coupling       | Tight           | Loose          |
| Extensibility  | Poor            | Excellent      |
| OCP            | ❌ Violated      | ✅ Followed     |
| Testing        | Hard            | Easy           |
| Responsibility | Mixed           | Clear          |

---

## 🧠 Key Takeaways

- Subject does not know concrete observers
- Observers react automatically to changes
- New observers can be added without modifying subject
- Supports Open/Closed Principle

---

## 🎯 When to Use Observer

- Multiple objects depend on one object
- Event-driven systems
- UI listeners, notifications
- Real-time updates required

---

## ❌ When NOT to Use Observer

- Only one dependent
- Simple if-else logic sufficient
- High-frequency updates causing performance issues

---

## 🎤 Interview One-Liner

Observer pattern establishes a one-to-many relationship where observers are  
automatically notified when the subject’s state changes.

---

## 🧠 Memory Trick

- **Strategy → Choose behavior**
- **Observer → React to change**

---

## 🏁 Final Notes

- Observer improves decoupling and scalability
- Commonly used in event systems and frameworks
- Must handle observer lifecycle carefully to avoid memory leaks  

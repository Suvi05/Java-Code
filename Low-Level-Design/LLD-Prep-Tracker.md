# LLD 7-Day Prep Tracker

> **Goal:** SDE-2 → SDE-3 | **Daily commitment:** 7-8 hrs | **No ChatGPT for implementation**

---

## Overall Progress

| Day | Topic | Status |
|-----|-------|--------|
| Day 1 | Creational Design Patterns | ⬜ Not Started |
| Day 2 | Structural + Behavioural Patterns | ⬜ Not Started |
| Day 3 | LRU + LFU Cache | ⬜ Not Started |
| Day 4 | Rate Limiter (3 algorithms) | ⬜ Not Started |
| Day 5 | Parking Lot — Hardened | ⬜ Not Started |
| Day 6 | Elevator System + Cab Booking | ⬜ Not Started |
| Day 7 | Full Revision + Mock | ⬜ Not Started |

> Update status to: `🔄 In Progress` → `✅ Done`

---

## Revision Strategy (Read This First)

Forgetting is predictable. This plan fights it with **layered revision**:

- **Each morning (30 min):** Recall previous day out loud before opening any code.
- **Each evening (20 min):** Write 3 things you'd do differently in today's designs.
- **Spaced recap built into every day** — each day has a dedicated revision block for older material.
- **Rule:** If you can't explain a pattern/design in 2 minutes without notes, mark it 🔁 for redo.

---

## Day 1 — Creational Design Patterns

### Revision Block
> Day 1 has no prior material to revise. Use the first 20 min to write down everything you already know about design patterns from memory. This becomes your baseline.

### Tasks

**Singleton (2 hrs)**
- [ ] Implement eager initialization Singleton
- [ ] Implement lazy initialization Singleton (naive — identify the thread-safety bug)
- [ ] Implement double-checked locking Singleton
- [ ] Implement enum-based Singleton (best practice)
- [ ] Answer out loud: *"Why does naive lazy singleton break with 2 threads?"*

**Factory + Factory Method + Abstract Factory (2 hrs)**
- [ ] Revisit your PenDesign factory code and note its flaws
- [ ] Implement a fresh DB connection factory (MySQL / Postgres / MongoDB)
- [ ] Implement Factory Method — let subclasses decide which object to create
- [ ] Implement Abstract Factory — family of related objects (e.g. UI components: Windows vs Mac)
- [ ] Answer out loud: *"What's the difference between Factory Method and Abstract Factory?"*

**Builder (2 hrs)**
- [ ] Implement `HttpRequest` builder — url, headers (optional), timeout (optional), retries (optional)
- [ ] Show why telescoping constructors break with 5+ optional params
- [ ] Add method chaining (fluent interface)
- [ ] Answer out loud: *"When would you use Builder over a constructor?"*

**Prototype (1 hr)**
- [ ] Implement shallow copy via `clone()`
- [ ] Implement deep copy manually
- [ ] Write a 3-line note: when does shallow copy cause bugs?

**End of Day**
- [ ] Without notes — write one real-world use case for each of: Singleton, Factory, Builder, Prototype
- [ ] Mark any pattern you couldn't explain as 🔁

---

## Day 2 — Structural + Behavioural Patterns

### Revision Block (30 min — before writing any new code)
- [ ] Open your Day 1 implementations. For each pattern, explain it out loud in 90 seconds.
- [ ] Recall: what's the difference between Factory Method and Abstract Factory?
- [ ] Recall: why is enum Singleton the best? What problem does it solve vs double-checked locking?
- [ ] If any answer is shaky — reread only that implementation, not the whole thing.

### Tasks

**Structural Patterns (3.5 hrs)**

*Decorator (1 hr)*
- [ ] Implement Coffee + condiments (Milk, Sugar, Whip) using Decorator
- [ ] Show the same thing with inheritance — demonstrate why it explodes
- [ ] Answer: *"Decorator vs Inheritance — when does Decorator win?"*

*Adapter (1 hr)*
- [ ] Old payment gateway has `processPayment(amount, currency)`. New interface expects `pay(PaymentRequest)`. Write Adapter.
- [ ] Answer: *"Adapter vs Facade — what's the key difference?"*

*Facade (45 min)*
- [ ] Implement home theater facade: `watchMovie()` hides TV, sound system, lights, streaming
- [ ] Answer: *"Does Facade prevent access to subsystem directly? Should it?"*

*Proxy (45 min)*
- [ ] Implement virtual proxy (lazy load a large image)
- [ ] Implement protection proxy (role-based access control)

**Behavioural Patterns (4 hrs)**

*Strategy (1 hr)*
- [ ] Implement sorting strategies: BubbleSort, QuickSort, MergeSort — all pluggable
- [ ] Revisit your ParkingLot — does it use Strategy correctly? Note one flaw if any.
- [ ] Answer: *"Strategy vs if-else — what's the maintenance difference after 6 months?"*

*Observer (1 hr)*
- [ ] Implement stock price notifier: one `Stock` (subject), multiple observers (MobileAlert, EmailAlert, Dashboard)
- [ ] Make it so observers can subscribe/unsubscribe at runtime
- [ ] Answer: *"What happens if one observer throws an exception? Does it break others?"*

*Command (1 hr)*
- [ ] Implement text editor: `TypeCommand`, `DeleteCommand`, `UndoCommand`
- [ ] Implement undo stack — last 10 commands
- [ ] Answer: *"Command vs Strategy — both encapsulate behavior. What's the difference?"*

*Chain of Responsibility (30 min)*
- [ ] Log level chain: DEBUG → INFO → WARN → ERROR — each handler decides pass or handle

*Template Method (30 min)*
- [ ] Data parser skeleton: `readFile()` → `parseData()` → `processData()` — CSV and JSON override middle step

**End of Day**
- [ ] Write "I'd use X when ___, avoid it when ___" for all 9 patterns covered today
- [ ] Mark any pattern you couldn't explain as 🔁

---

## Day 3 — LRU + LFU Cache

### Revision Block (45 min — non-negotiable)

*Creational Patterns (15 min)*
- [ ] Quick-fire — for each: Singleton, Factory, Builder, Prototype — say one real use case out loud
- [ ] Anything marked 🔁 from Day 1? Redo just that pattern now.

*Structural + Behavioural (30 min)*
- [ ] Pick 3 random patterns from Day 2. Implement a 10-line skeleton from memory.
- [ ] Answer: *"Observer vs Chain of Responsibility — when does each fit better?"*
- [ ] Anything marked 🔁 from Day 2? Redo just that pattern now.

### Tasks

**LRU Cache (2 hrs)**
- [ ] Review your existing InMemoryCacheYT code — list every gap
- [ ] Implement LRU from scratch: `HashMap + DoublyLinkedList` — no `LinkedHashMap`
- [ ] `get(key)` → O(1), moves node to head
- [ ] `put(key, value)` → O(1), evicts tail if full
- [ ] Write test cases: insert beyond capacity, access pattern changes eviction order

**Thread-Safe LRU (1 hr)**
- [ ] Add `ReentrantReadWriteLock` — concurrent reads, exclusive writes
- [ ] Answer: *"Why not just use `synchronized` on every method? What's the performance cost?"*
- [ ] Identify: is there still a race condition after adding the lock? (hint: check `get` + `put` interleaving)

**LFU Cache (2 hrs)**
- [ ] Implement LFU: `HashMap<key, value>` + `HashMap<key, freq>` + `HashMap<freq, LinkedHashSet<key>>`
- [ ] `get(key)` → O(1), increments frequency
- [ ] `put(key, value)` → O(1), evicts lowest frequency (ties broken by LRU order)
- [ ] Edge case: what happens when `minFreq` needs to update on `put`?

**Tradeoffs Doc (1 hr)**
- [ ] Write comparison: LRU vs LFU vs FIFO vs Random eviction
- [ ] When does LFU perform worse than LRU? (hint: frequency pollution)
- [ ] How would you make this cache distributed across 10 nodes?

**End of Day**
- [ ] Can you implement LRU skeleton (no library) in 15 min from memory? Try it.
- [ ] Mark anything shaky as 🔁

---

## Day 4 — Rate Limiter

### Revision Block (45 min)

*Day 1 + Day 2 Pattern Recap (20 min)*
- [ ] Command pattern quick-fire: implement undo/redo in 10 lines from memory
- [ ] Singleton: write double-checked locking from memory — no peeking
- [ ] Abstract Factory vs Factory Method — explain difference in one sentence each

*Day 3 Cache Recap (25 min)*
- [ ] Anything marked 🔁 from Day 3? Redo it now.
- [ ] Draw LRU data structure on paper — HashMap + DLL — label every pointer
- [ ] Explain: *"Why does LFU need a LinkedHashSet and not just a HashSet?"*

### Tasks

**Setup (30 min)**
- [ ] Define interface: `RateLimiter` with `boolean allowRequest(String userId)`
- [ ] Define models: `RateLimiterConfig` (limit, windowInSeconds)

**Token Bucket (2 hrs)**
- [ ] Implement: tokens refill at fixed rate, each request consumes one token
- [ ] Handle: what if request arrives between refill intervals? (partial refill)
- [ ] Thread-safe: `synchronized` or `AtomicLong` for token count
- [ ] Answer: *"Token Bucket allows bursts — is that a feature or a bug? Depends on what?"*

**Sliding Window Log (2 hrs)**
- [ ] Implement: store request timestamps in `LinkedList`, evict entries older than window
- [ ] Thread-safe: lock during eviction + count
- [ ] Answer: *"What's the memory problem with this approach at 10k req/sec?"*

**Sliding Window Counter (2 hrs)**
- [ ] Implement: split window into buckets, approximate count using weighted average
- [ ] Compare memory usage vs Sliding Window Log
- [ ] Answer: *"Why is this an approximation? When does it over/under-count?"*

**Factory + Config (30 min)**
- [ ] Implement `RateLimiterFactory` — returns correct strategy based on config string
- [ ] This is Factory pattern from Day 1 applied — note the connection

**End of Day**
- [ ] Without notes: explain all 3 algorithms and their tradeoffs in 3 minutes
- [ ] Mark anything shaky as 🔁

---

## Day 5 — Parking Lot: Hardened

### Revision Block (45 min)

*Day 3 Cache (15 min)*
- [ ] Anything marked 🔁 from Day 3? Address it now.
- [ ] Explain LRU thread-safety: *"What goes wrong if two threads call `get()` on the same key simultaneously?"*

*Day 4 Rate Limiter (30 min)*
- [ ] Implement Token Bucket skeleton from memory in 10 min
- [ ] Explain: when would you pick Token Bucket over Sliding Window in production?
- [ ] Anything marked 🔁 from Day 4? Address it now.

### Tasks

**Audit Existing Code (1 hr)**
- [ ] Read your `MyParkingLot` code top to bottom
- [ ] List every design flaw you can find (aim for at least 5)
- [ ] List every missing feature vs a real parking lot
- [ ] List every place a race condition could occur

**Add Concurrency (1.5 hrs)**
- [ ] Scenario: 2 cars arrive at different gates, 1 spot left — implement safe assignment
- [ ] Use `synchronized` block on spot assignment (not the whole method — why?)
- [ ] Add `ReentrantLock` alternative — compare with `synchronized`
- [ ] Write test: spawn 10 threads, each trying to park simultaneously — verify no two get same spot

**Pluggable Spot Assignment Strategy (1.5 hrs)**
- [ ] Interface: `SpotAssignmentStrategy`
- [ ] Implement: `NearestSpotStrategy` (closest to entry gate)
- [ ] Implement: `EVPreferredStrategy` (EVs get charging spots first, fallback to normal)
- [ ] Implement: `RandomSpotStrategy` (you already have this — refactor it in)
- [ ] Wire via Factory: config decides which strategy loads at startup

**Observer for DisplayBoard (1 hr)**
- [ ] DisplayBoard subscribes to spot status changes
- [ ] When spot goes OCCUPIED or AVAILABLE — board updates automatically
- [ ] No manual `displayBoard.update()` calls scattered in business logic

**Exception Handling (30 min)**
- [ ] `ParkingLotFullException`
- [ ] `InvalidTicketException`
- [ ] `VehicleAlreadyParkedException`
- [ ] Propagate cleanly through controller → service → repository layers

**Tradeoffs (30 min)**
- [ ] Write: *"What breaks first if 50 entry gates fire simultaneously?"*
- [ ] Write: *"How would you redesign spot assignment for a distributed multi-location parking system?"*

**End of Day**
- [ ] Can you walk through your ParkingLot design in 5 minutes, covering concurrency and patterns used?
- [ ] Mark anything shaky as 🔁

---

## Day 6 — Elevator System + Cab Booking

### Revision Block (45 min)

*Day 4 Rate Limiter (15 min)*
- [ ] Anything marked 🔁 from Day 4? Address it now.
- [ ] Quick-fire: *"Which rate limiter algorithm would you use for a payment API? Why?"*

*Day 5 Parking Lot (30 min)*
- [ ] Anything marked 🔁 from Day 5? Address it now.
- [ ] Explain your concurrency fix out loud: *"Where exactly is the lock? Why not lock the whole service?"*
- [ ] Name the 3 design patterns used in your hardened ParkingLot

### Tasks

**Elevator System (4 hrs)**

*Design on paper first (30 min)*
- [ ] Identify models: `Elevator`, `Floor`, `Request`, `Button`, `Direction`, `ElevatorState`
- [ ] Identify strategies: how does elevator decide which floor to go to next?
- [ ] Draw class diagram — before writing any code

*Core Implementation (1.5 hrs)*
- [ ] `Elevator` with state: `IDLE`, `MOVING_UP`, `MOVING_DOWN`, `DOOR_OPEN`
- [ ] `Request` can come from inside elevator (destination) or outside (floor + direction)
- [ ] SCAN algorithm: service all requests in current direction before reversing

*State Pattern (1 hr)*
- [ ] Each `ElevatorState` is a class: `IdleState`, `MovingUpState`, `MovingDownState`, `DoorOpenState`
- [ ] State transitions: `IDLE → MOVING`, `MOVING → DOOR_OPEN`, `DOOR_OPEN → IDLE or MOVING`
- [ ] This is State pattern from Day 2's Behavioural section — note the connection

*Thread-Safety (1 hr)*
- [ ] Multiple floor buttons pressed simultaneously — safe request queuing
- [ ] Use `PriorityQueue` or `TreeSet` for ordered floor requests
- [ ] Answer: *"What happens if 2 elevators serve the same building? How does your design change?"*

**Cab Booking (4 hrs)**

*Review existing code (30 min)*
- [ ] Read your `CabBooking` skeleton — list what's missing

*Complete Core (1.5 hrs)*
- [ ] Models: `Driver`, `Rider`, `Trip`, `TripStatus` (REQUESTED/ACCEPTED/IN_PROGRESS/COMPLETED), `Location`
- [ ] `TripService`: create trip, assign driver, update status
- [ ] `DriverService`: update location, toggle availability

*Strategy Pattern (1 hr)*
- [ ] Interface: `DriverMatchStrategy`
- [ ] Implement: `NearestDriverStrategy`
- [ ] Implement: `HighestRatedDriverStrategy`
- [ ] Implement: `CheapestDriverStrategy`

*Observer Pattern (1 hr)*
- [ ] Driver gets notified when new trip is requested nearby
- [ ] Rider gets notified when driver accepts
- [ ] Trip status changes propagate to both parties

**End of Day**
- [ ] Walk through Elevator design in 3 min — State pattern, concurrency, algorithm choice
- [ ] Walk through Cab Booking in 3 min — Strategy, Observer, models
- [ ] Mark anything shaky as 🔁

---

## Day 7 — Full Revision + Mock

### Morning — Spaced Revision Sweep (3 hrs)

**Design Patterns (1 hr)**
- [ ] Quick-fire: for 15 scenarios below, name the pattern and justify in one sentence:
  - [ ] Logging framework (multiple output targets)
  - [ ] Database connection pool
  - [ ] UI theme switcher (Windows/Mac/Linux look)
  - [ ] Payment processing (multiple gateways)
  - [ ] Undo/redo in a drawing app
  - [ ] Access control for admin vs regular user
  - [ ] Adding features to a stream pipeline
  - [ ] Notification to multiple services on order placed
  - [ ] Object creation is expensive — reuse existing instances
  - [ ] Simplify a complex third-party API for your team
  - [ ] HTTP request pipeline with auth, logging, compression steps
  - [ ] Game character with different attack behaviors
  - [ ] Order processing: validate → payment → ship → notify
  - [ ] File system: files and folders treated uniformly
  - [ ] Elevator floor scheduling algorithm

**LLD Systems Rapid Recall (1 hr)**
- [ ] LRU — explain data structure + thread-safety out loud (no code, no notes)
- [ ] Rate Limiter — explain all 3 algorithms + when to use each (no code, no notes)
- [ ] Parking Lot — explain concurrency fix + 3 patterns used (no code, no notes)
- [ ] Elevator — explain State pattern + SCAN algorithm (no code, no notes)
- [ ] Cab Booking — explain Strategy + Observer usage (no code, no notes)

**🔁 Backlog Clearance (1 hr)**
- [ ] Go through every item marked 🔁 across all days
- [ ] Address each one — reimplement or re-explain until comfortable
- [ ] Unmark 🔁 only when you can explain it cleanly without notes

---

### Afternoon — Timed Mock (2 hrs)

**Problem: Design a Library Management System** *(unseen problem — do not look it up first)*

- [ ] Spend 10 min designing on paper: models, relationships, patterns you'll use
- [ ] Spend 35 min implementing core: `Book`, `Member`, `Librarian`, `BorrowRecord`, `Catalog`
- [ ] Spend 10 min adding one Strategy: fine calculation (per-day vs flat-rate)
- [ ] Spend 5 min adding thread-safety: two members borrow last copy simultaneously

**Self-critique (30 min)**
- [ ] What patterns did you use? Were they justified?
- [ ] Where is the race condition in your implementation?
- [ ] What breaks if 1000 members try to borrow simultaneously?
- [ ] What would you change with 30 more minutes?

---

### Evening — Lock It In (2 hrs)

**Concurrency Audit (1 hr)**
- [ ] Open each project. For each one, answer: *"Where is the race condition if I remove all locks?"*
  - [ ] LRU Cache
  - [ ] Rate Limiter
  - [ ] Parking Lot
  - [ ] Elevator System
  - [ ] Cab Booking

**Cheat Sheet (1 hr)**
- [ ] Create a one-page personal cheat sheet — every pattern, one-line use case, one-line avoid case
- [ ] This is YOUR cheat sheet — not copied from internet. Write it from memory, then verify.

---

## Patterns Quick Reference (Fill This In Yourself by Day 7)

> Leave this blank now. Fill it in on Day 7 from memory.

| Pattern | Type | Use When | Avoid When |
|---------|------|----------|------------|
| Singleton | Creational | | |
| Factory Method | Creational | | |
| Abstract Factory | Creational | | |
| Builder | Creational | | |
| Prototype | Creational | | |
| Decorator | Structural | | |
| Adapter | Structural | | |
| Facade | Structural | | |
| Proxy | Structural | | |
| Strategy | Behavioural | | |
| Observer | Behavioural | | |
| Command | Behavioural | | |
| Chain of Responsibility | Behavioural | | |
| Template Method | Behavioural | | |
| State | Behavioural | | |

---

## 🔁 Redo List

> Add items here when you mark something 🔁. Clear them by Day 7.

-

---

## Notes & Observations

> Use this space for anything surprising, tricky, or worth remembering across days.

-

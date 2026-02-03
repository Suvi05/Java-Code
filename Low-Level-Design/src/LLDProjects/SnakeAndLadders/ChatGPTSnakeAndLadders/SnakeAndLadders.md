# Snake & Ladders – LLD Master Reference (Interview + Real-world)

This document captures:

1. The **final working design** of Snake & Ladders
2. The **thinking process** behind every decision
3. A **step-by-step template** to build ANY similar LLD problem again
4. Common mental blockers and how to avoid them

This is NOT a tutorial.
This is a **reusable LLD blueprint**.

---

## 1. CORE LLD PRINCIPLE (MOST IMPORTANT)

> LLD is not about classes.  
> LLD is about **OWNERSHIP of responsibility**.

If you know:

- who owns the flow
- who owns the state
- who owns the rules

👉 the design writes itself.

---

## 2. FINAL RESPONSIBILITY MAP (Snake & Ladders)

| Component         | Responsibility                                        |
|-------------------|-------------------------------------------------------|
| Main / Controller | Take input, wire objects, start game                  |
| Game              | Orchestrate the flow (turns, lifecycle, win)          |
| TurnManager       | Decide **who plays next**                             |
| Player            | Hold player-specific state (position, started or not) |
| Board             | Apply rules to moves (snakes, ladders, frog, bounds)  |
| Dice              | Generate randomness                                   |
| BoardEntity       | Modify position (Snake / Ladder / Frog)               |

**Golden Rule**
> Game decides **WHAT happens**  
> Others decide **HOW it happens**

---

## 3. PACKAGE STRUCTURE (INTERVIEW-FRIENDLY)

Always create packages early. This reduces confusion later.

``````
game → flow & lifecycle
models → stateful domain objects
entities → board modifiers (snake, ladder, frog)
managers → coordination helpers (turns)
factories → object creation decisions
``````

This signals **clean thinking** to interviewers.

---

## 4. ENUMS – WHEN & WHY

Use ENUM when:

- values are **finite**
- logic depends on those values

### Used in this game:

- `GameState` → lifecycle control
- `Level` → board configuration

### Do NOT use ENUM for:

- board size
- dice max value
- number of players  
  (these are dynamic, user-driven)

---

## 5. STATE MODELING (CRITICAL INSIGHT)

### Player Position

- Stored inside `Player`
- NOT in Board
- NOT in Game

Reason:
> Position is intrinsic to a player, not the board.

If you ever ask:
> “Where do I store X?”

Ask:
> “Whose identity does X belong to?”

---

## 6. GAME LIFECYCLE (STANDARD PATTERN)

Always track lifecycle explicitly.

```java
enum GameState {
    NOT_STARTED,
    IN_PROGRESS,
    ENDED
}
```

## GAME LIFECYCLE & GAME LOOP (CORE SECTION)

In `Game.start()`:

- set state to `IN_PROGRESS`
- loop while state is `IN_PROGRESS`
- end when win condition is met

**Never scatter lifecycle logic.**

---

## 7. GAME LOOP TEMPLATE (REUSABLE EVERYWHERE)

This exact structure applies to:

- Snake & Ladders
- TicTacToe
- Board games
- Turn-based simulations

```java
start() {
    state = IN_PROGRESS;

    while (state == IN_PROGRESS) {

        Player p = turnManager.getCurrentPlayer();
        int diceValue = dice.roll();

        board.applyMove(p, diceValue);

        if (board.hasPlayerWon(p)) {
            state = ENDED;
            break;
        }

        turnManager.moveToNextPlayer(diceValue);
    }
}
```

## IMPORTANT ORCHESTRATION RULE

If your Game does NOT follow a single clear game loop,
your orchestration is wrong.

---

## 8. TURN MANAGER – STRICT RULE

TurnManager responsibilities:

- knows player order
- does NOT know rules
- does NOT know dice logic

Example method:

```java
moveToNextPlayer(int diceValue) {
    if (diceValue == 6) return;
    index = (index + 1) % players.size();
}
```

Rule decisions are owned by Game.  
Execution of turn order is owned by TurnManager.

---

## 9. DICE – STRATEGY + FACTORY

### Strategy

```java
interface Dice {
    int roll();
}
```

### Factory

```java
DiceFactory.createDice(maxValue);
```

Why this exists:

- Dice behavior may vary
- Creation decision must stay OUTSIDE Game

This pattern repeats in every LLD problem.

---

## 10. BOARD ENTITIES – ABSTRACT CLASS

Snake, Ladder, Frog all:

- trigger at a cell
- modify player position

```java
abstract class BoardEntity {
    int start;
    abstract int apply();
}
```
This allows:

- extension without changing Board
- clean Open/Closed Principle

---

## 11. FROG DESIGN (ADVANCED)

Frog behavior:

- randomly moves forward OR backward
- uses internal randomness
- does NOT affect Game logic

Key lesson:

Random behavior is NOT Game logic.  
Random behavior belongs to the entity itself.

---

## 12. INPUT HANDLING (VERY IMPORTANT)

Rule:

- Input ONLY in Main or Controller
- NEVER inside Game, Board, or Player

Why:

Game must be reusable across:

- UI
- REST API
- Tests

---

## 13. STATIC – WHEN TO AVOID

If you ever think:

"Let me make this static, so I can access it"

STOP.

Static usually indicates:

- broken ownership
- global state smell

Instead:

- pass dependencies via constructor
- store data as instance fields

---

## 14. HOW TO BUILD ANY LLD PROBLEM (STEP-BY-STEP)

### Step 1: Read requirements ONCE

Do NOT code yet.

Identify:

- players or users
- state
- rules
- flow

---

### Step 2: Identify the ORCHESTRATOR

Ask:
Who runs the system?

That becomes:

- Game
- Controller
- Manager

---

### Step 3: Identify STATE HOLDERS

Examples:

- Player holds position
- ParkingSlot holds occupied or free
- Account holds balance

Create models with ONLY:

- state
- getters
- setters

---

### Step 4: Identify RULE APPLIERS

Rules that modify state:

- Board
- Strategy
- Validators

These classes do NOT run the main loop.

---

### Step 5: Identify VARIATIONS

If behavior can change:

- use Strategy
- use Factory

Do NOT overdo patterns.

---

### Step 6: Write SKELETON FIRST

Create:

- empty classes
- fields
- constructors

NO logic yet.

This avoids mental overload.

---

### Step 7: Implement Game Loop EARLY

Always do this first.

Most LLD confusion disappears once the game loop exists.

---

### Step 8: Fill Logic Incrementally

Order:

1. happy path
2. rules
3. edge cases

---

## 15. COMMON MENTAL BLOCKERS (AND FIXES)

Who should call this method?

- Higher abstraction calls lower abstraction

Where do I store this variable?

- Store it where the identity belongs

Should I make this static?

- Almost always NO

I want to use more patterns

- Stop and fix ownership first

---

## 16. INTERVIEW MODE VS REFERENCE MODE

This codebase is REFERENCE MODE.

In interviews:

- write only 40–50 percent
- explain remaining verbally
- never over-code

Safe interview sentence:

"This can be extended using strategy or factory, but I will keep it simple for now."

---

## 17. FINAL TAKEAWAY

If you remember only ONE thing:

LLD clarity comes from flow ownership, not patterns.

Once flow is clear,
patterns appear naturally
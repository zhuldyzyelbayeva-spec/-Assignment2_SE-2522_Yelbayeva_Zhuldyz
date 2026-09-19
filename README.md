# Assignment 2 — Factory Method and Abstract Factory

**Astana IT University**
**School of Software Engineering**
**Course:** ShP-2216 Software Design Patterns
**Academic Year:** 2026–2027
**Student:** Zhuldyz Yelbayeva
**Group:** SE-2522

## Project Description

This project is a Java console application that demonstrates two design patterns:

* **Factory Method** — used to create different types of transport for delivery.
* **Abstract Factory** — used to create matching UI components for different platforms.

The application supports:

* Road delivery → `Truck`
* Sea delivery → `Ship`
* Windows UI → `WindowsButton` + `WindowsCheckbox`
* macOS UI → `MacOSButton` + `MacOSCheckbox`

The two patterns work together in the same application. The user selects a delivery mode and a UI platform at runtime.

The application does not require a graphical interface, database, web framework, or external services. UI components demonstrate their behavior by printing messages to the console.

---

## Technologies

* Java
* JDK 17
* IntelliJ IDEA
* Command-line compilation with `javac`

> The assignment is designed for JDK 17.

---

## Project Structure

```text
DeliveryApplication/
│
├── src/
│   │
│   ├── app/
│   │   ├── Main.java
│   │   └── DeliveryApplication.java
│   │
│   ├── logistics/
│   │   ├── Logistics.java
│   │   ├── RoadLogistics.java
│   │   └── SeaLogistics.java
│   │
│   ├── transport/
│   │   ├── Transport.java
│   │   ├── Truck.java
│   │   └── Ship.java
│   │
│   ├── factory/
│   │   ├── GUIFactory.java
│   │   ├── WindowsFactory.java
│   │   └── MacOSFactory.java
│   │
│   └── ui/
│       ├── Button.java
│       ├── Checkbox.java
│       ├── WindowsButton.java
│       ├── WindowsCheckbox.java
│       ├── MacOSButton.java
│       └── MacOSCheckbox.java
│
└── README.md
```

### Package Responsibilities

#### `transport`

Contains the Factory Method product hierarchy.

* `Transport` — common transport interface.
* `Truck` — concrete road transport.
* `Ship` — concrete sea transport.

#### `logistics`

Contains the Factory Method creators.

* `Logistics` — abstract creator with `createTransport()` and the shared `planDelivery(...)` workflow.
* `RoadLogistics` — creates `Truck`.
* `SeaLogistics` — creates `Ship`.

#### `ui`

Contains the Abstract Factory product interfaces and concrete products.

* `Button`
* `Checkbox`
* `WindowsButton`
* `WindowsCheckbox`
* `MacOSButton`
* `MacOSCheckbox`

#### `factory`

Contains the Abstract Factory classes.

* `GUIFactory` — abstract factory interface.
* `WindowsFactory` — creates Windows UI components.
* `MacOSFactory` — creates macOS UI components.

#### `app`

Contains the application client and startup logic.

* `DeliveryApplication` — receives `Logistics` and `GUIFactory` thro

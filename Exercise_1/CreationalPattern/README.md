# Creational Design Patterns in Java

## Overview

This project demonstrates two **Creational Design Patterns** with practical, real-world examples:

* **Factory Pattern:** Notification Service Factory (Email, SMS, Push)
* **Singleton Pattern:** Job Scheduler

---

## How It Works

* **Factory Pattern:** A client requests a notification type from the factory (Email, SMS, Push). The factory creates the right object without exposing the instantiation logic. This decouples the client from concrete classes.

* **Singleton Pattern:** A single JobScheduler instance manages all jobs (EmailJob, DataBackupJob, etc.). Multiple parts of the system access the same scheduler, ensuring consistent coordination and avoiding duplicate instances.

---

## Run Instructions

```bash
# Run Factory Pattern
javac factory/*.java
java factory.FactoryPatternDemo

# Run Singleton Pattern
javac singleton/*.java
java singleton.SingletonJobSchedulerDemo
```

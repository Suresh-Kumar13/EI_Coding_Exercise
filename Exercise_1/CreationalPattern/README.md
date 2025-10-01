# Creational Design Patterns in Java

## Overview

This project demonstrates two **Creational Design Patterns** with practical, real-world examples:

* **Factory Pattern:** Notification Service Factory (Email, SMS, Push)
* **Singleton Pattern:** Job Scheduler

---

**Class Structure**
- **Notification (Interface):** Defines the `send()` method for all notifications.
- **EmailNotification:** Concrete class for sending email notifications.
- **SMSNotification:** Concrete class for sending SMS notifications.
- **PushNotification:** Concrete class for sending push notifications.
- **NotificationFactory:** Responsible for creating the appropriate notification object.
- **FactoryPatternDemo:** Client code that demonstrates the use of the factory.



---

### Singleton Pattern
A single **JobScheduler** instance manages all jobs (EmailJob, DataBackupJob, etc.). Multiple parts of the system access the same scheduler, ensuring consistent coordination and avoiding duplicate instances.

**Class Structure**
- **Job (Interface):** Defines the `execute()` method for all jobs.
- **EmailJob:** Represents a job that sends emails.
- **DataBackupJob:** Represents a job that performs database backups.
- **JobScheduler (Singleton):** Manages the job queue and ensures only one instance exists.
- **SingletonJobSchedulerDemo:** Client code that demonstrates the singleton in action.



---

## Clone and Explore

```bash
# Clone repository
git clone https://github.com/maaliniponraj/EI_Coding_Exercise.git
cd EI_Coding_Exercise/Exercise1

# Explore Factory Pattern
cd CreationalPattern/factory/NotificationService/src
javac *.java
java FactoryPatternDemo

# Explore Singleton Pattern
cd CreationalPattern/singelton/JobScheduler/src
javac *.java
java SingletonJobSchedulerDemo

# Behavioral Design Patterns in Java

## Overview

This project demonstrates two **Behavioral Design Patterns** with practical, real-world examples:

* **Chain of Responsibility (CoR):** Payment Processing System  
* **Observer Pattern:** Weather Alert System  

---

### Chain of Responsibility - Payment Processing System

A payment request flows through multiple checks (Card Validation → Fraud Check → Balance Check → Final Approval).  
Each handler performs its responsibility and passes the request forward if valid.  

**Class Structure**
- **PaymentRequest:** Represents the request with card number, amount, and balance.  
- **PaymentHandler (Abstract):** Defines the chain structure with setNextHandler() and handle().  
- **CardValidationHandler:** Verifies if the card number is valid.  
- **FraudCheckHandler:** Detects suspicious or fraudulent activity.  
- **BalanceCheckHandler:** Ensures account balance is sufficient.  
- **FinalPaymentHandler:** Completes payment processing if all checks pass.  
- **CORDemo:** Client code that sets up the chain and runs test cases.  


---

### Observer Pattern - Weather Alert System

A **WeatherStation** acts as the subject. It notifies all registered observers whenever the weather condition changes.  

**Class Structure**
- **WeatherObserver (Interface):** Defines the update() method for observers.  
- **WeatherStation:** Manages observers and broadcasts updates.  
- **MobileApp:** Observer representing a user’s weather app.  
- **NewsAgency:** Observer representing a media agency.  
- **GovernmentDepartment:** Observer representing disaster management.  
- **ObserverDemo:** Client code that attaches observers and simulates weather changes.  


---

## Clone and Explore

```bash
# Clone repository
git clone https://github.com/maaliniponraj/EI_Coding_Exercise.git
cd EI_Coding_Exercise/Exercise1

# Explore Chain of Responsibility
cd BehaviouralPattern/PaymentSystem/src
javac com/paymentsystem/*.java
java com.paymentsystem.CORDemo

# Explore Observer Pattern
cd BehaviouralPattern/WeatherAlertSystem/src
javac com/weatheralertsystem/*.java
java com.weatheralertsystem.ObserverDemo

# 🏠 Smart Home System 

A **Java-based Smart Home System simulation** where users can control smart devices (Lights, Thermostats, and Door Locks) via a central hub.  
This project demonstrates **OOP principles** and the use of **Design Patterns** commonly used in real-world applications.

---

## 🚀 Features

-  Add or remove smart devices dynamically  
-  Turn devices **ON/OFF** from the central hub  
-  **Schedule** device actions (e.g., turn light ON at 06:30)  
-  View all devices and their current status  
-  View scheduled tasks and automation triggers  
-  Update thermostat temperature to test triggers  
-  Logging of all actions into a file (`logs/app.log`)  

---
## 📘 Class Structure  

### **Main**
- Entry point of the application. Handles the menu-driven user interface.  

---

### **Devices**  
- **SmartDevice (Abstract Class):** Base class for all devices (ID, type, status).  
- **Light:** Represents a smart light that can be turned ON/OFF.  
- **Thermostat:** Represents a thermostat with adjustable temperature.  
- **DoorLock:** Represents a smart door lock that can lock/unlock.  

---

### **Factory**  
- **DeviceFactory:** Implements the Factory Pattern to create devices dynamically based on type.  

---

### **Proxy**  
- **DeviceProxy:** Implements the Proxy Pattern to control and wrap access to real devices.  

---

### **Hub**  
- **SmartHomeHub:** Central hub that manages devices, scheduler, and triggers.  
- **Scheduler:** Handles scheduling of device actions at specific times.  
- **Trigger:** Represents automation rules .  

---

### **Utilities**  
- **LoggerUtil:** Logs all actions to `logs/app.log` for tracking system activity.  

---

### **Exceptions**  
- **InvalidInputException:** Thrown for invalid input formats.  
- **InvalidActionException:** Thrown for unsupported or wrong actions.  
- **DeviceNotFoundException:** Thrown when a device with a given ID doesn’t exist.  

---

## Sample Run  

```text
--- Smart Home Menu ---
1. Add Device
2. Remove Device
3. Turn Device On/Off
4. Schedule Device Action
5. Add Automation Trigger
6. Show Device Status
7. Show Scheduled Tasks
8. Show Automation Triggers
9. Exit

Enter choice: 1
Enter device type (light/thermostat/door): light
Enter device ID: 1

Enter choice: 3
Enter device ID: 1
Enter action (on/off): on
Light 1 is on

Enter choice: 4
Enter device ID: 1
Enter time (HH:MM): 06:30
Enter action (on/off): off
Scheduled task added

Enter choice: 6
Light 1 is off   (executed by scheduler)

`````
## Clone and Explore
git clone https://github.com/maaliniponraj/EI_Coding_Exercise.git
cd EI_Coding_Exercise/SmartHomeSystem/src
javac com/smarthome/**/*.java
java com.smarthome.Main

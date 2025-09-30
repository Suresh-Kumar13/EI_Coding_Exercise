# Structural Design Patterns in Java

## Overview

This project demonstrates two **Structural Design Patterns** with practical, real-world examples:

* **Adapter Pattern:** Media Player supporting multiple file formats (MP3, MP4, VLC)  
* **Decorator Pattern:** Coffee Billing System with dynamic add-ons (Milk, Sugar, Whipped Cream)  

---

## Adapter Pattern

The **Adapter Pattern** allows incompatible interfaces to work together.  
Here, a simple AudioPlayer can play only MP3 files. By using an **Adapter**, it can also support MP4 and VLC formats through existing advanced players.

### Class Structure
- **MediaPlayer (Interface):** Defines the play() method for all media players.  
- **AdvancedMediaPlayer (Interface):** Defines methods for advanced formats (playMp4(), playVlc()).  
- **Mp4Player:** Plays MP4 files (concrete advanced player).  
- **VlcPlayer:** Plays VLC files (concrete advanced player).  
- **MediaAdapter:** Bridges AudioPlayer with advanced players.  
- **AudioPlayer:** Client-facing player that delegates to MediaAdapter for unsupported formats.  
- **AdapterDemo:** Demonstrates the usage of the adapter pattern.  

### Sample Output

---

## Decorator Pattern

The **Decorator Pattern** dynamically adds new responsibilities to objects without modifying their code.  
Here, a SimpleCoffee can be enhanced with additional toppings like Milk, Sugar, and Whipped Cream by wrapping it with decorators.

### Class Structure
- **Coffee (Interface):** Defines getDescription() and getCost().  
- **SimpleCoffee:** Base implementation with default description and cost.  
- **CoffeeDecorator (Abstract Class):** Base decorator that delegates to the wrapped coffee.  
- **MilkDecorator:** Adds milk description and cost.  
- **SugarDecorator:** Adds sugar description and cost.  
- **WhippedCreamDecorator:** Adds whipped cream description and cost.  
- **DecoratorDemo:** Demonstrates combining multiple decorators dynamically.  

### Sample Output

---

## Clone and Explore

```bash
# Clone repository
git clone https://github.com/Suresh-Kumar13/EI_Coding_Exercise.git
cd EI_Coding_Exercise/Exercise1

# Explore Adapter Pattern
cd StructuralPattern/adapter/MediaPlayer/src
javac *.java
java AdapterClient

# Explore Decorator Pattern
cd StructuralPattern/decorator/CoffeeBilling/src
javac *.java
java DecoratorClient

# DesignPatterns-and-SmartHomeSystem

**Java implementations of common design patterns + a Smart Home System demo**

---

## Overview

This repository contains two main parts:

1. **Exercise_1** — Hands-on implementations of Creational, Structural and Behavioral design patterns (each pattern as its own mini-project).
2. **SmartHomeSystem** — A small real-world Java project demonstrating architecture patterns (factory, proxy), scheduling, exception handling, and modular design.

This repo is structured and documented so interviewers can quickly find code, run demos, and understand your design choices.

---

## Project layout (top-level)

```
DesignPatterns-and-SmartHomeSystem/
├── Exercise_1/               # All design pattern examples (each pattern has its own subfolder)
├── SmartHomeSystem/          # Smart Home project with hub, devices, proxy, factory
├── README.md                 # This file (root-level overview + quick start)
├── LICENSE
└── .gitignore
```

Each pattern/demo also contains its own `README.md` and sample `bin/` (compiled classes). *Before publishing, compiled files should be removed (see Quick checklist below).*

---

## Quick start (VSCode)

1. Open the repository folder in VSCode: `code /path/to/DesignPatterns-and-SmartHomeSystem`
2. Install Java extensions if you want to run Java files from VSCode (Java Extension Pack).
3. Use the **Run** (▶) code lens on demo classes like `CORDemo.java`, `ObserverDemo.java`, or `SingletonJobSchedulerDemo.java` to run them directly in the editor.

If you prefer the terminal, compile/run with `javac`/`java` from the module's `src` folder or use a build tool (Maven/Gradle) if you add one later.

---

## Recommended commit history (example)

Make incremental commits rather than one giant commit. Example sequence:

* `chore(repo): add README, LICENSE and .gitignore`
* `feat(patterns): add Creational Pattern examples (Factory, Singleton)`
* `feat(patterns): add Structural Pattern examples (Adapter, Decorator)`
* `feat(patterns): add Behavioral Pattern examples (Chain of Responsibility, Observer)`
* `feat: add SmartHomeSystem project (devices, hub, factory, proxy)`
* `chore: remove compiled class files and bin folders`

This demonstrates deliberate, readable progress to reviewers.

---

## Best-practice checklist before push

* [ ] Remove compiled `.class` files and `bin/` folders from repo (add them to `.gitignore`).
* [ ] Keep `src/` and `lib/` (source-first) — avoid committing binaries/JARs.
* [ ] Ensure each sub-project has a short `README.md` that explains how to run its demo class.
* [ ] Add a license (MIT or similar) and a descriptive root-level README (this file).
* [ ] Add a small UML diagram or ASCII class diagram for 1–2 key components (SmartHomeHub, JobScheduler) to help interviewers understand design at a glance.

---

## Contact / Author

Repository prepared for interview showcase. Replace placeholders in `LICENSE` with your real name and year.

---

If you want, follow the step-by-step git instructions I’ll show in the chat to initialize, split commits logically, and push to GitHub. Happy to generate a `.gitignore` and `LICENSE` file content (ready to paste) as well.

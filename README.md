# Time-Dilation-Simulator

Note: Project In-Progress. Code does not reflect the complete README

RocketSim lets you select a destination in space, launch a rocket, and understand time dilation and space relativity using simplified physics.

---

## Features

- Selectable destinations (Solar System + nearby stars)
- Rocket launch and trajectory simulation
- Constant acceleration travel model (arcade-style physics)
- Special relativity time dilation (speed-based)
- Real-time simulation of:
  - Earth time
  - Ship time
  - Distance traveled
- Docker support for build consistency

---

## Supported Destinations

- Moon
- Mercury
- Mars
- Jupiter
- Saturn
- Venus
- Uranus
- Neptune
- Alpha Centauri
- Tau Ceti
- Barnard's Star
- Sirius
- Betelguese

(Distances are simplified for simulation purposes)

---

## Physics Model

This project uses a simplified space travel model:

- Straight-line travel between origin and destination
- Constant acceleration halfway, then deceleration
- No orbital mechanics or gravity simulation

### Time Dilation

Special relativity is approximated using:

\[
\gamma = \frac{1}{\sqrt{1 - \frac{v^2}{c^2}}}
\]

Ship time is slowed relative to Earth time based on velocity.

---

## Project Structure
```
RocketSim/
│
├── src/
│   ├── Driver.java
│   ├── Simulation.java
│   ├── RocketState.Java
│   ├── Desination.Java
│   └── Physics.java
│
└── Dockerfile
```# Time-Dilation-Simulator

# Graph Algorithms Project

Design and Performance Evaluation of Graph Algorithms for Smart City Route Optimisation

## Overview
This project implements a graph data structure and fundamental graph algorithms using Java. The system is designed to model real-world network problems such as route optimisation, where nodes represent locations and edges represent connections with associated weights.

The project demonstrates the use of object-oriented design principles and includes performance analysis of graph algorithms.

---

## Features
- Graph implementation using adjacency list
- Vertex and Edge representation
- Graph traversal algorithms:
  - Breadth-First Search (BFS)
  - Depth-First Search (DFS)
- Shortest path algorithm:
  - Dijkstra’s Algorithm
- Performance experiments for different graph sizes
- Test cases for validation

---

## Project Structure
```
src/graphproject/
│
├── Graph.java
├── Vertex.java
├── Edge.java
├── GraphAlgorithms.java
├── Main.java
├── ExperimentRunner.java
├── GraphTestCases.java
```

---

## Technologies Used
- Java
- Eclipse IDE
- GitHub (Version Control)

---

## How to Run the Project

1. Open the project in Eclipse
2. Navigate to the `src/graphproject` package
3. Run:
   - `Main.java` → to demonstrate graph functionality
   - `GraphTestCases.java` → to test correctness
   - `ExperimentRunner.java` → to run performance experiments

---

## Algorithms Used

### Breadth-First Search (BFS)
Used for level-order traversal of the graph  
Time Complexity: **O(V + E)**

### Depth-First Search (DFS)
Used for depth-based traversal  
Time Complexity: **O(V + E)**

### Dijkstra’s Algorithm
Used for finding shortest path in weighted graphs  
Time Complexity: **O((V + E) log V)**

---

## Experiments
The system includes experiments to evaluate:
- Execution time for BFS, DFS, and Dijkstra
- Performance with increasing number of vertices and edges
- Scalability of graph algorithms

---

## Results
The experiments demonstrate that:
- BFS and DFS scale linearly with graph size
- Dijkstra’s algorithm has higher computational cost due to priority queue operations
- The adjacency list representation is efficient for sparse graphs

---

## Learning Outcomes
- Understanding graph data structures
- Implementation of traversal and shortest path algorithms
- Application of object-oriented design principles
- Performance analysis of algorithms

---

🌳 Binary Tree in Java

A collection of Binary Tree implementations and practice problems in Java, covering tree construction, traversals, height, node counting, diameter, level-order operations, and subtree checking.

This repository is intended for learning Data Structures & Algorithms (DSA) and understanding how common Binary Tree problems can be implemented using Java.

📌 About the Repository

This repository contains simple and beginner-friendly Java implementations of common Binary Tree concepts and problems.

Topics Covered
🌱 Creating and building Binary Trees
🔄 Tree Traversals
📊 Calculating tree height
🔢 Counting nodes
📏 Finding the diameter of a Binary Tree
📋 Level Order Traversal
➕ Calculating the sum of nodes at a specific level
🌳 Checking whether one tree is a subtree of another
⚡ Comparing different approaches and their time complexities

The code is written with readability and learning in mind.

🌳 Binary Tree Used in Examples

Most examples use the following Binary Tree:

            1
          /   \
         2     3
        / \     \
       4   5     6


The tree is constructed using a preorder representation, where -1 represents a null child.
```
Example
int nodes[] = {
    1, 2, 4, -1, -1, 5, -1, -1,
    3, -1, 6, -1, -1
};
```
## 📂 Topics Covered

| # | Topic | Java File | Time Complexity |
|---:|---|---|---|
| 1 | Binary Tree Construction | `BinaryTree.java` | `O(n)` |
| 2 | Count Nodes | `CountNodes.java` | `O(n)` |
| 3 | Tree Height | `TreeHeight.java` | `O(n)` |
| 4 | Preorder Traversal | `PreOrderTraversal.java` | `O(n)` |
| 5 | Inorder Traversal | `InOrderTraversal.java` | `O(n)` |
| 6 | Postorder Traversal | `PostOrderTraversal.java` | `O(n)` |
| 7 | Level Order Traversal | `LevelOrderTraversal.java` | `O(n)` |
| 8 | Sum of Nodes at a Level | `SumOfLevel.java` | `O(n)` |
| 9 | Diameter — Optimized | `DiameterOfTreeOn.java` | `O(n)` |
| 10 | Diameter — Basic | `DiameterOfTreeOn2.java` | `O(n²)` |
| 11 | Subtree of Another Tree | `IsSubtree.java` | Depends on tree structure |

The repository demonstrates the three fundamental Depth First Search (DFS) traversals and Breadth First Search (BFS).

1. Preorder Traversal

Order:
```
Root → Left → Right
```

Output:
```
1 2 4 5 3 6
```

Implemented in:
```
PreOrderTraversal.java
```
2. Inorder Traversal

Order:
```
Left → Root → Right
```

Output:
```
4 2 5 1 3 6
```

Implemented in:
```
InOrderTraversal.java
```
3. Postorder Traversal

Order:
```
Left → Right → Root
```

Output:
```
4 5 2 6 3 1
```

Implemented in:
```
PostOrderTraversal.java
```
4. Level Order Traversal

Level Order Traversal visits nodes level by level using a Queue.

        1
       / \
      2   3
     / \   \
    4   5   6


Output:
```
1
2 3
4 5 6
```

Implemented in:
```
LevelOrderTraversal.java
```
📏 Tree Height

TreeHeight.java calculates the height of a Binary Tree recursively.

For the example tree:

            1
          /   \
         2     3
        / \     \
       4   5     6

Height
```
3
```
Complexity
Time: O(n)
Space: O(h), where h is the height of the tree due to recursion.
🔢 Count Nodes

CountNodes.java calculates the total number of nodes in the Binary Tree.

For the example tree:

Total Nodes = 6

Recursive Idea
```
count(root)
    = count(left subtree)
    + count(right subtree)
    + 1
```
Complexity
Time: O(n)
Space: O(h)
📏 Diameter of Binary Tree

The repository contains two approaches for finding the diameter of a Binary Tree.

1. Basic O(n²) Approach

Implemented in:
```
DiameterOfTreeOn2.java
```

This approach repeatedly calculates the height of subtrees while finding the diameter.

Time Complexity: O(n²) in the worst case.

2. Optimized O(n) Approach

Implemented in:
```
DiameterOfTreeOn.java
```

This approach calculates the height and diameter together using a TreeInfo class.

Time Complexity: O(n)

This provides a useful comparison between a straightforward recursive solution and an optimized solution.

➕ Sum of Nodes at a Level

SumOfLevel.java calculates the sum of all nodes present at a specified level using Level Order Traversal.

Example
```
Level 1 → 1
Level 2 → 2 + 3 = 5
Level 3 → 4 + 5 + 6 = 15
```
Example Output
```
Sum of level 3 = 15
```
🌿 Subtree of Another Tree

IsSubtree.java contains a solution for the LeetCode "Subtree of Another Tree" problem.

The solution uses two recursive methods:

isIdentical() — checks whether two trees are structurally identical and contain the same values.
isSubtree() — searches the main tree for a matching subtree.
🧠 Concepts Practiced
```
Binary Trees
├── Node Creation
├── Recursive Tree Construction
├── Depth First Search
│   ├── Preorder
│   ├── Inorder
│   └── Postorder
├── Breadth First Search
│   └── Level Order
├── Tree Height
├── Node Counting
├── Tree Diameter
├── Level-Based Calculations
└── Subtree Checking
```
🛠️ Technologies Used
☕ Java
🌳 Binary Tree Data Structure
🔁 Recursion
📦 Java Collections
🧠 Data Structures & Algorithms
▶️ How to Run
1. Clone the Repository
```
git clone https://github.com/<your-username>/tree.git
```
2. Navigate to the Repository
```
cd tree
```
3. Compile a Java File

For example:
```
javac TreeHeight.java
```
4. Run the Program
```
java TreeHeight
```

You can similarly compile and run any of the Java files individually.

📁 Project Structure
tree/
│
├── BinaryTree.java
├── CountNodes.java
├── DiameterOfTreeOn.java
├── DiameterOfTreeOn2.java
├── InOrderTraversal.java
├── IsSubtree.java
├── LevelOrderTraversal.java
├── PostOrderTraversal.java
├── PreOrderTraversal.java
├── SumOfLevel.java
├── TreeHeight.java
│
└── README.md

🎯 Learning Goals

This repository is part of my journey to strengthen my understanding of Data Structures and Algorithms using Java.

The main goals are to:

Understand Binary Tree fundamentals
Improve recursive problem-solving skills
Learn different tree traversal techniques
Analyze time and space complexity
Compare brute-force and optimized approaches
Build a strong foundation for solving DSA problems

🚀 Future Additions

More Binary Tree problems and concepts can be added over time, such as:

🔍 Search in Binary Tree
➕ Sum of all nodes
🍃 Count leaf nodes
🪞 Mirror / Invert Binary Tree
📍 Lowest Common Ancestor
⬆️ Top View of Binary Tree
⬇️ Bottom View of Binary Tree
👈 Left / Right View
🌿 Root-to-leaf paths
🌳 Binary Search Tree (BST)
➕ BST insertion and deletion
⚖️ Balanced Binary Tree
🧩 More LeetCode problems
🤝 Contributions

This repository is primarily for learning and practice.

Suggestions, improvements, and better approaches are always welcome!

If you find a bug or have a more efficient solution, feel free to:

Open an Issue
Submit a Pull Request
⭐ Support

If you find this repository useful for learning Binary Trees and Java DSA, consider giving it a ⭐.

Keep learning. Keep coding. Keep growing. 🌱

👨‍💻 Author

Manish

"Every expert was once a beginner." 🌳

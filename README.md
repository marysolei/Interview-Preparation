# Leetcode

Solutions to problems on Leetcode, using Golang and JAVA.

Feel free to make a pull request, if you are interested in helping or you have solutions in different programming languages.


# Data Structures

 ## Arrays & Strings
 
 - The array has a fixed size in Java.
 - ArrayLists have dynamic resizing feature. When the Array is full, it doubles the size.
 - Copying a string is an expensive operation, an alternative can be using String Builder.
 - String Builder is a resizable array of Strings. String Builder can be converted to a String when it is needed.
 
 ## Hash Table
 
 - It is a map of keys to values.
 - How it can be implemented?  Using an array of linked lists and a hash function.
 - How does it work? 
    - The hashcode of the key is computed using a hash function.
    - The result will be mapped to an index in the array. e.g. (key % ArrayLength).
    - The key and value will be stored in that index.
    
    ### Collision Handling:
    
    - Since there are infinite values and finite possible hashcode or indexes in an array collision may occur. How to handle the collision?
        - Chaining with Linked List: it is the most common way in which we make a hashtable of items with having an array that maps to a linked list. The keys and values are stored in Linked Lists. The time complexity of access is O(n) in the worst case.
        - Chaining with Binary Search Tree: The collisions are stored in a binary search tree. The method is not that common but provides time complexity of O(logn).
        - Open Addressing with Linear Probing: while saving the key value in the hash map, if a collision occurs, increment the index and move to the next index till we find the next open spot. If the number of collisions is low, this method can be very fast and space efficient.
        - Quadratic Probing: Like the approach above but instead of linear search for next open spot, do a quadratic search for the next open spot. Another possible approach is to do a double hash function as well.
        
   ## Linked Lists
     - No constant time Access (unlike arrays).
     - Add or remove to the beginning of the Linked List is constant. 
     
     
     
     ```
     Class Node {
     int data; 
     Node next; 
     public Node (int data) {
     this.data= data;
      }
     }
     ```
        
    ## Stack
    
     - The order in stack is LIFO (Last in First out).
     - The adds and removes can be done in constant time.
     - No constant time access.
     - 4 available functions: pop(), push(), peek() and isEmpty();
     - Stacks can be implemented by linked lists.
     
     
     
     ```
     public class stackNode <int> {
      
      int data; 
      stackNode next; 
      public stackNode (int d) {
       this.data= d; 
       }
     }
     ```
   ## Queue
   
     - The order in Queue is FIFO (First in First out).
     - The adds and removes can be done in constant time.
     - It is used in Breadth First Search.
     - 4 available functions:  add(), remove(), peek() and isEmpty();
     - Queues can be implemented by linked lists.
   
   
   
   ```
   public class MyQueue {
    
    public class QueueNode {
     
     int data;
     QueueNode next; 
     public QueueNode (int d) {
      this.data=d;
       }
     }
    }
   ```
   
   ## Trees
   
   - Tree is a type of connected graph with no cycle.
   - Tree has a root node.
   
   ```
   class TreeNode{
    int data; 
    TreeNode[] children;
    }
   ```
   ### Different Types of Trees:
   
   - Binary Tree: A tree that has up to 2 children.
   - Binary Search Tree: A binary tree with the condition: Value of all left descendants <= Value of root < Value of all right descendants.
   - Balanced Tree: insertion and find time complexity: O(logn) where n is the number of nodes in the tree.
   - Complete Binary Tree: A binary tree in which every level of the tree is fully filled except the last level.
   - Full Binary Tree: A binary tree in which every node has either zero or two children.
   - Perfect Binary Tree: A tree that is full and complete. The number of nodes in the level of K in a perfect binary tree is 2^K-1 nodes.

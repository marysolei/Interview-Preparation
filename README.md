# Leetcode

Solutions to problems on Leetcode, using Golang and JAVA.

Feel free to make a pull request, if you are interested in helping or you have solutions in different programming languages.


# Data Structures

 ## Arrays & Strings
 
 - Arrays have fixed size in Java.
 - ArrayLists have dynamic resizing feature. When the Array is full, it doubles the size.
 - Copying a string is an expensive operation, an alternative can be using String Builder.
 - String Builder is a resizable array of Strings. String Builder can be converted to a String when it is needed.
 
 ## Hash Table
 
 - It is a map of keys to values.
 - How it can be implemented?  Using an Array of LinkedLists and a Hash function.
 - How it works? 
    - The hashcode of the key is computed using Hash function.
    - The result will be maped to an index in the array. e.g. (key % ArrayLength).
    - The key and value will be stored in that index.
    
    ### Collision Handling:
    
    - Since there are infinite values and finite possible hashcode or indexes in an arraya collision may occur. How to handle the collision?
        - Chaining with Linked List: it is the most common way in which we make a hashtable of items with having an array which maps to linkedlists. The keys and values are stored in Linked Lists. Time complexity of access is O(n) in worst case.
        - Chaining with Binary Search Tree: The collisions are stored in a binary search tree. The method is not that common but provides time complexity of O(logn).
        - Open Addressing with Linear Probing: while saving the key value in the hash map, if a collision occurs, increament the index and move to the next index till we find the next open spot. If the number of collisions is low, this method can be very fast and space efficient.
        
    

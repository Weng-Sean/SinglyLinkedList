# Singly Linked List and Stack Implementation

This project provides Java implementations of a Singly Linked List and a Stack, along with associated interfaces, that can be used as fundamental data structures in various applications. The code is designed to be generic, allowing you to work with elements of any data type.

## Table of Contents

- [Singly Linked List](#singly-linked-list)
  - [Node Class](#node-class)
  - [SinglyLinkedList Class](#singlylinkedlist-class)
  - [Interface Implementation](#interface-implementation)
- [Singly Linked Stack](#singly-linked-stack)
  - [SinglyLinkedStack Class](#singlylinkedstack-class)
  - [Interface Implementation](#interface-implementation-1)

## Singly Linked List

### Node Class

The `Node` class represents a node in the singly linked list. Each node contains two fields:
- `element`: Stores the data element of type `T`.
- `next`: A reference to the next node in the list.

The `Node` class provides constructors for creating nodes with and without initial elements, as well as getter and setter methods for the element and the next node.

### SinglyLinkedList Class

The `SinglyLinkedList` class represents the singly linked list data structure. It includes the following functionality:
- Constructors for creating an empty list or initializing a list with elements.
- Methods for adding elements at specified indices, at the beginning, or removing elements by index or by value.
- A method for finding an element in the list.
- A method for determining the size (number of elements) of the list.

### Interface Implementation

The `SinglyLinkedList` class implements the `CSE214List<T>` interface, which defines a common set of list operations, including size, adding, removing, and finding elements.

## Singly Linked Stack

### SinglyLinkedStack Class

The `SinglyLinkedStack` class represents a stack data structure implemented using a singly linked list. It includes the following functionality:
- Constructors for creating an empty stack or initializing a stack with elements.
- Methods for pushing (adding) elements onto the top of the stack, popping (removing) elements from the top, and peeking (viewing) the top element without removal.
- Methods for checking the stack's size and whether it is empty.

### Interface Implementation

The `SinglyLinkedStack` class implements the `CSE214Stack<T>` interface, which defines common stack operations, including size, peeking, popping, pushing, and checking for emptiness.

## Usage

You can use the provided classes and interfaces to work with singly linked lists and stacks in your Java applications. Here's a simple example of using the Singly Linked Stack:

```java
// Creating a SinglyLinkedStack of integers
SinglyLinkedStack<Integer> stack = new SinglyLinkedStack<>();
stack.push(1);
stack.push(2);
stack.push(3);

// Peeking at the top element
int top = stack.peek();
System.out.println("Top element: " + top); // Output: Top element: 3

// Popping the top element
int popped = stack.pop();
System.out.println("Popped element: " + popped); // Output: Popped element: 3

// Checking if the stack is empty
boolean isEmpty = stack.isEmpty();
System.out.println("Is the stack empty? " + isEmpty); // Output: Is the stack empty? false

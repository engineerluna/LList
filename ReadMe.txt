Implemented a LinkedList class using Strings as the objects that links 
StringNodes to each other.

[String item, StringNode next] ---> [String item, StringNode null]

LList.java:
	LList()
	isEmpty(): boolean
	size(): int
	addFirst(String): void
	addLast(String): void
	add(int, String): void
	removeFirst(): String
	removeLast(): String
	remove(int): String
	get(int): String
	removeString(String): int
	toString(): String
StringNode.java:
	StringNode()
	StringNode(String, StringNode)
	getItem(): String
	setItem(): void
	getNext(): StringNode
	setNext(): StringNode
	

This was used to test it. 

Test Plan for LinkList (LList)
1.) Create new set of list called list (Line 7)
2.) Add Blue, Green,  and Purple to beginning of list. (Line 11-13)
3.) Add Red, Orange, Gray, and Black to last of list (Line 15-18)
4.) Print List #1 and the size of the list (Line 21)
a.) Make sure the size of list is 7. 
5.) Add White at index 3, Brown at index 7, and Pink at index 1. (Line 23-33)
a.) Try adding Navy Blue at index 40, to see if the ListIndexOutOfBoundException works. (Line 29)
6.) Print List #2 and the size (line 35)
a.) Make sure the size of the list is 10
7.) Get item at index 2, 5, and 8.
a.) Try getting items at index 40, to see if the ListIndexOutOfBoundException works
8.) Remove item at the beginning and end of list (Lines 52 and 53)
9.) Remove items at index 4 and 8. (Lines 54 and 55)
a.) Try removing item at index 40 to see if the ListIndexOutOfBoundExcetion works (Lines 56-61)
10.)  Print List # 3 and the size(Line 66)
a.) Make sure the size of the list is 6 (Line 69)
11.)  Add Luis to the odd number index in list (Ex. Index 1, 3, 5…(2n+1))
a.)Remove Luis and display the number of times it was removed


Results after running Test.java:

--------------------------------------------------------------------------------
luis@ubpc:~/Desktop/JavaProjects$ java Test
List #1
 
1 Purple
2 Green
3 Blue
4 Red
5 Orange
6 Gray
7 Black

Size: 7
Is list empty?: false
Passed 5a! ListIndexOutOfBoundsException: index: 40

List #2
 
1 Pink
2 Purple
3 Green
4 White
5 Blue
6 Red
7 Orange
8 Brown
9 Gray
10 Black

Size: 11
Is list empty?: false

Item at index 2 is Purple
Item at index 5 is Blue
Item at index 8 is Brown
Passed 7a! ListIndexOutOfBoundsException: index: 40

Remove item at beginning of list Pink
Remove item at end of list Black
Remove item at index 4 Blue
Remove item at index 8 Gray
Passed 7a! ListIndexOutOfBoundsException: index: 40

List #3
 
1 Purple
2 Green
3 White
4 Red
5 Orange
6 Brown

Size: 6
Is list empty?: false
Passed test case 10a!

List #4
 
1 Luis
2 Purple
3 Luis
4 Green
5 Luis
6 White
7 Luis
8 Red
9 Luis
10 Orange
11 Luis
12 Brown

Size: 13
Is list empty?: false
Remove 'Luis' in List #4 
Total items removed: 6



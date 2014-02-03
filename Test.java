   /* Test Class to test the the LinkedList (LList) 
    * and StringNode class created
    * 
    */
import java.util.*;
   public class Test
   {
      public static void main(String[] args)
      {
				//Create new list
      		LList list = new LList();
      		
				//add to first of list
				list.addFirst("Blue");
				list.addFirst("Green");
				list.addFirst("Purple");
				//add to last of list
				list.addLast("Red");
				list.addLast("Orange");
				list.addLast("Gray");
				list.addLast("Black");
      		//Print List 1
				System.out.println("List #1\n " + list + "\n\nSize: "+ list.size() + "\nIs list empty?: " +list.isEmpty());   
				
				//add to specific index
				list.add(3, "White");
				list.add(7, "Brown");
				list.add(1, "Pink");
				try{
					list.add(40, "APPLE");
					}
			catch(ListIndexOutOfBoundsException e)
				{
					System.out.println("Passed 5a! " + e);
					
				}

				//Print List 2			
				System.out.println("\nList #2\n " + list + "\n\nSize: "+ list.size()+ "\nIs list empty?: " +list.isEmpty());   
				//Get an item in certain index
				System.out.println();
				System.out.println("Item at index 2 is "+ list.get(2));
				System.out.println("Item at index 5 is " + list.get(5));
				System.out.println("Item at index 8 is " + list.get(8));
				try{
					list.get(40);
					}
			catch(ListIndexOutOfBoundsException e)
				{
					System.out.println("Passed 7a! " + e);
					
				}
				
				//RemoveFirst, last and at certain index
				System.out.println("\nRemove item at beginning of list " + list.removeFirst());
				System.out.println("Remove item at end of list " + list.removeLast());
				System.out.println("Remove item at index 4 " + list.remove(4));
				System.out.println("Remove item at index 8 " + list.remove(8));
				try{
					list.remove(40);
					}
			catch(ListIndexOutOfBoundsException e)
				{
					System.out.println("Passed 7a! " + e);
					
				}
				
				//Print List 3		
				System.out.println("\nList #3\n " + list + "\n\nSize: "+ list.size()+ "\nIs list empty?: " +list.isEmpty()); 
				
				if(list.size() == 6)
					System.out.println("Passed test case 10a!");
				
				//Remove String
				int i =0;
				while(i<6)
					{
						int n = 2*i+1;
						list.add(n,"Luis");
						i++;
					}
				//Print List 4
				System.out.println("\nList #4\n " + list + "\n\nSize: "+ list.size()+ "\nIs list empty?: " +list.isEmpty()); 
				System.out.println("Remove 'Luis' in List #4 \nTotal items removed: " +list.removeString("Luis"));
				
				   
      }//END main
}


/*	Author: Luis Luna
 *  [String item, StringNode next] ---> [String item, StringNode next]
 *  
 *  Description: Wrote a LinkedList Class that would use the StringNode
 *  Class that I created. 
 *  
 *  Able to: add, addFirst, addLast, remove, removeFirst, removeLast, get, size, isEmpty
*/

   public class LList
   {
      private StringNode head;
      private int size;
   	
   	//--------------------------
		
   	
      public LList()
      {
         head = null;
         size = 0;
      }//END LList
   	
   	
   	//--------------------------
      public boolean isEmpty()
      {
         
         boolean empty = false;
         if(size== 0)
            empty = true;
      			
         return empty;
      }//END isEmpty
   	//--------------------------
      public int size()
      {
      
         return size;
      		
      }//END size
   	//--------------------------
   
      public void addFirst(String newItem)
      {
      	
         StringNode current = head;
      	
      		
         StringNode a = new StringNode(newItem);
      		
         a.setNext(current);
      		
         head = a;
         size++;
      	
      	
      	
      		
      }//END addFirst
   	//--------------------------
   	
      public void addLast(String newItem)
      {
      	
         StringNode current = head;
         StringNode a = new StringNode(newItem);
			
         if( current == null)
			{
            head = a;
				size++;
				
				}
			else
				{
				 	getStringNodeAt(size).setNext(a);
         		
         		size++;
      		}
      		
      }//END addLast
   	//--------------------------
      public void add(int index, String s) throws ListIndexOutOfBoundsException
      {
         StringNode current = head;
         StringNode nextCurrent = current;
         StringNode w = new StringNode(s);
      	
         if(index==1)
         {
            addFirst(s);
            size++;
         	
         	
         }
        
         else if(index < 1 || index >size+1)
           throw new ListIndexOutOfBoundsException("index: " +index);
         
         else
         {
				
            current = getStringNodeAt(index-1);
				nextCurrent  = current.getNext();
				
				current.setNext(w);
				w.setNext(nextCurrent);
				
				
				size++;
				          	 
         }
        
      	
      		
         
        
      }//END add
   	
   	//--------------------------
      public String removeFirst()
      {
         StringNode current = head;
         StringNode a		= current.getNext();
         head = a;
      	
         size--;
         return current.getItem();
      	
      	
      }//END removeFirst
   	//--------------------------
      public String removeLast()
      {
         StringNode current = head;
         StringNode nextCurrent = current;
         while( current.getNext() != null)
         {
            nextCurrent = current;
            current = current.getNext();
         }
         String a = current.getItem();
         nextCurrent.setNext(null);
         size--;
         return a;
      }//END removeLast
   
   
   	//--------------------------
      public String remove(int index) throws ListIndexOutOfBoundsException
      { StringNode current = head;
         StringNode nextCurrent = current.getNext();
         StringNode oldCurrent;
         String w = "";
         
        
        
         if(index==1)
         {
            w = removeFirst();
				size--;
            
         }
         else if(index == size)
         {
         
            w= removeLast();
				size--;
          
         }
         else if(index < 1 || index >size)
         	
            throw new ListIndexOutOfBoundsException("index: " +index);
          
         else
         {
				oldCurrent = getStringNodeAt(index-1);
				current = getStringNodeAt(index);
				nextCurrent = getStringNodeAt(index+1);
				w= current.getItem();
				
				oldCurrent.setNext(nextCurrent);
				size--;

         	
         }
         return w;
      }//END remove
   	
   	
   	
   	//--------------------------
   	
      public String get(int index) throws ListIndexOutOfBoundsException
      {
         StringNode current = head;
         
         String w = "";
         
         if(index < 1|| index> size)
            throw new ListIndexOutOfBoundsException("index: " +index);
         else
         {
            current = getStringNodeAt(index);
            w = current.getItem();
         
         }
         return w;
      
      }//END get
   	//--------------------------
   	
   	
   	
      public int removeString(String s)
      {	
         StringNode current = head;
         String a = "";
			int count = 0;
      	
      	while(current!= null)
			{
				a = current.getItem();
				
				if(a.compareToIgnoreCase(s)==0)
					{
						count++;
						current = current.getNext();
					}
				else 
					current = current.getNext();
					
			}
         return count;
      }//END removeString
   	
   
   	//--------------------------
      public String toString()
      {	
         StringNode current = head;
         String s = "";
         int i = 1;
         while(current != null)
         {
            s += "\n" +i+" "+current.getItem();
            current = current.getNext();
            i++;
         }
         return s;
      		
      				
      }//END toString
   	//--------------------------
   	
      private StringNode getStringNodeAt(int index)
      {
         StringNode current = head;
         if(index < 1 || index > size)
         {
            System.out.println("Error!");
            return null;
         }	
         else 
         {
         			
            int k = 1;
            while(k<index)
            {
               current = current.getNext();
               k++;
            }
         }
         return current;
      }//END getStringNodeAt
   		
   	
   }//END LList
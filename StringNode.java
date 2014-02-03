/*
 *  [String item, StringNode next]
 *  Description: StringNode class that contains a String and single link that 
 *  is a reference to the next node.  
 */
class StringNode
	{
		private String item;
		private StringNode next;
		
		public StringNode(String s)
			{
				item = s;
				next = null;
				}//END StringNode
		//----------------------
		
		public StringNode(String s, StringNode nextnode)
			{
				item = s;
				next = nextnode;
				}//END StringNode
				
		//----------------------
	
		public String getItem()
			{
				return item;
				}//END getItem
		//----------------------
		
		public void setItem(String s)
			{
				item = s;
				}//END setItem
		//----------------------
		
		public StringNode getNext()
			{
				return next;
				}//END getNext
		//----------------------
		
		public void setNext(StringNode w)
			{
				next = w;
				}//END setNext
		//-----------------------------
						
}//END StringNode
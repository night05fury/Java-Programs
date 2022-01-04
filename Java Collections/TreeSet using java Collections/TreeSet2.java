// Creating a tree data structure in java using TreeSet and iterating it

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;  
class TreeSet2 {  
 public static void main(String args[]){  
  
  //To create instance of TreeSet
	 Set<String> treeSet = new TreeSet<>(); 
//Creating and adding elements  
	 
	 TreeSet<Integer> al=new TreeSet<Integer>();  
	 al.add(3);  
	 al.add(21);  
	 al.add(32);  
	 al.add(15);
  treeSet.add("Hello");
  treeSet.add("Dear");
  treeSet.add("Students");
  //Traversing elements  
  Iterator<Integer> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());
   
  }  
  
  Iterator<String> itr1=treeSet.iterator();  
  while(itr1.hasNext()){  
	  System.out.println(itr1.next());
 }  
  
 }
}  

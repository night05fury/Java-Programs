// Creating a tree data structure in java using treeset

import java.util.*;  
class TreeSet1{  
 public static void main(String args[]){  
  

	 //Creating and adding elements  
  TreeSet<Integer> t1=new TreeSet<Integer>();  
  t1.add(3);  
  t1.add(21);  
  t1.add(32);  
  t1.add(15);
    
  //Traversing elements  
  Iterator<Integer> itr=t1.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  


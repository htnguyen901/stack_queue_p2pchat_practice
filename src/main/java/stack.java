/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hangu
 */

public class stack {
          static final int max =250;
	  int top;
	  String msg[] = new String [max];
	  boolean isEmpty()
	  {
		  return (top < 0);
	  }
	  boolean isFull()
	  {
		  return top == max;
	  }
	 public stack() {
	    top = -1;
	  }

	  // push elements to the top of stack
	  boolean push(String x) {
	    if (top >= (max -1)) {
	      System.out.println("Message has to be under 250 letters");
	      return false;
	    }

	    // insert element on top of stack
	    else {
	    msg[++top] = x;
	    System.out.println(x + " has been pushed");
	    return true;
	    }
	  }
	  
	  // pop elements from top of stack
	 public String pop() 
	  {
	    if (top<0) 
	    {
	      System.out.println("There is no letter in the message to delete");
	      return null;
	    }
	    else 
	    {
	    	String x = msg[top--]; //top-- is the top next next when the type of the first first time type
	    	return x;
	    }
	  }
	 public String peek()
	  {
		  if(top<0)
		  {
			  System.out.println("Stack is empty! Underflow condition.");
			  return null;
		  }
		  else
		  {
			  String x =msg[top];
			  return x;
		  }
	  }
         

}

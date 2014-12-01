package groceryinternal

import java.util._;
import java.lang._; 

object GroceryListExecuter {
	
	var stack:Stack[Int] = _;
	var program:Program =  _;

  	var helperstack:Stack[Int] = _; 
  	var value:Int = _; 
  	var val1:Int = _;
  	var val2:Int = _; 
  	var alphabet:Array[Char] = Array('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z');

	def main(args: Array[String]) {

		program = new Program(args);
		stack = new Stack();
		helperstack = new Stack(); 
		var item:Array[Char] = program.nextLine;

		while (item != null) {

			try {
				System.out.println(item);

				var start:Char = Character.toUpperCase(item(1))
				var length:Int = item.length;

				execute(start, length);
			} catch {
			  case e : OutOfRangeException => System.out.println(e);
			} 
			item = program.nextLine;
		}
	}
	
	// This is where all new code should be made
	// This is what reads the char and determines what to do.
	def execute(char:Char, length:Int) {
		char match {
		  case 'A' => 	// Adds  
		  				stack.push(stack.pop() + stack.pop());
		  			   	value = stack.pop();
		  case 'B' =>  	// Brings bottom stack value to top
		  				while(!stack.empty()){
		  					helperstack.push(stack.pop());
		  				}
		  				value = helperstack.pop(); 
		  				while (!helperstack.empty()){
		  					stack.push(helperstack.pop()); 
		  				}
		  				stack.push(value); 
		  case 'C' => 	// Same as stack.push(stack.peek())? 
		  				value = stack.pop();
		  				stack.push(value);
		  				stack.push(value);
		  case 'D' => 	// Divides
		  				stack.push(stack.pop() / stack.pop());
		  case 'E' => 	// Ends a loop and checks top value
		  case 'F' => 	// Flips
		  				val1 = stack.pop();
		  				val2 = stack.pop();
		  				stack.push(val1);
		  				stack.push(val2);
		  case 'G' => 	// Greater than
		  				val1 = stack.pop();
		  				val2 = stack.pop();
		  				stack.push(if (val1>val2) 1 else 0); 
		  case 'H' => 	// Not even sure how this relates to H
		  				value = stack.pop(); 
		  				value = value%26 + 1; 
		  				execute(alphabet(value), 1); 
		  case 'I' => 	// Inputs
		  				stack.push(scala.io.StdIn.readChar());
		  case 'J' => 	// Jumps
		  				value = stack.pop(); 
		  				var a:Int = 0; 
		  				for (a <- 1 to value){
		  					program.moveDown; 
		  				}
		  				//stack.push(if (stack.pop()==0) 1 else 0);
		  case 'K' => 	// Kills the stack
		  				stack = new Stack(); 
		  case 'L' => 	// Loops 

		  case 'M' => 	// Multiplies
		  				stack.push(stack.pop() * stack.pop());
		  case 'N' => 	// Number
		  				stack.push(length); 
		  case 'O' => 	// Not sure what outputs means?
		  				System.out.print(stack.pop());
		  case 'P' => 	// Prints
		  				System.out.print(stack.pop().toChar);
		  case 'Q' => 	// Nop...
		  case 'R' => 	// Remainder 
		  				stack.push(stack.pop() % stack.pop()); 
		  case 'S' => 	// Subtracts
		  				stack.push(stack.pop() - stack.pop()); 
		  case 'T' => 	// Terminates

		  case 'U' => 	// Top to bottom? 
		  				value = stack.pop();
		  				while (!stack.empty()){
		  					helperstack.push(stack.pop()); 
		  				}
		  				stack.push(value);
		  				while(!helperstack.empty()){
		  					stack.push(helperstack.pop()); 
		  				}
		  case 'V' => 	// Value
		  				var line:Array[Char] = program.nextLine;
		  				var item = line(0);
		  				stack.push(item)
		  case 'W' => 	// W?
		  				stack.push(100); 
		  case 'X' => 	// 
		  				stack.pop(); 
		  case 'Y' =>	// Why
		  				var a:Int = 0;
		  				for (a <- 1 to length){
		  					helperstack.push(stack.pop());
		  				}
		  				helperstack.pop(); 
		  				for (a <- 1 until length){
		  					stack.push(helperstack.pop()); 
		  				}
		  case 'Z' =>	// Zero
		  				stack.push(if (stack.pop()==0) 1 else 0);
		}
	}
}

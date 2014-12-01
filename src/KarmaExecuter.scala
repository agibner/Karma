package groceryinternal

import java.util._;

object KarmaExecuter {
	
	var stack:Stack[Int] = _;
	var deque:ArrayDeque[Int] = _;
	var program:Program =  _;
  
	def main(args: Array[String]) {
		program = new Program(args);
		stack = new Stack();
		deque = new ArrayDeque();
		var char:Char = program.nextChar;
		while (char != '\n') {
			try {
				execute(char);
			} catch {
			  case e : OutOfRangeException => System.out.println(e);
			} 
			char = program.nextChar;
		}
	}
	
	// This is where all new code should be made
	// This is what reads the char and determines what to do.
	def execute(char:Char) {
		char match {
		  case '+' => stack.push(stack.pop() + stack.pop());
		  case '-' => stack.push(stack.pop() - stack.pop());
		  case '*' => stack.push(stack.pop() * stack.pop());
		  case '/' => stack.push(stack.pop() / stack.pop());
		  case '%' => stack.push(stack.pop() % stack.pop());
		  case '&' => stack.push(stack.pop() & stack.pop());
		  case '|' => stack.push(stack.pop() | stack.pop());
		  case '^' => stack.push(stack.pop() ^ stack.pop());
		  case '~' => stack.push(~stack.pop());
		  case '!' => stack.push(if (stack.pop()==0) 1 else 0);
		  case '=' => stack.push(if (stack.pop() == deque.peekFirst()) 1 else 0);
		  case '>' => stack.push(if (stack.pop() > deque.peekFirst()) 1 else 0);
		  case '@' => if (stack.pop() != 1) program.skipNextChar;
		  case x:Char if (x>='0' && x<='9') => stack.push(x - '0');
		  case '}' => deque.addFirst(stack.pop());
		  case '{' => stack.push(deque.removeFirst());
		  case '[' => deque.addLast(stack.pop());
		  case ']' => stack.push(deque.removeLast());
		  case '#' => stack.pop();
		  case '\\' => stack.push(stack.peek());
		  case '?' => stack.push(scala.io.StdIn.readChar());
		  case ':' => System.out.print(stack.pop().toChar);
		  case ';' => System.out.print(stack.pop());
		  case ',' => program.moveDown; program.moveToFront;
		  case '.' => program.moveDown;
		  case ''' => program.moveUp;
		  case '<' => program.moveToFront;
		}
	}
}

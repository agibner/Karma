import java.util._;

class KarmaExecuter {
	
	var stack:Stack[String] = _;
	var deque:ArrayDeque[String] = _;
	var program:Program =  _;
  
	def main(args: Array[String]) {
		program = new Program(args(0));
		stack = new Stack();
		deque = new ArrayDeque();
		var char:Char = program.getNext;
		while (char != '\n') {
			try {
				execute(char);
			} catch {
			  case e : OutOfRangeException => System.out.println(e);
			} 
			char = program.getNext;
		}
	}
	
	// This is where all new code should be made
	// This is what reads the char and determines what to do.
	def execute(char:Char) {
		
	}
}
class KarmaExecuter {
	
	var program:Program;
  
	def main(args: Array[String]) {
		program = new Program(args(0));
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
	
	def execute(char:Char) {
		
	}
}
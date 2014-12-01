import java.util._;
import java.lang._; 

object GroceryListCompiler {
	
	var stack:Stack[Int] = _;
	var program:Program =  _;
	var compiledProgram:String = "0[1,";

  	var helperstack:Stack[Int] = _; 
  	var value:Int = _; 
  	var val1:Int = _;
  	var val2:Int = _; 
  	var alphabet:Array[Char] = Array('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z');
	var startOfLine:String = "\n\\1+!(ASCII value)}[2+]@,[2]-{#\\!@'[1]-\\!@,#";
	var endOfLine:String = "1,<";
	var decreaseDequeEnd:String = "1]-[";
	var increaseDequeEnd:String = "1]+[";
  	
	def main(args: Array[String]) {

		program = new Program(args);
		stack = new Stack();
		helperstack = new Stack(); 

		for (elem:String <- args) {

			try {
				System.out.println(elem);

				var start:Char = Character.toUpperCase(elem.charAt(0))
				var length:Int = elem.length;

				execute(elem.charAt(0), start, length);
			} catch {
			  case e : OutOfRangeException => System.out.println(e);
			} 
		}
		System.out.println(compiledProgram);
	}
	
	// This is where all new code should be made
	// This is what reads the char and determines what to do.
	def execute(char:Char, upperChar:Char, length:Int) {
		upperChar match {
		  case 'A' => 	compiledProgram += startOfLine(char) + "{{+}" + decreaseDequeEnd + endOfLine
		  case 'B' =>  	compiledProgram += startOfLine(char) + "{[" + endOfLine
		  case 'C' => 	compiledProgram += startOfLine(char) + "{\\}}" + increaseDequeEnd  + endOfLine
		  case 'D' => 	compiledProgram += startOfLine(char) + "{[{]/}" + decreaseDequeEnd + endOfLine
		  case 'E' => 	compiledProgram += startOfLine(char) + "0{!@'1," + decreaseDequeEnd + endOfLine
		  case 'F' => 	compiledProgram += startOfLine(char) + "{[{]}}" + endOfLine
		  case 'G' => 	compiledProgram += startOfLine(char) + "{>[}]}" + decreaseDequeEnd + endOfLine
		  case 'H' => 	// No compiledProgram += startOfLine + "67+2*>\\[[}]\\{{]@-}!@#[1]@<{$FINISH" + decreaseDequeEnd
		  case 'I' => 	compiledProgram += startOfLine(char) + "?}" + increaseDequeEnd  + endOfLine
		  case 'J' => 	compiledProgram += startOfLine(char) + "{,<" + decreaseDequeEnd
		  case 'K' => 	compiledProgram += startOfLine(char) + "]\\[![1]@,\\@<]-[{#1<" 
		  case 'L' => 	compiledProgram += "\\!@![1]-\\!@,#" + decreaseDequeEnd + endOfLine
		  case 'M' => 	compiledProgram += startOfLine(char) + "{{*}" + decreaseDequeEnd + endOfLine
		  case 'N' => 	compiledProgram += startOfLine(char) + numberToStack(length) + "}" + increaseDequeEnd  + endOfLine
		  case 'O' => 	compiledProgram += startOfLine(char) + "{;" + decreaseDequeEnd + endOfLine
		  case 'P' => 	compiledProgram += startOfLine(char) + "{:" + decreaseDequeEnd + endOfLine
		  case 'Q' => 	compiledProgram += startOfLine(char) + endOfLine
		  case 'R' => 	compiledProgram += startOfLine(char) + "{\\[[{\\]/*]-}" + decreaseDequeEnd + endOfLine
		  case 'S' => 	compiledProgram += startOfLine(char) + "{[{]-}" + decreaseDequeEnd + endOfLine
		  case 'T' => 	compiledProgram += startOfLine(char)
		  case 'U' => 	compiledProgram += startOfLine(char) + "]{[[" + endOfLine
		  case 'V' => 	compiledProgram += startOfLine(char) + "10-," + increaseDequeEnd 
		  case 'W' => 	compiledProgram += startOfLine(char) + "554**}" + increaseDequeEnd  + endOfLine
		  case 'X' => 	compiledProgram += startOfLine(char) + "{#" + endOfLine
		  case 'Y' =>	// No
		  case 'Z' =>	compiledProgram += startOfLine + "{!}" + endOfLine
		}
	}
	
	def numberToStack(length:Int):String = {
		var stackNum:String = ""; 
		var first:Boolean = true;
		var len:Int = length;
		while (len>9) {
			stackNum=stackNum+"9"
			if (!first) {
				stackNum+="+"
			}
			else {
				first = false
			}
			len= len - 9
		}
		stackNum+=len.toString()
		if (!first) {
			stackNum+="+"
		}
		return stackNum;
	}
	
	def startOfLine(ascii:Int):String = {
		return "\n\\1+!" + numberToStack(ascii) + "}[2+]@,[2]-{#\\!@'[1]-\\!!@,#";
	}
}

package groceryinternal

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

		for (elem:String <- args) {

			try {
				System.out.println(elem);
				var split:Array[String] = elem.split("-");
				var length:Int = if (split.length == 2) Integer.parseInt(split(1)) else 0;

				compiledProgram += convert(elem.charAt(0), length);
			} catch {
			  case e : OutOfRangeException => System.out.println(e);
			} 
		}
		System.out.println(compiledProgram);
		var karmaEx = new KarmaExecuter();
		karmaEx.executeProgram(compiledProgram.split("\n"));
	}
	
	def convert(char:Char, length:Int):String = {
		return Character.toUpperCase(char) match {
		  case 'A' => 	startOfLine(char) + decreaseDequeEnd + "{{+}" + endOfLine
		  case 'B' =>  	startOfLine(char) + "]{[[" + endOfLine
		  case 'C' => 	startOfLine(char) + increaseDequeEnd  + "{\\}}" + endOfLine
		  case 'D' => 	startOfLine(char) + decreaseDequeEnd + "{[{]/}" + endOfLine
		  case 'E' => 	startOfLineForE(char) + "0'<"
		  case 'F' => 	startOfLine(char) + "{[{]}}" + endOfLine
		  case 'G' => 	startOfLine(char) + decreaseDequeEnd + "{>{#}" + endOfLine
		  case 'I' => 	startOfLine(char) + increaseDequeEnd  + "?}" + endOfLine
		  case 'J' => 	startOfLine(char) + decreaseDequeEnd + "{,<"
		  case 'K' => 	startOfLine(char) + "]\\[![1]$,<\\@<]-[{#1<"
		  case 'L' => 	startOfLineForL(char) + decreaseDequeEnd + "31-{!$,<#" + endOfLine
		  case 'M' => 	startOfLine(char) + decreaseDequeEnd + "{{*}" + endOfLine
		  case 'N' => 	startOfLine(char) + increaseDequeEnd  + numberToStack(length) + "}" + endOfLine
		  case 'O' => 	startOfLine(char) + decreaseDequeEnd + "{;" + endOfLine
		  case 'P' => 	startOfLine(char) + decreaseDequeEnd + "{:" + endOfLine
		  case 'Q' => 	startOfLine(char) + endOfLine
		  case 'R' => 	startOfLine(char) + decreaseDequeEnd + "{\\[[{\\]/*]-}" + endOfLine
		  case 'S' => 	startOfLine(char) + decreaseDequeEnd + "{[{]-}" + endOfLine
		  case 'T' => 	startOfLine(char)
		  case 'U' => 	startOfLine(char) + "]]}[" + endOfLine
		  case 'V' => 	startOfLine(char) + increaseDequeEnd + "10-," 
		  case 'W' => 	startOfLine(char) + increaseDequeEnd  + "554**}" + endOfLine
		  case 'X' => 	startOfLine(char) + "{#" + endOfLine
		  case 'Z' =>	startOfLine(char) + "{!}" + endOfLine
		  case _   =>	startOfLine(char)
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
		return "\n\\3+$,<\\1+!" + numberToStack(ascii) + "}[2+]$,<[2]-{#\\!@'[1]-\\!!$,<#";
	}
	
	def startOfLineForL(ascii:Int):String = {
		return "\n\\1+!" + numberToStack(ascii) + "}[2+]$,<[2]-{#\\!@![1]-\\!!$,<#";
	}
	
	def startOfLineForE(ascii:Int):String = {
		return "\n3+\\$,<[3]-\\1+!" + numberToStack(ascii) + "}[2+]$,<[2]-{#[1]-\\!!$,<#";
	}
}

import scala.util.control.Exception

class OutOfRangeException(above:Boolean, line:Int, position:Int) extends Exception {
	def tooHigh:Boolean = above;
	def lineNum:Int = line;
	def charPos:Int = position;
	
	override def toString(): String = "Command at position " + charPos + ", line " + lineNum + 
										{if (tooHigh) "attempted to move up a line when there is no line to go to.";
										else "attempted to move down a line when there is no line to go to.";};
	
}
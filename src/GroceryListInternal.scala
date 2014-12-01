package groceryinternal

import scala.collection.mutable.{ HashMap, Stack }
import scala.util.Random
import scala.math.{ min, max }

class GroceryListInternal {
  abstract sealed class GroceryLine
  case class End(num: Int) extends GroceryLine

  var current: Int = 1

  var lines = new HashMap[Int, GroceryLine]
  var stack = new Stack[Int];
  var karmaString = "";

  // evaluate
  private def gotoLine(line: Int) {

    lines(line) match {
      case End(_) =>
      case _ =>
    }
  }

  // end of the program
  def AND_PROBABLY_OTHER_STUFF() = {
    lines(current) = End(current)
    //lines should be populated with Karma lines or something
    //this should then call karma executor
    gotoLine(lines.keys.toList.sorted.head)
  }
  // beginning of program
  def GROCERY_LIST() = {
    lines = new HashMap[Int, GroceryLine];
    stack = new Stack[Int];
  }
  
  def Apples() = {
      //so we should translate this into a Karma document
      var left:Int = stack.pop();
      var right:Int = stack.pop();
      stack.push(left + right);
      current += 1
  }

	def Bananas() = {
	    System.out.println("Hey"); 
	    karmaString += GroceryListCompiler.execute('b','B',2);
	    current += 1
	 }
	
	def Chicken() = {
	  	karmaString += "1},5},2},5},4},5},3},";
	    current += 1
	  }
	
	def Dumplings() = {
	  	karmaString += "1=!\\@,@'{#1;1'\n";
	    current += 1
	  }
	
	def Eggs() = {
	  	karmaString += "3=!\\@,@'{#81;;1\n";
	    current += 1
	  }
	
	def Fruit() = {
	  	karmaString += "2=!\\@,@'{#456**:1'\n";
	    current += 1
	  }
	
	def Gruyere() = {
	  	karmaString += "4=!\\@,@'{#855+*:1'\n";
	    current += 1
	  }
	
	def Ham() = {
	  	karmaString += "5=!\\@,@'{#55+:1'\n";
	    current += 1
	  }
	
	def Ibuprofen() = {
	    current += 1
	  }
	
	def Juice() = {
	    current += 1
	  }
	
	def Lettuce() = {
	    current += 1
	  }
	
	def Milk() = {
	    current += 1
	  }
	
	object Noodles {
	def apply(n: Int) = {
	    current += 1
	  }
	}	
	
	def Oatmeal() = {
	    current += 1
	  }
	
	def Pasta() = {
	    current += 1
	  }
	
	def Rice() = {
	    current += 1
	  }
	
	def Sriracha() = {
	    current += 1
	  }
	
	def Turkey() = {
	    current += 1
	  }
	
	def Utensils() = {
	    current += 1
	  }
	
	def Veggies() = {
	    current += 1
	  }
	
	def Xanax() = {
	    current += 1
	  }
	
	def Zucchini() = {
	    current += 1
	  }
}

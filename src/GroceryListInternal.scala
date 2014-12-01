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
    gotoLine(lines.keys.toList.sorted.head);
    KarmaExecuter.main(karmaString.split("\n"));
  }
  // beginning of program
  def GROCERY_LIST() = {
    lines = new HashMap[Int, GroceryLine];
    stack = new Stack[Int];
    karmaString = "0[1,";
  }
  
  def Apples() = {
    karmaString += GroceryListCompiler.convert('A',7);
    current += 1
  }

	def Bananas() = {
	    karmaString += GroceryListCompiler.convert('B',7);
	    current += 1
	 }
	
	def Chicken() = {
	    karmaString += GroceryListCompiler.convert('C',7);
	    current += 1
	  }
	
	def Dumplings() = {
	    karmaString += GroceryListCompiler.convert('D',7);
	    current += 1
	  }
	
	def Eggs() = {
	    karmaString += GroceryListCompiler.convert('E',7);
	    current += 1
	  }
	
	def Fruit() = {
	    karmaString += GroceryListCompiler.convert('F',7);
	    current += 1
	  }
	
	def Gruyere() = {
	    karmaString += GroceryListCompiler.convert('G',7);
	    current += 1
	  }
	
	def Ibuprofen() = {
	    karmaString += GroceryListCompiler.convert('I',7);
	    current += 1
	  }
	
	def Juice() = {
	    karmaString += GroceryListCompiler.convert('J',7);
	    current += 1
	  }
	
	def Lettuce() = {
	    karmaString += GroceryListCompiler.convert('L',7);
	    current += 1
	  }
	
	def Milk() = {
	  karmaString += GroceryListCompiler.convert('M',7);
	  current += 1
	  }
	
//	object Noodles {
		def Noodles(n: Int) = {
		  karmaString += GroceryListCompiler.convert('N',n);
		  current += 1
		}
//	}	
	
	def Oatmeal() = {
	  karmaString += GroceryListCompiler.convert('O',7);
	    current += 1
	  }
	
	def Pasta() = {
	  karmaString += GroceryListCompiler.convert('P',7);
	    current += 1
	  }
	
	def Rice() = {
	  karmaString += GroceryListCompiler.convert('R',7);
	    current += 1
	  }
	
	def Sriracha() = {
	  karmaString += GroceryListCompiler.convert('S',7);
	    current += 1
	  }
	
	def Turkey() = {
	  karmaString += GroceryListCompiler.convert('T',7);
	    current += 1
	  }
	
	def Utensils() = {
	  karmaString += GroceryListCompiler.convert('U',7);
	    current += 1
	  }
	
	def Veggies() = {
	  karmaString += GroceryListCompiler.convert('V',7);
	    current += 1
	  }
	
	def Watermelon() = {
	    karmaString += GroceryListCompiler.convert('W',7);
	    current += 1
	  }
	
	def Xanax() = {
	  karmaString += GroceryListCompiler.convert('X',7);
	    current += 1
	  }
	
	def Zucchini() = {
	  karmaString += GroceryListCompiler.convert('Z',7);
	    current += 1
	  }
}

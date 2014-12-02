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
    val karmaEx = new KarmaExecuter();
    System.out.println("\nKarma code:");
    System.out.println(karmaString);
    System.out.println("\nProgram:");
    karmaEx.executeProgram(karmaString.split("\n"));
  }
  // beginning of program
  def GROCERY_LIST() = {
    lines = new HashMap[Int, GroceryLine];
    stack = new Stack[Int];
    karmaString = "0[1,";
  }
  
  def Apples() = {
    karmaString += GroceryListCompiler.convert('A',1);
    current += 1
  }

	def Bananas() = {
	    karmaString += GroceryListCompiler.convert('B',1);
	    current += 1
	 }
	
	def Chicken() = {
	    karmaString += GroceryListCompiler.convert('C',1);
	    current += 1
	  }
	
	def Dumplings() = {
	    karmaString += GroceryListCompiler.convert('D',1);
	    current += 1
	  }
	
	def Eggs() = {
	    karmaString += GroceryListCompiler.convert('E',1);
	    current += 1
	  }
	
	def Fruit() = {
	    karmaString += GroceryListCompiler.convert('F',1);
	    current += 1
	  }
	
	def Gruyere() = {
	    karmaString += GroceryListCompiler.convert('G',1);
	    current += 1
	  }
	
	def Ibuprofen() = {
	    karmaString += GroceryListCompiler.convert('I',1);
	    current += 1
	  }
	
	def Juice() = {
	    karmaString += GroceryListCompiler.convert('J',1);
	    current += 1
	  }
	
	def Lettuce() = {
	    karmaString += GroceryListCompiler.convert('L',1);
	    current += 1
	  }
	
	def Milk() = {
	  karmaString += GroceryListCompiler.convert('M',1);
	  current += 1
	  }
	
	object Noodles {
		def -(n: Int) = {
		  karmaString += GroceryListCompiler.convert('N',n);
		  current += 1
		}
  	}	
	
	def Oatmeal() = {
	  karmaString += GroceryListCompiler.convert('O',1);
	    current += 1
	  }
	
	def Pasta() = {
	  karmaString += GroceryListCompiler.convert('P',1);
	    current += 1
	  }
	
	def Rice() = {
	  karmaString += GroceryListCompiler.convert('R',1);
	    current += 1
	  }
	
	def Sriracha() = {
	  karmaString += GroceryListCompiler.convert('S',1);
	    current += 1
	  }
	
	def Turkey() = {
	  karmaString += GroceryListCompiler.convert('T',1);
	    current += 1
	  }
	
	def Utensils() = {
	  karmaString += GroceryListCompiler.convert('U',1);
	    current += 1
	  }
	
	def Veggies() = {
	  karmaString += GroceryListCompiler.convert('V',1);
	    current += 1
	  }
	
	def Watermelon() = {
	    karmaString += GroceryListCompiler.convert('W',1);
	    current += 1
	  }
	
	def Xanax() = {
	  karmaString += GroceryListCompiler.convert('X',1);
	    current += 1
	  }
	
	def Zucchini() = {
	  karmaString += GroceryListCompiler.convert('Z',1);
	    current += 1
	  }
}

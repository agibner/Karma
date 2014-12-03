package groceryinternal

import scala.collection.mutable.{ HashMap, Stack }
import scala.util.Random
import scala.math.{ min, max }
import scala.language.dynamics

class GroceryListInternal extends Dynamic {
	var karmaString = "";
	var a = new A();
	var an = new An();
	var some = new Some();
  
	// end of the program
	def AND_PROBABLY_OTHER_STUFF() = {
		val karmaEx = new KarmaExecuter();	
		System.out.println("\nKarma code:");
		System.out.println(karmaString);
		System.out.println("\nProgram:");
		karmaEx.executeProgram(karmaString.split("\n"));
	}
	
	// beginning of program
	def GROCERY_LIST() = {
	    karmaString = "0[1,";
	    a = new A();
	    var an = new An();
	    var some = new Some();
	}
	
	//Build in Groceries for convenience 
	def Apples() = {
	    karmaString += GroceryListCompiler.convert('A',1);
	}

	def Bananas() = {
	    karmaString += GroceryListCompiler.convert('B',1);
	}
	
	def Chicken() = {
	    karmaString += GroceryListCompiler.convert('C',1);
	}
	
	def Dumplings() = {
	    karmaString += GroceryListCompiler.convert('D',1);
	}
	
	def Eggs() = {
	    karmaString += GroceryListCompiler.convert('E',1);
	}
	
	def Fruit() = {
	    karmaString += GroceryListCompiler.convert('F',1);
	}
	
	def Gruyere() = {
	    karmaString += GroceryListCompiler.convert('G',1);
	}
	
	def Ibuprofen() = {
	    karmaString += GroceryListCompiler.convert('I',1);
	}
	
	def Juice() = {
	    karmaString += GroceryListCompiler.convert('J',1);
	}
	
	def Lettuce() = {
	    karmaString += GroceryListCompiler.convert('L',1);
	}
	
	def Milk() = {
	  karmaString += GroceryListCompiler.convert('M',1);
	}
	
	object Noodles {
		def -(n: Int) = {
		  karmaString += GroceryListCompiler.convert('N',n);
		}
  	}	
	
	def Oatmeal() = {
	  karmaString += GroceryListCompiler.convert('O',1);
	}
	
	def Pasta() = {
	  karmaString += GroceryListCompiler.convert('P',1);
	}
	
	def Rice() = {
	  karmaString += GroceryListCompiler.convert('R',1);
	}
	
	def Sriracha() = {
	  karmaString += GroceryListCompiler.convert('S',1);
	}
	
	def Turkey() = {
	  karmaString += GroceryListCompiler.convert('T',1);
	}
	
	def Utensils() = {
	  karmaString += GroceryListCompiler.convert('U',1);
	}
	
	def Veggies() = {
	  karmaString += GroceryListCompiler.convert('V',1);
	}
	
	def Watermelon() = {
	    karmaString += GroceryListCompiler.convert('W',1);
	}
	
	def Xanax() = {
	  karmaString += GroceryListCompiler.convert('X',1);
	}
	
	def Zucchini() = {
	  karmaString += GroceryListCompiler.convert('Z',1);
	}
	
	// Handle other names for variables
	class A extends Dynamic {
	  def applyDynamic(name:String)(args:Int) = {
			var f = name.charAt(0);
			karmaString += GroceryListCompiler.convert(f,args);
		}
		
		def selectDynamic(name:String) = {
		  var f = name.charAt(0);
		  karmaString += GroceryListCompiler.convert(f,1);
		}
	}

		
	class An extends Dynamic {
	  def applyDynamic(name:String)(args:Int) = {
			var f = name.charAt(0);
			karmaString += GroceryListCompiler.convert(f,args);
		}
		
		def selectDynamic(name:String) = {
		  var f = name.charAt(0);
		  karmaString += GroceryListCompiler.convert(f,1);
		}
	}
	
	class Some extends Dynamic {
	  def applyDynamic(name:String)(args:Int) = {
			var f = name.charAt(0);
			karmaString += GroceryListCompiler.convert(f,args);
		}
		
		def selectDynamic(name:String) = {
		  var f = name.charAt(0);
		  karmaString += GroceryListCompiler.convert(f,1);
		}
	}
	
	def applyDynamic(name:String)(args:Int) = {
		var f = name.charAt(0);
		karmaString += GroceryListCompiler.convert(f,args);
	}
		def selectDynamic(name:String) = {
		var f = name.charAt(0);
		karmaString += GroceryListCompiler.convert(f,1);
	}
}

package groceryinternal

object Test_Jump extends GroceryListInternal {
  def main(args: Array[String]): Unit = {
  	GROCERY_LIST
    Noodles - 3
    Juice 
    Noodles - 4
    Noodles - 5
    Pasta
  	Turkey
  	AND_PROBABLY_OTHER_STUFF
  }
}

object Test_DynApp extends GroceryListInternal {
  def main(args: Array[String]): Unit = {
    GROCERY_LIST

    some Noodles 40

    a Pasta

    Turkey
    AND_PROBABLY_OTHER_STUFF
  }
}

object Test_Loop extends GroceryListInternal {
  def main(args: Array[String]): Unit = {
  	GROCERY_LIST
    Lettuce

    Eggs

  	Turkey
  	AND_PROBABLY_OTHER_STUFF
  }
}

object Test_Print extends GroceryListInternal {
	def main(args: Array[String]): Unit = {
      GROCERY_LIST
 	  Noodles - 72
  	  Pasta
  	  Noodles - 101
  	  Pasta
  	  Noodles - 108
  	  Pasta
  	  Noodles - 108
  	  Pasta
  	  Noodles - 11
  	  Pasta
      Noodles - 32
      Pasta
      Noodles - 87
      Pasta
      Noodles - 111
      Pasta
      Noodles - 114
      Pasta
      Noodles - 108
      Pasta
      Noodles - 100
      Pasta
      Noodles - 46
      Pasta
	  Turkey
	  AND_PROBABLY_OTHER_STUFF
  }
}


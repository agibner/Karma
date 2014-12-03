package groceryinternal

object HelloDemo extends GroceryListInternal{
  def main(args: Array[String]){
    GROCERY_LIST
    
    //You can build programs with the built in names easily
    //Doesn't require thinking about foods and can be helpful for remembering what things do
    Noodles - 72
    Pasta
    Noodles - 101
    Pasta
    Noodles - 108
    Pasta
    Noodles - 108
    Pasta
    Noodles - 111
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
    
    //you can use the build in names this way too
    some Noodles 100
    a Pasta
    
    //example of how to use dynamic names
    some Nutella 46
    a Potato
    
    Noodles - 10
    Pasta
    a Turtle
    
    AND_PROBABLY_OTHER_STUFF
  }
}
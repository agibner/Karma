#Grocery List - Karma#
================================
## Karma ##
Read up on how to write in Karma on Karma: http://esolangs.org/wiki/Karma

###Ba(e)sics###
Treats code as 2D grid <br>
One Stack, One Deque, One Love, One Life <br>
Each command is a single char <br>
' - + * / % | ^ ~ ! = > @ } { [ ] # \ ? : ; , .  <br>
It's a Turing Tarpit <br>
Allows you to do Math, Logic, I/O, Stack/Deque Operations, Jumping 

###Sample Program###
```
1},5},2},5},4},5},3}, 
1=!\@,@'{#1;1'     		// 1 
2=!\@,@'{#456**:1' 		// x 
3=!\@,@'{#81;;1'  		// 18 
4=!\@,@'{#855+*:1'		//  P 
5=!\@,@'{#55+:1'   		// newline
```
This program treats the numbers as functions, and calls them in the order listed in the first line. <br>
We leave understanding how that works as an exercise for the reader.

## Grocery List ##
Read up on how to write in Grocery List on Grocery List: http://esolangs.org/wiki/Grocery_List <br>
our Grocery List is an internal DSL, which compiles to Karma and runs at the end of the block

###Basics###
Meant as a joke language, supposed to read like a grocery list <br>
Each item is a command, but the command is just based on the first letter (26 possible commands) <br>
We modified this in a number of ways: <br>
  Removed stupid operations: we took out 'h' and 'y' because they were dumb <br>
  Added start and end: GROCERY_LIST and AND_PROBABLY_OTHER_STUFF <br>
  Base Commands: There are 24ish base groceries that can be used without pronouns <br>
  Pronouns: you can use your own groceries if you use one of the keywords: 'a', 'an' or 'some' <br>
Probably the best way to understand this is to look at the sample code below

###Sample Program###
```
//Hello World
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
```

Here's what happens here: <br>
1. extends GroceryInternal allows you to write in Grocery List. <br>
2. use GROCERY_LIST and AND_PROBABLY_OTHER_STUFF to denote the start/end of groceries <br>
3. These commands will go through GroceryListInternal, and pass the letter/args to GroceryListCompiler <br>
4. GroceryListCompiler will change the command into Karma using magic, and return a string <br>
5. GroceryInternal will keep track of this string as it's made, until it reaches the end of the code <br>
6. It will then call KarmaExecuter with the string, which will process/execute the karma code <br>
7. hip hip hooray.


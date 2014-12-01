package groceryinternal

import scala.collection.mutable.{ HashMap, Stack }
import scala.util.Random
import scala.math.{ min, max }

class GroceryListInternal {
  abstract sealed class GroceryLine
  case class PrintString(num: Int, s: String) extends GroceryLine
  case class PrintNumber(num: Int, s: Int) extends GroceryLine
  case class ReadString(num: Int, s: Symbol) extends GroceryLine
  case class ErrorPrintString(num: Int, s: String) extends GroceryLine
  case class ErrorPrintNumber(num: Int, s: Int) extends GroceryLine
  case class LoopBeg() extends GroceryLine
  case class Break() extends GroceryLine
  case class LoopEnd(loopBegLine: Int) extends GroceryLine
  case class End(num: Int) extends GroceryLine

  var current: Int = 1

  var lines = new HashMap[Int, GroceryLine]
  var stack = new Stack[Int];
  var helperstack = new Stack[Int]
  val loopBegLines = new Stack[Int]
  val pcStack = new Stack[Int]
  val returnStack = new Stack[Any]

  // end of the program
  def AND_PROBABLY_OTHER_STUFF() = {
    lines(current) = End(current)
    //lines should be populated with Karma lines or something
    //this should then call karma executor
    gotoLine(lines.keys.toList.sorted.head)
  }
  // beginning of program
  def GROCERY_LIST() = {
    lines = new HashMap[Int, GroceryLine]
    stack = new Stack[Int];
    helperstack = new Stack[Int]; 
  }

  // evaluate
  private def gotoLine(line: Int) {

    lines(line) match {
      // print to stdout
      case PrintString(_, s: String) => {
        println(s)
        gotoLine(line + 1)
      }
      case PrintNumber(_, s: Int) => {
        println(s)
        gotoLine(line + 1)
      }

      // print to stderr
      case ErrorPrintString(_, s: String) => {
        Console.err.println(Console.RED + s + Console.RESET)
        gotoLine(line + 1)
      }
      case ErrorPrintNumber(_, s: Int) => {
        Console.err.println(Console.RED + s + Console.RESET)
        gotoLine(line + 1)
      }
      case ReadString(_, s: Symbol) => {
//        val value: Int = tryInt(readLine())
        stack.push(0);
        gotoLine(line + 1)
      }
      case LoopBeg() => {
        gotoLine(line + 1)
      }
      case LoopEnd(loopBegLine: Int) => {
        gotoLine(loopBegLine + 1)
      }
      case End(_) =>
      case _ =>
    }
  }
// infix operators
  implicit def operator_any(i: Any) = new {
//
// our language doesn't support any operators like these dont think
//    def Up(j: Any): Function0[Any] = {
//      () =>
//        {
//          val base_i = i match {
//            case _i: Symbol => binds.anyval(_i)
//            case _i: Function0[Any] => _i()
//            case _ => i
//          }
//
//          val base_j = j match {
//            case _j: Symbol => binds.anyval(_j)
//            case _j: Function0[Any] => _j()
//            case _ => j
//          }
//
//          base_i match {
//            case _i: Int => {
//              base_j match {
//                case _j: Int => _i - _j
//                case _j: Double => _i - _j
//              }
//            }
//            case _i: Double => {
//              base_j match {
//                case _j: Int => _i - _j
//                case _j: Double => _i - _j
//              }
//            }
//          }
//        }
//    }
//
//    def OVAR(j: Any): Function0[Any] = {
//      () =>
//        {
//          val base_i = i match {
//            case _i: Symbol => binds.anyval(_i)
//            case _i: Function0[Any] => _i()
//            case _ => i
//          }
//
//          val base_j = j match {
//            case _j: Symbol => binds.anyval(_j)
//            case _j: Function0[Any] => _j()
//            case _ => j
//          }
//
//          base_i match {
//            case _i: Int => {
//              base_j match {
//                case _j: Int => _i / _j
//                case _j: Double => _i / _j
//              }
//            }
//            case _i: Double => {
//              base_j match {
//                case _j: Int => _i / _j
//                case _j: Double => _i / _j
//              }
//            }
//          }
//        }
//    }
//
//    def MOD(j: Any): Function0[Any] = {
//      () =>
//        {
//          val base_i = i match {
//            case _i: Symbol => binds.anyval(_i)
//            case _i: Function0[Any] => _i()
//            case _ => i
//          }
//
//          val base_j = j match {
//            case _j: Symbol => binds.anyval(_j)
//            case _j: Function0[Any] => _j()
//            case _ => j
//          }
//
//          base_i match {
//            case _i: Int => {
//              base_j match {
//                case _j: Int => _i % _j
//                case _j: Double => _i % _j
//              }
//            }
//            case _i: Double => {
//              base_j match {
//                case _j: Int => _i % _j
//                case _j: Double => _i % _j
//              }
//            }
//          }
//        }
//    }
//
//    def BIGR_THAN(j: Any): Function0[Boolean] = {
//      () =>
//        {
//          val base_i = i match {
//            case _i: Symbol => binds.anyval(_i)
//            case _i: Function0[Any] => _i()
//            case _ => i
//          }
//
//          val base_j = j match {
//            case _j: Symbol => binds.anyval(_j)
//            case _j: Function0[Any] => _j()
//            case _ => j
//          }
//
//          base_i match {
//            case _i: Int => {
//              base_j match {
//                case _j: Int => _i > _j
//                case _j: Double => _i > _j
//              }
//            }
//            case _i: Double => {
//              base_j match {
//                case _j: Int => _i > _j
//                case _j: Double => _i > _j
//              }
//            }
//          }
//        }
//    }
//
//    def SMALLR_THAN(j: Any): Function0[Boolean] = {
//      () =>
//        {
//          val base_i = i match {
//            case _i: Symbol => binds.anyval(_i)
//            case _i: Function0[Any] => _i()
//            case _ => i
//          }
//
//          val base_j = j match {
//            case _j: Symbol => binds.anyval(_j)
//            case _j: Function0[Any] => _j()
//            case _ => j
//          }
//
//          base_i match {
//            case _i: Int => {
//              base_j match {
//                case _j: Int => _i < _j
//                case _j: Double => _i < _j
//              }
//            }
//            case _i: Double => {
//              base_j match {
//                case _j: Int => _i < _j
//                case _j: Double => _i < _j
//              }
//            }
//          }
//        }
//    }
//
//    def LIEK(j: Any): Function0[Boolean] = {
//      () =>
//        {
//          val base_i = i match {
//            case _i: Symbol => binds.anyval(_i)
//            case _i: Function0[Any] => _i()
//            case _ => i
//          }
//
//          val base_j = j match {
//            case _j: Symbol => binds.anyval(_j)
//            case _j: Function0[Any] => _j()
//            case _ => j
//          }
//
//          base_i match {
//            case _i: Int => {
//              base_j match {
//                case _j: Int => _i == _j
//                case _j: Double => _i == _j
//              }
//            }
//            case _i: Double => {
//              base_j match {
//                case _j: Int => _i == _j
//                case _j: Double => _i == _j
//              }
//            }
//          }
//        }
//    }
//
//  }

	 //example
   object Market{
    // How you title a program? 
   }

	 object Apples {
	    def apply(s: Symbol) = {
	      //so we should translate this into a Karma document
	      var left:Int = stack.pop();
	      var right:Int = stack.pop();
	      stack.push(left + right);
	      current += 1
	    }
	 }

   object Bananas {
    def apply(s: Symbol) = {
        System.out.println("Hey"); 
        current += 1
      }
   }

   object Chicken {
    def apply(s: Symbol) = {
        current += 1
      }
   }

   object Dumplings{
    def apply(s: Symbol) = {
        current += 1
      }
   }

  object Eggs {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Fruit {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Gruyere {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Ham {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Ibuprofen {
    def apply(s: Symbol) = {
        current += 1
      }
  }
  object Juice {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Lettuce {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Milk {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Noodles {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Oatmeal {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Pasta {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Rice {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Sriracha {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Turkey {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Utensils {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Veggies {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Xanax {
    def apply(s: Symbol) = {
        current += 1
      }
  }

  object Zucchini {
    def apply(s: Symbol) = {
        current += 1
      }
  }

//  object GIMMEH {
//    def apply(s: Symbol) = {
//      lines(current) = ReadString(current, s)
//      current += 1
//    }
//  }
//  object VISIBLE {
//    def apply(s: String) = {
//      lines(current) = PrintString(current, s)
//      current += 1
//    }
//    def apply(s: Any*) = {
//      lines(current) = PrintMany(current, s.toVector)
//      current += 1
//    }
//    def apply(s: Symbol) = {
//      lines(current) = PrintVariable(current, s)
//      current += 1
//    }
//    def apply(s: Int) = {
//      lines(current) = PrintNumber(current, s)
//      current += 1
//    }
//    def apply(s: Function0[Any]) = {
//      lines(current) = PrintFunction(current, s)
//      current += 1
//    }
//  }
//
//  object COMPLAIN {
//    def apply(s: String) = {
//      lines(current) = ErrorPrintString(current, s)
//      current += 1
//    }
//    def apply(s: Any*) = {
//      lines(current) = ErrorPrintMany(current, s.toVector)
//      current += 1
//    }
//    def apply(s: Symbol) = {
//      lines(current) = ErrorPrintVariable(current, s)
//      current += 1
//    }
//    def apply(s: Int) = {
//      lines(current) = ErrorPrintNumber(current, s)
//      current += 1
//    }
//    def apply(s: Function0[Any]) = {
//      lines(current) = ErrorPrintFunction(current, s)
//      current += 1
//    }
//  }
//
//  object I_HAZ_A {
//    def apply(s: Symbol) = Assignment(s)
//  }
//
//  object LOL {
//    def apply(s: Symbol) = Assignment(s)
//  }
//
//  object BTW {
//    def apply(s: Any) = {}
//  }
//
//  object IZ {
//    def apply(s: Function0[Boolean]) = {
//      lines(current) = If(current, s)
//      current += 1
//    }
//    def apply(s: Symbol) = {
//      lines(current) = IfSymb(current, s)
//      current += 1
//    }
//  }
//
//  def IM_IN_YR_LOOP {
//    lines(current) = LoopBeg()
//    loopBegLines.push(current)
//    current += 1
//  }
//
//  def IM_OUTTA_YR_LOOP {
//    lines(current) = LoopEnd(loopBegLines.pop())
//    current += 1
//  }
//
//  def GTFO {
//    lines(current) = Break()
//    current += 1
//  }
//
//  object HOW_DUZ_I {
//    def apply(funcName: Symbol) = {
//      funcBegLines += (funcName -> current)
//      lines(current) = FuncBeg(funcName)
//      current += 1
//    }
//  }
//
//  object FOUND_YR {
//    def apply(value: Any) = {
//      lines(current) = FuncReturn(value)
//      current += 1
//    }
//  }
//
//  def IF_U_SAY_SO {
//    lines(current) = FuncEnd()
//    current += 1
//  }
//
//  object PLZ {
//    def apply(funcName: Symbol) = {
//      lines(current) = FuncCall(funcName)
//      current += 1
//    }
//    def apply(funcName: Symbol, variable: Symbol) = {
//      lines(current) = FuncCallReturn(funcName, variable)
//      current += 1
//    }
  }

  class Bindings {
    val bindingsStack = Stack[HashMap[Symbol, Any]]()
    val bindings = HashMap[Symbol, Any]()

    /*
     * Create a new scope.
     * Call whenever doing a function call.
     */
    def newScope() {
      bindingsStack.push(new HashMap[Symbol, Any])
    }

    /*
     * Destroy topmost scope.
     * Call whenever leaving a function.
     */
    def leaveScope() {
      bindingsStack.pop()
    }

    /**
     * get correct HashMap for your scope
     */
    def getMap(sym: Symbol): HashMap[Symbol, Any] = {
      val bindingsStackCopy = Stack[HashMap[Symbol, Any]]()
      val bindingsStackTop = bindingsStack.top
      while (!bindingsStack.isEmpty && !bindingsStack.top.contains(sym)) {
        bindingsStackCopy.push(bindingsStack.pop())
      }
      //bindingsStackCopy.push(bindingsStack.pop())
      var map = bindingsStackTop
      if (!bindingsStack.isEmpty) {
        map = bindingsStack.top
      }
      while (!bindingsStackCopy.isEmpty) {
        bindingsStack.push(bindingsStackCopy.pop())
      }
      map
    }

    /**
     * set a value in our map
     */
    def set(k: Symbol, v: Any): Unit = {
      val map = getMap(k)
      map(k) = v;
    }

    /**
     * only returns integers
     */
    def num(k: Symbol): Int = {
      any(k) match {
        case n: Int => n
        case _ => throw new RuntimeException(f"Variable $k does not exist or is not an integer")
      }
    }

    /**
     * WARNING: don't use yet
     * returns ints and doubles
     */
    /* DID NOT TOUCH THIS WHILE IMPLEMENTING SCOPE */
    def anyval(k: Symbol): AnyVal = {
      any(k) match {
        case n: Int => n
        case n: Double => n
        case _ => throw new RuntimeException(f"Variable $k does not exist as type AnyVal")
      }
    }

    /**
     * returns anything
     */
    def any(k: Symbol): Any = {
      val map = getMap(k)
      map.get(k) match {
        case Some(x) => x
        case None => None
      }
    }

    override def toString: String = {
      bindingsStack.top.toString
    }
  }
}
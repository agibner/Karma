package groceryinternal

import java.util._
import java.io._
import java.awt.Robot;
import java.awt.event.KeyEvent

object KarmaTester {
	def main(args:Array[String]){		
		//Stack
		runStackTest("1","?",'1');
		runStackTest("11","??+",'1' + '1');
		runStackTest("\1\1","??+",2);
		runStackTest("11","??-",0);
		runStackTest("\2\2","??*",4);
		runStackTest("11","??/",1);
		runStackTest("11","??%",0);
		runStackTest("\1\1","??&",1);
		runStackTest("\1\1","??|",1);
		runStackTest("\1\1","??^",0);
		runStackTest("\0","?!",1);
		runStackTest("\1","?!",0);
		runStackTest("\1\2","?#?",2);
		runStackTest("\1\1","??:",1);
		runStackTest("\1\1","??;",1);
		
		//Deque
		runDequeTest("1","?}",'1');
		runDequeTest("1","?[",'1');
		
		//Stack and Deque
		runStackTest("\1\1","?}?=",1);
		runStackTest("\1\1","?}?>",0);
	}
	
	def runStackTest(data:String,program:String,endStack:Char) {
		val karmEx = new KarmaExecuter();
		var stdin = System.in;
		try {
			System.setIn(new ByteArrayInputStream(data.getBytes()));
			karmEx.executeProgram(Array(program));
			assert(karmEx.stack.pop() == endStack);
			System.out.println(program + " with input " + data + " passed.");
		} finally {
			System.setIn(stdin);
		}
	}
	
	def runDequeTest(data:String,program:String,endStack:Char) {
		val karmEx = new KarmaExecuter();
		var stdin = System.in;
		try {
			System.setIn(new ByteArrayInputStream(data.getBytes()));
			karmEx.executeProgram(Array(program));
			assert(karmEx.deque.pop() == endStack);
			System.out.println(program + " with input " + data + " passed.");
		} finally {
			System.setIn(stdin);
		}
	}
}



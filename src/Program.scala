class Program {
	
	var codeArray:Array[Array[Char]] = _;
	var linePositions:Array[Int] = _;
	var currentLine:Int = _;

	def this(code:String) {
		this();
		var stringArray:Array[String] = code.split('\n');
		codeArray = stringArray.transpose[Char]((s) => s.toCharArray());
		linePositions = Array.fill(codeArray.size)(0);
		currentLine = 0;
	}
	
	def moveToFront {
		linePositions(currentLine) = 0;
	}
	
	def moveUp {
		if (currentLine==0)
			throw new OutOfRangeException(true,currentLine,linePositions(currentLine) - 1);
		currentLine -= 1;
	}
	
	def moveDown {
		currentLine += 1;
		if (currentLine==linePositions.size)
			throw new OutOfRangeException(false,currentLine,linePositions(currentLine) - 1);
	}
	
	def getNext:Char = {
		if (codeArray(currentLine).size == linePositions(currentLine)) '\n';
		else {
			var a:Char = codeArray(currentLine)(linePositions(currentLine));
			linePositions(currentLine) += 1;
			a
		}
	}
}
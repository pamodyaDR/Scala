object Question4{
   def main(args : Array[String]){
	println(isOdd(5),isEven(4));
	println(AddEven(10));
  
    }

	def isOdd(m:Int):Boolean = m match{
	 case 0 => false;
	 case _ => isEven(m-1);
	}

	def isEven(m:Int) : Boolean = !(isOdd(m));

	//Question5

	def AddEven(m:Int):Int = m match{
	 case 0 => 0;
	 case x if (isOdd(x)==true) => AddEven(m-1);
	 case x => m+AddEven(m-2);
	}

}
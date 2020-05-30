object Question6{
   def main(args : Array[String]){
	fiboSeq(10);
	
  
    }
	def fibo(n:Int):Int = n match{
	 case 0 => 0;
	 case 1 => 1;
	 case _ => fibo(n-1) + fibo(n-2);
	}

	def fiboSeq(m:Int):Any = {
	 if(m>0) fiboSeq(m-1)
	  print(fibo(m) + " ")
	}

}
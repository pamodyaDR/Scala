object Question1{
   def main(args : Array[String]){
	println(primeNum(5),primeNum(8));
	
  
    }

	def GCD(n:Int ,m:Int):Int=m match
	{
	case x if (x==0) => n;
	case x if(x>n) => GCD(x,n);
	case x => GCD(x,n%x);
	}

	def primeNum(n: Int, m:Int=2):Boolean=n match
	{
	 case x if(x==m) => true;
	 case x if(GCD(x,m))>1 => false;
	 case x => primeNum(x,m+1)
	}
}
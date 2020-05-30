object Question3{
   def main(args : Array[String]){
	println(Addition(5));
	
  
    }

	def Addition(m:Int):Int = m match{
	 case 1 => 1;
	 case _ => m+ Addition(m-1)
	}

}
object Question1{
	def main(args : Array[String])
	{
	  
         println("35.0C = "+convert(35.00)+"F");

	}
	def convert(cel : Double) : Double = {
	   var far : Double=0;
	  
         far=cel*1.8000 + 32.00;
	return far;
	}
}
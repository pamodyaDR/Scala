object Question2{
	
   def main(args : Array[String]){ 
	
          println("Volume = "+volume(5.0));
	}

  def volume(rad : Double) : Double ={
	var volume : Double = 0;
	
        volume = (4.0/3) * (22.0/7) *(rad*rad*rad);
	return volume;
       }

}
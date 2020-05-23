object Question3{
	def main(args : Array[String]){
		
		println("Total cost for 60 copies : Rs."+cost(60));
		
	}
	
	def cost(n : Int) : Double = {
	var Cost : Double = 0;

		if(n<=50){
			Cost=n*(24.95*0.6+3);
                        return Cost;			}
                else{
			Cost=n*(24.95*0.6)+3*50+(n-50)*0.75;
			return Cost;
			}

	}
}

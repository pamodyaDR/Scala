object Question2{
   def main(args : Array[String]){
        println("Profite for ticket price Rs.5  : "+profit(5));
        println("Profite for ticket price Rs.10 : "+profit(10));
        println("Profite for ticket price Rs.15 : "+profit(15));
        println("Profite for ticket price Rs.20 : "+profit(20));
        println("Profite for ticket price Rs.25 : "+profit(25));
        println("Profite for ticket price Rs.30 : "+profit(30));
        println("Profite for ticket price Rs.35 : "+profit(35));
        println("Profite for ticket price Rs.40 : "+profit(40));
	
   }
   def attendees(price : Int ): Int=120+(15-price)/5*20
  
   def revenue(price:Int) : Int = attendees(price)*price

   def cost(price:Int) : Int =500+attendees(price)

   def profit(price:Int):Int ={
	var profit : Int =0;
    profit = revenue(price)-cost(price)
	return profit
}
	



  
}
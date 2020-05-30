object Question1{
  def main(args : Array[String])
	{
	 println("The take home salary of an employee =Rs. "+Salary(40.00,10.00));
	}
  def Salary( normal : Double , OT : Double) : Double={
          var salary : Double = 0;

	  salary=((normal*150 + OT*75)*0.9);
		return salary;
	}
}
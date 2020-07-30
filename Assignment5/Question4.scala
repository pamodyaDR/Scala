class Account(val nic : String,val accNum : Int ,var balance : Double){

	override def toString ="NIC: "+nic+"\nAccount No: "+accNum +"\nBalance: "+balance+"\n"


}

object Question4{

	def main(args:Array[String])
	{
		var acc1= new Account("978654322v",100001,5000)
		var acc2= new Account("958754322v",100002,-6000)
		var acc3= new Account("978954322v",100003,15000)
		var acc4= new Account("978224322v",100004,35000)
		var acc5= new Account("878654322v",100005,5600)
		var acc6= new Account("998654322v",100006,0)
		var acc7= new Account("956654322v",100007,8900)
		var acc8= new Account("946654322v",100008,-2000)


		var Bank:List[Account]=List(acc1,acc2,acc3,acc4,acc5,acc6,acc7,acc8)


	println("******Account numbers of Over Draft Account******")
	var odList=overDraft(Bank);
	odList.foreach(a=>print(a.accNum+"\n"))
	println();

	var sumOfBalance=sum(Bank);
	println("Sum of all Accounts balance : "+sumOfBalance.balance);
	println()

	println("Account balance with interested" )
	var interestList=interest(Bank)
	interestList.foreach(a=>println(a+" "))
	println()
	}

	val overDraft=(list:List[Account])=>list.filter(a=>a.balance<=0)
	val sum=(list:List[Account])=>list.reduce((a,b)=>new Account("000000000v",100000,a.balance+b.balance));
	val interest=(list:List[Account])=>list.map(x=>(if(x.balance>0) x.balance*1.05d else x.balance*1.01d))

}


		


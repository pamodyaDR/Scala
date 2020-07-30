class Account(val nic : String,val accNum : Int ,var balance : Double){

	def withdraw(amount:Double) = if(this.balance<amount) println("Unable to do your transaction.Balance is not sufficient") else this.balance=this.balance-amount

	def deposit(amount:Double)=this.balance=this.balance+amount

	def transfer(acc : Account,amount : Double)
	{
		this.withdraw(amount)
		acc.deposit(amount)
	}

	override def toString ="NIC: "+nic+"\nAccount No: "+accNum +"\nBalance: "+balance+"\n"

}

object Question3{

	def main(args : Array[String]){
	
		var acc1 =new Account("978654622v",100001,5000.00)
		acc1.deposit(400.00)
		var acc2 =new Account("987645211v",100002,10000.50)
		acc2.withdraw(1000)

		var bank:List[Account]=List(acc1,acc2)

		println("\n************Before transfer money************")
		println(acc1)
		println(acc2)
		acc2.transfer(acc1,500)

		println("\n************After transfer money*************")
		println(acc1)
		println(acc2)
	}
}
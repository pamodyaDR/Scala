class Rational(x:Int,y:Int)
{
	require(y>0,"Denomenator must be greater than 0");
	def numer = x/gcd(Math.abs(x),y);
	def denom = y/gcd(Math.abs(x),y);
	def this(x:Int) = this(x,1)
	private def gcd(n:Int,m:Int):Int = if(m==0) n else gcd(m,n%m)

	def neg = new Rational(-this.numer,this.denom)

	override def toString = numer+"/"+denom;

}

object Question1 extends App{

	var r1=new Rational(3,8);

	println(r1.neg)

}
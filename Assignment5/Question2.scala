class Rational(x:Int,y:Int)
{
	require(y>0,"Denomenator must be greater than 0");
	def numer = x/gcd(Math.abs(x),y);
	def denom = y/gcd(Math.abs(x),y);
	
	def this(x:Int) = this(x,1);

	private def gcd(n:Int,m:Int):Int = if(m==0) n else gcd(m,n%m)

	def neg = new Rational(-this.numer,this.denom)

	def +(r:Rational) =new Rational(this.numer*r.denom +this.denom*r.numer,this.denom*r.denom)

	def-(r:Rational) =this+r.neg;

	override def toString = numer+"/"+denom;
}

object Question2
{

	def main(args : Array[String]){
	
	val x=new Rational(3,4)
	val y=new Rational(5,8)
	val z=new Rational(5,8)
	val r=x-y-z
	println(r)
	}

}
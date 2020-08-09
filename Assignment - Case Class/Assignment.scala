import math.{sqrt,pow}
object Assignment extends App{

	val p1=Point(4,3)
	val p2=Point(3,2)

	val p3=p1.move(4,2)
	val p4=p1.distance(p2)
	val p5=p1.invert

	
	
	println(p1+p2)
	println(p3)
	println(p4)
	println(p5)

}

case class Point(a:Int,b:Int){
	def x:Int=a
	def y:Int=b

	def +(that:Point)=Point(this.x+that.x,this.y+that.y)
	def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
	def distance(that:Point):Double=sqrt(pow(this.x-that.x,2)+pow(this.y-that.y,2))
	def invert=Point(this.y,this.x)
	
}
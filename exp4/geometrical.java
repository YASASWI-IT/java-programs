abstract class shape{
	abstract void numberofsides();
}
class trapizium extends shape{
	void numberofsides(){
		System.out.println("A trapezium has 4 sides.");
	}
}
class triangle extends shape{
	void numberofsides(){
		System.out.println("A triangle has 3 sides.");
	}
}
class hexagon extends shape{
	void numberofsides(){
		System.out.println("A hexagon has 6 sides.");
	}
}
class geometrical{
	public static void main(String args[]){
		shape s1=new trapizium();
		shape s2=new triangle();
		shape s3=new hexagon();
		s1.numberofsides();
		s2.numberofsides();
		s3.numberofsides();
	}
}

class person{
	void introduce(){
		System.out.println("I am a person");
	}
}
class student extends person{
	void study(){
		System.out.println("I am studying");
	}
}
class collegestudent extends student{
	void attendlecture(){
		System.out.println("I am attending a college lectures in SRGEC");
	}
}
public class multilevelinheritanceperson{
	public static void main(String args[]){
		collegestudent cs=new collegestudent();
		cs.introduce();
		cs.study();
		cs.attendlecture();
	}
}
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
public class inheritanceperson{
	public static void main(String args[]){
		student s=new student();
		s.introduce();
		s.study();
	}
}
class A{
    int X,Y;
    A(int a,int b){
        X=a;
        Y=b;
        System.out.println(" X= "+ X +" Y= "+ Y);
    }
    void add(){
        System.out.println("super add:"+(X+Y));
    }
}
class B extends A{
    int Z=80;
    B(int X,int Y){
        super(X,Y);
    }
    void display(){
        super.add();
        Z=super.X+super.Y+Z;
        System.out.println("sub add:"+Z);
    }
}
class SuperExample{
    public static void main(String args[]){
        B obj = new B(13,15);
        obj.display();
    }
}
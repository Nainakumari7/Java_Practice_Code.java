public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor = ("blue");
        System.out.println(p1.color);
        p1.setTip=(5);
        System.out.println(p1.set);


    }
    
}
class pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
 



Constuctor in java
public class OOPS{
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("naina");
        student s3 = new student(47);
        
    }
    
}
class student {
    String name;
    int rollno;

    student(){
        System.out.println("constructor is called");

    }
    student(String name ){
        this.name=name;

    }
    student(int rollno){
        this.rollno=rollno;

    }
}


public class OOPS{
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "naina";
        s1.roll=42;
        s1.pass=1234;
        student s2 = new student(s1);
        s2.pass=56789;
        
    }
    
}

class student{
    String name;
    int roll;
    int pass;
    student(student s1){
        this.name = s1.name;
        this.roll=s1.roll;
    }

    student(){
        System.out.println("Constructor is called.....");
    }

}


Inheritance in java
public class OOPS{
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eats();
        shark.breath();    
    }
}
class Animal{
    string color;

    void eats(){
        System.out.println("yes...eating man....");
    }

    void breath(){
        System.out.println("breathing......");
    }
}


class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("swimming......");
    }

}

polymorphism  in java 
method overloading
public class OOPS{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,3));
        System.out.println(calc.sum((float)2.5,(float)3.5));
        System.out.println(calc.sum(2,3,5));
        
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    } 
}


method overridding
public class OOPS{
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eats();
        
        
    }
}

class Animal{
    void eats(){
        System.out.println("eats nothing");
    }
}

class Deer extends Animal{
    void eats(){
        System.out.println("eats green grass");
    }

}

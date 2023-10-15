import java.lang.Math.*;
public class findPerson{
public static void main (String args[]){

Person p1 = new Person();
p1.name = "Sanya";
System.out.println(p1.name);
p1.age = 42;
System.out.println(p1.age);

Circle c1 = new Circle();
c1.radius = 4;
System.out.println("Perimeter is : " + c1.perimeter(4));

System.out.println("Area is : " + c1.area(4));
}
}

class Person{
    String name;
    int age;
}
class Circle{
    
    int radius;
    double perimeter(int radius){
        double per = 2*3.14*radius;
        return per;
    }

        double area(int radius) {
            double Area = 3.14*radius*radius;
            return Area;
        }
    

    

    
        
    }


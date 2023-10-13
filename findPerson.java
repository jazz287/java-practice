public class findPerson{
public static void main (String args[]){

Person p1 = new Person();
p1.name = "Sanya";
System.out.println(p1.name);
p1.age = 42;
System.out.println(p1.age);
}

}

class Person{
    String name;
    int age;
}

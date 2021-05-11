package study;

public class Employee {
    String name ;
    String post;
    String email;
    String tel;
    int salary;
    int age;

    public Employee(String name, String post, String email, String tel, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {

    }


    void tellAboutHuman(){
        System.out.println("My name is " + name + ". And my post is " + post + ". My data: " + email + "," + tel + "," + salary + ", and I'm " + age + ".");
    }
}

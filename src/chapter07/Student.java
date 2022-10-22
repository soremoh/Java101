package chapter07;

public class Student {

    String name;
    int grade;
    String department;
    //customize student
    //this() 생성자
    public Student(){
        this("lee",5,"computer");
    }

    //this. 자기참조
    Student(String name,int grade){
        this.name = name;
        this.grade = grade;
        department = "computer-engine";
    }
    Student(String name,int grade,String department){
        this.name = name;
        this.grade = grade;
        this.department = "computer-engine";
    }
}

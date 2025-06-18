package Oops;

class Person1 {
    String name;
    String dob;

    Person1(String name,String dob){
        this.name = name;
        this.dob = dob;
    }
    void dispperson1(){
        System.out.println("NAME:"+name);
        System.out.println("DOB:"+dob);
    }
}
class Teacher extends Person1{
    double salary;
    String subject;

    Teacher(String name,String dob,double salary,String subject){
        super(name, dob);
        this.salary = salary;
        this.subject = subject;
    }
    void dispTeacher(){
        dispperson1();
        System.out.println("SALARY:"+salary);
        System.out.println("SUBJECT:"+subject);
    }
}
class student extends Person1{
    int studentid;
    student(String name,String dob,int studentid){
        super(name,dob);
        this.studentid = studentid;
    }
    void dispstudent(){
        dispperson1();
        System.out.println("STUDENTID:"+studentid);
    }
}
class collegestudent extends student{
    String clgName;
    int year;
    collegestudent(String name,String dob,int studentid,String clgName,int year){
        super(name,dob,studentid);
        this.clgName = clgName;
        this.year = year;
    }
    void dispcollegestudent(){
        dispperson1();
        dispstudent();
        System.out.println("COLLEGE NAME:"+clgName);
        System.out.println("YEAR:"+year);
    }
}
class Person2 {
    public static void main(String[] args){
        System.out.println("PERSON INFORMATION:");
        Person1 p = new Person1("john","10/1/90");
        p.dispperson1();
        System.out.println();
        System.out.println("TEACHER INFORMATION:");
        Teacher t = new Teacher("Swetha","4/5/89",45000,"Physics");
        t.dispTeacher();
        System.out.println();
        System.out.println("STUDENT INFORMATION:");
        student s = new student("mark","4/5/6",1234);
        s.dispstudent();
        System.out.println();
        System.out.println("COLLEGE STUDENT INFORMATION:");
        collegestudent cs = new collegestudent("wood","4/5/4",4567,"vel tech",3);
        cs.dispcollegestudent();
    }
}


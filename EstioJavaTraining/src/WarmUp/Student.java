package WarmUp;

class main{
    public static  void main(String[] args){

        Student sdt1 = new Student("James", 4);
        Student sdt2 = new Student("Jim", 16);
        Student sdt3 = new Student("Cathy", 19);
        Student sdt4 = new Student("Simon", 14);
        Student sdt5 = new Student("Claire", 6);
        Student sdt6 = new Student("Clive", 21);

        sdt1.describeStudent();
        sdt2.describeStudent();
        sdt3.describeStudent();
        sdt4.describeStudent();
        sdt5.describeStudent();
        sdt6.describeStudent();
    }
}

public class Student {

    private String name;
    private Integer age;
    private static String headOfSchool;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStudentName(){
        return this.name;
    }

    public Integer getStudentAge(){
        return this.age;
    }

    public void describeStudent(){
        int newAge = age;
        if(age < 5) {
            System.out.println(name + " Is Not yet old enough to go to school");
        }
        else if(age > 4 && age < 19){
            System.out.println(name + " Is still in education");
        }
        else{
            System.out.println(name + " Is now seeking employment as a Java developer");
        }


    }
}
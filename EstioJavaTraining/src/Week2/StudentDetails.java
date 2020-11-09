package Week2;

public class StudentDetails {

 private String studentName;
 private Integer studentAge;
 private String headTeacher;

 public static void main(String[] args) {

 }

 public StudentDetails(String name, int age) {
  this.studentName = name;
  this.studentAge = age;

 }

 public void setName(String name) {
  this.studentName = name;
 }

 public void setAge(Integer age) {
  this.studentAge = age;
 }

 public String getStudentName() {
  return this.studentName;
 }

 public Integer getStudentAge() {
  return this.studentAge;
 }

 public void describeStudent() {
  int newAge = studentAge;
  //if (studentAge </*minium age - in constructor- constructor can have default size*/) {
   System.out.println(studentName + "This will print something");
  }
 }
//}



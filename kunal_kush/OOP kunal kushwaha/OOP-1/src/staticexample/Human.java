package staticexample;

public class Human extends InnerClass.Test {
  int age;
  String name;
  int salary;
  boolean married;
  static long population;
 public Human(int age,String name,int salary,boolean married){
     this.age=age;
      this.name=name;
      this.salary=salary;
      this.married=married;
      Human.population +=1;
 }
    public void checking(){
     System.out.println("i am in human class");
 }

    public static void main(String[] args) {
        InnerClass.Test a= new InnerClass.Test();
        a.checkingInnerClass();
    }
}

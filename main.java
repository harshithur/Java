class Employee{
   int id;
   String name;
    
   void eat(){
    System.out.println("Employee is eating");
    }
    
    void work() {
    System.out.println("Employee is Working");
    }
}

class Main{
  public static void main(String[] args){
   Employee emp = new Employee();
   emp.id       = 12;
   emp.name     ="Ramesh";
   System.out.println(emp.id);
   System.out.println(emp.name);
   emp.eat();
   emp.work();
 }
}
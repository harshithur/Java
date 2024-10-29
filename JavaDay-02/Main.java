class Employee{

   int id;
   String name;
 
   void work()
  {
   System.out.println("Employee is working");
   }
   
   void eat()
  {
   System.out.println("Employee is eating");
   }
   
}

class Main{
public static void main(String[] args)
   {
    Employee emp1 = new Employee();
    emp1.id = 12;
    emp1.name="Ajay";
    System.out.println(emp1.id);
    System.out.println(emp1.name);
    emp1.work();
    emp1.eat();
    System.out.println("===================================");
    Employee emp2 = new Employee();
    emp2.id = 12;
    emp2.name="Ajay";
    System.out.println(emp2.id);
    System.out.println(emp2.name);
    emp2.work();
    emp2.eat();  

   }
}
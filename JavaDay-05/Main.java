package operatorsInjava;
class myCar{
	void Name(){
		System.out.println("My Name is Java");
	}
class myBike   {
	      void Name1()
	      {
		System.out.println("My Name is notJava");
	     }
   
  }
}


public class Main {
  public static void main(String[] args) {
	  myCar obj1 = new myCar();
	  obj1.Name();
	  
	  operatorsInjava.myCar.myBike obj11 =  obj1.new myBike();
	  obj11.Name1();
  }
}
class Student{
    String name;  //properties..... 
    
    void study(){    //behaviour......
  
    System.out.println("Student is studying");
               }
public static void main(String[] args){
    
    Student st = new Student();
    st.name    = "Ajay";
    System.out.println(st.name);
    st.study();
    
   }
}
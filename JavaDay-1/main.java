class student {
    String name;
    
    void study(){
     System.out.println("Student is studying ");
  }
public static void main(String[] args){
   student st = new student();
   st.name = "Ajay";
   System.out.println(st.name);
   st.study();
  
  }
}
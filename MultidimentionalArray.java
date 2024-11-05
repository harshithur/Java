package operatorsInjava;
//multi dimentional array
public class Airthmetic {

	public static void main(String[] args) {
     int array[][] = new int[3][4];
     
//     array[0][0] = 2;
//     array[0][1] = 3;
//     array[0][2] = 4;
//     array[0][3] = 4;
//     array[1][0] = 5;
//     array[1][1] = 6;
//     array[1][2] = 7;
//     array[1][3] = 0;
//     array[2][0] = 6;
//     array[2][1] = 25;
//     array[2][2] = 6;
//     array[2][3] = 25;
//     
     for(int i=0;i<3;i++) 
     {
    	 for(int j=0;j<4;j++) 
    	 {
    		 array[i][j] = (int)(Math.random()*10);
    		 System.out.println(array[i][j]);
    	 }
		
     }
		
	
     
     
     for(int i=0;i<3;i++) 
     {
    	 for(int j=0;j<4;j++) 
    	 {
    		 System.out.print(array[i][j]+" ");
    	 }
    	 System.out.println();
     }
		
	}
}

public class Demo {

    public static void main(String[] args) {
        //Type conversion in java
        
        int a = 10;
        float b = a;
        System.out.println(b+"     Implisit type conversion");
        float c =20.9f;
        int d = (int)c;
        System.out.println(d+"       Explicit type conversion");
        short e = 32678;
        int f = e;
        int g = 320678223;
        short h = (short)g;

        System.out.println(h+"    Explicit type conversion");
        
        System.out.println(f+"    Implicit type conversion");

    }
}
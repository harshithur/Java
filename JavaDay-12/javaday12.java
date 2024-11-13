class Javaday12 {  // Make sure the class name matches the file name
    String phone = "iphone";
    String colur = "Red";
    int prize = 1200;

    public void show() {
        System.out.println(phone + " : " + colur + " : " + prize);
    }

    public static void main(String[] args) {
        Javaday12 obj = new Javaday12();
        obj.phone = "sumsang";
        obj.colur = "blue";
        obj.prize = 1300;

        Javaday12 obj1 = new Javaday12();
        obj1.phone = "sumsang";
        obj1.colur = "blue";
        obj1.prize = 1300;

        obj.show();
        obj1.show();
    }
}

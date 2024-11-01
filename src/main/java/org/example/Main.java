package org.example;


public class Main {
    public static void main(String[] args) {
        Main operations = new Main();
        operations.addInt(6,9);
        operations.addDouble(5.6,6.5);
        operations.addString("Tuma", "Puma");
        operations.multipleInt(5,5);
        operations.multipleDouble(5.5, 5.9);
        operations.multipleString("Ira" , 3);

    }

    public void addInt(int a , int b){
        System.out.println(a+b);
    }
    public void addDouble(double a , double b){
        System.out.println(a+b);
    }
    public void addString(String a , String b) {
        System.out.println(a + b);
    }
    public void multipleInt(int a , int b){
        System.out.println(a*b);
    }
    public void multipleDouble(double a , double b){
        System.out.println(a*b);
    }
//    public void multipleString(String a , int b){
//        StringBuilder builder = new StringBuilder();
//        for (int i=0 ;i < b; i++ ){
//            builder.append(a);
//        }
//        System.out.println(builder.toString());
//    }

    public void multipleString(String a , int b) {
        String result = "";
        for (int i = 0; i < b; i++){
            result += a;
        }
        System.out.println(result);

    }
}

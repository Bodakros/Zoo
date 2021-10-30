package basic;

public class Main {
    public static void main(String [] args){
     Zoo a = new Zoo("Zoo_3000" , "Ivanucivka", 100);
        System.out.println(a.name);
        System.out.println(a.location);

        System.out.println(a.pay (200) );
        System.out.println(a.pay (100) );
        System.out.println(a.pay (50) );
    }
}

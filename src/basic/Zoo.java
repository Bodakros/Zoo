package basic;

public class Zoo {
    public static void main(String [] args){
    People a = new People("","", "","");
    Event b = new Event("","", 100);
        System.out.println(a.age(20));
        System.out.println(b.pay(250));
        System.out.println(a.amountofPeople());
        System.out.println(b.annonceStartShow());
    }
}
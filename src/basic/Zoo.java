package basic;

public class Zoo{
    String name;
    String location;
    int price;

 public Zoo(String name, String location, int price){
     this.name = name;
     this.location = location;
     this.price = price;
 }
    public int pay(int cash) {
        if (cash >= price) {
            int result = cash - price;
            return result;
        }
         else  {
            int result = price - cash;
            throw new ArithmeticException("Замало коштів, будь ласка додайте " + result);
         }
 }
}

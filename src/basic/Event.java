package basic;

public class Event {
    String name;
    String location;
    int price;


    public Event(String name, String location, int price) {
        this.name = name;
        this.location = location;
        this.price = price;
        Name current = Name.Rob;
        System.out.println("Name of shou: " + current);

        Location yo = Location.WestPart;
        System.out.println("Locatio: " + yo);
    }

    public String pay(int cash) {
        if (cash >= price) {
            int result = cash - price;
            return ("Ось ваша здача: " + result);
        } else {
            int result = price - cash;
            throw new ArithmeticException("Замало коштів, будь ласка додайте " + result);
        }
    }
    //шоу має починатися після того як достатня кількість людей набереться

    public Object annonceStartShow() {

        System.out.println("Welcome to our Zoo! ");
        System.out.println("The show starts in... ");
        for (int k = 10; k > -1; k--) {
            System.out.println(k+ "second");
        }
        return null;
    }

    enum Name {

        Rob,
        Bob,
        Sot,
        Got
    }

    enum Location {
        WestPart,
        EastPart,
        SouthPart,
        NorthPart
    }
}


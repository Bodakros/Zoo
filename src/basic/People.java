package basic;

public class People {
    String name;
    String surname;
    int birth;
    String firstcity;
    String secodcity;
    int age;


    public People(String name, String surname, String firstcity, String secodcity) {
        this.name = name;
        this.surname = surname;
        this.firstcity = firstcity;
        this.secodcity = secodcity;
        this.birth = birth;


    }
    public int age(int age){

        int i = age;
        if(i>=18){
            System.out.println("Your ticket");;

        }
      else{
            System.out.println("go home");
        }

        return i;
    }
    public  Object amountofPeople(){
   for(int g = 1; g < 21; g ++){
       System.out.println(g+ "Person");
   }
   return null;
    }
}
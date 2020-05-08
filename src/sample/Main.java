//import BonusMilles.BonusMilles;
package sample;
public class Main {

    public static void main(String[] args) {
        Bonus service= new Bonus();
        int price = 5000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
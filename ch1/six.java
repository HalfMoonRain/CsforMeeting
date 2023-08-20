/*
알아야 할 개념
1. abstract
2. extend
3. override
4. 
*/ 
abstract class Coffe{
    public abstract int getPrcie();

    @Override
    public String toString() {
        return "Hi this coffe is " + this.getPrcie();
    }
}
class CoffeFactory{
    public static Coffe getCoffe(String type, int price){
        if ("Latte".equalsIgnoreCase(type)) return new Latte(price);
        else if ("Americano".equalsIgnoreCase(type)) return new Americano(price);
        else {
            return new DefaultCoffe();
        }
    }
}

class DefaultCoffe extends Coffe{
    private int price;

    public DefaultCoffe() {
        this.price = -1;
    }
    @Override
    public int getPrcie(){
        return this.price;
    }
}
class Latte extends Coffe {
    private int price;
    
    public Latte(int price){
        this.price = price;
    }
    @Override
    public int getPrcie(){
        return this.price;
    }
}
class Americano extends Coffe{
    private int price;

    public Americano(int price){
        this.price = price;
    }
    @Override
    public int getPrcie(){
        return this.price;
    }
}

public class six {
    public static void main(String[] args){
        Coffe latte = CoffeFactory.getCoffe("Latte", 4000);
        Coffe ame = CoffeFactory.getCoffe("Americano", 3000);
        System.out.println("Factory latte ::" + latte);
        System.out.println("Factory ame ::" + ame);
    }
}

import java.util.ArrayList;

class CoffeeShopMenu
{
    protected String name;
    protected double price;

    public CoffeeShopMenu(String name, double price)
    {
        this.name = name;
        this.price = price;
    }


    public void printMenu(String name, double price)
    {
        System.out.println(name+", "+price);
    }

    public void printMenu() {
    }
}
class BakeryItem extends CoffeeShopMenu
{
    protected boolean warmed;

    public BakeryItem(String name, double price, boolean warmed)
    {
        super(name, price);
        this.warmed = warmed;
    }
    public void printMenu()
    {
    System.out.print(name+", "+price);
        if(warmed)
        {
            System.out.print(", Warmed");
        }
        System.out.println();
    }
}
class Drink extends CoffeeShopMenu
{
    protected String size;

    public Drink(String name, double price, String size)
    {
        super(name, price);
        this.size = size;
    }
    public void printMenu()
    {
        System.out.println(name+", "+price+", "+size);
    }

}
class Coffee extends Drink
{
    protected String milk;

    public Coffee(String name, double price, String size, String milk) {
        super(name, price, size);
        this.milk = milk;
    }
    public void printMenu()
    {
        System.out.println(name+", "+price+", "+size+", "+milk);
    }
    

}
class Frappuccino extends Coffee
{
    private Boolean hasWhipCream;

    public Frappuccino(String name, double price, String size, String milk, boolean hasWhipCream) {
        super(name, price, size, milk);
        this.hasWhipCream = hasWhipCream;
    }
    public void printMenu()
    {
        System.out.print(name+", "+price+", "+size+", "+milk);
        if(hasWhipCream)
        {
            System.out.print(", Whipped Cream");
        }
        System.out.println();
    }

}

public class Lab3 {
    public static void main(String[] args) 
    {
        ArrayList<CoffeeShopMenu> items = new ArrayList<>();
        items.add(new BakeryItem("Croissant", 4.99, true));
        items.add(new BakeryItem("Croissant", 4.99, false));
        items.add(new Coffee("Latte", 5.35, "large", "Oat milk"));
        items.add(new Coffee("Latte", 4.35, "large", "Whole milk"));
        items.add(new Frappuccino("Pumpkin spice frappuccino", 5.97, "medium", "Almond milk", true));
        items.add(new Frappuccino("Pumpkin spice frappuccino", 5.37, "small", "Whole milk", false));
        items.add(new Drink("Earl Grey Tea", 3.23, "small"));

        for (CoffeeShopMenu item: items) {
            item.printMenu();
            //new line for output, this line can be deleted if you structure your printMenu() method so you don't need it.
        }
    }
}
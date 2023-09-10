import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
class Item{
    public String name , Category;
    public int quantity , price;
}
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Item> list = new ArrayList<Item>();

    public static void main(String[] args) {
        System.out.println("Welcome to the Inventory Management System!");
        System.out.println("1. Add Item");
        System.out.println("2. View Items");
        System.out.println("3. Update Item");
        System.out.println("4. Remove Item");
        System.out.println("5. Search Items");
        System.out.println("6. Exit");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please select an option :");

        int input = scanner.nextInt();

        while(input != 6){
            if(input == 1) {
                addItem();
                System.out.println("Item added successfully!");
            }else if(input == 2){
                viewItem();
            } else if (input ==3) {
                updateItem();
            } else if (input ==4) {
                removeItem();
                System.out.println("Item removed successfully!");
            } else if (input == 5) {
                searchItem();
            }
            input = scanner.nextInt();
        }

    }

    static void addItem(){
        System.out.println("Enter Item Name :");
        String name = scanner.next();
        System.out.println("Enter quantity :");
        int quantity = scanner.nextInt();
        System.out.println("Enter price :");
        int price = scanner.nextInt();
        Item it = new Item();
        it.name = name;
        it.quantity = quantity;
        it.price = price;

        list.add(it);
    }
    static void viewItem(){
        System.out.println("Item List : ");
        System.out.println("name - quantity - price");
        for(Item it : list){
            System.out.println(it.name + " -" + it.quantity + " - " + it.price);
        }
    }
    static void updateItem(){
        System.out.println("Enter the number of the item you want to update:");
        int itemIndex = scanner.nextInt();
        int update = scanner.nextInt();
        Item i = new Item();
        i = list.get(itemIndex-1);
        i.quantity = update;
        list.set(itemIndex-1 , i);
    }
    static void removeItem(){
        System.out.println("Enter the number of the item you want to remove:");
        int del = scanner.nextInt();
        list.remove(del-1);
    }
    static void searchItem(){
        System.out.println("Enter item name to search:");
        String search = scanner.next();
        for(Item it : list) {
            if(it.name.equals(search))
            {
                System.out.println(it.name + " -" + it.quantity + " - " + it.price);
            }
        }
        }

}

package Week1.Ecommerce;
import java.util.Scanner;
public class ECommerceMain{
    public static void main(String args[]){
        ECommerce eCommerce = new ECommerce();
        Scanner scn = new Scanner(System.in);
        eCommerce.add(new Product("P102", "Laptop", "Electronics"));
        eCommerce.add(new Product("P101", "Book", "Stationery"));
        eCommerce.add(new Product("P103", "Smartphone", "Electronics"));
        eCommerce.add(new Product("P105", "Shoes", "Footwear"));
        eCommerce.add(new Product("P104", "T-shirt", "Apparel"));
       
        System.out.println("Enter the id to be searched");
        String key = scn.nextLine();
       
        System.out.println("Linear Search: ");
        int ind = eCommerce.linearSearch(key);
        if (ind!=-1){
            System.out.println("\tProduct found: "+eCommerce.products.get(ind).inString());
        }else{
            System.out.println("\tProduct not found");
        }    
       
        System.out.println("Binary Search: ");
        ind = eCommerce.binarySearch(key);
        if (ind!=-1){
            System.out.println("\tProduct found: "+eCommerce.products.get(ind).inString());
        }else{
            System.out.println("\tProduct not found");
        }        
        scn.close();
    }
}
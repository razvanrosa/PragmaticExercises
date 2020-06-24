package org.fasttrackit.chapter3;
import java.util.Scanner;

/*Create a simple self-checkout system. Prompt for the prices
        and quantities of three items. Calculate the subtotal of the
        items. Then calculate the tax using a tax rate of 5.5%. Print
        out the line items with the quantity and total, and then print
        out the subtotal, tax amount, and total.*/

public class Exercise10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter item 1 price:");
        double price = input.nextDouble();
        System.out.println("Enter item 1 quantity:");
        double quantity = input.nextDouble();

        Item item1 = new Item(price,quantity);

        System.out.println("Enter item 2 price:");
        price = input.nextDouble();
        System.out.println("Enter item 2 quantity:");
        quantity = input.nextDouble();

        Item item2 = new Item(price,quantity);

        System.out.println("Enter item 3 price:");
        price = input.nextDouble();
        System.out.println("Enter item 3 quantity:");
        quantity = input.nextDouble();

        Item item3 = new Item(price,quantity);

        double receiptSubtotal = item1.subTotal() + item2.subTotal() + item3.subTotal();
        double taxAmount = taxAmount(receiptSubtotal);

        System.out.println("Subtotal : " + receiptSubtotal);
        System.out.println("Tax: " + taxAmount);
        System.out.println("Total: " + total(receiptSubtotal,taxAmount));

    }

    public static double taxAmount( double receiptSubtotal){
        return ( receiptSubtotal * 5.5 ) / 100;
    }

    public static double total(double receiptSubtotal,double taxAmount){
        return receiptSubtotal + taxAmount;
    }


   static class Item{

        double price;
        double quantity;

        public Item(double price,double quantity){
            this.price = price;
            this.quantity = quantity;
        }

        public double subTotal(){
            return this.price * this.quantity;
        }
    }
}

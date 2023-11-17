package EcommerceProject;

import java.util.Scanner;

public class Cod {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Please, provide your budget");

        int user_budget = Integer.valueOf(reader.nextLine());

        String[] shop_item = new String[5];

        shop_item[0] = "Eggs";
        shop_item[1] = "Milk";
        shop_item[2] = "Meat";
        shop_item[3] = "Juice";
        shop_item[4] = "Orange";

        int[] price = new int[5];
        price[0] = 10;
        price[1] = 12;
        price[2] = 35;
        price[3] = 15;
        price[4] = 17;

        int items = 0;
        String[] shop_list = new String[100];

        int index = 0;
        System.out.println();
        while (index < shop_item.length) {
            System.out.println(shop_item[index] + " " + price[index] + " lei press " + index);
            index = index + 1;
        }
        System.out.println();
        System.out.println("Please, press the number of the item to add it to the basket ");

        int user_choice = Integer.valueOf(reader.nextLine());

        while (user_budget != 0) {
            if (user_budget < price[user_choice]) {
                System.out.println();
                System.out.println("Insufficient budget to purchase this item.");
                break;
            } else {
                user_budget -= price[user_choice];
                shop_list[items] = shop_item[user_choice];
                System.out.println();
                System.out.println("Added " + shop_item[user_choice] + " to your basket.");
                System.out.println("Sold: " + user_budget);
                items++;

            }
            user_choice = Integer.valueOf(reader.nextLine());
        }
        System.out.println();

        System.out.println("Items: ");
        System.out.println();
        for (int i = 0; i < items; i++) {
            System.out.println(shop_list[i]);
        }
        System.out.println();
        System.out.println("Are you an admin? (press 1 if yes, 0 if no)");
        int admin = Integer.valueOf(reader.nextLine());

        if (admin == 1) {
            System.out.println();
            System.out.println("Change prices (Enter new prices for each item):");
            System.out.println();

            for (int i = 0; i < shop_item.length; i++) {
                System.out.print(shop_item[i] + " = ");
                price[i] = Integer.valueOf(reader.nextLine());
            }
            System.out.println();

            System.out.print("Would you like to add new items as well?(press 1 if yes, 0 if no) ");
            int choice = Integer.valueOf(reader.nextLine());

            if(choice == 1) {
                System.out.print("How many? ");
                int n = Integer.valueOf(reader.nextLine());
                int[] extra_groceries_price = new int[n];
                String[] extra_groceries = new String[n];
                System.out.println("Write the items: ");
                for (int i = 0; i < n; i++) {
                    extra_groceries[i] = String.valueOf(reader.nextLine());
                }
                System.out.println();

                System.out.println("Write prices for each: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(extra_groceries[i] + " = ");
                    extra_groceries_price[i] = Integer.valueOf(reader.nextLine());
                }
                System.out.println();
                System.out.print("Would you like to shop with the new items added and prices? (press 1 if yes, 0 if no) ");
                int choice1 = Integer.valueOf(reader.nextLine());
                if(choice1 == 1){

                    System.out.println();
                    System.out.println("Write new budget: ");
                    user_budget = Integer.valueOf(reader.nextLine());
                    System.out.println();
                    int cnt = shop_item.length + n;
                    int index1 = 5;
                    index = 0;
                    while (index < shop_item.length) {
                        System.out.println(shop_item[index] + " " + price[index] + " lei press " + index);
                        index = index + 1;
                    }
                    for(int i = 0; i < n; i++){
                        System.out.println(extra_groceries[i] + " " + extra_groceries_price[i] + " lei press " + index1);
                        index1++;
                    }
                    System.out.println();
                    System.out.println("Please, press the number of the item to add it to the basket ");
                    user_choice = Integer.valueOf(reader.nextLine());
                    String[] newList = new String[cnt];
                    int[] newPrice = new int[cnt];
                    for(int i = 0; i < shop_item.length; i++){
                        newList[i] = shop_item[i];
                        newPrice[i] = price[i];
                    }
                    index1 = 5;
                    for (int i = 0; i < n; i++) {
                        newList[index1] = extra_groceries[i];
                        newPrice[index1] = extra_groceries_price[i];
                        index1++;
                    }

                    items = 0;
                    while (user_budget != 0) {
                        if (user_budget < newPrice[user_choice]) {
                            System.out.println();
                            System.out.println("Insufficient budget to purchase this item.");
                            break;
                        } else {
                            user_budget -= newPrice[user_choice];
                            System.out.println();
                            shop_list[items] = newList[user_choice];
                            System.out.println("Added " + newList[user_choice] + " to your basket.");
                            System.out.println("Sold: " + user_budget);
                            items++;

                        }
                        user_choice = Integer.valueOf(reader.nextLine());
                    }


                }else{
                    System.out.println("Thank you for choosing ecommerce ;)");
                }
            }else {
                System.out.println("Thank you for changing prices:) ");
            }
        } else {
            System.out.println("You can't make changes to prices");
        }

        System.out.println("Items: ");
        System.out.println();
        for (int i = 0; i < items; i++) {
            System.out.println(shop_list[i]);
        }

    }

}
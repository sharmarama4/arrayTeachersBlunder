import java.util.Arrays;

public class SupremeApp {
    public static void main(String[] args) {
        ShoePair nike = new ShoePair("Nike", false, "white", 41, 69.99);
        ShoePair timberLand = new ShoePair("TimberLand", true, "brown", 41, 219.99);
        ShoePair balenciaga = new ShoePair("Balenciaga", true, "black", 45, 429.99);
        ShoePair nike2 = new ShoePair("Nike", true, "white", 42, 29.99);
        ShoePair timberLand2 = new ShoePair("TimberLand", true, "black", 39, 170);
        ShoePair balenciaga2 = new ShoePair("Balenciaga", false, "black", 45, 50);
        ShoePair nike3 = new ShoePair("Nike", true, "white", 41, 79.99);
        ShoePair timberLand3 = new ShoePair("TimberLand", true, "yellow", 41, 80);
        ShoePair balenciaga3 = new ShoePair("Balenciaga", false, "black", 37, 349.99);
        ShoePair[] shoePairs = {nike, timberLand, balenciaga, nike2, timberLand2, balenciaga2, nike3, timberLand3, balenciaga3};
        for(int i=0;i< shoePairs.length;i++){
            System.out.println(shoePairs[i]);
        }
        System.out.println("Total length of shoes = "+shoePairs.length);

/*
        Ik wil graag alle paar schoenen er uithalen die maatje 41 zijn,
        en die compleet zijn. Print al die schoenen af.
*/
        System.out.println("\n");
        for (ShoePair shoe : shoePairs) {
            if (shoe.getSize() == 41 && shoe.isComplete() == true) {
                System.out.println(shoe);
            }
        }
      /*  Via een tweede iteratie wil ik ook dat je me optelt hoeveel
      van die schoenen niet compleet zijn,
       en bereken me hoeveel geld ik hierdoor verloren ben.*/


        System.out.println("\nIncomplete pairs");
        double total = 0;
        int qty = 0;
        for (ShoePair pair : shoePairs) {
            if (!pair.isComplete()) {
                System.out.println(pair);
                total = total + pair.getPrice();
                qty++;
            }

        }

        System.out.println("There are " + qty + " shoePairs lost");
        System.out.println("I have lost total price= " + total);

        System.out.println("\nComplete pairs");
        int quantity =0;
for (ShoePair shoePair:shoePairs){
    if (shoePair.isComplete()==true){
        System.out.println(shoePair);
quantity++;
    }
}
        System.out.println("There are "+ quantity+ " pairs complete");
    }
    }


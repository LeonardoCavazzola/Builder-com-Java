import Burguer.*;

public class Main {

    public static void main(String[] args) {
        Lanche lanche = BurguerBuilder.burgerOf(Hamburger.COW)
                .withBacon()
                .withLettuce()
                .withSauce(Sauce.MAYO)
                .withSauce(Sauce.MUSTARD)
                .withSauce(Sauce.KETCHUP)
                .build();

        Burger burgeer = (Burger) BurguerBuilder.burgerOf(Hamburger.COW)
                .withBacon()
                .withLettuce()
                .withSauce(Sauce.MAYO)
                .withSauce(Sauce.MUSTARD)
                .withSauce(Sauce.KETCHUP)
                .build();
    }
    
}

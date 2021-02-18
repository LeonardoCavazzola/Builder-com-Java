package Burguer;

import java.util.Collection;

public class Burger implements Lanche {

    private Hamburger hamburger;      //tipo de carne
    private Collection<Sauce> sauces; //molhos
    private Boolean lettuce;//true se tem alface
    private Boolean bacon;  //true se tem bacon
    private Boolean onion;  //true se tem cebola
    private Boolean pickles;//true se tem pickles

    public Burger(Hamburger hamburger, Collection<Sauce> sauces, Boolean lettuce, Boolean bacon, Boolean onion, Boolean pickles) {
        this.hamburger = hamburger;
        this.sauces = sauces;
        this.lettuce = lettuce;
        this.bacon = bacon;
        this.onion = onion;
        this.pickles = pickles;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public Collection<Sauce> getSauces() {
        return sauces;
    }

    public Boolean getLettuce() {
        return lettuce;
    }

    public Boolean getBacon() {
        return bacon;
    }

    public Boolean getOnion() {
        return onion;
    }

    public Boolean getPickles() {
        return pickles;
    }
}

package Burguer;

import java.util.Collection;
import java.util.HashSet;

public class BurguerBuilder implements Builder {

    private Hamburger hamburger; //As propriedades que não tem valor padrão e são obrigatorias você passa como parametro no construtor
    private Collection<Sauce> sauces = new HashSet<>();
    private Boolean lettuce = false; //as propriedades que tem um valor padrão você já deixa preenchido aqui, pode ser 'null' inclusive;
    private Boolean bacon = false;
    private Boolean onion = false;
    private Boolean pickles = false;

    public BurguerBuilder(Hamburger hamburger) { //As propriedades que não tem valor padrão e são obrigatorias você passa como parametro no construtor
        this.hamburger = hamburger;
    }

    public static Builder burgerOf(Hamburger hamburger) {
        return new BurguerBuilder(hamburger);
    }

    @Override
    public Builder withSauce(Sauce sauce) {
        this.sauces.add(sauce);
        return this;
    }

    @Override
    public Builder withLettuce() {
        this.lettuce = true;
        return this;
    }

    @Override
    public Builder withBacon() {
        this.bacon = true;
        return this;
    }

    @Override
    public Builder withOnion() {
        this.onion = true;
        return this;
    }

    @Override
    public Builder withPickles() {
        this.pickles = true;
        return this;
    }

    @Override
    public void reset() {
        this.sauces = new HashSet<>();
        this.lettuce = false;
        this.bacon = false;
        this.onion = false;
        this.pickles = false;
    }

    @Override
    public Lanche build() {
        Lanche lanche = new Burger(this.hamburger, this.sauces, this.lettuce, this.bacon, this.onion, this.pickles);
        this.reset();
        return lanche;
    }
}

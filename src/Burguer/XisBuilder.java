package Burguer;

import java.util.Collection;
import java.util.HashSet;

public class XisBuilder implements Builder{

    private Hamburger hamburger;
    private Collection<Sauce> sauces = new HashSet<>();
    private Boolean lettuce = false;
    private Boolean bacon = false;
    private Boolean onion = false;
    private Boolean pickles = false;

    public XisBuilder(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public static Builder xisOf(Hamburger hamburger) {
        return new XisBuilder(hamburger);
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
        Lanche lanche = new Xis(this.hamburger,this.sauces, this.lettuce, this.bacon, this.onion, this.pickles);
        this.reset();
        return lanche;
    }
}

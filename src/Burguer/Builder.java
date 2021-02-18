package Burguer;

public interface Builder {

    Builder withSauce(Sauce sauce);
    Builder withLettuce();
    Builder withBacon();
    Builder withOnion();
    Builder withPickles();
    void reset();
    Lanche build();
}

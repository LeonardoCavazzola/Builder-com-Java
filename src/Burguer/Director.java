package Burguer;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Lanche buildBaconLanche(){

        return this.builder.withSauce(Sauce.BARBECUE)
                .withBacon()
                .withOnion()
                .build();
    }

    public Lanche buildVegetarianLanche(){
        return this.builder.withSauce(Sauce.MAYO)
                .withLettuce()
                .withPickles()
                .withOnion()
                .build();
    }
}

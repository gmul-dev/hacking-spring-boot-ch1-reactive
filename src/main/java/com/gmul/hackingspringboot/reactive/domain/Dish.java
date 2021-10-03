package com.gmul.hackingspringboot.reactive.domain;

public class Dish {

    private String descriptoin;
    private boolean delivered = false;

    public static Dish deliver(Dish dish) {
        Dish deliverdDish = new Dish(dish.descriptoin);
        deliverdDish.delivered = true;
        return deliverdDish;
    }

    public Dish(String descriptoin) {
        this.descriptoin = descriptoin;
    }

    public String getDescriptoin() {
        return descriptoin;
    }

    public void setDescriptoin(String descriptoin) {
        this.descriptoin = descriptoin;
    }

    public boolean isDelivered() {
        return delivered;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "descriptions='" + descriptoin + '\'' +
                ", delivered=" + delivered +
                '}';
    }
}

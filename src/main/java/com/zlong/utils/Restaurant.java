package com.zlong.utils;

public class Restaurant implements Comparable<Restaurant> {
    public String restaurantName;
    public int score;
    public Restaurant(String restaurantName, int score) {
        this.restaurantName = restaurantName;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + restaurantName + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Restaurant o) {
        return score > o.score ? -1 : 1;
    }

}


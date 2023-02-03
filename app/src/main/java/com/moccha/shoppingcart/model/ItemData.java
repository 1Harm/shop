package com.moccha.shoppingcart.model;

import androidx.annotation.NonNull;

import com.moccha.shoppingcart.R;

import java.util.ArrayList;

public class ItemData {
    public static ArrayList<Item> orders = new ArrayList<>();

    @NonNull
    public static ArrayList<Item> getListDrink() {
        ArrayList<Item> drinks = new ArrayList<>();
        drinks.add(new Item("Mineral Water", 4000, R.drawable.mineral));
        drinks.add(new Item("Mango Juice", 8000, R.drawable.mango));
        drinks.add(new Item("Apple Juice", 9000, R.drawable.apple));
        drinks.add(new Item("Avocado Juice", 7000, R.drawable.avocado));
        drinks.add(new Item("Beet Juice", 8000, R.drawable.beet));
        drinks.add(new Item("Orange Juice", 7000, R.drawable.orange));
        drinks.add(new Item("Strawberry Juice", 10000, R.drawable.straw));
        drinks.add(new Item("Grape Juice", 8000, R.drawable.grape));
        return drinks;
    }

    @NonNull
    public static ArrayList<Item> getListFood() {
        ArrayList<Item> foods = new ArrayList<>();
        foods.add(new Item("Sirloin Steak", 45000, R.drawable.sirloin));
        foods.add(new Item("Burger", 30000, R.drawable.burger));
        foods.add(new Item("Spaghetti", 28000, R.drawable.spagetti));
        foods.add(new Item("Soto Ayam", 25000, R.drawable.soto));
        return foods;
    }

    @NonNull
    public static ArrayList<Item> getListSnack() {
        ArrayList<Item> snacks = new ArrayList<>();
        snacks.add(new Item("Donut", 15000, R.drawable.donut));
        snacks.add(new Item("French Fries", 10000, R.drawable.fries));
        snacks.add(new Item("Bread", 13000, R.drawable.bread));
        snacks.add(new Item("Cupcake", 16000, R.drawable.cupcakes));
        return snacks;
    }

    @NonNull
    public static ArrayList<Item> getListOrder() {
        return orders;
    }

}

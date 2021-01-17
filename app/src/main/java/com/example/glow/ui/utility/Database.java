package com.example.glow.ui.utility;

import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    HashMap<Product, String> products;
    HashMap<Ingredient, String> ingredients;
    Database(){
        products = new HashMap<>();
        ingredients = new HashMap<>();
    }
    boolean addProduct(){
        return false;
    }
    boolean addIngredient(Ingredient i){
        return false;
    }
}

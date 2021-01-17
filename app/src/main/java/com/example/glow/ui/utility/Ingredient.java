package com.example.glow.ui.utility;

import java.util.HashMap;

public class Ingredient {
    String name;
    int safety;
    Ingredient(String name, int safety){
        this.name = name;
        this.safety = safety;
    }
    public int getSafety() {
        return safety;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSafety(int safety) {
        this.safety = safety;
    }
}

package components;

import java.util.ArrayList;

public class Player {
    
    private String name;
    private float hunger;
    private float thirst;
    private ArrayList objects;

    public Player() {
        name = "Ciro";
        hunger = 0;
        thirst = 0;
        objects.clear();
    }

    public Player(String name, float hunger, float thirst) {
        this.name = name;
        this.hunger = hunger;
        this.thirst =  thirst;
        objects.clear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHunger() {
        return hunger;
    }

    public void setHunger(float hunger) {
        this.hunger = hunger;
    }

    public float getThirst() {
        return thirst;
    }

    public void setThirst(float thirst) {
        this.thirst = thirst;
    }

    public ArrayList getObjects() {
        return objects;
    }
    
    public void setObjects(ArrayList objects) {
        this.objects = objects;
    }
}

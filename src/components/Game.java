package components;

import java.util.UUID;

import javax.xml.crypto.Data;

public class Game {
    
    private String name;
    private UUID id;
    private Player player;
    private Data time; //Da modificare
    private int day;
    private float level;

    public Game(String name, Player player, Data time, int day, float level) {
        this.name = name;
        id = UUID.randomUUID();
        this.player = player;
        this.time = time;
        this.day = day;
        this.level = level;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Data getTime() {
        return time;
    }

    public void setTime(Data time) {
        this.time = time;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public float getLevel() {
        return level;
    }

    public void setLevel(float level) {
        this.level = level;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Game name: " + name + ", id_game: " + id + ", player: " + player.getName() + ", day: " + day;
    }
}

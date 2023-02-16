package components;

public class Object {
    
    private String name;
    private String description;
    private int quantity;
    private Boolean consumable;
    private float rarity;
    private float durability;

    public Object() {
        name = "Default";
        description = "This is a Default Object!";
        quantity = 0;
        consumable = false;
        rarity = 100;
        durability = 0;
    }

    public Object(String name, String description, int quantity, Boolean consumable, float rarity, float durability) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.consumable = consumable;
        this.rarity = rarity;
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Boolean getConsumable() {
        return consumable;
    }

    public void setConsumable(Boolean consumable) {
        this.consumable = consumable;
    }

    public float getRarity() {
        return rarity;
    }

    public void setRarity(float rarity) {
        this.rarity = rarity;
    }

    public float getDurability() {
        return durability;
    }

    public void setDurability(float durability) {
        this.durability = durability;
    }

}

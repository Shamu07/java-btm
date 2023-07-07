class Pot {
   
    String material;
    String shape;
    int capacity;
    String color;
    boolean isLidAvailable;
    int durability;
    boolean isDishwasherSafe;
    double price;

   
    Pot(String material, String shape, int capacity, String color,boolean isLidAvailable, int durability, boolean isDishwasherSafe, double price)
	{
        this.material = material;
        this.shape = shape;
        this.capacity = capacity;
        this.color = color;
        this.isLidAvailable = isLidAvailable;
        this.durability = durability;
        this.isDishwasherSafe = isDishwasherSafe;
        this.price = price;
    }
    
}
class Animal
{
    String name, habitat, food, sound;
    Animal(String name, String habitat, String food, String sound)
    {
        this.name = name;
        this.habitat = habitat;
        this.food = food;
        this.sound = sound;
    }
    void display()
    {
        System.out.println("Animal: " + name);
        System.out.println("Lives: " + habitat);
        System.out.println("Food: " + food);
        System.out.println("Sound: " + sound + "\n");
    }
}
public class FarmAnimals
{
    public static void main(String[] args)
    {
        Animal cow = new Animal("Cow", "Cowshed", "Grass", "Moo");
        Animal pig = new Animal("Pig", "Pigpen", "Plants and grains", "Oink");
        Animal horse = new Animal("Horse", "Stable", "Grass and hay", "Neigh");
        cow.display();
        pig.display();
        horse.display();
    }
}

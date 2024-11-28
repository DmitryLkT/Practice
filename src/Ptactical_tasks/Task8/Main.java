package Ptactical_tasks.Task8;

public class Main {
    public static void main(String[] args) {
        Player mag = new Wizard(100, 1, "Wizard", "Staff", 15, "Water");
        mag.levelUp();
        System.out.println(mag.getFullInfo());
        System.out.println("----------------");
        Player war = new Warrior(100, 1, "Warrior", "Sword", "Armor");
        war.levelUp();
        System.out.println(war.getFullInfo());



    }
}

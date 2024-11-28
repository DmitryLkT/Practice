package Ptactical_tasks.Task8;

public class Warrior extends Player {
    String armor;

    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;
    }

    @Override
    public void levelUp() {
        level += 1;
    }

    @Override
    public String getFullInfo() {
        return "[Hp: " + hp + "]\n" + "[Level: " + level + "]\n" +
                "[Type: " + type + "]\n" + "[Weapon: " + weapon + "]\n" +
                "[Armor: " + armor + "]";
    }

    @Override
    public boolean doDamage() {
            return true;
    }

}

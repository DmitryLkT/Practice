package Ptactical_tasks.Task8;

public class Wizard extends Player {
    int manaLevel;
    String element;

    public Wizard(int hp, int level, String type, String weapon, int manaLevel, String element) {
        super(hp, level, type, weapon);
        this.manaLevel = manaLevel;
        this.element = element;
    }

    @Override
    public void levelUp() {
        level += 1;
    }

    @Override
    public String getFullInfo() {
        return "[Hp: " + hp + "]\n" + "[Level: " + level + "]\n" +
                "[Type: " + type + "]\n" + "[Weapon: " + weapon + "]\n" +
                "[Mana level: " + manaLevel + "]\n" + "[Element: " + element + "]";
    }

    @Override
    public boolean doDamage() {
        if(manaLevel >= 10) {
            manaLevel -= 10;
            return true;
        } else {
            return false;
        }
    }

}

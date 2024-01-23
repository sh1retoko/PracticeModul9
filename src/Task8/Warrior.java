package Task8;

public class Warrior extends Player{
    String armor;

    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;
    }

    @Override
    void levelUp() {
        level++;
    }

    String getFullInfo() {
        return hp + " " + level + " " + type + " " + weapon + " " + armor;
    }

    @Override
    boolean doDamage() {
        return true;
    }
}

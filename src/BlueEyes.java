public class BlueEyes extends VeryFast {

    public BlueEyes(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields) {
        return "Blue".equals(fields[13]);
    }

    public int attack(SuperHero oHero) {
        int damage = super.attack(oHero);

        damage += (this.getSpeed() - this.getSpeed() * 0.1) - oHero.getSpeed();

        return damage;

    }

    public static boolean SubCondition(String[] fields) {
        return true;
    }
}

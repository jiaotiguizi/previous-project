public class DontLookDownMe extends StrengthBuilder {

    public DontLookDownMe(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields) {
        return "Female".equals(fields[9]);
    }

    public int attack(SuperHero oHero) {
        int damage = super.attack(oHero);

        damage += this.getStrength() * 1.5 - oHero.getSpeed();

        return damage;

    }

    public static boolean SubCondition(String[] fields) {
        return true;
    }
}


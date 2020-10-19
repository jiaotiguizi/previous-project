public class HaroldJordan extends SuperHero {

    public HaroldJordan(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields) {
        boolean is = "Harold Jordan".equals(fields[7]);
        return is;
    }

    public int attack(SuperHero oHero) {
        int damage = super.attack(oHero);
        damage += this.GreenAttack(oHero) + this.getSpeed() * 2 - oHero.getSpeed();
        return damage;

    }

    public int GreenAttack(SuperHero oHero) {
        int Green_damage = 0;
        Green_damage += this.getIntelligence() * 10000 - oHero.getSpeed();
        return Green_damage;
    }


    public static boolean SubCondition(String[] fields) {
        return true;
    }
}


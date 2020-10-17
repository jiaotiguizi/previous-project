public class OverWeight extends VeryFast{

    public OverWeight(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){
        return Integer.parseInt(fields[12]) > 150;
    }

    public int attack(SuperHero oHero) {
        int damage = super.attack(oHero);

        damage += (this.getSpeed() - this.getSpeed() * 0.1) - oHero.getSpeed();

        return damage;

    }

    public static boolean SubCondition(String[] fields){
        return true;
    }
}

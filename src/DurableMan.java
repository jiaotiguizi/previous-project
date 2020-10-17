public class DurableMan extends SuperHero{

    public DurableMan(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){
        return Integer.parseInt(fields[4]) > 90;
    }

    public int attack(SuperHero oHero){
        int damage = super.attack(oHero);

        damage += this.getDurability() - oHero.getDurability() / 2;

        return damage;
    }
}

public class DurableMan extends SuperHero{

    public DurableMan(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){
        return Integer.parseInt(fields[4]) > 90;
    }

    public void attack(SuperHero oHero){
        int damage = super.attack(oHero);

        damage -= this.getDurability() * 2 - oHero.getDurability();

        return damage;
    }
}

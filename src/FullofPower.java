public class FullofPower extends SuperHero{

    public FullofPower(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields) {
        return Integer.parseInt(fields[5]) > 90;
    }

    public void attack(SuperHero oHero) {
        int damage = super.attack(oHero);

        damage += this.getPower() * 2 - oHero.getPower();


        return damage;
    }
}

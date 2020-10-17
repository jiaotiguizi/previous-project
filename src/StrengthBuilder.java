public class StrengthBuilder extends SuperHero{

    public StrengthBuilder(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){
        return Integer.parseInt(fields[2]) > 90;
    }

    public int attack(SuperHero oHero){
        int damage = super.attack(oHero);

        damage += this.getStrength() * 3 - oHero.getStrength();


        return damage;
    }


}

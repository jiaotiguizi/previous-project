public class GreenLantern extends SuperHero{

    public GreenLantern(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){



        return (fields[7]) == "Harold Jordan";
    }

    public int attack(SuperHero oHero) {
        int damage = super.attack(oHero);
        damage += this.GreenAttack(oHero) + this.getSpeed() * 2  - oHero.getSpeed();
        return damage;

    }
    public int GreenAttack(SuperHero oHero){
        int Green_damage = 0;
        Green_damage += this.getIntelligence() * 10000  - oHero.getSpeed();
        return Green_damage;
    }


    public static boolean SubCondition(String[] fields){
        return true;
    }
}

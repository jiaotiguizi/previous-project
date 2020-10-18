import java.util.Random;
public class VeryFast extends SuperHero{

    public VeryFast(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){
        return Integer.parseInt(fields[3]) > 90;
    }

    public int attack(SuperHero oHero) {
        int damage = super.attack(oHero);

        Random run = new Random();
        int i = 0;
        if (i == run.nextInt(5)){
            damage = 0;
        }
        else {
            return damage += this.getSpeed() - oHero.getSpeed();

        }


        return damage;
    }

    public static boolean SubCondition(String[] fields){
        return true;
    }

}
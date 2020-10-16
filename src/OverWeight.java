import java.util.Random;

public class OverWeight extends VeryFast{

    public VeryFast(String[] fields) {
        super(fields);
    }

    public static boolean meetsConditions(String[] fields){
        return Integer.parseInt(fields[12]) > 150;
    }

    public void attack(SuperHero oHero) {
        int damage = super.attack(oHero);

        Random run = new Random();
        int i = 0;
        if (i == run.nextInt(5)){
            damage = 0;
        }
        else {
            return damage += this.getSpeed() - oHero.getSpeed();

        }


    }

    public static boolean SubCondition(String[] fields){
        return true;
    }
}

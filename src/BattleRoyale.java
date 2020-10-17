import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BattleRoyale {
    public static void main(String[] args){


        PrintWriter writer;
        try{
            System.out.println(System.getProperty("user.dir"));
            writer = new PrintWriter("results.txt");
            ArrayList<SuperHero> heroes = SuperHero.readDataFile("./SuperheroDataset.csv");
            int count = 0;
            for(int i = 0; i < heroes.size(); i++){
                for(int j = i + 1; j < heroes.size(); j++){
                    int damageA = heroes.get(i).attack(heroes.get(j));
                    int damageB = heroes.get(j).attack(heroes.get(i));
                    String AlignmentA = heroes.get(i).getAlignment();
                    String AlignmentB = heroes.get(j).getAlignment();

                    if(damageA > damageB && !AlignmentA.equals(AlignmentB))
                        writer.println(heroes.get(i).getName() + " wins");
                    else if(damageB > damageA && !AlignmentB.equals(AlignmentA))
                        writer.println(heroes.get(j).getName() + " wins");
                    else if(damageA == damageB)
                        writer.println("it was a tie");
                    else
                        writer.println("They have same Alignment");
                }
            }
            writer.close();
        }

        catch (Exception e){
            System.out.println("File write error");
        }



    }
}

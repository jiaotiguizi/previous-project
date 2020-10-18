import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BattleRoyale {
    public static void main(String[] args){
        ArrayList<String> myList_win = new ArrayList<String>();
        ArrayList<String> myList_lose = new ArrayList<String>();
        ArrayList<String> myList_tie = new ArrayList<String>();
        PrintWriter writer;
        try{

            System.out.println(System.getProperty("user.dir"));
            writer = new PrintWriter("results.txt");
            ArrayList<SuperHero> heroes = SuperHero.readDataFile("./SuperheroDataset.csv");
            for(int i = 0; i < heroes.size(); i++){
                for(int j = i + 1; j < heroes.size(); j++){
                    int damageA = heroes.get(i).attack(heroes.get(j));
                    int damageB = heroes.get(j).attack(heroes.get(i));
                    String AlignmentA = heroes.get(i).getAlignment();
                    String AlignmentB = heroes.get(j).getAlignment();

                    if(damageA > damageB && !AlignmentA.equals(AlignmentB))
                        myList_win.add(heroes.get(i).getAlignment());

                    else if(damageB > damageA && !AlignmentB.equals(AlignmentA))
                        myList_lose.add(heroes.get(i).getAlignment());

                    else if (damageB == damageA && !AlignmentB.equals(AlignmentA))
                        myList_tie.add(heroes.get(i).getAlignment());
                    myList_tie.add(heroes.get(j).getAlignment());
                }
            }

            int count_good = 0;
            int count_bad = 0;
            int count_neutral = 0;
            int count_good_lose = 0;
            int count_bad_lose = 0;
            int count_neutral_lose = 0;
            int count_good_tie = 0;
            int count_bad_tie = 0;
            int count_neutral_tie = 0;
            for(int i=0; i < myList_win.size(); i++){
                if (myList_win.get(i).equals("good"))
                    count_good+=1;
                else if (myList_win.get(i).equals("bad"))
                    count_bad +=1;
                else if (myList_win.get(i).equals("neutral"))
                    count_neutral +=1;
            }
            for(int i=0; i < myList_lose.size(); i++){
                if (myList_lose.get(i).equals("good"))
                    count_good_lose+=1;
                else if (myList_lose.get(i).equals("bad"))
                    count_bad_lose +=1;
                else if (myList_lose.get(i).equals("neutral"))
                    count_neutral_lose +=1;
            }
            for(int i=0; i < myList_tie.size(); i++){
                if (myList_tie.get(i).equals("good"))
                    count_good_tie+=1;
                else if (myList_tie.get(i).equals("bad"))
                    count_bad_tie +=1;
                else if (myList_tie.get(i).equals("neutral"))
                    count_neutral_tie +=1;
            }
            writer.println("Good hero win: " + count_good);
            writer.println("bad hero win: " + count_bad);
            writer.println("neutral hero win: " + count_neutral);
            writer.println(Math.max(count_good, count_bad));
            writer.println("Good hero lose: " + count_good_lose);
            writer.println("bad hero lose: " + count_bad_lose);
            writer.println("neutral hero lose: " + count_neutral_lose);
            writer.println("Good hero tie: " + count_good_tie);
            writer.println("bad hero tie: " + count_bad_tie);
            writer.println("neutral hero tie: " + count_neutral_tie);

            writer.close();
        }

        catch (Exception e){
            System.out.println("File write error");
        }


    }
}
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class BattleRoyale {
    public static int[] groupBy(List<String> list) {
        int count_good = 0;
        int count_bad = 0;
        int count_neutral = 0;
        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i)) {
                case "good":
                    count_good += 1;
                    break;
                case "bad":
                    count_bad += 1;
                    break;
                case "neutral":
                    count_neutral += 1;
                    break;
            }
        }
        return new int[]{count_good, count_bad, count_neutral};
    }

    public static int getMaxValueIndex(int[] arr) {
        int index = -1;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                index = i;
                max = arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        List<MasterMind> masterMinds = new ArrayList<>();
        List<DontLookDownMe> dontLookDownMes = new ArrayList<>();
        List<StrengthBuilder> strengthBuilders = new ArrayList<>();
        List<FullofPower> fullofPowers = new ArrayList<>();
        List<DurableMan> durableMans = new ArrayList<>();
        List<VeryFast> veryFasts = new ArrayList<>();
        List<GreenLantern> greenLanterns = new ArrayList<>();
        List<SuperHero> overweight = new ArrayList<>();

        List<MasterMind> masterMinds_lose = new ArrayList<>();
        List<DontLookDownMe> dontLookDownMes_lose = new ArrayList<>();
        List<StrengthBuilder> strengthBuilders_lose = new ArrayList<>();
        List<FullofPower> fullofPowers_lose = new ArrayList<>();
        List<DurableMan> durableMans_lose = new ArrayList<>();
        List<VeryFast> veryFasts_lose = new ArrayList<>();
        List<GreenLantern> greenLanterns_lose = new ArrayList<>();
        List<SuperHero> overweight_lose = new ArrayList<>();

        List<MasterMind> masterMinds_tie = new ArrayList<>();
        List<DontLookDownMe> dontLookDownMes_tie = new ArrayList<>();
        List<StrengthBuilder> strengthBuilders_tie = new ArrayList<>();
        List<FullofPower> fullofPowers_tie = new ArrayList<>();
        List<DurableMan> durableMans_tie = new ArrayList<>();
        List<VeryFast> veryFasts_tie = new ArrayList<>();
        List<GreenLantern> greenLanterns_tie = new ArrayList<>();
        List<SuperHero> overweight_tie = new ArrayList<>();

        ArrayList<String> myList_win = new ArrayList<>();
        ArrayList<String> myList_lose = new ArrayList<>();
        ArrayList<String> myList_tie = new ArrayList<>();
        ArrayList<String> myList_heroes_win = new ArrayList<>();
        ArrayList<String> myList_heroes_lose = new ArrayList<>();
        ArrayList<String> myList_heroes_tie = new ArrayList<>();
        PrintWriter writer;
        try {

            System.out.println(System.getProperty("user.dir"));
            writer = new PrintWriter("results.txt");
            ArrayList<SuperHero> heroes = SuperHero.readDataFile("./SuperheroDataset.csv");
            int count = 0;
            for (int a = 0; a < heroes.size(); a++) {

                for (int b = a + 1; b < heroes.size(); b++) {
                    count += 1;
                    //System.out.println(count);
                    int damageA = heroes.get(a).attack(heroes.get(b));
                    int damageB = heroes.get(b).attack(heroes.get(a));
                    String AlignmentA = heroes.get(a).getAlignment();
                    String AlignmentB = heroes.get(b).getAlignment();

                    if (damageA > damageB && !AlignmentA.equals(AlignmentB)) {
                        myList_win.add(heroes.get(a).getAlignment());
                        if (heroes.get(a) instanceof MasterMind) masterMinds.add((MasterMind) heroes.get(a));
                        else if (heroes.get(a) instanceof DontLookDownMe) dontLookDownMes.add((DontLookDownMe) heroes.get(a));
                        else if (heroes.get(a) instanceof StrengthBuilder) strengthBuilders.add((StrengthBuilder) heroes.get(a));
                        else if (heroes.get(a) instanceof FullofPower) fullofPowers.add((FullofPower) heroes.get(a));
                        else if (heroes.get(a) instanceof DurableMan) durableMans.add((DurableMan) heroes.get(a));
                        else if (heroes.get(a) instanceof OverWeight) overweight.add((OverWeight) heroes.get(a));
                        else if (heroes.get(a) instanceof VeryFast) veryFasts.add((VeryFast) heroes.get(a));
                        else if (heroes.get(a) instanceof GreenLantern) greenLanterns.add((GreenLantern) heroes.get(a));


                        if (heroes.get(a).equals(heroes.get(a).getFullName()))
                            myList_heroes_win.add(heroes.get(a).getFullName());

                    } else if (damageB > damageA && !AlignmentB.equals(AlignmentA)) {
                        myList_lose.add(heroes.get(b).getAlignment());
                        if (heroes.get(a) instanceof MasterMind) masterMinds_lose.add((MasterMind) heroes.get(a));
                        else if (heroes.get(a) instanceof DontLookDownMe) dontLookDownMes_lose.add((DontLookDownMe) heroes.get(a));
                        else if (heroes.get(a) instanceof StrengthBuilder) strengthBuilders_lose.add((StrengthBuilder) heroes.get(a));
                        else if (heroes.get(a) instanceof FullofPower) fullofPowers_lose.add((FullofPower) heroes.get(a));
                        else if (heroes.get(a) instanceof DurableMan) durableMans_lose.add((DurableMan) heroes.get(a));
                        else if (heroes.get(a) instanceof OverWeight) overweight_lose.add((OverWeight) heroes.get(a));
                        else if (heroes.get(a) instanceof VeryFast) veryFasts_lose.add((VeryFast) heroes.get(a));
                        else if (heroes.get(a) instanceof GreenLantern) greenLanterns_lose.add((GreenLantern) heroes.get(a));

                        myList_heroes_lose.add(heroes.get(a).getFullName());
                    } else if (damageB == damageA && !AlignmentB.equals(AlignmentA)) {
                        if (heroes.get(a) instanceof MasterMind) {
                            masterMinds_tie.add((MasterMind) heroes.get(a));
                            //masterMinds_tie.add((MasterMind) heroes.get(b));
                        } else if (heroes.get(a) instanceof DontLookDownMe) {
                            dontLookDownMes_tie.add((DontLookDownMe) heroes.get(a));
                            //dontLookDownMes_tie.add((DontLookDownMe) heroes.get(b));
                        } else if (heroes.get(a) instanceof StrengthBuilder) {
                            strengthBuilders_tie.add((StrengthBuilder) heroes.get(a));
                            //strengthBuilders_tie.add((StrengthBuilder) heroes.get(b));
                        } else if (heroes.get(a) instanceof FullofPower) {
                            fullofPowers_tie.add((FullofPower) heroes.get(a));
                            //fullofPowers_tie.add((FullofPower) heroes.get(b));
                        } else if (heroes.get(a) instanceof DurableMan) {
                            durableMans_tie.add((DurableMan) heroes.get(a));
                            //durableMans_tie.add((DurableMan) heroes.get(b));
                        } else if (heroes.get(a) instanceof OverWeight) {
                            overweight_tie.add((OverWeight) heroes.get(a));
                            //overweight_tie.add((OverWeight) heroes.get(b));
                        } else if (heroes.get(a) instanceof VeryFast) {
                            veryFasts_tie.add((VeryFast) heroes.get(a));
                            //veryFasts_tie.add((VeryFast) heroes.get(b));
                        } else if (heroes.get(a) instanceof GreenLantern) {
                            greenLanterns_tie.add((GreenLantern) heroes.get(a));
                            //greenLanterns_tie.add((GreenLantern) heroes.get(b));
                        }

                        myList_tie.add(heroes.get(a).getAlignment());
                        myList_tie.add(heroes.get(b).getAlignment());
                        myList_heroes_tie.add(heroes.get(a).getFullName());
                        myList_heroes_tie.add(heroes.get(b).getFullName());
                    }
                }
            }


            int[] wins = groupBy(myList_win);
            int[] loses = groupBy(myList_lose);
            int[] ties = groupBy(myList_tie);
            writer.println("Good hero win: " + wins[0]);
            writer.println("bad hero win: " + wins[1]);
            writer.println("neutral hero win: " + wins[2]);
            writer.println("Max: " + wins[getMaxValueIndex(wins)]);
            writer.println("Good hero lose: " + loses[0]);
            writer.println("bad hero lose: " + loses[1]);
            writer.println("neutral hero lose: " + loses[2]);
            writer.println("Max: " + loses[getMaxValueIndex(loses)]);
            writer.println("Good hero tie: " + ties[0]);
            writer.println("bad hero tie: " + ties[1]);
            writer.println("neutral hero tie: " + ties[2]);
            writer.println("Max: " + ties[getMaxValueIndex(ties)]);

            writer.println("MasterMind " + "win: " + masterMinds.size() + "lose: " + masterMinds_lose.size() + "tie: " + masterMinds_tie.size());
            writer.println("DontLookDownMe " + "win: " + dontLookDownMes.size() + "lose: " + dontLookDownMes_lose.size() + "tie: " + dontLookDownMes_tie.size());
            writer.println("StrengthBuilder " + "win: " + strengthBuilders.size() + "lose: " + strengthBuilders_lose.size() + "tie: " + strengthBuilders_tie.size());
            writer.println("FullOfPower " + "win: " + fullofPowers.size() + "lose: " + fullofPowers_lose.size() + "tie: " + fullofPowers_tie.size());
            writer.println("DurableMans " + "win: " + durableMans.size() + "lose: " + durableMans_lose.size() + "tie: " + durableMans_tie.size());
            writer.println("VeryFast " + "win: " + veryFasts.size() + "lose: " + veryFasts_lose.size() + "tie: " + veryFasts_tie.size());
            writer.println("GreenLantern " + "win: " + greenLanterns.size() + "lose: " + greenLanterns_lose.size() + "tie: " + greenLanterns_tie.size());
            writer.println("OverWeight " + "win: " + overweight.size() + "lose: " + overweight_lose.size() + "tie: " + overweight_tie.size());


            writer.close();
        } catch (Exception e) {
            System.out.println("File write error");
        }
    }
}



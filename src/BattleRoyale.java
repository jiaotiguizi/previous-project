import java.io.PrintWriter;

public class BattleRoyale {
    public static void main(String[] args){

        PrintWriter writer;
        try{
            writer = new PrintWriter("results.txt");
            for(int i = 0; i < 100; i++)
                writer.println("line " + i);
            writer.close();
        }
        catch (Exception ex){
            System.out.println("File write error");
        }

    }
}

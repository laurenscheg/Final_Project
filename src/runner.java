import java.util.Scanner;
public class runner
{

    public static void main(String[] args)
    {
        punctuation punkd = new puncuation();

        System.out.println (punkd.greeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("exit"))
        {
            System.out.println (punkd.getResponse(statement));
            statement = in.nextLine();
        }
    }

}

import java.util.Scanner;
public class punctuation
{
    public  String greeting()
    {
        return "Enter your text: ";
    }

    public String getCorrection(String text)
    {
        String correction = "";

        if(statment.length()==0)
        {
            correction = "Please enter text.";
        }

        else if((findError(statement,"  ")>=0)
        {
            statement = ". ";
            correction = text.substring(0, findError(text, "  "))+ statement+ text.substring(findError(text, "  "+2),text.length());
        }



        return correction;
    }

    private int findError(String text, String goal)
    {
        int psn = text.indexOf(goal);
        String before = "";
        String after = "";

        while (psn >= 0)
        {

            if (psn > 0)
            {
                before = phrase.substring(psn-1, psn);
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
            }
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))&&((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
            {
                return psn;
            }
            else {
                psn = phrase.indexOf(goal, psn + 1);
            }
        }
    }

}

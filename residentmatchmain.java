
import java.lang.Math;

/**
 * resident compatibility project
 *
 * @author (Jeremy Rine)
 * @version (2/19/2019 p.2)
 */
public class residentmatchmain
{    
    
    //It's the main method of the program
    public static void main(String [] args)
    {
        
        
        
        Resident [] residents = new Resident[10];
                for (int i = 0; i < residents.length; i++)
        {
            residents[i] = new Resident(i + 1, randomNumber(1, 5), randomNumber(1, 5), randomNumber(1, 5));
        }
        
        printArray(residents);
        
        matcher newone = new matcher(residents);
        
        Resident [] best = newone.bestMatch();
        
        best[0].showresident();
        best[1].showresident();
    }

    //Prints all the elements in an array of Residents
    public static void printArray(Resident [] arr)
    {
        for (Resident r: arr)
        {
            System.out.println(r);
        }
    }

    //Generates a random integer between a min and max value 
    public static int randomNumber(int min, int max)
    {
        return (int)(Math.random() * (max - min + 1) + min);
    }
    
}

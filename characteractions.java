
/**
 * Write a description of class characteractions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class characteractions
{
    public static void main(String [] args)
    {
        Character first = new Character("John Wick from Fortnite", "Victory Royale man", 9001, 350, true, false, false, true);
        Character second = new Character("Ninja from Fortnite", "Epic Twitch man", 9, 320, true, true, true, true);
        
        System.out.println(first.floss());
        first.stats();
        second.stats();
        
        Interview firstagain = new Interview(first, second);
        firstagain.comparestrength();
    }
}

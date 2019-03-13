
/**
 * Write a description of class Resident here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Resident
{
    private int sleep, study, social, residentnum;
    public Resident(int resident, int slep, int stody, int socialish)
    {
        residentnum = resident;
        sleep = slep;
        study = stody;
        social = socialish;
    }
    
    public void showresident()
    {
        System.out.println("Resident #" + residentnum);
        System.out.println("    Sleep Habits: " + sleep);
        System.out.println("    Study Habits: " + study);
        System.out.println("    Social Activity: " + social);
    }
    
    public int sleepcall()
    {
        return sleep;
    }
    
    public int studycall()
    {
        return study;
    }
    
    public int socialcall()
    {
        return social;
    }
}

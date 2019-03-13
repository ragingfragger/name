
/**
 * Write a description of class animalmain2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class animalmain2
{
    public static void main (String [] args)
    {
        Animal2 a = new Animal2(true, 7, 6, "Female");
        a.loselegs(1);
        a.eat();
        a.locomote();
        
        System.out.println();
        
        dog2 b = new dog2(true, "male", true, "Yes");
        b.locomote();
        b.eat();
        b.loselegs(0);
        b.wagtail();
        b.bjork();
        
        human2 c = new human2(true, "It", "Jeffrey", true);
        c.sayname();
        c.whine();
    }
}

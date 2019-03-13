
/**
 * Write a description of class matcher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class matcher
{
    
    private Resident [] residents = new Resident[10];
    
    public matcher(Resident [] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            residents [i] = a [i];
        }
    }    
    
    public static double calculatecompscore(Resident a, Resident b)
    {
        int x1, y1, z1, x2, y2, z2, f1, f2, f3;
        x1 = a.sleepcall();
        x2 = b.sleepcall();
        y1 = a.studycall();
        y2 = b.studycall();
        z1 = a.studycall();
        z2 = b.studycall();        
        f1 = Math.abs(x1 - x2);
        f2 = Math.abs(y1 - y2);
        f3 = Math.abs(z1 - z2);
        double returned = Math.abs((f1+f2+f3)/3);
        return returned;
    }
    
    public Resident[] bestMatch()
    {
        Resident [] worst = new Resident[2];   
        int count = 0;
        double placeholder = Math.abs(calculatecompscore(residents[0], residents[1]));

        for (int i = 0; i < (residents.length); i++)
        {
            for (int o = i+1; o < (residents.length); o++)
            {
                    if (calculatecompscore(residents[i], residents[o]) < placeholder)
                    {
                        placeholder = calculatecompscore(residents[i], residents[o]);
                        worst[0] = residents[i];
                        worst[1] = residents[o];
                    }                                    
            }
        }
        return worst;
    }
    
    public Resident[] worstMatch()
    {
        Resident [] worst = new Resident[2];        
        for (int i = 0; i < (residents.length); i++)
        {
            for (int o = 0; o < (residents.length - 1); o++)
            {
                if (calculatecompscore(residents[i], residents[o + 1]) > calculatecompscore(residents[i], residents[o]))
                {
                    worst[0] = residents[i];
                    worst[1] = residents[o+1];
                }
            }
        }
        worst[0].showresident();
        worst[1].showresident();
        return worst;
    }
    
    public Resident bestindividual(Resident a)
    {
        Resident [] worst = new Resident[2];        
        for (int o = 0; o < (residents.length - 1); o++)
        {
            if (calculatecompscore(a, residents[o + 1]) < calculatecompscore(a, residents[o]))
            {
                worst[0] = a;
                worst[1] = residents[o+1];
            }
        }
        worst[0].showresident();
        worst[1].showresident();
        return worst[1];
    }
    
    public Resident worstindividual(Resident a)
    {
        Resident [] worst = new Resident[2];        
        for (int o = 0; o < (residents.length - 1); o++)
        {
            if (calculatecompscore(a, residents[o + 1]) > calculatecompscore(a, residents[o]))
            {
                worst[0] = a;
                worst[1] = residents[o+1];
            }
        }        
        worst[0].showresident();
        worst[1].showresident();
        return worst[1];
    }
}

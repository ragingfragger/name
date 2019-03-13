/**
 * Character class and object creator.
 *
 * @author (Jeremy Rine)
 * @version (2/5/2019)
 */
public class Character
{
    private int tensileStrength, weight;
    private String name, species;
    boolean commitwarcrime, subtotseries, floss, taunt;
    
    public Character(String naewname, String newspecies, int tensile,int weightnumb, boolean commitwar, boolean subto, boolean flo, boolean tau)
    {
        this.name = naewname;
        this.species = newspecies;
        this.tensileStrength = tensile;
        this.weight = weightnumb;
        this.commitwarcrime = commitwar;
        this.subtotseries = subto;
        this.floss = flo;
        this.taunt = tau;
    }
    
    public Character()
    {
        this("Person", "It", 50, 140, true, true, false, false);
    }
    
    public int tensilerespond()
    {
        return tensileStrength;
    }
    
    public String namecall()
    {
        return name;
    }
    
    public String speciescall()
    {
        return species;
    }
    
    public int weightcall()
    {
        return weight;
    }
    
    public boolean warcrimecall()
    {
        return commitwarcrime;
    }
    
    public boolean subcall()
    {
        return subtotseries;
    }
    
    public boolean flosscall()
    {
        return floss;
    }
    
    public boolean tauntcall()
    {
        return taunt;
    }
    
    public String floss()
    {
        String doestheyfloss = name + " of the species " + species;
        if (floss == true)
        {
            doestheyfloss += " does the epic floss.";
        }
        else if (floss == false)
        {
            doestheyfloss += " does not floss, they are too epic for that.";
        }
        return doestheyfloss;
    }

    public void stats()
    {
        System.out.println("Name: " + name);
        System.out.println("specie: " + species);
        System.out.println("Tensile Strength = " + tensileStrength + " MPa");
        System.out.println("weight: " + weight + " lbs");
        if (commitwarcrime == true)
        {
            System.out.println(name + " commits war crimes like a true fortnite twitch streamer.");
        }
        else if (commitwarcrime == false)
        {
            System.out.println(name + " doesn't commit war crimes, like a normie");
        }
        if (subtotseries == true)
        {
            System.out.println(name + " subs to T series like a fool");
        }
        else
        {
            System.out.println(name + " subs to PewDiePie like a boss");
        }
        System.out.println(floss());
        if (taunt == true)
        {
            System.out.println(name + " taunts noobs like a boss");
        }
        else
        {
            System.out.println(name + " says 'Thats how the mafia works'");
        }
    }
}
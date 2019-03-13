
/**
 * Write a description of class walkupticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WalkupTicket extends Ticket
{
    public WalkupTicket(int _numb)
    {
        super(_numb, 50, 0);
    }
    @Override
    public String toString()
    {
        return "Number: " + numb + ", Price: " + price;
    }
}


/**
 * Write a description of class advanceticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdvanceTicket extends Ticket
{
    public AdvanceTicket(int _numb, int _daysbefore)
    {
        super(_numb, 30, 0);
        if(_daysbefore >= 10)
        {
            price = 30;
        }
        else if (_daysbefore < 10)
        {
            price = 40;
        }
    }
    @Override
    public String toString()
    {
        return "Number: " + numb + ", Price: " + price;
    }
}

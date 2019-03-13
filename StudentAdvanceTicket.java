
/**
 * Write a description of class studentadvanceticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentAdvanceTicket extends Ticket
{
    public StudentAdvanceTicket(int _numb, int _daysbefore)
    {
        super(_numb, 20, 0);
        if(_daysbefore >= 10)
        {
            price = 15;
        }
        else if (_daysbefore < 10)
        {
            price = 20;
        }
    }
    
    @Override
    public String toString()
    {
        return "Number: " + numb + ", Price: " + price;
    }
}


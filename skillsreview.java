/**
* Write a description of class skillsreview here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class skillsreview
{
    public static void main(String [] args)
    {
        int [] nums1 = {13, 23, 42, 23, 45, 43};
        int [] nums2 = {12, 3, 2, 43, 123, 3, 4};
        
        System.out.println(findmaxvalue(nums1));
    }
    
    public static int findmaxvalue(int [] x)
    {
        int max = x[0];
        for(int i = 0; i < x.length; i++)
        {
            if(max<x[i])
            {
                max = x[i];
            }
        }
        return max;
    }
    
    public static boolean inorder(int [] x)
    {
        boolean returnstuff = true;
        for(int i = 0; i < (x.length-1); i++)
        {
            if(x[i]>x[i+1])
            {
                returnstuff = false;
            }
        }
        return returnstuff;
    }
    
}
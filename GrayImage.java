/**
 * The GrayImage class for FRQ #4 2012.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GrayImage
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;
    
    /** The two dimensional representation of this image. Guaranteed not to be null.
     *  All values in the array are within the range [BLACK, WHITE], inclusive.
     */
    private int [][] pixelValues;
    
    public GrayImage (int [][] _pixelValues)
    {
        pixelValues = _pixelValues;
    }
    
    public int [][] getPixelValues()
    {
        return pixelValues;
    }
    
    /** @return the total number of white pixels in this image.
     *  Postcondition: this image has not been changed
     */
    public int countWhitePixels()
    {
        /* to be implemented in part (a) */
        int count = 0;
        for(int i = 0; i < pixelValues.length; i++)
        {
            for(int j = 0; j < pixelValues[i].length; j++)
            {
                if(pixelValues[i][j] == 255)
                {
                    count = count + 1;
                }
            }
        }
        return count;  // This is just to allow the code to compile; replace with your code
    }
    
    /** Processes this image in row-major order and decreases the values of each pixel at
     *  position (row, col) by the value of the pixel at position (row + 2, col + 2) if it exists.
     *  Resulting values that would be less than BLACK are replaced by BLACK.
     *  Pixels for which there is no pixel at position (row + 2, col + 2) are unchanged.
     */
    public void processImage()
    {
        /* to be implemented in part (b) */
        for(int i = 0; i < (pixelValues.length-2); i++)
        {
            for(int j = 0; j < (pixelValues[i].length - 2); j++)
            {
                int num = pixelValues[i+2][j+2];
                if(num < pixelValues[i][j])
                {
                    pixelValues[i][j] = pixelValues[i][j] - num;
                }
                else
                {
                    pixelValues[i][j] = 0;
                }
            }
        }
    }
    
    public static void main()
    {
        int [][] sample = {
            {221, 184, 178, 84, 135},
            {84, 255, 255, 130, 84},
            {78, 255, 0, 0, 78},
            {84, 130, 255, 130, 84}
        };
        
        GrayImage test = new GrayImage(sample);
        
        System.out.println("This should print 4: " + test.countWhitePixels());
        
        System.out.println("The original image (refer to FRQ for values):");
        printArray(test.getPixelValues());
        
        test.processImage();
        
        System.out.println("The processed image (refer to FRQ for values):");
        printArray(test.getPixelValues());        
    }
    
    public static void printArray(int [][] arr)
    {
        for (int [] row: arr)
        {
            for (int col: row)
            {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}

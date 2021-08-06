public class Main 
{
    static class Check_Clean //static class//
    {
    
    int Smallest_Number; //initializing variable//
    int Largest_Number; 
    }
    
    static Check_Clean UpperBound_LowerBound(int GivenArray[], int SizeOfArray)  //Method to Find UpperBound And LowerBound//
    {
        Check_Clean object_Check = new Check_Clean(); // instance object of class
        
        int i;
        
        if (SizeOfArray == 1)
        {
            object_Check.Largest_Number = GivenArray[0];
            object_Check.Smallest_Number = GivenArray[0];
            return object_Check;
        }
        
        if (GivenArray[0] > GivenArray[1]) 
        {
            object_Check.Largest_Number = GivenArray[0];
            object_Check.Smallest_Number = GivenArray[1];
        } 
        else 
        {
            object_Check.Largest_Number = GivenArray[1];
            object_Check.Smallest_Number = GivenArray[0];
        }
        
        for (i = 2; i < SizeOfArray; i++) 
        {
            if (GivenArray[i] > object_Check.Largest_Number) 
            {
                object_Check.Largest_Number = GivenArray[i];
            }
            else if (GivenArray[i] < object_Check.Smallest_Number)
            {
                object_Check.Smallest_Number = GivenArray[i];
            }
        }
    
        return object_Check;
    }
    
    public static void main(String args[]) //Main method//
    {
        int GivenArray[] = {1000, 11, 445, 1, 330, 3000}; //declaring Array//
        int SizeOfArray = 6;
        Check_Clean object_Check = UpperBound_LowerBound(GivenArray, SizeOfArray); // passing value of array according to size//
        System.out.printf("\n Smallest Number : %d", object_Check.Smallest_Number);
        System.out.printf("\n Largest Number : %d", object_Check.Largest_Number);
    }
}

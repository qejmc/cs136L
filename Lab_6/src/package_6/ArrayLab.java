package package_6;

public class ArrayLab
{
   
   private final static int LOW_VALUE = 1;
   private final static int HIGH_VALUE = 100;
   
   private static final char COMMA = ',';
   
   private static final int PRECISION = 1;
   
   private static Console_IO_Class conIO = new Console_IO_Class();
   
   public static void main(String[] args)
      {
         //declare variables, array capacity is a variable not a constant
         //add in variables as needed to store the return values
         int capacity = 20;
         int index, min, max;
         double avg;
         
         //declare array
         int[] intArray = new int[capacity];
       
         //for loop using getRandBetween method to
         //initialize array
         for( index = 0; index < intArray.length; index++ )
            {
               intArray[ index ] = getRandBetween( LOW_VALUE, HIGH_VALUE );
            }
         
     
         //call methods to return the values 
         min = calcMin(intArray);
         max = calcMax(intArray);
         avg = calcAverage(intArray);
         
         //use Console IO Class to print min, max, average
         //use a for loop and Console IO Class to print out all
         //elements in the array
         conIO.printString("Min value is: ");
         conIO.printInt(min);
         conIO.printEndline();
         
         conIO.printString("Max value is: ");
         conIO.printInt(max);
         conIO.printEndline();
         
         conIO.printString("Average value is: ");
         conIO.printDouble(avg, PRECISION);
         conIO.printEndline();
         
         conIO.printString("Array values");
         conIO.printEndline();
         printArray(intArray);
      
      }

   public static int getRandBetween( int low, int high )
      {
         int value, range = high - low + 1;
       
         value = (int)( Math.random() * range );
       
         return low + value;
      }

   public static int calcMin( int[] intArray )
      {
        // initialize variables
        int min = intArray[ 0 ];
        int index;
         
        // iterates through numbers to find min
         for(index = 1; index < intArray.length; index++ )
            { 
               if( intArray [index ] < min )
                  { 
                     min = intArray[ index ]; 
                  }
            }
 
       return min;
       
      }

   
   public static int calcMax( int[] intArray )
      {
         int max = intArray[ 0 ];
         int index;

         
          // for loop to calc max
          for(index = 1; index < intArray.length; index++ )
             { 
                // check each number in array
                if( intArray [ index ] > max )                
                   { 
                      max = intArray[ index ]; 
                   }            
             }

       
          return max;
      }

   public static double calcAverage( int[] intArray )
      {
         double average, sum = 0;
         int index;


         // loops through all values to get average
         for(index = 0; index < intArray.length; index++ )
            { 
               sum = sum + intArray[ index ];          
            }
       
         average = sum / intArray.length;
       
       
         // return average
         return average;
      }
   
   public static void printArray(int[] intArray)
      {
         int index;
         
         for(index = 0; index < intArray.length; index++)
            {
               conIO.printInt(intArray[index]);
               conIO.printChar(COMMA);
            }
      }

   
}
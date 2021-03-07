package package_3;

public class GoldenRatio
   {
      //set table characters
      private static final char PIPE = '|';
      private static final String PIPE_SPACE = "| ";
      private static final String SPACE_PIPE = " |";
      private static final char THICK_LINE = '=';
      private static final char THIN_LINE = '-';
      
      //set table widths
      private static final int TABLE_WIDTH = 60;
      private static final int LEFT_COLUMN_WIDTH = 40;
      private static final int RIGHT_COLUMN_WIDTH = 17;
      private static final int TITLE_WIDTH = 52;
      
      //constants for computing golden ratio
      private static final double GOLDEN_RATIO_INVERSE = (Math.sqrt(5)-1)/2;
      private static final int PRECISION = 3;
      
      //newline constant
      private static final int DOUBLE_NEW_LINE = 2;
      
      public static void main(String[] args) 
         {
            //declare and initialize variables
            Console_IO_Class conIO = new Console_IO_Class();
            
            double length, longPart, shortPart;
            
            //show title and thick line
            //method: printString, printEndline(s), printChars
            conIO.printString("COMPUTE GOLDEN RATIO PART OF "
                  + "LINE WITH GIVEN LENGTH:");
            conIO.printEndline();
            conIO.printChars(TITLE_WIDTH, THICK_LINE);
            conIO.printEndlines(DOUBLE_NEW_LINE);
            
            //get input from user
            //method: promptForDouble, preintEndline
            length = conIO.promptForDouble("Enter length of line: ");
            conIO.printEndline();
            
            //calculate long part
            longPart = calcLongPart(length);
            
            //calculate short part
            shortPart = calcShortPart(length);
            
            //display results
            displayResult(longPart, shortPart);
            
         //end main
            
         }
      
      public static double calcLongPart(double length)
         {
            //declare and initialize variables
            double longPart;
            
            //calculate long part
            longPart = length * GOLDEN_RATIO_INVERSE;
            
            //return value
            return longPart;
         }
      
      public static double calcShortPart(double length)
         {
            //declare and initialize variables
            double shortPart, longPart;
            
            //calculate long part
            longPart = calcLongPart(length);
            
            //calculate short part
            shortPart = length - longPart;
            
            //return value
            return shortPart;
            
         }
      
      public static void displayResult(double longPart, double shortPart)
         {
            Console_IO_Class conIO = new Console_IO_Class();
            
             //display result
               //first line, thick line
               //method: printEndline, printChar, printChars
            conIO.printChar(PIPE);
            conIO.printChars(TABLE_WIDTH, THICK_LINE);
            conIO.printChar(PIPE);
            conIO.printEndline();
            
               //show first line of content of table
               //method: printString, printChar, printDouble, printEndline
            conIO.printString(PIPE_SPACE);
            conIO.printString("Long Part", LEFT_COLUMN_WIDTH, "LEFT");
            conIO.printChar(PIPE);
            conIO.printDouble(longPart, PRECISION, 
                  RIGHT_COLUMN_WIDTH, "RIGHT");
            conIO.printString(SPACE_PIPE);
            conIO.printEndline();
            
               //show divider thin line of table
               //method: printChar, printChars, printEndline
            conIO.printChar(PIPE);
            conIO.printChars(LEFT_COLUMN_WIDTH + 1, THIN_LINE);
            conIO.printChar(PIPE);
            conIO.printChars(RIGHT_COLUMN_WIDTH + 1, THIN_LINE);
            conIO.printChar(PIPE);
            conIO.printEndline();
            
               //show second line of content of table
               //method: printString, printChar, printDouble, printEndline
            conIO.printString(PIPE_SPACE);
            conIO.printString("Short Part", LEFT_COLUMN_WIDTH, "LEFT");
            conIO.printChar(PIPE);
            conIO.printDouble(shortPart, PRECISION, 
                  RIGHT_COLUMN_WIDTH, "RIGHT");
            conIO.printString(SPACE_PIPE);
            conIO.printEndline();
            
               //show bottom thick line of table
               //method: printChar, printChars, printEndline
            conIO.printChar(PIPE);
            conIO.printChars(TABLE_WIDTH, THICK_LINE);
            conIO.printChar(PIPE);
         }
      
   }

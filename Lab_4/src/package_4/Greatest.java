package package_4;

public class Greatest
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
      private static final int TITLE_WIDTH = 35;
      
      //precision
      private static final int PRECISION = 3;
      
      //spacing
      private static final int TWO_ENDLINES = 2;
      
      // (static) IO object
      private static Console_IO_Class conIO = new Console_IO_Class();
      
      public static void main(String[] args)
         {
            //declare and initialize variables
            double first, second, third, result;
            
            //show title and thick line
            printTitle();
            
            //get input from user
            first = promptForCoef("Enter first number: ");
            second = promptForCoef("Enter second number: ");
            third = promptForCoef("Enter third number: ");
            
            //get greatest number
            result = getGreatest(first, second, third);
            
            //display results
            displayResult(first, second, third, result);
            
            //end main
            displayProgramEnd();
            
         }
      
      public static double getGreatest(double first, double second, 
            double third)
         {
            double greatest = 0.0;
            
            if(first > second)
               {
                  if(first > third)
                     {
                        greatest = first;
                     }
                  else
                     {
                        greatest = third;
                     }
               }
            else if(second >= first)
               {
                  if(second > third)
                     {
                        greatest = second;
                     }
                  else
                     {
                        greatest = third;
                     }
               }
            
            return greatest;
            
         }
      
      public static void displayResult(double first, double second, 
            double third, double result)
         {
            conIO.printEndline();
            displayLine(THICK_LINE, "SOLID");
            conIO.printEndline();
            displayDataLine("First Number", first);
            displayLine(THIN_LINE, "BROKEN");
            conIO.printEndline();
            displayDataLine("Second Number", second);
            displayLine(THIN_LINE, "BROKEN");
            conIO.printEndline();
            displayDataLine("Third Number", third);
            displayLine(THICK_LINE, "SOLID");
            conIO.printEndline();
            displayDataLine("Result", result);
            displayLine(THICK_LINE, "SOLID");
            
         }
      
      public static int promptForCoef(String promptString)
         {
            return conIO.promptForInt(promptString);
         }
      
      public static void displayProgramEnd()
         {

            conIO.printEndlines(TWO_ENDLINES);
            conIO.printString("End Program");
         }
      
      public static void printTitle()
         {

            conIO.printString("FIND THE GREATEST OF THREE NUMBERS:");
            conIO.printEndline();
            conIO.printChars(TITLE_WIDTH, THICK_LINE);
            conIO.printEndlines(TWO_ENDLINES);
            
         }
      
      public static void displayLine(char lineChar, String type)
         {

            if(type == "BROKEN")
               {
                  conIO.printChar(PIPE);
                  conIO.printChars(LEFT_COLUMN_WIDTH + 1, lineChar);
                  conIO.printChar(PIPE);
                  conIO.printChars(RIGHT_COLUMN_WIDTH + 1, lineChar);
                  conIO.printChar(PIPE);
               }
            else if(type == "SOLID")
               {
                  conIO.printChar(PIPE);
                  conIO.printChars(TABLE_WIDTH, lineChar);
                  conIO.printChar(PIPE);
               }
         }
      
      public static void displayDataLine(String description, double number)
         {
            
            conIO.printString(PIPE_SPACE);
            conIO.printString(description, LEFT_COLUMN_WIDTH, "LEFT");
            conIO.printChar(PIPE);
            conIO.printDouble(number, PRECISION, RIGHT_COLUMN_WIDTH, "RIGHT");
            conIO.printString(SPACE_PIPE);
            conIO.printEndline();
         }
   }

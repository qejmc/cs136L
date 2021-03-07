package package_5;

public class InvestmentCalculator 
   {

      // number compounds per year
      private static int NUM_COMPOUNDS_PER_YEAR = 1;
   
      // set table characters
      private static final char PIPE = '|';
      private static final String PIPE_SPACE = "| ";
      private static final String SPACE_PIPE = " |";
      private static final char THICK_LINE = '=';
      private static final char THIN_LINE = '-';
   
      // set table widths
      private static final int TABLE_WIDTH = 60;
      private static final int LEFT_COLUMN_WIDTH = 40;
      private static final int RIGHT_COLUMN_WIDTH = 17;
      private static final int TITLE_WIDTH = 22;
      private static final int DOUBLE_ENDLINE = 2;
      
      // calculation constants
      private static final double RULE_CONSTANT = 72;
   
      // precision
      private static final int PRECISION = 3;
   
      // (static) IO object
      private static Console_IO_Class conIO = new Console_IO_Class();
   
      public static void main(String args[])
         {
            //Initialize varibales
            double principle, rate, total, doublingPeriod;
            int years;
            
            //Print title
            //Method: printTitle
            printTitle();
            
            //Prompt user for principle, rate of return, and the time
               //Prompt user for principle
               //Method: promptForDouble
            principle = conIO.promptForDouble("Enter the original "
                  + "investment: ");
               //Prompt user for rate of return
               //Method: promptForDouble
            rate = conIO.promptForDouble("Enter the rate of return in %: ");
               //Prompt user for time
               //Method: promptForInt
            years = conIO.promptForInt("Enter the number of years: ");
            
            //Find principle + compounded interest
            //Method: computeTotal
            total = computeTotal(principle, rate, years, 
                  NUM_COMPOUNDS_PER_YEAR);
            
            //Find approximate doubling period
            //Method: computeDoublingPeriod
            doublingPeriod = computeDoublingPeriod(rate);
   
            //Print to user
            //Method: displayResult
            displayResult(principle, total, doublingPeriod);
   
         }
   
      /*
      Name: printTitle
      Process: displays the program title on the monitor
      Method Input/Parameters: none
      Method Output/Parameters: none
      Method Output/Returned: none
      Device Input/Keyboard: none
      Device Output/Monitor: title displayed
      Dependencies: Console IO Class tools
      */
      public static void printTitle()
         {
            //Print program title (line 1)
            //Methods: printString, printEndline
            conIO.printString("INVESTMENT CALCULATOR:");
            conIO.printEndline();
            
            //Print separating bar (line 2)
            //Methods: printChars, printEndlines
            conIO.printChars(TITLE_WIDTH, THICK_LINE);
            conIO.printEndlines(DOUBLE_ENDLINE);
            
         }
      
      /*
      Name: computeTotal
      Process: computes the total
      Method Input/Parameters: principle (double), rate of return (double),
         years (int), number of times compounded anually (int)
      Method Output/Parameters: none
      Method Output/Returned: total
      Device Input/Keyboard: none
      Device Output/Monitor: none
      Dependencies: Math class
      */
      public static double computeTotal(double principle, double rate, 
            int years, int numCompoundPerYear) 
         {
            
            // Transforms % to decimal
            rate = rate / 100;
            
            //Calculates r/n
            double rateUnit = rate / numCompoundPerYear;
            
            //Calculates value in parenthesis
            double parenthesized = 1 + rateUnit;
      
            //Calculates the total interest
            //Method: Math.pow
            double totalInterest = Math.pow(parenthesized, years * 
                  numCompoundPerYear);
            
            //Returns the total
            return principle * totalInterest;
   
         }
   
      /*
      Name: computeDoublingPeriod
      Process: computes the doubling period using the Rule of 72
      Method Input/Parameters: rate of return (double)
      Method Output/Parameters: none
      Method Output/Returned: doubling period
      Device Input/Keyboard: none
      Device Output/Monitor: none
      Dependencies: none
      */
      public static double computeDoublingPeriod(double rate)
         {
            return RULE_CONSTANT / rate;
   
         }
         
      /*
      Name: displayResult
      Process: displays the result of the calculations
      Method Input/Parameters: principle (double), total (double), doubling
         period (double)
      Method Output/Parameters: none
      Method Output/Returned: none
      Device Input/Keyboard: none
      Device Output/Monitor: result table
      Dependencies: Console IO Class tools
      */
      public static void displayResult(double principle, double total, 
            double doublingPeriod)
         {
            //Methods: printEndline, displayLine, displayDataLine
            conIO.printEndline();
            displayLine(THICK_LINE, "SOLID");
            conIO.printEndline();
            displayDataLine("Principle", principle);
            displayLine(THICK_LINE, "SOLID");
            conIO.printEndline();
            displayDataLine("Principle + Compounded Interest", total);
            displayLine(THIN_LINE, "BROKEN");
            conIO.printEndline();
            displayDataLine("Approximate Doubling Period", doublingPeriod);
            displayLine(THICK_LINE, "SOLID");
   
         }
      
      /*
      Name: displayLine
      Process: displays a line, either broken or solid
      Method Input/Parameters: character line is filled with (char), "BROKEN"
         or "SOLID" (String)
      Method Output/Parameters: none
      Method Output/Returned: none
      Device Input/Keyboard: none
      Device Output/Monitor: divider line
      Dependencies: Console IO Class tools
      */
      public static void displayLine(char lineChar, String type)
         {
            //If method is called to display broken line
            if(type == "BROKEN")
               {
                  //Prints broken line
                  //Methods: printChar, printChars
                  conIO.printChar(PIPE);
                  conIO.printChars(LEFT_COLUMN_WIDTH + 1, lineChar);
                  conIO.printChar(PIPE);
                  conIO.printChars(RIGHT_COLUMN_WIDTH + 1, lineChar);
                  conIO.printChar(PIPE);
               }
            //Otherwise, if method is called to display solid line
            else if(type == "SOLID")
               {
                  //Prints solid line
                  //Methods: printChar, printChars
                  conIO.printChar(PIPE);
                  conIO.printChars(TABLE_WIDTH, lineChar);
                  conIO.printChar(PIPE);
               }
         }
      
      /*
      Name: displayDataLine
      Process: displays a line of data in the table
      Method Input/Parameters: description (String), the value (double)
      Method Output/Parameters: none
      Method Output/Returned: none
      Device Input/Keyboard: none
      Device Output/Monitor: divider and data line
      Dependencies: Console IO Class tools
      */
      public static void displayDataLine(String description, double number)
         {
            //Methods: printString, printCHar, printDouble, printEndline
            conIO.printString(PIPE_SPACE);
            conIO.printString(description, LEFT_COLUMN_WIDTH, "LEFT");
            conIO.printChar(PIPE);
            conIO.printDouble(number, PRECISION, RIGHT_COLUMN_WIDTH, "RIGHT");
            conIO.printString(SPACE_PIPE);
            conIO.printEndline();
         }
   
   }

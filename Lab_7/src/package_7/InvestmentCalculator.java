package package_7;

public class InvestmentCalculator 
{
    // finance constants
    private static final int NUM_COMPOUNDS_PER_YEAR = 1;
    private static final int RULE_OF_72_FACTOR = 72;
    
    // default constructor default values
    private static final double DEFAULT_RATE = 0.05;
    private static final double DEFAULT_PRINCIPLE = 100000;
    private static final int    DEFAULT_YEARS = 30;
    
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

   // precision
   private static final int PRECISION = 3;

   // member variables
   private double principle;
   private double rate;
   private int    years;

   
   /**
    * Default constructor
    */
   public InvestmentCalculator()
      {
           principle = DEFAULT_PRINCIPLE;
           rate = DEFAULT_RATE;
           years = DEFAULT_YEARS;
      }
   
   
   /**
    * Initialization Constructor
    * 
    * @param principle Initial investment
    * @param rate Rate of return
    * @param years Number of years compounded
    */
   public InvestmentCalculator(double principle, double rate, int years)
      {
           this.principle = principle;
           this.rate = rate / 100;
           this.years = years;
      }

   
   /**
    * Copy constructor
    * 
    * @param copied Object to copy from
    */
   public InvestmentCalculator(InvestmentCalculator copied)
      {
           this.principle = copied.principle;
           this.rate = copied.rate;
           this.years = copied.years;
                 
      }

   
   /**
    * Computes number of years in which the principle doubles by compounding 
    * interest
    * 
    * @return Returns number of years
    */
   public double computeDoublingPeriod()
      {
         return RULE_OF_72_FACTOR / (rate * 100);
      }

   
   /**
    * Computes Computes the overall total, after the principle has compounded 
    * for the given number of years at the given rate of return
    * 
    * @return Returns the overall total
    */
   public double computeTotal() 
      {
         //Calculates r/n
         double rateUnit = rate / NUM_COMPOUNDS_PER_YEAR;
         
         //Calculates value in parenthesis
         double parenthesized = 1 + rateUnit;
   
         //Calculates the total interest
         //Method: Math.pow
         double totalInterest = Math.pow(parenthesized, years * 
               NUM_COMPOUNDS_PER_YEAR);
         
         //Returns the total
         return principle * totalInterest;
      }

   /**
    * Displays the results in table format
    */
   public void displayResult() 
      {
         Console_IO_Class conIO = new Console_IO_Class();
         
         double doublingPeriod = computeDoublingPeriod();
         double total = computeTotal();
         
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
         
         conIO.printEndline();
         conIO.printEndline();
         
         
      }
   
   public void displayLine(char lineChar, String type)
      {
         Console_IO_Class conIO = new Console_IO_Class();
         
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
   
   public void displayDataLine(String description, double number)
      {
         Console_IO_Class conIO = new Console_IO_Class();
         
         //Methods: printString, printCHar, printDouble, printEndline
         conIO.printString(PIPE_SPACE);
         conIO.printString(description, LEFT_COLUMN_WIDTH, "LEFT");
         conIO.printChar(PIPE);
         conIO.printDouble(number, PRECISION, RIGHT_COLUMN_WIDTH, "RIGHT");
         conIO.printString(SPACE_PIPE);
         conIO.printEndline();
      }

}
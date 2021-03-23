package package_7;

/**
 * Driver to test objects of type InvestmentCalculator
 * 
 * @author Dr.-Ing. Wolf-Dieter Otte
 */
public class InvestmentCalculatorMain
{
   // Constant that has the char to construct "thick" lines 
   public static final char THICK_LINE = '=';
   
   public static final int DOUBLE_ENDLINE = 2;
   public static final int TITLE_WIDTH = 22;
   
   // io object to be used in main()
   public static Console_IO_Class conIO = new Console_IO_Class();
      
   /**
    * Get things started ...
    * @param args Command line arguments, not used
    */
   public static void main(String args[]) 
   {
        // declare and initialize variables
      double principle, rate;
      int years;
      
      InvestmentCalculator calcDefault = null;
      InvestmentCalculator calcInit    = null;
      InvestmentCalculator calcCopy    = null;

        // show title and thick line
        // method: printString, printEndline, printChars
        // ...

      conIO.printString("INVESTMENT CALCULATOR:");
      conIO.printEndline();
      
      conIO.printChars(TITLE_WIDTH, THICK_LINE);
      conIO.printEndlines(DOUBLE_ENDLINE);
        
        // ============== Testing Default Constructor ==============
        
        // Create object of type InvestmentCalculator by invoking default 
         // constructor
      // ...
      calcDefault = new InvestmentCalculator();
      
      // Print control message
      System.out.println("\nTesting Default Constructor");
      
      // Print out result
      // ...
      calcDefault.displayResult();
      
        // ============== Testing Initialization Constructor ==============

      // get input from user
        // method: promptForDouble, promptForInt
      principle  = conIO.promptForDouble( "Enter the original investment: " );
      rate       = conIO.promptForDouble( "Enter the rate of return in %: " );
      years      = conIO.promptForInt   ( "Enter the number of years: " );

        // Create object of type InvestmentCalculator by invoking initialization
         // constructor
        // ...
      calcInit = new InvestmentCalculator(principle, rate, years);
      
      // Print control message
      System.out.println("\nTesting Initialization Constructor");

      // Print out result
      // ...
      calcInit.displayResult();

      
        // ============== Testing Copy Constructor ==============

        // Create object of type InvestmentCalculator by invoking copy 
      //constructor
        // We will use the object created by the initialization constructor to 
      //be copied from ...
        // ...
      calcCopy = new InvestmentCalculator(calcInit);
      
      // Print control message
      System.out.println("\nTesting Copy Constructor");

      // Print out result
      // ...
      calcCopy.displayResult();

   }
}
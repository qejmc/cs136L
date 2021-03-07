package package_1;

public class ImageMakerClassLab
   {
      
      public static final char CROSS = 'x';
      public static final char SPACE = ' ';
      
      public static final int LENGTH = 10;
      public static final int INNER_LENGTH = 8;
      public static final int BORDER_WIDTH = 1;
      
      public static void main(String[] args)
         {
            //Handler
            
            Console_IO_Class conIO = new Console_IO_Class();
            
            //Output
            
            // Line 1
            
            conIO.printChars(LENGTH, CROSS);
            conIO.printEndline();
            
            //Line 2
            
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printChars(INNER_LENGTH, SPACE);
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printEndline();
            
            //Line 3
            
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printChars(INNER_LENGTH, SPACE);
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printEndline();
            
            //Line 4
            
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printChars(INNER_LENGTH, SPACE);
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printEndline();
            
            //Line 5
            
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printChars(INNER_LENGTH, SPACE);
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printEndline();
            
            //Line 6
            
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printChars(INNER_LENGTH, SPACE);
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printEndline();
            
            //Line 7
            
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printChars(INNER_LENGTH, SPACE);
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printEndline();
            
            //Line 8
            
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printChars(INNER_LENGTH, SPACE);
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printEndline();
            
            //Line 9
            
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printChars(INNER_LENGTH, SPACE);
            conIO.printChars(BORDER_WIDTH, CROSS);
            conIO.printEndline();
            
            //Line 10
            
            conIO.printChars(LENGTH, CROSS);
            conIO.printEndline();

         }

   }

import java.util.Scanner; 

class Main {
  
  public static void main(String[] args) {
    
    int score = 0;

    System.out.println("Welcome to the Primitive Data Types Quiz! What is your name?");
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
//---------------------------------------------------
    System.out.println(" #1: What data type deals with whole numbers?");
    String integer = scan.next();

    if(integer.equals("integer"))
    {
      System.out.println("Correct +1 point(s)");
      score++;
    }else{
      System.out.println("Incorrect +0 point(s)");
    }
//---------------------------------------------------  
   System.out.println(" #2: What data type deals with True or False?");
    String trueFalse = scan.next();

    if(trueFalse.equals("boolean"))
    {
      System.out.println("Correct +1 point(s)");
      score++;
    }else{
      System.out.println("Incorrect +0 point(s)");
    }
//------------------------------------------------------- 
  System.out.println(" #3: The data type Double stores how many decimal digits?");
    int digits = scan.nextInt();

    if(digits == 15)
    {
      System.out.println("Correct +1 point(s)");
      score++;
    }else{
      System.out.println("Incorrect +0 point(s)");
    }
//------------------------------------------------------  
  System.out.println(" #4: The data type Float stores __________ numbers.");
    String fraction = scan.next();

    if(fraction.equals("fractional"))
    {
      System.out.println("Correct +2 point(s)");
      score++;
    }else{
      System.out.println("Incorrect +0 point(s)");
    }
//------------------------------------------------------  
   System.out.println(" #5: The data type Char stores a single ____________.");
    String character = scan.next();

    if(character.equals("character"))
    {
      System.out.println("Correct +2 point(s)");
      score++;
    }else{
      System.out.println("Incorrect +0 point(s)");
    }
//------------------------------------------------------  
  System.out.println(" #6: True or False: The data type Long can store whole numbers like 1,000,000 to -1,000,000.");
    boolean bigNumbers = scan.nextBoolean();

    if(bigNumbers)
    {
      System.out.println("Correct +1 point(s)");
      score++;
    }else{
      System.out.println("Incorrect +0 point(s)");
    }
//------------------------------------------------------
 System.out.println(" #7: True or False: The data type Short can store whole numbers like -32,768 to 32,767.");
    boolean smallNumbers = scan.nextBoolean();

    if(smallNumbers)
    {
      System.out.println("Correct +1 point(s)");
      score++;
    }else{
      System.out.println("Incorrect +0 point(s)");
    } 
//-------------------------------------------------------
  System.out.println(" #8: True or False: The data type Byte can store whole numbers like -128 to 127.");
    boolean smallerNumbers = scan.nextBoolean();

    if(smallerNumbers)
    {
      System.out.println("Correct +1 point(s)");
      score++;
    }else{
      System.out.println("Incorrect +0 point(s)");
    } 
//------------------------------------------------------  
   System.out.println(" #9: How many Primitive Data Types are there?");
    int primitive = scan.nextInt();

    if(primitive == 8)
    {
      System.out.println("Correct +1 point(s)");
      score++;
    }else{
      System.out.println("Incorrect +0 point(s)");
    }
//------------------------------------------------------
System.out.println("Your score out of 9 is " + score + "/9."); 
    }
}




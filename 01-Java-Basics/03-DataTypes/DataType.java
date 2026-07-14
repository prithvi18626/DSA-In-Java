public class DataType{
  public static void main(String[] args){

    //Primitive Numeric(Integral) DataType 
    byte num1 = 127;        //(1byte)(-128 to 127)
    short num2 = 32767;     //(2byte)(-32768 to 32767)
    int num3 = 2147483647;  //(4byte)(-2^31 to 2^31-1)
    long num4 = 100;        //(8byte)(-2^63 to -263-1)
    float num5 = 3.142436f;       //(4byte)(_+ 3.4*10^38)
    double num6 = 3.214243234234245;      //(8byte)(_+ 1.7*10^308)

    //Primitive Character DataType
    char firstCharacter = 'A'; //(2byte)(0 to 65535)
    
    //Primitive Boolean DataType
    boolean eligibleToVote = true;



    //Printing Statements
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(num5);
    System.out.println(num6);
    System.out.println(firstCharacter);
    System.out.println("ASCII " +(firstCharacter+2));
    System.out.println(eligibleToVote);
  }
}
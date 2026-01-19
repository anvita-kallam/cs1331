// I worked on the assignment alone, using only course-provided materials.
public class PrimitiveOperations {
    public static void main(String[] args) {
       //integer and double stuff
        int myInteger = 67;
        double myDouble = 6.7;
        System.out.println(myInteger);
        System.out.println(myDouble);

        //operations
        double product = myInteger * myDouble;
        System.out.println(product);
        double floatMyInteger = (double) myInteger;
        System.out.println(floatMyInteger);
        int integerMyDouble = (int) myDouble;
        System.out.println(integerMyDouble);
        char myChar = 'A';
        System.out.println(myChar);
        myChar = (char) (myChar + 32);
        System.out.println(myChar);
    }
}

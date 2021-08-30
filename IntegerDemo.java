/**
 * IntegerDemo
 */
public class IntegerDemo {

    public static void main(String[] args) {

        /**
         * byte : 8 bit - range (-128 to 128), useful while working with raw binary 
         * data or stream of data
         */        
        byte a = 10;

        /**
         * short : 16 bit - range (–32,768 to 32,767), least used in Java,
         * can also be used to save memory.
         */
        short s = 10000;

        /**
         * int : 32 bit - range (–2,147,483,648 to 2,147,483,647).
         * Most commonly used.
         */
        int lightspeed = 186000;

        /**
         * long : 64 bit - range (quite large, encompassed big numbers)
         */
        long days;
        long seconds;
        long distance;

        days = 1000; 
        seconds = days * 24 * 60 * 60; // convert to seconds
        distance = lightspeed * seconds; // compute distance
        System.out.print("In " + days + " days light will travel about " + distance + " miles.");
        System.out.println("----------------------------------------");
        System.out.println("Byte - " + a);
        System.out.println("Short - " + s);
    }
}
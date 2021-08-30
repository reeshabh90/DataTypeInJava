public class FloatDemo {
    public static void main(String[] args) {
        
        /**
         * float : 32 bit - range (unlimited)
         * Specifies Single precison values.
         * Is not recommended for getting precise values.
         */
        float highTemp = 23.4f; 
        System.out.println("float value " + highTemp);
        System.out.println("----------------------");

        /**
         * double : 64 bit - range (unlimited)
         * Commonly used, double precison faster on modern processor.
         * Recommended for maintaining accuracy
         */
        double pi, rad, area;
        rad = 10.8; // radius of circle
        pi = 3.1416; // pi, approx value

        area = pi * rad * rad;
        System.out.println("Area of circle is " + area);
    }
}

public class TypesDemo {
    public static void main(String[] args) {
/*      byte b = 1;
        short s = 1;
        int i = 77;
        long l = 8_000_000_000L;
        float f = 9.99f;
        double d = 367.78;
        char c = 'N';
        boolean j =  true;

        System.out.println("b " + b);
        System.out.println("s " + s);
        System.out.println("i " + i);
        System.out.println("l " + l);
        System.out.println("f " + f);
        System.out.println("d " + d);
        System.out.println("c " + c);
        System.out.println("j " + j);


        System.out.println();
        System.out.println("j " + j+ "\ns " + s + "\ni " + i );

        int u = Integer.MAX_VALUE;
        System.out.println("u " + u);
*/
        System.out.println("2:");
        byte b2 = Byte.MIN_VALUE;
        byte b3 = Byte.MIN_VALUE;

                System.out.println("byte:");
                System.out.println("Min: " + b2);
                System.out.println("Max: " + b3);

                System.out.println("\nshort:");
                System.out.println("Min: " + Short.MIN_VALUE);
                System.out.println("Max: " + Short.MAX_VALUE);

                System.out.println("\nint:");
                System.out.println("Min: " + Integer.MIN_VALUE);
                System.out.println("Max: " + Integer.MAX_VALUE);

                System.out.println("\nlong:");
                System.out.println("Min: " + Long.MIN_VALUE);
                System.out.println("Max: " + Long.MAX_VALUE);

                System.out.println("\nfloat:");
                System.out.println("Min: " + Float.MIN_VALUE);
                System.out.println("Max: " + Float.MAX_VALUE);

                System.out.println("\ndouble:");
                System.out.println("Min: " + Double.MIN_VALUE);
                System.out.println("Max: " + Double.MAX_VALUE);



        System.out.println("\n3:");
        int i = Integer.MAX_VALUE;
        i = i + 1;
        System.out.println(i );


        System.out.println("\n4:");
        int a = 7;
        int b = 8;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
        System.out.println('a' + " " + 'b');

    }
}
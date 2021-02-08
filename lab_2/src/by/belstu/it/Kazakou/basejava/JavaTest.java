package by.belstu.it.Kazakou.basejava;

import java.lang.constant.Constable;
import  by.belstu.it.Kazakou.basejava.WrapperString;

/**
 * @author Ilya ads
 * @version 1.0
 *
 * */
public class JavaTest {

    static int sint;
    final int cOne = 1;
    public final int cTwo = 2;
    public static final int cThree = 3;



    public static void main(String[] args) {

/**
 * @return 
 * @throws
 * @param args
 * */
        char sym = 'c';
        int intNum = 25;
        short shortNum = 25;
        byte b = 25;
        long l = 4000;
        boolean bl = false;

        System.out.println("Str" + intNum);
        System.out.println("Str" + 2.3);
        System.out.println("Str" + sym);
        System.out.println("Static: "+sint);
        b +=intNum;
        intNum = (int) (3.6 + l);
        l = Math.abs(intNum + 2147483647);

        bl = false && true;
        bl = false ^ true;

        long x1 = 9223372036854775807L;
        long x = 0x7ffffffffffL;

        char a1 = 'a';
        char a2 =  '\u0061';
        char a3 = 97;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a1 + a2 + a3);

        System.out.println( 3.45 % 2.4);
        System.out.println(1.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(Math.log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));

        System.out.println(Math.PI +" " + Math.E+ " rOUND: "+Math.round(Math.PI) + " "+Math.round(Math.E));
        System.out.println(Math.min(Math.PI,Math.E));
        System.out.println(Math.random());

        Boolean boolVar = new Boolean(true);
        Integer intVar = new Integer(60);
        intVar = intVar << 2;
        System.out.println(Long.MAX_VALUE + " " + Long.MIN_VALUE);
        System.out.println(Double.MAX_VALUE + " " + Double.MIN_VALUE);

        //for byte
        int varUnbox = new Integer(8);
        Integer varBox = 5;

        System.out.println(Integer.parseInt("2")+ " " +Integer.toHexString(2) +
                " " + Integer.compare(2,2) + " " + Integer.toString(27)+" "+Integer.bitCount(2));


        String s34 = "2345";
        String s35 = "2345";
        int strToInt1 = new Integer(s34);
        int strToInt2 = Integer.valueOf(s34);
        int strToInt3 = Integer.parseInt(s34);

        byte bArr[] = s34.getBytes();
        String str34 = bArr.toString();

        Boolean firstWay =  Boolean.valueOf("true");
        Boolean secondWay  =Boolean.parseBoolean("true");

        System.out.println(s34 == s35 + " " + s34.equals(s35) + " " + s34.compareTo(s35));
        s35 = null;
       // System.out.println(s34 == s35 + " " + s34.equals(s35) + " " + s34.compareTo(s35));

        String words = "New day for new bugs";
        System.out.println(words.split(" "));
        System.out.println(words.contains("day"));
        System.out.println(words.hashCode());
        System.out.println(words.length());
        System.out.println(words.replace("bugs","completed project" ));

        char[][] c1;
        char[] c2[]  = new char[2][];
        c2[0] = new char[]{'s','s'};
        c2[1] = new char[]{'f','g'};

        char c3[][]= new char[2][];
        c3[0] = new char[]{'s','s'};
        c3[1] = new char[]{'f','g'};

        c1  = new char[3][];
        c1[0] = new char[]{'1'};
        c1[1] = new char[]{'1','2'};
        c1[2] = new char[]{'1','2','3'};

        System.out.println(c1.length + " " + c1[0].length);

        boolean comRez = c2 ==c3;
        c2 = c3;

        for (char[] arr1:c2
             ) {
            System.out.println(arr1);
        }

        WrapperString ws = new WrapperString("ser");
        WrapperString ss = new WrapperString("sdr")
        {

            @Override
            public void replace(char oldchar, char newChar) {
                super.replace(oldchar, newChar);
                System.out.println("Hello from Anonymus");
            }
            public void delete(char newchar)
            {
                System.out.println("Delete "+ newchar);
            }
        };


    }
}

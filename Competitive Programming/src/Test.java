import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) throws Exception{

        /*
        What is the output by Q1?

        int event = 0XAbCdEf;
        long typeof = 076543210;
        short ulong = 0b10101010;
        System.out.println(event + typeof + ulong); //Q1

        A. 26435165
        B. 27694369 <<
        C. 28953574
        D. 30129023
        E. There is no output due to a compile error
        */

        /*
        What is the output by Q2?

        double decimal = 3.00;
        float fixed = 3.0;
        int is = 3;
        long lock = 3;

        System.out.println(decimal + fixed + is + lock); //Q2

        A. 12
        B. 12.0
        C. 12.00
        D. There is no output due to a compile error <<
        E. There is no output due to a runtime error
        */

        /*
        What is the output by Q3?
        Note: e's indicate spaces

        short ushort = 0;
        byte sbyte = 0;

        System.out.printf("%5.2s %10d",ushort,sbyte); //Q3

        A. %5.2s %10d
        B. eeee0eeeeeeeeee0 <<
        C. e0.00eeeeeeeeee0
        D. There is no output due to a compile error
        E. There is no output due to a runtime error
        */

        /*
        What is the output by Q4?

        String best = "Falcons Are The Best";
        //Q4
        System.out.print(best.length() + " ");
        System.out.print(best.beginsWith("Falcons") + " ");
        System.out.print(best.endsWith("best"));

        A. 17 true true
        B. 17 true false
        C. 20 true true
        D. 20 true false
        E. There is no output due to a compile error <<
        */

        /*
        Which one of these will make Q5 output "false true"?

        // Code to initialize a, b, c, and d
        System.out.println((a ^ b | c && d) + " " + (a || b & c ^ d)); //Q5

        I.
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        II.
        boolean a = false;
        boolean b = true;
        boolean c = false;
        boolean d = true;
        III.
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        A. I and II
        B. I and III <<
        C. II and III
        D. I, II and III
        E. There is no output due to a compile error
        */

        /*
        Which of these is closest to the output by Q6?

        double pi = Math.PI;
        pi = Math.sin(pi/2);
        pi = Math.cos(pi/3);
        pi = Math.tan(pi/4);
        pi = Math.asin(pi/5);
        pi = Math.acos(pi/6);
        pi = Math.atan(pi/7);
        System.out.println(pi); //Q6

        A. 0.0
        B. 0.1
        C. 0.2 <<
        D. 0.3
        E. 0.4
        */

        /*
        What is the output by Q7?

        long lost = 0;
        System.out.println((lost++ == 0)?(--lost > 0)?lost++:--lost:(--lost < 0)?++lost:lost--); // Q7

        A. -2
        B. -1 <<
        C. 0
        D. 1
        E. There is no output due to a compile error
        */

        /*
        What is the output by Q8?

        short checked = 0;
        for (int i = 1; i < 2021; i++)
            if ((Math.floor(2018/i) + Math.ceil(2019/i) + Math.round(2020/i)) % 4 == 0)
                checked++;
        System.out.println(checked); // Q8

        A. 184 <<
        B. 185
        C. 186
        D. 187
        E. There is no output due to a compile error
        */

        /*
        What is the output by Q9?

        float ing = (int)Math.random() * 10;
        System.out.println(ing); //Q9

        A. 0.0 <<
        B. 0
        C. Output can't be determined until runtime
        D. There is no output due to a compile error
        E. There is no output due to a runtime error
        */

        /*
        What is the output by Q10?

        byte[] synchronized = {1,2,3,4,5};
        while (synchronized[3] != 0)
        {
            synchronized[0] += synchronized[1];
            synchronized[1] -= synchronized[2];
            synchronized[2] *= synchronized[3];
            synchronized[3] /= synchronized[4];
            synchronized[4] %= synchronized[0];
        }
        System.out.println(synchronized); //Q10

        A. [3, -1, 12, 0, 2]
        B. [1, -13, 0, 0, 0]
        C. Output can't be determined until runtime
        D. There is no output due to an infinite loop
        E. There is no output due to a compile error <<
        */

        /*
        Which of the following could replace <11*> so the code runs without error?

        File doesTheFileNameReallyMatter = new File("n.txt");
        Scanner moreUsefulThanBufferedReader = new Scanner(doesTheFileNameReallyMatter);
        float iCanNotBelieveYouAreReadingThis = moreUsefulThanBufferedReader.<11*>;

        I.
        nextInt()
        II.
        nextByte()
        III.
        nextLong()

        A. I and II
        B. I and III
        C. II and III
        D. I, II, and III <<
        E. None of the Above
        */

        /*
        What is the output by Q12?

        int operator = 0;
        for (int pass = 0; pass < 2021; pass++)
        {
            switch (++pass % 4) {
                case 0:
                    operator += 1;
                case 1:
                    operator += 2;
                case 2:
                    operator += 3;
                case 3:
                    operator += 4;
            }
        }
        System.out.println(operator); //Q12

        A. 2021
        B. 4066
        C. 6574 <<
        D. 8595
        E. There is no output due to a compile error
        */

        /*
        What is the correct order of precedence of the following operators?

        I. ++ (prefix)
        II. () (cast)
        III. -- (postfix)

        A. I, II, III
        B. I, III, II
        C. II, I, III
        D. III, I, II <<
        E, III, II, I
        */

        /*
        What is the output by Q14?

        System.out.println(Character.MAX_RADIX + Byte.MAX_VALUE + Double.MAX_EXPONENT + Integer.SIZE + Float.BYTES + Short.MAX_VALUE); //Q14

        A. 33957
        B. 33973
        C. 33989 <<
        D. 34005
        E. 34021
        */

        /*
        What is the output by Q15?

        ArrayList <Integer> as = new ArrayList<>();
        as.add(2019);
        as.add(2020);
        as.add(2021);
        as.add(0,as.get(0));
        as.add(4,as.set(0,as.get(2)));
        as.add(2,as.remove(as.get(1)));
        as.remove(as.set(1,2020));
        as.remove(as.set(2,as.get(1)));

        System.out.println(as); //Q15

        A. [2019, 2020, 2020, 2019]
        B. [2020, 2019, 2019, 2019]
        C. [2020, 2021, 2019, 2021]
        D. [2019, 2021, 2021, 2019]
        E. There is no output due to a compile error <<
        */

        /*
        What is the output by Q16?

        char coal = '!';
        //Q16
        System.out.print(++coal + " ");
        System.out.print((char)(coal-- + 6) + " ");
        System.out.print((char)(27 + --coal) + " ");

        A. ! ' :
        B. " ( ; <<
        C. " ( <
        D. " ) <
        E. " ' ;
        */

        /*
        What is the output by Q17?

        String[][] except = {{"Y","O","U"},{"W","O","N","'","T"},{"A","N","S","W","E","R"},{"T","H","I","S"}};
        System.out.println(Arrays.toString(except)); //Q17

        A. YOU WON'T ANSWER THIS
        B. Y O U W O N ' T A N S W E R T H I S
        c. [[Y, O, U], [W, O, N, ', T], [A, N, S, W, E, R], [T, H, I, S]]
        D. {{"Y","O","U"},{"W","O","N","'","T"},{"A","N","S","W","E","R"},{"T","H","I","S"}}
        E. Output can't be determined until runtime <<
        */

        /*
        What is the output by Q18?

        System.out.println(1895^2930|4949&1064); //Q18

        A. 2852
        B. 2998
        C. 3093 <<
        D. 3124
        E. 3215
        */

        /*
        Which of these will return 1?

        I. enu(21)
        II. enu(1596)
        III. enu(9659811)

        public static byte enu(int ref)
        {
            return ref % 7 + ref % 5 + ref % 3;
        }

        A. I only
        B. I and II
        C. I and III
        D. I, II, and III <<
        E. None of the above

        */

        /*
        What is the output by Q20?

        String String = "Aren't You Feeling Tired Yet?";
        // Q20
        System.out.print(String.matches(".{29,}") + " ");
        System.out.print(String.matches("A?+r??e*?[n]'?t Y?o?u?+ F?e??e?l?i*n?g? T??[i]*?r+?e*?d? Y?e?t+?[?]"));

        A. true true <<
        B. true false
        C. false true
        D. false false
        E. There is no output due to a compile error.
        */

        /*
        public class BasketballPlayer
        {
            <21*> int <22*> = 0;
            String name;


            public BasketballPlayer()
            {
                name = name;
            }

            public boolean equals(String name)
            {
                return name.contains(name);
            }
        }

        public class Eva extends BasketballPlayer
        {
            public Eva()
            {
                <23*>;
            }
        }

        Which of these can replace <21*> so the variable is a constant that is shared among all classes?

        A. public
        B. static public
        C. final public
        D. final static public <<
        E. None of the Above

        Which of these can replace <22*> so the variable is declared without error?

        A. assert
        B. native
        C. const
        D. goto
        E. None of the Above <<

        Which of these can replace <23*> so the code compiles without error?

        A. this("Eva")
        B. BasketballPlayer("Eva")
        C. super("Eva")
        D. name = "Eva" <<
        E. More than one of the Above
        */

        /*
        public int nonlocal(int raise)
        {
            if (raise <= 0)
                return 0;
            if (raise <= 2)
                return 1;
            return nonlocal(raise - 1) - nonlocal(raise - 2) + raise;
        }
        // Client Code
        System.out.println(nonlocal(10)); //Q24
        System.out.println(nonlocal(50)); //Q25

        What is the output of Q24?

        A. 8
        B. 10
        C. 12 <<
        D. 14
        E. 16

        What is the output of Q25?

        A. 48
        B. 49 <<
        C. 50
        D. 51
        E. 52
        */

        /*
        public box(int parameter[])
        {
            byte local = -1;
            for (short i = 0; i < parameter.length-1; i++)
            {
                for (short j = 0; j < parameter.length-i-1; j++)
                {
                    if (parameter[j] < parameter[j+1])
                    {
                        int global = parameter[j];
                        parameter[j] = parameter[j+1];
                        parameter[j+1] = global;
                        local++;
                    }
                }
            }
            return local;
        }
        // Client Code
        int[] pack = {1,5,6,2,7,3,2,1,7,4,2,1,5,1,3,4,0,8,7,9,8,3,1};
        System.out.println(box(pack)); //Q28

        What type of sorting algorithm does box implement?
        A. Selection
        B. Insertion
        C. Merge
        D. Quick
        E. Bubble <<

        What is the best and worst case time complexity of box?
        A. Best: O(n), Worst: O(n)
        B. Best: O(n), Worst: O(n log n)
        C. Best: O(n), Worst: O(n^2) <<
        D. Best: O(n log n), Worst: O(n log n)
        E. Best: O(n^2), Worst: O(n^2)

        What is the output of Q28?
        A. 125
        B. 126 <<
        C. 127
        D. 128
        E. There is no output due to a compile error
        */

        /*
        public int implicit(int[] arr, int out)
        {
            int n = arr.length;
            int step = (int)Math.floor(Math.sqrt(n));
            int explicit = 0;
            int unsafe = 0;
            while (arr[Math.min(step, n)-1] < out)
            {
                explicit = step;
                unsafe++;
                step += (int)Math.floor(Math.sqrt(n));
                if (explicit >= n)
                    return -1;
            }
            while (arr[explicit] < out)
            {
                explicit++;
                unsafe++;
                if (explicit == Math.min(step, n))
                    return -1;
            }
            if (arr[explicit] == out)
                return unsafe;
            return -1;
        }
        // Client Code
        int[] using = {1,5,6,2,7,3,2,1,7,4,2,1,5,1,3,4,0,8,7,9,8,3,1};
        System.out.println(implicit(using,8)); //Q30

        What type of search algorithm does implicit implement?
        A. Sequential
        B. Binary
        C. Linear
        D. Jump <<
        E. Exponential

        What is the output of Q30?
        A. 5 <<
        B. 6
        C. 7
        D. 8
        E. -1
        */

        /*
        Which of the following can replace <31*> so the code compiles without error?

        <31*> yield = new <31*>();
        Collections.reverse(yield);

        I. Collections
        II. Collection
        III. AbstractCollection

        A. I only
        B. II only
        C. I and II
        D. I and III
        E. None of the Above <<
        */

        /*
        Which of the following can replace <32*> so the code compiles without error?

        <32*> from = new <32*>();
        Collections.sort(from);

        I. Queue
        II. Stack
        III. LinkedList

        A. I and II
        B. I and III
        C. II and III <<
        D. I, II, and III
        E. None of the Above
        */

        /*
        What is the output of Q33?

        Double trouble = 11.00000d;
        Double bubble = 11D;
        System.out.println(trouble.equals(bubble) + " " + (bubble == trouble)); //Q33

        A. true true
        B. true false <<
        C. false true
        D. false false
        E. There is no output due to a compile error.
        */

        /*
        Which of the following can replace <34*> so the code compiles without error?

        Double.<34*>;

        I. isNaN()
        II. toInteger()
        III. isFinite()

        A. I only
        B. II only
        C. I and II
        D. I and III <<
        E. II and III
        */

        /*
        How many static methods does the String class have?
        Note: Different parameters count as different methods when determining number of static methods.

        A. 0
        B. 1
        C. 4
        D. 15 <<
        E. 16
        */

        /*
        What is the output of Q36?

        public static double internal(double namespace)
        {
            return 0;
        }

        public static int internal(double delegate)
        {
            return 1;
        }

        public int internal(double struct)
        {
            return 2;
        }
        // Client Code
        int virtual = 0;
        System.out.println(internal(virtual)); //Q36

        A. 0
        B. 1
        C. 2
        D. There is no output due to a compile error <<
        E. There is no output due to a runtime error
        */

        /*
        Which of these values are equal to the sum of the values of the prefix notation and postfix notations below?

        Prefix: + 2 - * 3 5 - + 7 1 - * * 0 8 9 + 6 7
        Postfix: 80 14 57 * 21 - +

        A. 01544
        B. Math.sqrt(755171)
        C. Math.cbrt(656234909) <<
        D. Math.pow(29, 2) + Math.pow(3, 3)
        E. More than one of the Above
        */

        /*
        Which of these can replace <38*> so the code compiles without error?

        Integer <38*> = 0;

        A. volatile
        B. transient
        C. C#
        D. strictfp
        E. None of the Above <<
        */

        // Q39 What is the postfix traversal of the binary tree. 63 nodes

        /*
        What is the signed 8-bit two's complement binary representation of 0b10110 - 0127?

        11010101 <<

        */
    }
}
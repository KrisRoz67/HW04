public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.missingChar("kitten", 1));
        System.out.println(main.missingChar("kitten", 0));
        System.out.println(main.missingChar("kitten", 4));
        System.out.println("------------------------------------");
        System.out.println(main.sumDouble(1, 2));
        System.out.println(main.sumDouble(3, 2));
        System.out.println(main.sumDouble(2, 2));
        System.out.println("------------------------------------");
        System.out.println(main.intMax(1, 2, 3));
        System.out.println(main.intMax(1, 3, 2));
        System.out.println(main.intMax(3, 2, 1));
        System.out.println("------------------------------------");
        System.out.println(main.nearHundred(193));
        System.out.println(main.nearHundred(90));
        System.out.println(main.nearHundred(89));
        System.out.println("------------------------------------");
        System.out.println(main.notString("candy"));
        System.out.println(main.notString("x"));
        System.out.println(main.notString("not bad"));
    }

    /**
     * Не  знаю точно как надо было , но нашла готовую функцию использая обьект класса StringBuilder ,
     * возможно, надо было черезе substring ,
     * тогда переделаю
     **/

    public StringBuilder missingChar(String str, int n) {
        StringBuilder newStr = new StringBuilder(str);
        return newStr.deleteCharAt(n);
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }

    public int intMax(int a, int b, int c) {
        int maxValue = Math.max(a,b);
        return Math.max(maxValue,c);
       /*  решила упростить
         if (a > b) {
       //     maxValue = a; //
        } else {
            maxValue = b;
        }
        if (c > maxValue) {
            maxValue = c;
        }
        return maxValue; */
    }

    public boolean nearHundred(int n) {
        return Math.abs(n - 100) > 0 && Math.abs(n - 100) < 11 || Math.abs(n - 200) > 0 && Math.abs(n - 200) < 11;
    }

    public String notString(String str) {
        String not = "not" ;
        if (str.contains("not")){
            return str;
        }
        return( String.format("%s %s",not,str)) ;
    }
}
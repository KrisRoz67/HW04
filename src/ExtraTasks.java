public class ExtraTasks {

    public static void main(String[] args) {
        ExtraTasks func = new ExtraTasks();
        System.out.println(func.in1020(12, 99));
        System.out.println(func.in1020(21, 12));
        System.out.println(func.in1020(8, 99));
        System.out.println("------------------------------");
        System.out.println(func.icyHot(120, -1));
        System.out.println(func.icyHot(-1, 120));
        System.out.println(func.icyHot(2, 120));
        System.out.println("------------------------------");
        System.out.println(func.imposeFine(func.caughtSpeeding(60, false)));
        System.out.println(func.imposeFine(func.caughtSpeeding(65, false)));
        System.out.println(func.imposeFine(func.caughtSpeeding(65, true)));
        System.out.println("------------------------------");
        System.out.println(func.fizzString("fig"));
        System.out.println(func.fizzString("dib"));
        System.out.println(func.fizzString("fib"));
        System.out.println("------------------------------");
        System.out.println(func.closeFar(1, 2, 10));
        System.out.println(func.closeFar(1, 2, 3));
        System.out.println(func.closeFar(4, 1, 3));

    }

    public boolean in1020(int n, int d) {
        return n > 9 && n < 21 || d > 9 && d < 21;
    }

    public boolean icyHot(int firstTemp, int secondTemp) {
        return firstTemp < 0 && secondTemp > 100 || secondTemp < 0 && firstTemp > 100;
    }


    public int caughtSpeeding(int speed, boolean birthday) {
        int value =0;
        if (speed < 61 || speed < 66 && birthday) {
            return value;
        } else if (speed > 60 && speed < 81 || speed > 66 && speed < 86 && birthday) {
            value = 1;
        } else if (speed > 81 || speed > 86 && birthday) {
            value = 2;
        }
        return value;
    }

    public String imposeFine(int value) {
        return switch (value) {
            case 1 -> "You got a small ticket!";
            case 2 -> "You got a big ticket!";
            default -> "You got lucky!No ticket for you";
        };
    }

    public String fizzString(String string) {
        if (string.charAt(0) == 'f') {
            if (string.charAt(string.length() - 1) == 'b') {
                return "FizzBuzz";
            }
            return "Fizz";
        } else if (string.charAt(string.length() - 1) == 'b') {
            return "Buzz";
        }
        return string;
    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(b - a) == 1 && Math.abs(c - a) > 1 && Math.abs(c - b) > 1) {
            return true;
        } else return Math.abs(c - a) == 1 && Math.abs(b - a) > 1 && Math.abs(b - c) > 1;
    }
}


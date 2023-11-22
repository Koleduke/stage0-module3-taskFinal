package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        String s = String.valueOf(number);

        int f1 = Integer.parseInt(String.valueOf(s.charAt(0)));
        int f2 = Integer.parseInt(String.valueOf(s.charAt(1)));
        int f3 = Integer.parseInt(String.valueOf(s.charAt(2)));
        int f4 = Integer.parseInt(String.valueOf(s.charAt(3)));
        int res = f1+ f2+f3+f4;
        System.out.println(res);
    }
}

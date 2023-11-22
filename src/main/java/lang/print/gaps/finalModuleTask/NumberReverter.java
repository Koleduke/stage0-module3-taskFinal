package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String s = String.valueOf(number);
        String r= String.valueOf(s.charAt(0));
        String e = String.valueOf(s.charAt(1));
        String z = String.valueOf(s.charAt(2));
        String res = z+e + r;
        System.out.println(res);
    }
}

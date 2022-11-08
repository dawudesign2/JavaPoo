public class Main {
    public static void main(String[] args) {
        wilder wilder = new wilder("john doe ", false);
        wilder wilder1 = new wilder("Jane doe ", true);
        System.out.println(wilder.wohAmi());
        System.out.println(wilder1.wohAmi());
    }
}
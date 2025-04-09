package Question02;

public class Test {
    public static void main(String[] args) {
        NumberDevider nbdev = new NumberDevider(12345678);
        nbdev.NumberDeviderMethod();

        NumberDevider nbdev2 = new NumberDevider(7);
        nbdev2.NumberDeviderMethod();
        NumberDevider nbdev3 = new NumberDevider(0);
        nbdev3.NumberDeviderMethod();
        NumberDevider nbdev5 = new NumberDevider(987654321);
        nbdev5.NumberDeviderMethod();
        NumberDevider nbdev6 = new NumberDevider(11111111);
        nbdev6.NumberDeviderMethod();
        NumberDevider nbdev7 = new NumberDevider(12321);
        nbdev7.NumberDeviderMethod();
    }
}

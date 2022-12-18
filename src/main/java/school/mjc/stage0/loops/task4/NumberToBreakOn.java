package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        int print = 1;
        if (toBreakWith < numberToGoUntil) {
            for (int i = 0; i <= numberToGoUntil; i++) {
                if (i == toBreakWith) {
                    break;
                }
                System.out.println(print);
                print++;
            }
        }
        if (toBreakWith > numberToGoUntil) {
            System.out.println("iterating till the end");
            for (int i = 0; i < numberToGoUntil; i++) {
                System.out.println(print);
                print++;
            }
        }
    }
}

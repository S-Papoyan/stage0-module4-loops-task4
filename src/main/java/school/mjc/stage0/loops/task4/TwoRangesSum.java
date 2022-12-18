package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }
        int temp = 0;
        if (numberToSkip == lastInRow) {
            for (int i = 0; i <= lastInRow; i++) {
                temp += i;
            }
            System.out.println("skipped sum is " + temp);
            System.out.println("counted sum is " + 0);
            return;
        }

        int skippedSum = numberToSkip;
        int countedSum = 0;
        for (int i = 1; i <= lastInRow; i++) {
            if (i == skippedSum) {
                skippedSum += numberToSkip;
                continue;
            }
            countedSum += i;
        }
        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + countedSum);
    }
}

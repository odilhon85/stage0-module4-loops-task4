package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(numberToSkip>lastInRow){
            System.out.println("number to skip is bugger then the last");
        }
        if(lastInRow<0){
            System.out.println("last number in row is negative");
        }
        if(lastInRow>=numberToSkip && lastInRow>0){
            int sumOfSkipped = 0;
            int allSum = 0;
            for (int i = 0; i <= lastInRow; i++) {
                if(i%numberToSkip==0){
                    sumOfSkipped+=i;
                    continue;
                }
                allSum+=i;
            }
            if(lastInRow==numberToSkip){
                System.out.println("skipped sum is "+(sumOfSkipped+allSum));
                System.out.println("counted sum is "+0);
            }else{
                System.out.println("skipped sum is "+sumOfSkipped);
                System.out.println("counted sum is "+allSum);
            }

        }
    }
}

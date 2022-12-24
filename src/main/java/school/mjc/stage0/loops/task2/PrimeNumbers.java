package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 0;
        while(i < printToInclusive) {
            int j = 1;
            int tmp_max = i < 2 ? i / 2 : i;
            int division = 1;
            while(j < tmp_max) {
                if(i % j == 0) {
                    division++;
                }
                j++;
            }
            if (division == 2) {
                System.out.println(i);
            }
            i++;
        }
    }
}

package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {
        int i = 1;
        int sum = 1;
        System.out.println(1);
        while (i <= printToInclusive) {
            sum *= i;
            System.out.println(sum);
            i++;
        }
    }
}

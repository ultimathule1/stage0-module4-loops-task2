package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public static void main(String[] args) {
        printEvenNumbers(10);
    }
    public static void printEvenNumbers(int printTillInclusive) {
        int i = 0;
        while(i <= printTillInclusive) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

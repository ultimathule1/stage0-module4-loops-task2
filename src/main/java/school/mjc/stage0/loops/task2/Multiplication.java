package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        if (multiplyByAndToInclusive < 0) {
            int end = multiplyByAndToInclusive * -1;
            while(i <= end) {
                System.out.println(multiplyByAndToInclusive * i++);
            }
        } else {
            while(i <= multiplyByAndToInclusive) {
                System.out.println(multiplyByAndToInclusive * i++);
            }
        }
    }
}

package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void printPower(int power) {
        if(power < 0) {
            System.out.println("too much power");
        } else {
            int i = 0;
            int sum = 1;
            System.out.println(sum);
            while (i < power) {
                sum *= 2;
                System.out.println(sum);
                i++;
            }
        }
    }
}

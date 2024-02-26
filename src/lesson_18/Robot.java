package lesson_18;

public class Robot {
    public static final String COMPANY_NAME = "Boston Dynamics";
    int countCPU;
    private static int count;
    private int sum;

    public Robot(int countCPU) {
        this.countCPU = countCPU;
        this.sum = 0;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public int getSum() {
        return sum;
    }


    public static int add(int a, int b) {
        return a + b;
    }

    public void addAndSave(int a) {
        sum = sum + a;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "countCPU=" + countCPU +
                '}';
    }
}

package homework_19;
/**
 * AIT-TR, cohort 42.1, Java Basic, HW #19
 *
 * @author Larysa Petrova
 * @version 28-Feb-24
 */

public class RubberArrayHW19 {
    public static void main(String[] args) {
        RubberArray rb = new RubberArray();
        rb.add(8);
        rb.add(12);
        rb.add(-5);
        rb.add(23);
        rb.add(11);
        System.out.println(rb);
        rb.add(17, 3);
        System.out.println(rb.contains(11));
        System.out.println(rb.indexOf(-4));
        System.out.println(rb);
        System.out.println(rb.get(2));
        rb.remove(2);
        System.out.println(rb);
    }
}

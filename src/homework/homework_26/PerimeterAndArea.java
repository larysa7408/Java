package homework.homework_26;

/**
 * AIT-TR, cohort 42.1, Java Basic, HW #26
 *
 * @author Larysa Petrova
 * @version 14-MAR-24
 */


public class PerimeterAndArea {

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(5);
        figures[1] = new Rectangle(2, 4);
        figures[2] = new Triangle(3, 4, 5);

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Figure figure : figures) {
            totalArea += figure.calculateArea();
            totalPerimeter += figure.calculatePerimeter();
        }
        System.out.println("Total area of all figures " + totalArea);
        System.out.println("Total Perimeter of all figures " + totalPerimeter);
    }
}

package lesson.lesson_25;

public class GenericMethods {
    public static <T> void printBoxes(GenericsBox<T>[]boxes){
        for (GenericsBox<T> box: boxes) {
            System.out.println(box + "; ");

        }
    }
}

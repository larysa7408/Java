package lesson.lesson_28;

public class Lesson28 {
    public static void main(String[] args) {
        OuterAndInnerClass outerAndInnerClass = new OuterAndInnerClass();
        outerAndInnerClass.useInnerClass();

        OuterAndInnerStaticClass outerAndInnerStaticClass = new OuterAndInnerStaticClass();
        outerAndInnerStaticClass.useInnerClass();

       // OuterAndInnerClass.InnerClass innerClass = new OuterAndInnerStaticClass.InnerClass();
    }
}

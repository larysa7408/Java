package lesson.lesson_28;

public class OuterAndInnerClass {
    private String field = "field";

    private void printText() {
        System.out.println("Private method print Text.");
    }

    public void useInnerClass() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.getField());
        innerClass.innerPrintText();
    }

   static class InnerClass {
        String getField() {
            return "static class field";
        }

        private void innerPrintText() {
            //printText();
        }
    }
}

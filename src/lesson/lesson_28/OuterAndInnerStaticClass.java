package lesson.lesson_28;

public class OuterAndInnerStaticClass {
    private String field = "field";

    private void printText() {
        System.out.println("Private method print Text.");

    }
    public void useInnerClass(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.getField());
        innerClass.innerPrintText();

    }
    static class InnerClass{
        String getField(){
          //  return field;
            return "static class field";
        }
        void innerPrintText(){
            //printText();
            System.out.println("method of static class");
        }
    }
}

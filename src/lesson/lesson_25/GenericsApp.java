package lesson.lesson_25;

public class GenericsApp {
    public static void main(String[] args) {
        GenericsBox<String> boxStr = new GenericsBox<>("Hello");
        System.out.println(boxStr);

        String strValue = boxStr.getValue();
        GenericsBox<Cat> catGenericsBox = new GenericsBox<>(new Cat());
        System.out.println(catGenericsBox);
        // catGenericsBox.setValue(); ошибка компиляции

        // Generics не работает с примитивными типами данных
        // Работают только с ссылочными типами
        //GenericsBox<int>genericsBox = new GenericsBox<int>(100);

        GenericsBox<Integer> integerGenericsBox = new GenericsBox<>(100);
        GenericsBox<Integer>[] boxes = new GenericsBox[3];
        boxes[0]=new GenericsBox<>(150);
        boxes[1]=new GenericsBox<>(170);
        boxes[2]=new GenericsBox<>(-150);

        int sum = 0;
        for (GenericsBox<Integer> val : boxes){
            sum += val.getValue();
        }
        System.out.println(sum);
        GenericMethods.printBoxes(boxes);

    }
}

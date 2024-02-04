package lesson_03;

public class TypeCasting {

    public static void main(String[] args) {
        //Приведение типов (преобразование типов данных Из одного типа в другой

        //Неявное преобразование Происходит автоматически когда меньший тип преобразуется в больший
        // Например byte - > short; int-> long

        byte byteV = 123;
        int intV;
        intV = byteV; //неявное преобразование типа byte в тип int
        System.out.println(intV);
        double doubleV;
        doubleV = intV;
        System.out.println(doubleV);
//Явное преобразование Необходимо когда мы больший тип данных пытаемся преобразовать в меньший
        doubleV = 125.65;
        intV = (int) doubleV; // Явное преобразование double в тип int
        System.out.println("intV: " + intV);

        System.out.println("===================");

        int x = 20;
        int y = 7;
        double result;
        result = x / (float) y; // когда в выражении присутствует хотя бы один double - операция производится как с типом double (обычное деление)
        System.out.println("float:  " + result);
        result = x / (double) y; // когда в выражении присутствует хотя бы один double - операция производится как с типом double (обычное деление)
        System.out.println("double: " + result);


    }
}

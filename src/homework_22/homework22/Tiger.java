package homework_22.homework22;

public class Tiger extends Cat{

    public Tiger(String name, int age) {
        super(name, age);
    }

    public void roar(){
        System.out.println(name + " Rrrrrr");
    }

    @Override
    public void eat() {
        super.eat();
    }
}

package study;

public class Doggie extends Animal {


    public Doggie(String name, int weight, int height, String color) {
        super(name, weight, height, color);
    }

    @Override
    public void swim(int valueSwim) {
        if (valueSwim <= 10)
            System.out.println(this.name + " проплывает " + valueSwim);
    }

    @Override
    public void run(int valueRun) {
        if (valueRun <= 500) {
            System.out.println(this.name + " пробегает " + valueRun);
        } else {
            System.out.println("Это слишком большое расстояние для пёселя");
        }
    }

}


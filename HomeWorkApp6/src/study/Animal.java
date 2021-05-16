package study;

public abstract class Animal {
    protected String name;
    protected int weight;
    protected int height;
    protected String color;
    protected int power;


    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int weight, int height, String color) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    public void run(int valueRun) {
        System.out.println("меня зовут" + name + ". Я пробегаю=" + valueRun);
    }

    public void swim(int valueSwim) {
        System.out.println(name + " проплывает " +  valueSwim);
    }

}

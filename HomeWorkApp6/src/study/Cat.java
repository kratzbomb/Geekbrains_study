package study;

public class Cat extends Animal {


    public Cat(String name, int weight, int height, String color) {
        super(name, weight, height, color);
    }

        @Override
        public void swim(int valueSwim){
            System.out.println(this.name + " не умеет плавать! Скорее спасайте котейку из сложившейся ситуации, у него же лапки!");
        }
        @Override
        public void run(int valueRun) {
            if (valueRun <= 200) {
                System.out.println(this.name + " пробегает " + valueRun);
            } else {
                System.out.println("Это слишком большое расстояние для котейки");
            }
        }

}

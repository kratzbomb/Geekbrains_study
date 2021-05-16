package study;

public class Main {

    public static void main(String[] args) {

       Animal[] animals = new Animal[4];
       animals[0] = new Cat("Василий", 5, 60,"черный");
       animals[1] = new Doggie("Шарик", 6,100, "белый");
       animals[2] = new Cat("Мурзик", 4, 70, "рыжий");
       animals[3] = new Doggie("Бобик", 5,40, "пестрый");

       int numOtherAnimals = 0;
       int numCats = 0;
       int numDogs = 0;
       int numAnimals = 0;

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(200);
            animals[i].run(300);
            animals[i].swim(10);
            animals[i].swim(11);

            if (animals[i] instanceof Doggie) {
                numDogs ++;
            } else if (animals[i] instanceof Cat) {
                numCats ++;
            } else {
                numOtherAnimals ++;
            }
            
            numAnimals ++;
        }

        System.out.println("Кошек прибежало " + numCats);
        System.out.println("Собак прибежало " + numDogs);
        System.out.println("Остальных животных " + numOtherAnimals );
        System.out.println("Всего животных " + numAnimals);
    }
}

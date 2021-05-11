package study;

public class Office {

    public static void main(String[] args) {

	    Employee employee1 = new Employee();
        employee1.name = "Belikova Tatyana";
        employee1.post = "Tester";
        employee1.email = "belikova.tn@yandex.ru";
        employee1.tel = "88005553535";
        employee1.salary = 100500;
        employee1.age = 26;

        System.out.println("My name is " + employee1.name);
        System.out.println("My post is " + employee1.post);
        System.out.println("My email is " + employee1.email);
        System.out.println("My tel is " + employee1.tel);
        System.out.println("My salary is " + employee1.salary);
        System.out.println("My age is " + employee1.age);
        System.out.println("------------------------------");

        Employee[] employeesArray = new Employee[5]; // Вначале объявляем массив объектов
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        employeesArray[1] = new Employee("Mr Nobody", "Driver", "fhjd@mailbox.com", "894562312", 50000, 50);
        employeesArray[2] = new Employee("Tatyana Ikol", "QA", "dhsjkg@dhjsl.ru", "85446669547", 10000, 18);
        employeesArray[3] = new Employee("Petra Popova", "Hunter", "fgehf@mailbox.com", "891262312", 50000, 99);
        employeesArray[4] = new Employee("Sasha Belikov", "DevOps", "dhsjkg@dhfgib.ru", "85446454747", 150000, 27);

        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].age > 40) {
                employeesArray[i].tellAboutHuman();
                System.out.println();
            }
        }
    }
}

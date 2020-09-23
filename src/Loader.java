import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {

        Dog dogs1 = new Dog("Lina", 7);
        Dog dogs2 = new Dog("Tesy", 5);
        Dog dogs3 = new Dog("Valeria", 10);

        Scanner in = new Scanner(System.in);

        System.out.println("Информация о собаках: ");
        System.out.println(dogs1.toString() + "\n" + dogs2.toString() + "\n" +dogs3.toString());
        System.out.println("Введите информацию о собаке №3: ");
        String name = in.nextLine();
        dogs3.setName(name);
        int age = in.nextInt();
        dogs3.setAge(age);
        System.out.println("Измененная информация о собаках: ");
        System.out.println(dogs1.toString() + "\n" + dogs2.toString() + "\n" +dogs3.toString());

    }
}

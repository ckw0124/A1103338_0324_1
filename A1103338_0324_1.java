import java.util.Scanner;

class Animal {
    private String name;
    private int height;
    private int weight;
    private int age;

    public Animal(String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("Name: " + name + ", Height: " + height + ", Weight: " + weight + ", Age: " + age);
    }

    public double distance(int time, double acceleration) {
        return 0.5 * acceleration * Math.pow(time, 2);
    }

    public double distance(int time) {
        return distance(time, 9.8);
    }
}

public class A1103338_0324_1 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("六福村狒狒", 90, 50, 15),
                new Animal("威力", 175, 70, 21),
                new Animal("Monkey", 160, 60, 15)
        };

        for (Animal animal : animals) {
            animal.show();
        }

        Scanner scanner = new Scanner(System.in);
        for (Animal animal : animals) {
            System.out.print("請輸入 " + animal.getName() + " 的時間 (分鐘): ");
            int x = scanner.nextInt();
            System.out.print("請輸入 " + animal.getName() + " 的加速度: ");
            double y = scanner.nextDouble();

            double distance = animal.distance(x, y);
            System.out.println(animal.getName() + " 跑了 " + distance + " 公尺");
        }

        for (Animal animal : animals) {
            System.out.print("請輸入 " + animal.getName() + " 的時間 (分鐘): ");
            int x = scanner.nextInt();

            double distance = animal.distance(x);
            System.out.println(animal.getName() + " 跑了 " + distance + " 公尺");
        }

        scanner.close();
    }
}

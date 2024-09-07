package hw_1;

public class Main_hw_1 {
    public static void main(String[] args) {

        Car car1 = new Car(750, "BMW1", 20, true);
        Car car2 = new Car(200, "BMW2", 10, true);
        Car car3 = new Car(85, "BMW3", 30, true);
        Car car4 = new Car(55, "BMW4", 24, true);
        Car car5 = new Car(55, "BMW5", 6, true);

        Car[] cars = {car1, car2, car3, car4, car5};

        for (Car oneCar : cars) {
            System.out.println(oneCar);
        }

        System.out.println("-------------------------------");

        Book book1 = new Book("Book1",500, new String[] {"John Doe", "J. K. Rowling"}, "drama1");
        Book book2 = new Book("Book2",500, new String[] {"Stephen King", "George R. R. Martin"}, "drama2");
        Book book3 = new Book("Book3",500, new String[] {"John Green", "James Patterson"}, "drama3");
        Book book4 = new Book("Book4",500, new String[] {"John Grisham", "Khaled Hosseini"}, "drama4");
        Book book5 = new Book("Book5",500, new String[] {"John Doe", "Stephen KingStephen King"}, "drama5");

        Book[] books = {book1, book2, book3, book4, book5};

        for (Book oneBook : books) {
            System.out.println(oneBook);
        }

        System.out.println("--------------------------------");

        Dog dog1 = new Dog("Joy", 2,"mini");
        Dog dog2 = new Dog("Lola", 1,"maxi");
        Dog dog3 = new Dog("Mika", 3,"medium");
        Dog dog4 = new Dog("Toto", 8,"maxi");
        Dog dog5 = new Dog("Nana", 4,"mini");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        for (Dog oneDog : dogs) {
            System.out.println(oneDog);
        }

        System.out.println("-------------------------------");


    }
}

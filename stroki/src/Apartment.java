import java.util.Scanner;

// прошлое название AppartamentHouse
public class Apartment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество этажей дома: ");
        int floorsCount = scanner.nextInt();

        System.out.print("Введите количество подъездов: ");
        int entrancesCount = scanner.nextInt();

        System.out.print("Введите номер квартиры: ");
        int flatNumber = scanner.nextInt();

        final int flatsEachFloorCount = 4;

        if (flatNumber <= 0 || flatNumber > flatsEachFloorCount * floorsCount * entrancesCount) {
            System.out.println("Такой квартиры нет в доме");
            return;
        }

        // количество квартир в 1 подъезде
        int flatsInEntranceCount = flatsEachFloorCount * floorsCount;

        // номер подъезда
        int entranceNumber = (int) Math.ceil((double) flatNumber / flatsInEntranceCount);
        System.out.println("Номер  подъезда: " + entranceNumber);

        // позиция квартиры на этаже
        int flatPositionInEntrance = flatNumber % flatsEachFloorCount;

        switch (flatPositionInEntrance) {
            case 1 -> System.out.println("Квартира ближняя слева");
            case 2 -> System.out.println("Квартира дальняя слева");
            case 3 -> System.out.println("Квартира дальняя справа");
            default -> System.out.println("Квартира ближняя справа");
        }

        // этаж
        int floorNumber = (int) Math.ceil(((double) flatNumber - flatsInEntranceCount * (entranceNumber - 1)) / flatsEachFloorCount);
        System.out.println("Номер этажа: " + floorNumber);
    }
}
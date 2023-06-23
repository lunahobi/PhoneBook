import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhoneBook pb = new PhoneBook();
        int choice;
        while (true){
            System.out.println("1. Добавить нового абонента");
            System.out.println("2. Удалить абонента");
            System.out.println("3. Поиск фамилии абонента по номеру телефона");
            System.out.println("4. Показать контакты");
            System.out.println("5. Выход");
            System.out.print("Введите номер действия: ");
            choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Введите ФИО абонента: ");
                    String name = in.nextLine();
                    String last_name;
                    String first_name;
                    String second_name;
                    try {
                        last_name = name.split(" ")[0];
                        first_name = name.split(" ")[1];
                        second_name = name.split(" ")[2];
                    } catch (Exception e) {
                        System.out.println("Неправильный формат ФИО");
                        break;
                    }
                    System.out.print("Введите номер телефона: ");
                    String phoneNumber = in.nextLine();
                    pb.addEntry(phoneNumber, new Human(last_name, first_name, second_name));
                    break;
                case 2:
                    System.out.print("Введите номер телефона абонента, которого хотите удалить: ");
                    String phone = in.nextLine();
                    pb.deleteEntry(phone);
                    break;
                case 3:
                    System.out.print("Введите номер телефона для поиска фамилии абонента: ");
                    String p = in.nextLine();
                    pb.searchByPhoneNumber(p);
                    break;
                case 4:
                    pb.showContacts();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неправильный номер действия. Игнорировать");
            }
        }
    }
}
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static Map<String, Human> directory;
    public PhoneBook() {
        this.directory = new HashMap<String, Human>();
    }
    public void addEntry(String phone, Human fio) {
        directory.put(phone, fio);
        System.out.println("Абонент успешно добавлен.");
    }

    public void deleteEntry(String phoneNumber) {
        if(directory.containsKey(phoneNumber)) {
            String name = directory.get(phoneNumber).last_name + " " + directory.get(phoneNumber).first_name + " " + directory.get(phoneNumber).second_name;
            directory.remove(phoneNumber);
            System.out.println("Абонент " + name + " с номером телефона " + phoneNumber + " успешно удален.");
        } else {
            System.out.println("Не найден абонент с номером телефона " + phoneNumber);
        }
    }

    public void searchByPhoneNumber(String phoneNumber) {
        if (directory.containsKey(phoneNumber)) {
            String last_name = directory.get(phoneNumber).last_name;
            System.out.println("Фамилия абонента номера " + phoneNumber + " это " + last_name);
        } else {
            System.out.println("Не найден абонент с номером телефона " + phoneNumber);
        }
    }
    public void showContacts() {
        if (this.directory.isEmpty()) {
            System.out.println("Телефонный справочник пустой");
        } else {
            for (Map.Entry<String, Human> entry : this.directory.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
package UserInterface;

import java.util.List;
import java.util.Scanner;
import Model.*;

public class ConsoleView implements View <Pet> {

    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in, "ibm866");
    }

    @Override
    public String getName() {
        System.out.printf("Имя: ");
        return in.nextLine();
    }

    @Override
    public String getBirthday() {
        System.out.printf("Введите дату рождения в формате 'dd.mm.yyyy': ");
        return in.nextLine();
    }

    @Override
    public <T> void printAll (List <T> list, Class <T> clazz) {
        System.out.print("\033[H\033[J");
        if (list.isEmpty())
            System.out.println("список пуст");
        else {
            if (clazz == Pet.class)
                System.out.println("\n          Наши питомцы:");
            for (T item : list) {
                System.out.println(item);              
            }
        }
    }
    
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}

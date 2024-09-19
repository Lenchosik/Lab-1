import java.util.Scanner;

public class Schools implements SchoolSystem {

    String first = "Школы";
    public void heading(String word) {
        first = word;
        System.out.println("Сейчас вы смотрите " + first);
    }

    public void showinfo() {

        heading("школы");

        Scanner in = new Scanner(System.in);

        System.out.print("Название: ");
        String name = in.nextLine();

        System.out.print("Директор: ");
        String director = in.nextLine();

        System.out.print("Адрес: ");
        String adress = in.nextLine();

        System.out.print("Телефон: ");
        String phone = in.nextLine();

        System.out.printf(" Название: %s\n"
                        + " Директор: %s\n"
                        + " Адрес: %s\n"
                        + " Телефон: %s\n",
                name, director, adress, phone);
    }
}

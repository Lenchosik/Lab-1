import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main myApp = new Main();
        myApp.information();
    }
    public void information() {
        SchoolSystem Schools = new Schools();

        SchoolSystem Additional = new SchoolSystem() {

            String second = "Кружки";
            public void heading(String word) {
                second = word;
                System.out.println("Теперь вы смотрите " + second);
            }

            public void showinfo() {

                heading("кружки");

                Scanner in = new Scanner(System.in);

                System.out.print("Название: ");
                String adname = in.nextLine();

                System.out.print("Вид деятельности: ");
                String adoing = in.nextLine();

                System.out.print("Количество детей: ");
                String amount = in.nextLine();

                System.out.print("Стоимость: ");
                String acount = in.nextLine();

                System.out.printf(" Название: %s\n"
                                + " Вид деятельности: %s\n"
                                + " Количество детей: %s\n"
                                + " Стоимость: %s\n",
                        adname, adoing, amount, acount);
                in.close();
            }
        };

        Schools.showinfo();
        System.out.println("---------------------------------");
        Additional.showinfo();
    }
}

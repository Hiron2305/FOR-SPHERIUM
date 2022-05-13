import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Scanner quantity_of_books = new Scanner(System.in);
    static Scanner f_bal = new Scanner(System.in);

    static int n = quantity_of_books.nextInt(); // Задайте значение количества книг
    static int bal = f_bal.nextInt(); // Задайте значение изначального баланса


    public static void main(String[] args) {

        System.out.println("Print your command");
        Scanner command = new Scanner(System.in);
        String com = command.next();

        boolean b = com == "print books";
        if (b){
            System.out.println(BOOKS.BOOKS());
        }
//HashMap <String,String> map = new HashMap<>();
//System.out.println("Введите название книги, количество в наличии, цену в формате:")
    }


    /* public static void balance(){ //функция баланса
    Scanner in = new Scanner(System.in);
    System.out.println("Your balance:" + bal); //вывод баланса
    } */
public class BOOKS{
        public static List BOOKS() {
            List books = new ArrayList();
            for(int i = 0; i < n; i++){
                Scanner a = new Scanner(System.in);
                String key = a.next();
            }
            return books;
        }

    }
        /*public String show_books_in_stock(){
            System.out.println("DOOONEEEE");
            List<List<String» Res_List = new ArrayList<>(); // Делаем итоговый список всех книг
            for(int j = 0; j<n; j++) {
                Scanner name_of_book = new Scanner(System.in);
                List<String> Books = new ArrayList<>();
                String Books_in_res = name_of_book.next();
                Books.add(Books_in_res);
                Res_List.add(Books);
            }
            System.out.println("DOOONENE");
            return "DOOONEEEE";

        }*/

    }
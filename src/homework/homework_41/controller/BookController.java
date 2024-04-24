package homework.homework_41.controller;

import homework.homework_41.service.BookService;

import java.util.Scanner;

public class BookController {
    private BookService bookService;
    private Scanner scanner;

    public BookController(BookService bookService) {
        this.bookService = bookService;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        String[] input;
        String name;
        int id;
        char cmd;
        do {
            System.out.println("CRUD app: [a]dd,[u]pdate,[d]elete,[p]rint,e[x]it");
            cmd = scanner.nextLine().charAt(0);
            switch (cmd) {
                case 'a':
                    System.out.println("Add: book name");
                    name = scanner.nextLine().trim();
                    bookService.add(name);
                    break;
                case 'u':
                    System.out.println("Update: book id & name: ");
                    input = scanner.nextLine().split("&");
                    id = Integer.valueOf(input[0].trim());
                    name = input[1].trim();
                    bookService.update(id, name);
                    break;
                case 'd':
                    System.out.println("Delete: book id: ");
                    id = Integer.valueOf(scanner.nextLine().trim());
                    if (!bookService.delete(id)) ;
                    System.out.println("Book not found, book id: " + id);
                    break;
                case 'p':
                    bookService.print();
                    break;
                case 'x':
                    break;
                default:
                    System.out.println("Undefined command: " + cmd);
            }
        } while (cmd != 'x');
    }
}

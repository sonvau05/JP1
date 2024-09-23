package Work;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        Author author1;
        Author author2;
        authors.add(author1 = new Author(1, "John", "jane@gmail.com", Gender.M));
        authors.add(author2 = new Author(2, "Jane", "jane@gmail.com", Gender.F));

        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", author1, 29.99, 10));
        books.add(new Book("Python Programming", author2, 29.99, 10));
        books.add(new Book("C++ Programming", author1, 29.99, 10));

        System.out.println("Sắp xếp sách theo tên:");
        books.stream()
                .sorted(Comparator.comparing(Book::getName))
                .forEach(System.out::println);

        Book maxPriceBook = books.stream()
                .max(Comparator.comparing(Book::getPrice))
                .orElse(null);

        System.out.println("\nSách có giá lớn nhất: " + maxPriceBook);


        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập tên tác giả: ");
        String authorName = scanner.nextLine();

        System.out.println("Các sách của tác giả " + authorName + ":");
        books.stream()
                .filter(book -> book.getAuthor().getName().equalsIgnoreCase(authorName))
                .forEach(System.out::println);

        scanner.close();
    }
}
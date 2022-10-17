import java.util.Scanner;

public class TestAuthor
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String e = scanner.nextLine();
        char g = scanner.next().charAt(0);
        Author A = new Author(n,e,g);
        System.out.println(A);

    }
}

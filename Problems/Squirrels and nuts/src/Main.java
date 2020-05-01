import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next()); // N 다람쥐
        Integer b = Integer.parseInt(scanner.next()); // K 견과류

        System.out.println(b % a);
    }
}

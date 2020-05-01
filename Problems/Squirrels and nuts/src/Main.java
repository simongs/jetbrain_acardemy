import java.util.Scanner;

// 각 다람쥐들이 균등하게 견과류를 나눠가진 후 남아있는 견과류의 수를 구하라
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer a = Integer.parseInt(scanner.next()); // N 다람쥐
        Integer b = Integer.parseInt(scanner.next()); // K 견과류

        System.out.println(b % a);
    }
}
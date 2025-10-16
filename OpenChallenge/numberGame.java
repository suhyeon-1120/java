package Openchallenge1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String again;

        do {
            int card = (int)(Math.random() * 100);
            int guess = -1;

            System.out.println("수를 결정하였습니다. 맞추어 보세요.");

            while (true) {
                System.out.print(">> ");

                try {
                    guess = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("숫자를 입력하세요");
                    sc.nextLine();
                    continue;
                }

                if (guess > card) {
                    System.out.println("더 낮게");
                } else if (guess < card) {
                    System.out.println("더 높게");
                } else {
                    System.out.println("정답입니다.");
                    break;
                }
            }

            System.out.print("다시 하시겠습니까?(y/n) >> ");
            again = sc.next();

        } while (again.equalsIgnoreCase("y"));

        System.out.println("게임을 종료합니다.");
        sc.close();
    }
}

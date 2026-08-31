package ex5_rsp;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class RspMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        ScoreWrite sw = new ScoreWrite();
        ScoreLoad sl = new ScoreLoad();

        while (true) {

            System.out.print("아이디를 입력하세요 : ");
            String id = sc.next();

            // User 객체 생성
            User user = new User(id);

            // 저장된 파일 경로
            String path = "C:/myFile/RspGame/"
                    + id + "/info.sav";

            File file = new File(path);

            // 기존 아이디
            if (file.exists()) {

                user = sl.load(user);

            } else {

                System.out.println("새로운 아이디 생성");

            }

            // 현재 전적 출력
            user.printScore();

            boolean playing = true;

            while (playing) {

                System.out.print(
                        "가위(s) | 바위(r) | 보(p) ? : "
                );

                String input = sc.next();

                char userChoice = input.charAt(0);

                // 잘못된 입력
                if (userChoice != 's'
                        && userChoice != 'r'
                        && userChoice != 'p') {

                    System.out.println("잘못 입력했습니다.");
                    continue;
                }

                // 컴퓨터 선택
                int num = random.nextInt(3);

                char computer;

                if (num == 0) {

                    computer = 's';

                } else if (num == 1) {

                    computer = 'r';

                } else {

                    computer = 'p';
                }

                // 결과 출력
                if (userChoice == computer) {

                    System.out.println("비겼습니다.");

                    user.addDraw();

                } else if (
                        (userChoice == 's' && computer == 'p')
                        || (userChoice == 'r' && computer == 's')
                        || (userChoice == 'p' && computer == 'r')
                ) {

                    System.out.println("이겼습니다.");

                    user.addWin();

                } else {

                    System.out.println("졌습니다.");

                    user.addLose();
                }

                // 현재 전적
                user.printScore();

                // 한판 더?
                System.out.print("한판 더?? y | n : ");

                char again = sc.next().charAt(0);

                if (again == 'n') {

                    System.out.println("게임이 종료되었습니다.");

                    sw.save(user);
                    System.out.println("----------------------------------------");
                    return;
                }
            }

            System.out.println("게임이 종료되었습니다.");

            // 기록 저장
            sw.save(user);

            System.out.println("----------------------------------------");
        }
    }
}


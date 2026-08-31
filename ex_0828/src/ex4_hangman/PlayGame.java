
package ex4_hangman;

import java.util.Scanner;

public class PlayGame {

    Scanner sc = new Scanner(System.in);

    char[] star;

    boolean check = false;

    boolean isPlaying = false;

    final char SHAPE = '☆';

    public void play(String word) {

        star = new char[word.length()];

        // ☆로 채우기
        for (int i = 0; i < star.length; i++) {
            star[i] = SHAPE;
        }

        // 게임 시작
        isPlaying = true;

        label: while (isPlaying) {

            System.out.print("word : ");

            for (int i = 0; i < star.length; i++) {
                System.out.print(star[i]);
            }

            System.out.print(" >> ");

            String in = sc.next();

            char ch = in.charAt(0);

            // 잘못된 입력
            if (ch < 'a' || ch > 'z' || in.length() > 1) {
                System.out.println("영문 소문자 한 글자만 입력하세요.");
                continue;
            }

            check = false;
            isPlaying = false;

            for (int i = 0; i < word.length(); i++) {

                // 이미 입력한 글자인지 확인
                if (star[i] == ch) {
                    System.out.println(ch + "은(는) 이미 입력함");
                    continue label;
                }

                // 정답에 포함되어 있는지 확인
                if (ch == word.charAt(i)) {
                    star[i] = ch;
                    check = true;
                }

                // 아직 ☆가 남아있으면 게임 계속
                if (star[i] == SHAPE) {
                    isPlaying = true;
                }
            }

            // 정답에 없는 글자
            if (!check) {
                System.out.println(ch + "이(가) 포함되어 있지 않아요");
            }

            // 게임 종료
            if (!isPlaying) {
                System.out.println("정답 : " + word);
                System.out.println("게임종료");
                break;
            }
        }
    }}



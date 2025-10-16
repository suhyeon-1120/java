package Openchallenge1;

import java.util.Scanner;

public class rspGame_02 {
	public static void main(String[] args) {
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		Scanner sc= new Scanner(System.in);
		System.out.println("철수 >> ");
		String man= sc.next();
		System.out.println("영희 >> ");
		String woman= sc.next();
		
		if(man.equals("가위")) {
			if(woman.equals("가위"))
				System.out.println("비겼습니다.");
			else if(woman.equals("바위"))
				System.out.println("철수가 졌습니다.");
			else
				System.out.println("철수가 이겼습니다.");
		}
		if(man.equals("바위")) {
			if(woman.equals("가위"))
				System.out.println("철수가 이겼습니다.");
			else if(woman.equals("바위"))
				System.out.println("비겼습니다.");
			else
				System.out.println("철수가 졌습니다.");
		}
		if(man.equals("보")) {
			if(woman.equals("가위"))
				System.out.println("철수가 졌습니다.");
			else if(woman.equals("바위"))
				System.out.println("철수가 이겼습니다.");
			else
				System.out.println("비겼습니다.");
		}
		
		sc.close();
	}
}

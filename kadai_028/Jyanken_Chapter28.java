package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public void createChoice() {
		choice.put("r", "グー");
		choice.put("s", "チョキ");
		choice.put("p", "パー");
	}
	
	HashMap<String, String> choice = new HashMap<>();

	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		
		String input;
		
		do {			
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			input = scanner.next();
			
			if (!choice.containsKey(input)) {
				System.out.println("入力した文字は間違っていた為エラーになってしまった。もう一度正しいのを入力してください");
			} 
		} while (!choice.containsKey(input));
		return input;
	}
	
	public String getRandom() {
		String[] randChoiceArray = {"r", "s", "p"};
		
		int randKey = (int)Math.floor(Math.random() * 3);
		
		String randChoice = randChoiceArray[randKey];
		return randChoice;
	}
	
	public void playGame(String myChoice, String random) {
		System.out.println("自分の手は" + choice.get(myChoice) + "、対戦相手の手は" + choice.get(random));
		if(myChoice.equals(random)) {
			System.out.println("あいこです");
		}else if(myChoice.equals("r") && random.equals("s") ||
				 myChoice.equals("s") && random.equals("p") ||
				 myChoice.equals("p") && random.equals("r")) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
	}
}
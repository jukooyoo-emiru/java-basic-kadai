package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dictWord = new Dictionary_Chapter21();
		
		dictWord.createDictionary();
		
		String[] engWord = {"apple", "banana", "grape", "orange"};
		
		dictWord.searchWord(engWord);
	}

}

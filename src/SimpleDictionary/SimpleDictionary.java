package SimpleDictionary;

import java.util.HashMap;

public class SimpleDictionary {
    private HashMap<String, String> translations;

    public SimpleDictionary(){
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation){
        this.translations.put(word,translation);

    }

    public String translate(String word){
        return this.translations.get(word);
    }
}

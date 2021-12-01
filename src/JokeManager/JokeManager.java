package JokeManager;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;


    public JokeManager(){
        this.jokes = new ArrayList<>();

    }

    public void addJoke(String joke){
        this.jokes.add(joke);
    }

    public String drawJoke(){
        if(jokes.size() > 0){
            Random random = new Random(jokes.size());
            int index = random.nextInt(jokes.size());
            return jokes.get(index);
        }
        return "NO jokes";
    }

    public void printJokes(){
        for(String joke : jokes){
            System.out.println(joke);
        }

    }


}

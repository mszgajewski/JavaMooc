package ToDoList;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList(){
        this.list = new ArrayList<>();
    }

    public void add(String task){
        this.list.add(task);
    }

    public void print() {
        for(String element : list){
            System.out.println(list.indexOf(element) + 1 + ": " +element);
        }
    }

    public void remove(int number){
        this.list.remove(number - 1);
    }
}

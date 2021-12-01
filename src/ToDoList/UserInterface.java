package ToDoList;

import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner input;

    public UserInterface(Scanner input, TodoList todoList){
        this.input = input;
        this.todoList = todoList;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String word = input.nextLine();

            if (word.equals("stop")) {
                break;
            } else if(word.equals("add")){
                add();
            } else if(word.equals("list")){
                list();
            } else if(word.equals("remove")){
                remove();
            } else {
                System.out.println("Uknown");
            }
        }
    }
    public void add() {
        System.out.print("To add: ");
        String word = input.nextLine();
        this.todoList.add(word);
    }
    public void list() {
        todoList.print();
    }
    public void remove(){
        System.out.print("Which one is removed? ");
        int removeIndex = Integer.valueOf(input.nextLine());
        todoList.remove(removeIndex);
    }
}


import java.io.*;
public class Main {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("F:\\SomeDir.txt", false))
        {
            // запись всей строки
            String text = "Мама мыла раму, раму мыла мама";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append("Eeeeeeeeeeeeeeee");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

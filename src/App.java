import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        //OPERAZIONI CON FILE
        // File file = new File("prova.txt");
        // //File file = new File("C:\\Users\\Nome\\prova.txt")
        // if(file.exists()) {
        //     System.out.println("file esiste");
        //     System.out.println(file.getPath());
        //     System.out.println(file.getAbsolutePath());
        //     System.out.println(file.isFile());
        //     //file.delate()
        // } else {
        //     System.out.println("file non esiste");
        // }

        //SCRITTURA
        // try {
        //     FileWriter writer = new FileWriter("prova.txt");
        //     writer.write("ciao sto scrivendo"); //cancella quello che è presente
        //     writer.append("\nciao"); //non cancella
        //     writer.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        //LETTURA
        try {
            FileReader reader = new FileReader("prova.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

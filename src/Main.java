import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
read();
error();
}

    public static List read () {

        List<String> List = new ArrayList<String>();

        File ideaold = new File("ideaold.log");
        Scanner Arraylist = null;
        try {
            Arraylist = new Scanner(ideaold);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (Arraylist.hasNext()) {
            List.add(Arraylist.nextLine());
        }
        return List;



        public static List error () {

    }


}



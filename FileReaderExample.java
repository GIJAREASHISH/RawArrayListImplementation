import java.io.*;

public class FileReaderExample {

    public static void main(String[] args)  {

        //Create a File
        try {
            File fo = new File("new-file.txt");
            fo.createNewFile();
        }
        catch(Exception e){

            System.out.println(e.getMessage());
        }

        //Write in File
        try {
            FileWriter fw = new FileWriter("new-file.txt");
            fw.write("Ashish");
            fw.close();
        }
        catch(Exception e){

            System.out.println(e.getMessage());
        }

        //Read file

        try {
            BufferedReader br = new BufferedReader(new FileReader("new-file.txt"));

            while(br.ready()){
                System.out.println(br.readLine());
            }
        }

        catch(Exception e){

            System.out.println(e.getMessage());
        }

    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessing {
    private String fileName = "input.txt";

    public List<String> getFileText(){

        List<String> foodstuff = new ArrayList<String>();
        BufferedReader bfr = null;

        try {            
            bfr = new BufferedReader(new FileReader(fileName));
       
            String str = bfr.readLine();

            while (str!= null) {
                String[] item = str.split(" ");
                for (int i = 0; i < item.length; i++) {
                    if (item[i].length() > 1) {
                        foodstuff.add(item[i]);
                    }
                }
                str = bfr.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Не удалось прочесть файл");
        }  finally{
            try{
                bfr.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        return foodstuff;         
    }
}
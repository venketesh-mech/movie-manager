import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class downloadJSON {
         void download(String mTitle) throws Exception {
            File file = new File("E:\\Peoject files\\json files\\"+mTitle+".json");
            if(file.createNewFile()) {
                FileWriter writer = new FileWriter("E:\\Peoject files\\json files\\" + mTitle + ".json");
                URL omdb = new URL(" http://www.omdbapi.com/?apikey=3a763f22&t=" + mTitle);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(omdb.openStream()));
                String JSON;
                while ((JSON = in.readLine()) != null) {
                    writer.write(JSON);
                }
                in.close();
                writer.close();
            }
//            else{
//                System.out.println("svfc");
//            }
        }

        void PassingTitles(String[] movList) throws Exception {
            for (String fTitle:movList) {
                download(fTitle);
            }
        }

}

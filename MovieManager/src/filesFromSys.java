import java.io.File;

//import java.io.FileWriter;

public class filesFromSys {
    private String path;
    String[] fileList;

    public filesFromSys(String path) {
        this.path = path;
    }

    void movNameCollector() {
        File file = new File(path);
        fileList = file.list();
        for (int i=0;i<fileList.length;i++) {
            String name = fileList[i];
            fileList[i] = name.substring(0, name.indexOf("."));
            fileList[i] = fileList[i].replace(" ","+");
        }
    }

    void PrintFileName(){
        for (String a: fileList) {
            System.out.println(a);
        }
    }


}

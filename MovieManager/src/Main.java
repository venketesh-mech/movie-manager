
public class Main {

    public static void main(String[] args) throws Exception {
        filesFromSys fil = new filesFromSys("E:\\movies");
        fil.movNameCollector();

        downloadJSON down = new downloadJSON();
        down.PassingTitles(fil.fileList);

    }
}

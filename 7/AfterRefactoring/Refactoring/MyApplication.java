package Refactoring;


public class MyApplication extends Application{

    public MyApplication(File file){
        super(file);
    }
    protected boolean checkFile(File file){
        return file.read();
    }
    protected boolean processFile(File file) {
        return file.result();
    }
}

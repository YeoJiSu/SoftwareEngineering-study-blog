package Refactoring;

public class Main {
    public static boolean isCorrectExtension(String fileName, String extension){
        return fileName.toLowerCase().endsWith(extension);
    }
    public static void main(String[] args){
        // 임의로 선언
        String fileName = "example.xls";
        File file = null;

        if ( isCorrectExtension(fileName, ".doc")) {
            file = new Doc(fileName);
        }
        if ( isCorrectExtension(fileName, ".xls")) {
            file = new Xls(fileName);
        }
        MyApplication myApp = new MyApplication(file);
        myApp.open();
    }
}

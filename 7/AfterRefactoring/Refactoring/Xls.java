package Refactoring;

public class Xls extends File{
    public Xls(String fileName) {
        super(fileName);
    }

    protected boolean read() {
        // 단순 확인을 위한 프린트 문
        System.out.println("xlsRead");
        return true;
    }
    protected boolean result() {
        // 단순 확인을 위한 프린트 문
        System.out.println("xlsResult");
        return true;
    }
}

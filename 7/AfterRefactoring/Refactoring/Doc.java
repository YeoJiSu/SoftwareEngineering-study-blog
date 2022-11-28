package Refactoring;

public class Doc extends File{

    public Doc(String fileName) {
        super(fileName);
    }

    protected boolean read() {
        // 단순 확인을 위한 프린트 문
        System.out.println("docRead");
        return true;
    }
    protected boolean result() {
        // 단순 확인을 위한 프린트 문
        System.out.println("docResult");
        return true;
    }
}

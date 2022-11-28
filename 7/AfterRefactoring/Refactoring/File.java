package Refactoring;

public abstract class File {

    protected String fileName;
    public File(String fileName){
        this.fileName = fileName;
    }

    protected abstract boolean read();
    protected abstract boolean result();

}

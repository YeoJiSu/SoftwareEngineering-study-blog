package Refactoring;

public abstract class Application {
    protected File file;
    public Application(File file){
        this.file = file;
    }
    public boolean open() {
        // check whether the file can be read!
        if (!checkFile(file)) {
            return false;
        }
        // read and process the file
        if (!processFile(file)) {
            return false;
        }
        return true;
    }

    protected abstract boolean checkFile(File file);

    protected abstract boolean processFile(File file);
}

package SOLID.LSP;

public class Main {
    public static void main(String[] args) {
        ReadableFile readableFile = new ReadableFile();
        readableFile.read();

        WriteableFile writeableFile = new WriteableFile();
        writeableFile.write();
        readableFile.read();

    }
}

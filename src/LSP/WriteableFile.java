package LSP;

public class WriteableFile implements Readable,Writeable{
    @Override
    public void read() {
        System.out.println("reading file");
    }

    @Override
    public void write() {
        System.out.println("writing file");
    }
}

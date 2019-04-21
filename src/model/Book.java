package model;

public class Book {
    private String name;
    private String WriterName;
    private String Nasher;
    private boolean rezerv=false;

    public void setRezerv(boolean rezerv) {
        this.rezerv = rezerv;
    }
    public Book(String Name,String writerName,String nasher)
    {
        name=Name;
        WriterName=writerName;
        Nasher=nasher;
    }
    public boolean isRezerv() {
        return rezerv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNasher() {
        return Nasher;
    }

    public void setNasher(String nasher) {
        Nasher = nasher;
    }

    public String getWriterName() {
        return WriterName;
    }

    public void setWriterName(String writerName) {
        WriterName = writerName;
    }
}

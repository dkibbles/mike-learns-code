package board;

public class Coordinates {
    
    File file;
    Integer rank;

    Coordinates(File file, Integer rank) {

        this.file = file;
        this.rank = rank;

    }

    public File getFile() {
        return file;
    }

    public Integer getRank() {
        
        return rank;
    }

    @Override
    public String toString() {
        return "squareCoordinates [file=" + file + ", rank=" + rank + "]";
    }

    
}

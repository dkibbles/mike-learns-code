package board;

public class squareCoordinates {
    
    File file;
    Integer rank;

    squareCoordinates(File file, Integer rank) {

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

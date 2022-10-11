package board;

public class Coordinates {

    String file;
    Integer rank;

    Coordinates(String file, Integer rank) {

            this.file = file;
            this.rank = rank;
        

    }

    public String getFile() {
        return file;
    }

    public Integer getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Coordinates [file=" + file + ", rank=" + rank + "]";
    }

    }
    


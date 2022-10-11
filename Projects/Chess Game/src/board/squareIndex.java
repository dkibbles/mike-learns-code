package board;

public class squareIndex {

    int file;
    int rank;

    squareIndex(int file, int rank) {

        this.file = file;
        this.rank = rank;

    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + file;
        result = prime * result + rank;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        squareIndex other = (squareIndex) obj;
        if (file != other.file)
            return false;
        if (rank != other.rank)
            return false;
        return true;
    }



    public class squareIndexOffsets {

        public squareIndexOffsets(squareIndex current, int fileOffset, int rankOffset) {   
            
        }

        public squareIndex queenSideDirectionalOffset(Square square) {

            squareIndex currentSquareIndex;
            squareIndex newSquareIndex;

            int currentFile;
            int currentRank;

            int newFile;
            int newRank;

            currentSquareIndex = square.getIndex();
            currentFile = currentSquareIndex.getFile();
            currentRank = currentSquareIndex.getRank();

            newFile = currentFile--;
            newRank = currentRank;

            newSquareIndex = new squareIndex(newFile, newRank);

            return newSquareIndex;
                
        }

        public squareIndex  kingSideDirectionalOffset(Square square) {

            squareIndex currentSquareIndex;
            squareIndex newSquareIndex;

            int currentFile;
            int currentRank;

            int newFile;
            int newRank;

            currentSquareIndex = square.getIndex();
            currentFile = currentSquareIndex.getFile();
            currentRank = currentSquareIndex.getRank();

            newFile = currentFile++;
            newRank = currentRank;

            newSquareIndex = new squareIndex(newFile, newRank);

            return newSquareIndex;

        }

        public squareIndex positiveDirectionalOffset(Square square) {

            squareIndex currentSquareIndex;
            squareIndex newSquareIndex;

            int currentFile;
            int currentRank;

            int newFile;
            int newRank;

            currentSquareIndex = square.getIndex();
            currentFile = currentSquareIndex.getFile();
            currentRank = currentSquareIndex.getRank();

            newFile = currentFile;
            newRank = currentRank++;

            newSquareIndex = new squareIndex(newFile, newRank);

            return newSquareIndex;

        }

        public squareIndex negativeDirectionalOffset(Square square) {

            squareIndex currentSquareIndex;
            squareIndex newSquareIndex;

            int currentFile;
            int currentRank;

            int newFile;
            int newRank;

            currentSquareIndex = square.getIndex();
            currentFile = currentSquareIndex.getFile();
            currentRank = currentSquareIndex.getRank();

            newFile = currentFile;
            newRank = currentRank--;

            newSquareIndex = new squareIndex(newFile, newRank);

            return newSquareIndex;

        }

        public squareIndex queenSidePositiveDirectionalOffset(Square square) {

            squareIndex currentSquareIndex;
            squareIndex newSquareIndex;

            int currentFile;
            int currentRank;

            int newFile;
            int newRank;

            currentSquareIndex = square.getIndex();
            currentFile = currentSquareIndex.getFile();
            currentRank = currentSquareIndex.getRank();

            newFile = currentFile--;
            newRank = currentRank++;

            newSquareIndex = new squareIndex(newFile, newRank);

            return newSquareIndex;
                
        }

        public squareIndex kingSidePositiveDirectionalOffset(Square square) {

            squareIndex currentSquareIndex;
            squareIndex newSquareIndex;

            int currentFile;
            int currentRank;

            int newFile;
            int newRank;

            currentSquareIndex = square.getIndex();
            currentFile = currentSquareIndex.getFile();
            currentRank = currentSquareIndex.getRank();

            newFile = currentFile++;
            newRank = currentRank++;

            newSquareIndex = new squareIndex(newFile, newRank);

            return newSquareIndex;

        }

        public squareIndex queenSideNegativeDirectionalOffset(Square square) {

            squareIndex currentSquareIndex;
            squareIndex newSquareIndex;

            int currentFile;
            int currentRank;

            int newFile;
            int newRank;

            currentSquareIndex = square.getIndex();
            currentFile = currentSquareIndex.getFile();
            currentRank = currentSquareIndex.getRank();

            newFile = currentFile--;
            newRank = currentRank--;

            newSquareIndex = new squareIndex(newFile, newRank);

            return newSquareIndex;

        }

        public squareIndex kingSideNegativeDirectionalOffset(Square square) {

            squareIndex currentSquareIndex;
            squareIndex newSquareIndex;

            int currentFile;
            int currentRank;

            int newFile;
            int newRank;

            currentSquareIndex = square.getIndex();
            currentFile = currentSquareIndex.getFile();
            currentRank = currentSquareIndex.getRank();

            newFile = currentFile++;
            newRank = currentRank--;

            newSquareIndex = new squareIndex(newFile, newRank);

            return newSquareIndex;

        }
        
    }
    
}

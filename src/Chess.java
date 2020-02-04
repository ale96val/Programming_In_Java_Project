import java.util.LinkedList;

public class Chess {  //Class for the chess.

    public static void main(String[] args) {  //Main class.

        Piece[][] chessboard = new Piece[3][3];  //Two-dimensional array for represent the chessboard.
        LinkedList ChessboardPlaces = new LinkedList();  //List with all the positions of the chessboard.

        //Creating five pieces and placing it randomly according to the chess rules.
        Knight KnightBlack1 = new Knight("KnightBlack1", Color.Black, getPlace());
        Knight KnightBlack2 = new Knight("KnightBlack2", Color.Black, getPlace());
        Rook RookWhite1 = new Rook("RookWhite1", Color.White, getPlace());
        Rook RookWhite2 = new Rook("RookWhite2", Color.White, getPlace());
        Queen QueenBlack1 = new Queen("QueenBlack1", Color.Black, getPlace());
        Queen QueenWhite1 = new Queen("QueenWhite1", Color.White, getPlace());
    }

    private static String getPlace() {  //Method to create a random place according to the chess rules.
        return null;
    }

    private static String ActualState(Piece){  //Method to show the actual state of the chessboard.
        return null;
    }
}

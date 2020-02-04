public class Piece {  //Abstract class Piece.

    String PieceName;  //String for the name of the piece.
    Color PieceColor;  //Enum type for the color of the piece.
    String Place; //String for the place of the Piece in the chessboard.

    public Piece(String pieceName, Color pieceColor, String Place) {  //General constructor for Piece.

        PieceName = pieceName;
        PieceColor = pieceColor;
        Place = Place;
    }

    //Getters and Setter of Piece.
    public String getPieceName() {
        return PieceName;
    }

    public void setPieceName(String pieceName) {
        PieceName = pieceName;
    }

    public Color getPieceColor() {
        return PieceColor;
    }

    public void setPieceColor(Color pieceColor) {
        PieceColor = pieceColor;
    }

    public String getPiecePlace() {
        return Place;
    }

    public void setPiecePlace(String Place) {
        Place = Place;
    }

    //ToString for Piece.
    public String toString() {
        return "Piece{" +
                "PieceName='" + PieceName + '\'' +
                ", PieceColor=" + PieceColor + '\'' +
                ", Place=" + Place +
                '}';
    }
}

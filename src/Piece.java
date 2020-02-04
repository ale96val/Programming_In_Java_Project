import java.util.LinkedList;

public class Piece {  //Abstract class Piece.

    String PieceName;  //String for the name of the piece.
    Color PieceColor;  //Enum type for the color of the piece.
    String PiecePlace; //String for the place of the Piece in the chessboard.

    public Piece(String pieceName, Color pieceColor, String Place) {  //General constructor for Piece.

        PieceName = pieceName;
        PieceColor = pieceColor;
        PiecePlace = Place;
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
        return PiecePlace;
    }

    public void setPiecePlace(String Place) {
        PiecePlace = Place;
    }

    //ToString for Piece.
    public String toString() {
        return "Piece{" +
                "PieceName='" + PieceName + '\'' +
                ", PieceColor=" + PieceColor + '\'' +
                ", Place=" + PiecePlace +
                '}';
    }

     public String getName(){  //Produces the two letters code.

        String pname = getPieceName();
        Color PieceColor = getPieceColor();
        String color = "A";
        String name = "A";

        switch (PieceColor) {  //Choose the letter of the color.
            case Black:
                color = "B";
                break;
            case White:
                color = "W";
                break;
        }

        if(pname.contains("ight")){  //Chose the letter of the piece.
            name = "K";
        }else if(pname.contains("ook")){
            name = "R";
        }else if(pname.contains("een")){
            name = "Q";
        }

        //Create the code:
        String code = name.concat(color);
        return code;
     }

     public void moveTo(String position) throws Exceptions {  //Move a Piece to other place.

        if(Chess.ChessboardPlacesUsed.contains(position)){
            throw new Exceptions("Place already in use.");
        }else{
            Chess.ChessboardPlacesUsed.remove(PiecePlace);
            Chess.ChessboardPlacesUsed.add(position);
            PiecePlace = position;
        }


     }
}

import java.util.LinkedList;

public class Piece {  //Abstract class Piece.

    PieceName pName;  //String for the name of the piece.
    Color PieceColor;  //Enum type for the color of the piece.
    String PiecePlace; //String for the place of the Piece in the chessboard.

    public Piece(PieceName pieceName, Color pieceColor, String Place) {  //General constructor for Piece.

        pName = pieceName;
        PieceColor = pieceColor;
        PiecePlace = Place;
    }

    //Getters and Setter of Piece.
    public String getPieceName() {
        return pName.toString();
    }

    public void setPieceName(PieceName pieceName) {
        pName = pieceName;
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
                "PieceName='" + pName.toString() + '\'' +
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
            name = "N";
        }else if(pname.contains("ook")){
            name = "R";
        }else if(pname.contains("een")){
            name = "Q";
        }else if(pname.contains("shop")){
            name = "B";
        }else if(pname.contains("Pawn")){
            name = "P";
        }else if(pname.contains("ing")){
            name = "K";
        }

        //Create the code:
        String code = name.concat(color);
        return code;
     }

     //Moving pieces to places where other pieces of the same or different colors are not allowed for this example.
     public void moveTo(String position) throws Exceptions {  //Move a Piece to other place.

        if(Chess.ChessboardPlacesUsed.contains(position)){
            throw new Exceptions("Place already in use.");
        }else{
            Chess.ChessboardPlacesUsed.remove(PiecePlace);
            String[] parts = PiecePlace.split(",");
            String part1 = parts[0];
            String part2 = parts[1];
            Chess.chessboard[Chess.getNumericalValue(part1)][Integer.parseInt(part2) - 1] = null;
            PiecePlace = position;
            Chess.ChessboardPlacesUsed.add(position);
            parts = position.split(",");
            part1 = parts[0];
            part2 = parts[1];
            Chess.chessboard[Chess.getNumericalValue(part1)][Integer.parseInt(part2) - 1] = Piece.this;
        }


     }
}

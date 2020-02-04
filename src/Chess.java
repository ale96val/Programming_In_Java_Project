import java.util.LinkedList;

public class Chess {  //Class for the chess.

    public static void main(String[] args) {  //Main class.

        Piece[][] chessboard = new Piece[6][2];  //Two-dimensional array for represent the chessboard.

        LinkedList ChessboardPlaces = new LinkedList();  //List with all the positions of the chessboard.

        //Filling the ChessboardPlaces List.
        ChessboardPlaces.add("A1");
        ChessboardPlaces.add("A2");
        ChessboardPlaces.add("A3");
        ChessboardPlaces.add("A4");
        ChessboardPlaces.add("A5");
        ChessboardPlaces.add("A6");
        ChessboardPlaces.add("A7");
        ChessboardPlaces.add("A8");
        ChessboardPlaces.add("B1");
        ChessboardPlaces.add("B2");
        ChessboardPlaces.add("B3");
        ChessboardPlaces.add("B4");
        ChessboardPlaces.add("B5");
        ChessboardPlaces.add("B6");
        ChessboardPlaces.add("B7");
        ChessboardPlaces.add("C1");
        ChessboardPlaces.add("C2");
        ChessboardPlaces.add("C3");
        ChessboardPlaces.add("C4");
        ChessboardPlaces.add("C5");
        ChessboardPlaces.add("C6");
        ChessboardPlaces.add("C7");
        ChessboardPlaces.add("C8");
        ChessboardPlaces.add("D1");
        ChessboardPlaces.add("D2");
        ChessboardPlaces.add("D3");
        ChessboardPlaces.add("D4");
        ChessboardPlaces.add("D5");
        ChessboardPlaces.add("D6");
        ChessboardPlaces.add("D7");
        ChessboardPlaces.add("D8");
        ChessboardPlaces.add("E1");
        ChessboardPlaces.add("E2");
        ChessboardPlaces.add("E3");
        ChessboardPlaces.add("E4");
        ChessboardPlaces.add("E5");
        ChessboardPlaces.add("E6");
        ChessboardPlaces.add("E7");
        ChessboardPlaces.add("E8");
        ChessboardPlaces.add("F1");
        ChessboardPlaces.add("F2");
        ChessboardPlaces.add("F3");
        ChessboardPlaces.add("F4");
        ChessboardPlaces.add("F5");
        ChessboardPlaces.add("F6");
        ChessboardPlaces.add("F7");
        ChessboardPlaces.add("F8");
        ChessboardPlaces.add("G1");
        ChessboardPlaces.add("G2");
        ChessboardPlaces.add("G3");
        ChessboardPlaces.add("G4");
        ChessboardPlaces.add("G5");
        ChessboardPlaces.add("G6");
        ChessboardPlaces.add("G7");
        ChessboardPlaces.add("G8");
        ChessboardPlaces.add("H1");
        ChessboardPlaces.add("H2");
        ChessboardPlaces.add("H3");
        ChessboardPlaces.add("H4");
        ChessboardPlaces.add("H5");
        ChessboardPlaces.add("H6");
        ChessboardPlaces.add("H7");
        ChessboardPlaces.add("H8");

        //Creating five pieces and placing it randomly according to the chess rules.
        Knight KnightBlack1 = new Knight("KnightBlack1", Color.Black, getPlace(ChessboardPlaces));
        Knight KnightBlack2 = new Knight("KnightBlack2", Color.Black, getPlace(ChessboardPlaces));
        Rook RookWhite1 = new Rook("RookWhite1", Color.White, getPlace(ChessboardPlaces));
        Rook RookWhite2 = new Rook("RookWhite2", Color.White, getPlace(ChessboardPlaces));
        Queen QueenBlack1 = new Queen("QueenBlack1", Color.Black, getPlace(ChessboardPlaces));
        Queen QueenWhite1 = new Queen("QueenWhite1", Color.White, getPlace(ChessboardPlaces));

        //Print information about the Pieces created.
        System.out.println("INFORMATION ABOUT THE PIECES CREATED: ");
        System.out.println(KnightBlack1.toString());
        System.out.println(KnightBlack2.toString());
        System.out.println(RookWhite1.toString());
        System.out.println(RookWhite2.toString());
        System.out.println(QueenBlack1.toString());
        System.out.println(QueenWhite1.toString());

        //Print information about the code of the Pieces created.
        System.out.println("INFORMATION ABOUT THE CODE OF THE PIECES CREATED: ");
        System.out.println(KnightBlack1.getName());
        System.out.println(KnightBlack2.getName());
        System.out.println(RookWhite1.getName());
        System.out.println(RookWhite2.getName());
        System.out.println(QueenBlack1.getName());
        System.out.println(QueenWhite1.getName());

        //Print the current state of the chessboard.
        System.out.println("CURRENT STATE OF THE CHESSBOARD: ");
        System.out.println(getState());

    }  //End of the main class.

    //List with all the positions of the chessboard used.
    static LinkedList ChessboardPlacesUsed = new LinkedList();

    private static String getPlace(LinkedList avaliables) {  //Method to create a random place according to the chess rules.

        Integer i = (int) (Math.random() * 64);  //Random number to choose a place.
        String chosen = avaliables.get(i).toString();  //Choose the place from the list.

        while(ChessboardPlacesUsed.contains(chosen)){  //Check that the place has not been used before or choose other.
            i = (int) (Math.random() * 64);
            chosen = avaliables.get(i).toString();
        }
        ChessboardPlacesUsed.add(chosen);  //Add the place to the list of places used.
        return chosen;  //Return the place.
    }

    private static String getState(){  //Method to show the actual state of the chessboard.
        String text ="A";
    return text;
    }
}

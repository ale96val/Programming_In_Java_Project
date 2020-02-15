import java.util.LinkedList;

public class Chess {  //Class for the chess.

    //List with all the positions of the chessboard used.
    public static LinkedList ChessboardPlacesUsed = new LinkedList();

    public static Piece[] chessboard = new Piece[6]; //Two-dimensional array for represent the chessboard.

    public static LinkedList ChessboardPlaces = new LinkedList();  //List with all the positions of the chessboard.

    public static void main(String[] args) throws Exceptions {  //Main class.

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
        //Adding the element to chessboard array to control it status at each time.
        Knight KnightBlack1 = new Knight(PieceName.KnightBlack1, Color.Black, getPlace(ChessboardPlaces));
        chessboard[0] = KnightBlack1;
        Knight KnightBlack2 = new Knight(PieceName.KnightBlack2, Color.Black, getPlace(ChessboardPlaces));
        chessboard[1] = KnightBlack2;
        Rook RookWhite1 = new Rook(PieceName.RookWhite1, Color.White, getPlace(ChessboardPlaces));
        chessboard[2] = RookWhite1;
        Rook RookWhite2 = new Rook(PieceName.RookWhite2, Color.White, getPlace(ChessboardPlaces));
        chessboard[3] = RookWhite2;
        Queen QueenBlack1 = new Queen(PieceName.QueenBlack, Color.Black, getPlace(ChessboardPlaces));
        chessboard[4] = QueenBlack1;
        Queen QueenWhite1 = new Queen(PieceName.QueenWhite, Color.White, getPlace(ChessboardPlaces));
        chessboard[5] = QueenWhite1;

        //Print information about the Pieces created.
        System.out.println("INFORMATION ABOUT THE PIECES CREATED: ");
        System.out.println(KnightBlack1.toString());
        System.out.println(KnightBlack2.toString());
        System.out.println(RookWhite1.toString());
        System.out.println(RookWhite2.toString());
        System.out.println(QueenBlack1.toString());
        System.out.println(QueenWhite1.toString());
        System.out.println();

        //Print information about the code of the Pieces created.
        System.out.println("INFORMATION ABOUT THE CODE OF THE PIECES CREATED: ");
        System.out.println(KnightBlack1.getName());
        System.out.println(KnightBlack2.getName());
        System.out.println(RookWhite1.getName());
        System.out.println(RookWhite2.getName());
        System.out.println(QueenBlack1.getName());
        System.out.println(QueenWhite1.getName());
        System.out.println();

        //Print the current state of the chessboard.
        System.out.println("CURRENT STATE OF THE CHESSBOARD: ");
        getState(chessboard);
        System.out.println();

        //Move some Pieces:
        System.out.println("MOVE SOME PIECES WITH CORRECT MOVEMENTS: ");
        System.out.println("Star position: ");
        System.out.println(KnightBlack1.getName() +", "+ KnightBlack1.getPiecePlace());
        KnightBlack1.moveTo("A2");
        System.out.println("New position: ");
        System.out.println(KnightBlack1.getName() +", "+ KnightBlack1.getPiecePlace());
        System.out.println();

        System.out.println("MOVE SOME PIECES WITH INCORRECT MOVEMENTS: ");
        System.out.println("Star position: ");
        System.out.println(KnightBlack1.getName() +", "+ KnightBlack1.getPiecePlace());
        try {
            KnightBlack1.moveTo(QueenBlack1.getPiecePlace());
        }catch (Exceptions ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("New position: ");
        System.out.println(KnightBlack1.getName() +", "+ KnightBlack1.getPiecePlace());
        System.out.println();

        //Create some random pieces.
        System.out.println("CREATE SOME RANDOM PIECES: ");
        System.out.println("New Piece: ");
        randomPiece();


    }  //End of the main class.

    private static String getPlace(LinkedList avaliables) {  //Method to create a random place according to the chess rules.
            Integer i = (int) (Math.random() * 63);  //Random number to choose a place.
            String chosen = avaliables.get(i).toString();  //Choose the place from the list.

            while (ChessboardPlacesUsed.contains(chosen)) {  //Check that the place has not been used before or choose other.
                i = (int) (Math.random() * 64);
                chosen = avaliables.get(i).toString();
            }
            ChessboardPlacesUsed.add(chosen);  //Add the place to the list of places used.

        return chosen;  //Return the place.
    }

    private static void getState(Piece[] actualstatus){  //Method to show the actual state of the chessboard.
        System.out.println("The pieces are situated in the next places in this moment: ");
        for (Piece p: actualstatus) {
            System.out.println(p.getName() + ", " + p.getPiecePlace());
        }
    }

    private static void randomPiece() {  //Method to create random pieces.
        PieceName NewpName = PieceName.randomPieceName();
        Piece  newPiece = new Piece(NewpName, Color.randomColor(), getPlace(ChessboardPlaces));
        chessboard[5] = newPiece;
        System.out.println(newPiece.toString());
    }
}

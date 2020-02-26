import java.util.LinkedList;  //Import for list.
import java.util.Scanner;  //Import for scanner.

public class Chess {  //Class for the chess.

    //List with all the positions of the chessboard used.
    public static LinkedList ChessboardPlacesUsed = new LinkedList();

    //Two-dimensional array for represent the chessboard.
    public static Piece[][] chessboard = new Piece[8][8];


    //List with all the positions of the chessboard.
    public static LinkedList ChessboardPlaces = new LinkedList();

    //Main class.
    public static void main(String[] args) throws Exceptions {

        //Filling the ChessboardPlaces List.
        ChessboardPlaces.add("A,1");
        ChessboardPlaces.add("A,2");
        ChessboardPlaces.add("A,3");
        ChessboardPlaces.add("A,4");
        ChessboardPlaces.add("A,5");
        ChessboardPlaces.add("A,6");
        ChessboardPlaces.add("A,7");
        ChessboardPlaces.add("A,8");
        ChessboardPlaces.add("B,1");
        ChessboardPlaces.add("B,2");
        ChessboardPlaces.add("B,3");
        ChessboardPlaces.add("B,4");
        ChessboardPlaces.add("B,5");
        ChessboardPlaces.add("B,6");
        ChessboardPlaces.add("B,7");
        ChessboardPlaces.add("C,1");
        ChessboardPlaces.add("C,2");
        ChessboardPlaces.add("C,3");
        ChessboardPlaces.add("C,4");
        ChessboardPlaces.add("C,5");
        ChessboardPlaces.add("C,6");
        ChessboardPlaces.add("C,7");
        ChessboardPlaces.add("C,8");
        ChessboardPlaces.add("D,1");
        ChessboardPlaces.add("D,2");
        ChessboardPlaces.add("D,3");
        ChessboardPlaces.add("D,4");
        ChessboardPlaces.add("D,5");
        ChessboardPlaces.add("D,6");
        ChessboardPlaces.add("D,7");
        ChessboardPlaces.add("D,8");
        ChessboardPlaces.add("E,1");
        ChessboardPlaces.add("E,2");
        ChessboardPlaces.add("E,3");
        ChessboardPlaces.add("E,4");
        ChessboardPlaces.add("E,5");
        ChessboardPlaces.add("E,6");
        ChessboardPlaces.add("E,7");
        ChessboardPlaces.add("E,8");
        ChessboardPlaces.add("F,1");
        ChessboardPlaces.add("F,2");
        ChessboardPlaces.add("F,3");
        ChessboardPlaces.add("F,4");
        ChessboardPlaces.add("F,5");
        ChessboardPlaces.add("F,6");
        ChessboardPlaces.add("F,7");
        ChessboardPlaces.add("F,8");
        ChessboardPlaces.add("G,1");
        ChessboardPlaces.add("G,2");
        ChessboardPlaces.add("G,3");
        ChessboardPlaces.add("G,4");
        ChessboardPlaces.add("G,5");
        ChessboardPlaces.add("G,6");
        ChessboardPlaces.add("G,7");
        ChessboardPlaces.add("G,8");
        ChessboardPlaces.add("H,1");
        ChessboardPlaces.add("H,2");
        ChessboardPlaces.add("H,3");
        ChessboardPlaces.add("H,4");
        ChessboardPlaces.add("H,5");
        ChessboardPlaces.add("H,6");
        ChessboardPlaces.add("H,7");
        ChessboardPlaces.add("H,8");

        //Creating five pieces and placing it randomly according to the chess rules.
        //Adding the element to chessboard array to control it status at each time.
        String position = "";  //String to convert position from string to integer.

        Knight KnightBlack1 = new Knight(PieceName.KnightBlack1, Color.Black, getPlace(ChessboardPlaces));
        position = KnightBlack1.getPiecePlace();  //Get the new position.
        ChessboardPlacesUsed.add(position);  //Add to the used position list.
        String[] parts = position.split(",");  //Convert the position to integer for add it to the chessboard.
        String part1 = parts[0];
        String part2 = parts[1];
        chessboard[getNumericalValue(part1)][Integer.parseInt(part2) - 1] = KnightBlack1; //Add the position to the chessboard.

        Knight KnightBlack2 = new Knight(PieceName.KnightBlack2, Color.Black, getPlace(ChessboardPlaces));
        position = KnightBlack2.getPiecePlace();
        ChessboardPlacesUsed.add(position);
        parts = position.split(",");
        part1 = parts[0];
        part2 = parts[1];
        chessboard[getNumericalValue(part1)][Integer.parseInt(part2) - 1] = KnightBlack2;

        Rook RookWhite1 = new Rook(PieceName.RookWhite1, Color.White, getPlace(ChessboardPlaces));
        position = RookWhite1.getPiecePlace();
        ChessboardPlacesUsed.add(position);
        parts = position.split(",");
        part1 = parts[0];
        part2 = parts[1];
        chessboard[getNumericalValue(part1)][Integer.parseInt(part2) - 1] = RookWhite1;

        Rook RookWhite2 = new Rook(PieceName.RookWhite2, Color.White, getPlace(ChessboardPlaces));
        position = RookWhite2.getPiecePlace();
        ChessboardPlacesUsed.add(position);
        parts = position.split(",");
        part1 = parts[0];
        part2 = parts[1];
        chessboard[getNumericalValue(part1)][Integer.parseInt(part2) - 1] = RookWhite2;

        Queen QueenBlack1 = new Queen(PieceName.QueenBlack, Color.Black, getPlace(ChessboardPlaces));
        position = QueenBlack1.getPiecePlace();
        ChessboardPlacesUsed.add(position);
        parts = position.split(",");
        part1 = parts[0];
        part2 = parts[1];
        chessboard[getNumericalValue(part1)][Integer.parseInt(part2) - 1] = QueenBlack1;

        Queen QueenWhite1 = new Queen(PieceName.QueenWhite, Color.White, getPlace(ChessboardPlaces));
        position = QueenWhite1.getPiecePlace();
        ChessboardPlacesUsed.add(position);
        parts = position.split(",");
        part1 = parts[0];
        part2 = parts[1];
        chessboard[getNumericalValue(part1)][Integer.parseInt(part2) - 1] = QueenWhite1;

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
        KnightBlack1.moveTo(getPlace(ChessboardPlaces));
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
        System.out.println("New Piece: ");
        randomPiece();
        System.out.println("New Piece: ");
        randomPiece();
        System.out.println("New Piece: ");
        randomPiece();
        System.out.println("New chessboard status:");
        getState(chessboard);
        System.out.println();

        //The user selects next option.
        System.out.println("SELECT NEXT OPTION: ");
        System.out.println("FOR CURRENT STATUS WRITE: st");
        System.out.println("FOR RANDOM PIECE WRITE: rd");
        String option;
        Scanner keyboard = new Scanner(System.in);
        option = keyboard.nextLine();
        switch (option) {
            case "st":
                getState(chessboard);
                break;
            case "rd":
                randomPiece();
                getState(chessboard);
                break;

            default:
                System.out.println("Option not allowed.");
        }
        System.out.println();

        System.out.println("TEST COMPLETED.");
        
    }  //End of the main class.

    //Method to create a random place according to the chess rules.
    private static String getPlace(LinkedList availables) throws Exceptions {

            Object chosen = null;
            String schosen = "";
            Integer i = (int) (Math.random() * 63);  //Random number to choose a place.

            chosen = availables.get(i);  //Choose the place from the list.
            schosen = chosen.toString();

            for(Object s: ChessboardPlacesUsed) {  //Check that the place has not been used before or choose other.
                if (s.toString() == schosen) {
                    schosen = getPlace(availables);
                }
            }
        return schosen;  //Return the place.

    }

    //Method to show the actual state of the chessboard.
    private static void getState(Piece[][] actualstatus) {

        System.out.println("The pieces are situated in the next places in this moment: ");
        System.out.println("// A  B  C  D  E  F  G  H");

        for(int i=0; i<=7; i++){  //Check all position of the chessboard.
            System.out.print(i + 1);
            System.out.print(" ");
            for (int n=0; n<=7; n++){
                if(actualstatus[n][i] != null){
                    System.out.print(actualstatus[n][i].getName());  //Print piece name.
                    System.out.print(" ");
                }else if(actualstatus[n][i] == null){
                    System.out.print("[]");  //Print place not used.
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    //Method to create random pieces.
    private static void randomPiece() throws Exceptions {

        PieceName NewpName = PieceName.randomPieceName();  //Select a random name.

        for (Piece[] letter: chessboard) {//If the name selected have been already used select other.
            for (Piece nbr : letter) {
                if (nbr != null) {
                    if (NewpName.toString() == nbr.getPieceName()) {
                        NewpName = PieceName.randomPieceName();
                    }
                }
            }
        }

        Piece  newPiece = new Piece(NewpName, Color.randomColor(), getPlace(ChessboardPlaces));  //Create piece with the information obtained.
        ChessboardPlacesUsed.add(newPiece.getPiecePlace());  //Add the place to the list of places used.
        int nbr_n = 0;  //Count the actual number of pieces in the chessboard.

        for (Piece[] letter: chessboard) {  //Check if the maximum of pieces have been reached.
            if(letter != null) {
                for (Piece nbr : letter) {
                    if (nbr != null) {
                        nbr_n = nbr_n + 1;
                    }
                }
            }
        }

        if(nbr_n <=32) {  //If the chessboard has places, add one piece to the chessboard.
            String rposition = newPiece.getPiecePlace();
            String[] parts = rposition.split(",");
            String part1 = parts[0];
            String part2 = parts[1];
            chessboard[getNumericalValue(part1)][Integer.parseInt(part2) - 1] =newPiece;
        }else {
            throw new Exceptions("Maximum of pieces reached");
        }

        System.out.println(newPiece.toString());
    }

    //Method to convert the string position in a position of the chessboard.
    static int getNumericalValue(String chain_to_int) {

        int nb = 0;

        switch (chain_to_int) {
            case "A":
                nb = 0;
                break;
            case "B":
                nb = 1;
                break;
            case "C":
                nb = 2;
                break;
            case "D":
                nb = 3;
                break;
            case "E":
                nb = 4;
                break;
            case "F":
                nb = 5;
                break;
            case "G":
                nb = 6;
                break;
            case "H":
                nb = 7;
                break;
        }

        return nb;
    }
}

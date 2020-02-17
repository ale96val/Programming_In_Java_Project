# Programming_In_Java_Project
Project for the programming course in java.

Project about chess pieces:

      -There is an abstract "Piece" class representing a general piece element with an abstract getName() method that returns a value of type String.
      
      -There are three classes, inheriting from the Piece class, representing specific elements (chess pieces) appearing in chess.
      
      -The implementations of the getName () method should return a two-letter description of the piece.
      
      -The main class is "Chess" class, where the chessboard is stored in a two-dimensional array of abstract elements of the "Piece" type.
      
      -The first process of the program is to draw 5 elements (chess pieces) and place them randomly on a chessboard according to the general rules of chess.
      
      -The current state of the chessboard should be displayed in a simplified way that allow to know the situation of it.
      
Information about files and methods in the code.
The source files are:

      -Chess. This is the chess file and also the main class.
      
      -Color. This is an enumeration class for the piece colors.
      
      -Exceptions. This is a class to add some exceptions control to the code.
      
      -Knight. This is the class for define the Knight pieces.
      
      -Queen. This is the class for define de Queen pieces.
      
      -Rook. This is the class for define the Rook pieces.
      
      -PieceName. This is a enumeration class for the piece names.
      
      -Piece. This is the class for all the pieces. Rook, Queen, and Knight extends this class.
      
When the main class is executed, all funtions are methods are tested and the information is printed on the console. The functions are methods availables are:

      -Default getters and setters of the classes.
      
      -getState: prints the information about the situation of all the pieces in the chessboard.
      
      -moveTo(): try to move a piece to a new chessboard place.
      
      -randomPiece(): create a new random piece following chess regulations and place its on the chessboard.
      
      -getPlace(): try to select a random place of the chessboard following the chess regulations.
      
      -getName(): obtains a two letter code for represent the piece.
      
      -randomPieceName: selects a piece name from the PieceName enumeration class.
      
      -randomColor: selects a piece color from the Color enumeration class.
     
 All this functions and methods are tested in the main class of the project.

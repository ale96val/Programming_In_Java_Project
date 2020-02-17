import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum PieceName {

    KnightBlack1,
    KnightBlack2,
    RookWhite1,
    RookWhite2,
    QueenBlack,
    QueenWhite,
    KingBlack,
    KingWhite,
    PawnBlack1,
    PawnBlack2,
    PawnBlack3,
    PawnBlack4,
    PawnBlack5,
    PawnBlack6,
    PawnBlack7,
    PawnBlack8,
    PawnWhite1,
    PawnWhite2,
    PawnWhite3,
    PawnWhite4,
    PawnWhite5,
    PawnWhite6,
    PawnWhite7,
    PawnWhite8,
    BishopBlack1,
    BishopBlack2,
    BishopWhite1,
    BishopWhite2;

    private static final List<PieceName> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));

    private static final int SIZE = VALUES.size();

    private static final Random RANDOM = new Random();

    public static PieceName randomPieceName()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
    }

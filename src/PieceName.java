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
    KingWhite;

    private static final List<PieceName> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static PieceName randomPieceName()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
    }

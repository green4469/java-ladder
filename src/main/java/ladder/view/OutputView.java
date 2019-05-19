package ladder.view;

import ladder.domain.*;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class OutputView {
    private static final int PADDING_WIDTH = 5;

    public static void printPlayerNames(Players players) {
        List<PlayerName> names = players.getPlayerNames();
        for (PlayerName name : names) {
            System.out.printf("%s ", StringUtils.center(name.getName(), PADDING_WIDTH));
        }
        System.out.println();
    }

    public static void printLadder(Ladder ladder) {
        while (ladder.hasNextLine()) {
            printLine(ladder.getNextLine());
        }
    }

    private static void printLine(Line line) {
        System.out.print("  |");
        for (Point point : line.getPoints()) {
            printPoint(point);
            System.out.print("|");
        }
        System.out.println();
    }

    private static void printPoint(Point point) {
        if (point.getCurrent()) {
            System.out.print("-----");
            return;
        }
        System.out.print("     ");
    }
}

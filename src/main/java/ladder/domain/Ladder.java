package ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private List<Line> lines = new ArrayList<>();

    public Ladder(final int numPlayers, final int height) {
        for (int i = 0; i < height; i++) {
            lines.add(new Line(makePoints(numPlayers)));
        }
    }

    private static List<Boolean> makePoints(final int numPlayers) {
        List<Boolean> points = new ArrayList<>();
        points.add(randomBoolean());

        while (points.size() < numPlayers - 1) {
            points.add(validRandom(points.get(points.size() - 1)));
        }

        return points;
    }

    private static boolean randomBoolean() {
        return (int) (Math.random() * 2) > 0;
    }

    private static boolean validRandom(final boolean prev) {
        if (prev) {
            return false;
        }
        return randomBoolean();
    }

    public List<Player> goDown(List<Player> players) {
        return goDown(lines, players);
    }

    static List<Player> goDown(final List<Line> lines, final List<Player> players) {
        for (Line line : lines) {
            goDownOneLine(players, line);
        }
        return players;
    }

    private static void goDownOneLine(final List<Player> players, final Line line) {
        for (Player player : players) {
            player.goDown(line);
        }
    }

    public List<Line> getLines() {
        return lines;
    }

}

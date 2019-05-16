package ladder.domain;

import java.util.Objects;

public class Player {
    public static final int MAX_NAME_LENGTH = 5;
    public static final int MIN_NAME_LENGTH = 1;

    private final String name;
    private int position;

    public Player(final String name, final int position, final int numOfPlayers) {
        validateNameNotNull(name);
        validateNameLength(this.name = name.trim());
        validatePosition(position, numOfPlayers);
        this.position = position;
    }

    private static void validatePosition(int position, int numOfPlayers) {
        if (position >= numOfPlayers || position < 0) {
            throw new IllegalArgumentException("플레이어의 위치는 0 이상이고 플레이어 전체 수보다 작아야합니다.");
        }
    }

    private static void validateNameNotNull(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 널(null)일 수 없습니다.");
        }
    }

    private void validateNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH || name.length() < MIN_NAME_LENGTH) {
            throw new IllegalArgumentException("이름은 1자 이상 5자 이내여야 합니다.");
        }
    }

    void goDown(final Line line) {
        position += line.getDirection(position);
    }

    public String getName() {
        return name;
    }

    int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return position == player.position &&
                Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}

package baseball;

public enum BallCountType {
    STRIKE("스트라이크", "S"),
    BALL("볼", "B"),
    OUT("낫싱", "O");

    private final String korName;
    private final String shortCode;

    BallCountType(final String korName, final String shortCode){
        this.korName = korName;
        this.shortCode = shortCode;
    }
}

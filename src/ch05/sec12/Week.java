package ch05.sec12;

public enum Week {
    MONDAY(0),
    TUESDAY(1),
    WEDNESDAY(2),
    THURSDAY(3),
    FRIDAY(4),
    SATURDAY(5),
    SUNDAY(6);

    private int idx;
    private Week(int idx) {
        this.idx = idx;
    }
}

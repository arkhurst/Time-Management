package sample;

public enum  AttemptKind {
    FOCUS(3, "Focus time"),
    BREAK(5 * 60,"Break time");

    private int mTotalSeconds;
    private String mDisplayName;

    AttemptKind(int TotalSeconds, String displayName) {
        this.mTotalSeconds = TotalSeconds;
        this.mDisplayName = displayName;
    }
    public int getmTotalSeconds(){
        return mTotalSeconds;
    }

    public String getDisplayName() {
        return mDisplayName;
    }
}

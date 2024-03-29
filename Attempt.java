package sample;

public class Attempt {

    private String mMessage;
    private int mRemainingSeconds;
    private AttemptKind mKind;

    public Attempt(AttemptKind kind, String message){
        mKind = kind;
        mMessage = message;
        mRemainingSeconds = kind.getmTotalSeconds();
    }
    public AttemptKind getKind(){
        return mKind;
    }
    public String getMessage(){
        return mMessage;
    }
    public int getmRemainingSeconds(){
        return mRemainingSeconds;
    }

    public void setMessage(String message){
        mMessage = message;
    }

    public void tick() {
        mRemainingSeconds --;
    }

    @Override
    public String toString() {
        return "Attempt{" +
                "mMessage='" + mMessage + '\'' +
                ", mRemainingSeconds=" + mRemainingSeconds +
                ", mKind=" + mKind +
                '}';
    }

    public void save() {
        System.out.printf("Saving: %s %n", this);
    }
}

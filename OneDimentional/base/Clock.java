package OneDimentional.base;

public class Clock {

    int hours = 0;
    int minutes = 0;
    int seconds = 0;

    public void setTime(int s, int m, int hrs)
    {
        this.hours = hrs;
        this.minutes = m;
        this.seconds = s;
    }

    @Override
    public String toString() {
        return "Hours : " + hours + " Minutes :" + minutes + " Seconds :" + seconds;
    }
}

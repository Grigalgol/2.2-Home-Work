public class Time {
    int hour, min, sec;
    public Time(int s) {
        hour = s/3600;
        s%=3600;
        min=s/60;
        sec=s%60;
    }
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}

package Clock;

public class Timer  {

    private ClockHand hundSeconds;
    private ClockHand seconds;

    public Timer() {
        this.hundSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {

        this.hundSeconds.advance();


        if(this.hundSeconds.value() == 0){
            this.seconds.advance();


        }

    }

    public String toString() {

        return this.seconds + ":" + this.hundSeconds;
    }

}
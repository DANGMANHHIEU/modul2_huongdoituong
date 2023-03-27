import java.time.LocalTime;

public class bai2 {
    public static void main(String[] args) {
        stopWatch watch = new stopWatch();
        watch.start();
        System.out.println("dem thoi gian");
        for(int i =1;i<1000000000;i++){

        }
        watch.stop();
        watch.getElapsedTime();
    }
}
class stopWatch {
    private LocalTime startTime;
    private LocalTime endTime;
    stopWatch() {
        startTime = LocalTime.now();
    }

    public LocalTime getStartTime(LocalTime startTime) {
        return startTime;
    }

    public LocalTime getEndTime(LocalTime endTime) {
        return endTime;
    }

    public void start() {
        this.startTime = LocalTime.now();
        getStartTime(startTime);
    }

    public void stop() {
        this.endTime = LocalTime.now();
        getEndTime(endTime);
    }

    public void getElapsedTime() {
        int ElapsedTime = (startTime.toSecondOfDay()-endTime.toSecondOfDay())*100;
        System.out.println("so mili giay dem duoc: " + ElapsedTime);
    }

}

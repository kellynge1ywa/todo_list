
import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;

public class Task {
    private String Title;
    private int Duration;
    private LocalTime StartTime;

    public Task(String Title,int Durationn,LocalTime StartTime) {
        this.Title=Title;
        this.Duration=Durationn;
        this.StartTime=StartTime;
       
    }

    public String getTitle()
    {
        return Title;
    }

    public int geDuration()
    {
        return Duration;
    }

    public LocalTime getStartTime()
    {
        return StartTime;
    }

}

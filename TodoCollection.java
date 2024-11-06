import java.util.ArrayList;
import java.util.List;

public class TodoCollection {
    private List<Task> Tasks;

    public TodoCollection() {
        Tasks=new ArrayList<>();
    }

    public void AddTask(Task task)
    {
        Tasks.add(task);
    }

    public List<Task> getAllTasks()
    {
        
        if(Tasks.isEmpty())
        {
            System.out.println("Tasks not found");
            return new ArrayList<>();
        }
        else
        {
            for (Task taskks: Tasks)
            {
                System.out.println("Title: " + taskks.getTitle()+", " + "Duration: " + taskks.geDuration() +" minutes"+", " +
                "Start time: " + taskks.getStartTime());
            }
            return new ArrayList<>(Tasks);
        }
    }

    public Task getTask(String title)
    {
        for(Task taskk: Tasks)
        {
            if(taskk.getTitle().equals(title)){
                System.out.println("Title: " + taskk.getTitle()+", " + "Duration: " + taskk.geDuration() +" minutes"+", " +
                "Start time: " + taskk.getStartTime());
                return taskk;
            }
        }
        return new Task(title, 0, null);
    }

    public void RemoveTask(String title)
    {
        Tasks.removeIf(task-> task.getTitle().equals(title));
    }

}

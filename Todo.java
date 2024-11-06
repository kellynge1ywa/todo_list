
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

class Todo{
    private static TodoCollection todoCollection=new TodoCollection();
    public  static void main(String[] args) {
        {
            Scanner scanner=new Scanner(System.in);
            int selectOption;

            do
            {
                System.out.println("Welcome to our todo list");
                System.out.println("1. Add Task");
                System.out.println("2. Get all tasks");
                System.out.println("3. Get one task");
                System.out.println("4. Remove task");
                System.out.println("5. Exit");
                System.out.print("Select your option: ");
                selectOption=scanner.nextInt();
                scanner.nextLine();

                switch (selectOption) {
                    case 1:
                        addTask(scanner);
                        break;
                    
                    case 2:
                       todoCollection.getAllTasks();
                       break;
                     
                    case 3:
                       getTaskk(scanner);
                       break;  
                     
                    case 4:
                       removeTask(scanner);
                       break;   

                    case 5:
                       System.out.println("Exiting. Bye!!!");
                       break;

                    default:
                       System.out.println("Invalid option. Try again!!");
                        break;
                }


            }
            while(selectOption !=5);
            scanner.close();
        }

        
    }
    private static void addTask(Scanner scanner)
    {
        System.out.print("Enter title: ");
        String title=scanner.nextLine();

        System.out.print("Enter duration: ");
        int durationn=scanner.nextInt();
        

        System.out.print("Enter starting time (HH:mm): ");
        String start_time=scanner.next();
        LocalTime startTime=LocalTime.parse(start_time);

        Task newTask=new Task(title,durationn,startTime);
        todoCollection.AddTask(newTask);
        System.out.println("Task added successfully!!!");
    }

    private static void removeTask(Scanner scanner)
    {
        System.out.print("Enter task to remove: ");
        String taskTitle=scanner.nextLine();

        todoCollection.RemoveTask(taskTitle);
        System.out.println("Task "+ taskTitle + " Removed successfully!!!");
    }
    private static void getTaskk(Scanner scanner)
    {
        System.out.print("Enter task you want to fetch: ");
        String title=scanner.nextLine();

        todoCollection.getTask(title);
    }
}
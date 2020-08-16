import java.util.Date;
import java.util.Scanner;

public class Note {
    public static final String NHẬP_TASK = "Nhập task";
    public static final String TASK_NÀY_CÓ_RỒI = "Task này có rồi";
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String content;
    private String[] tasks = new String[20];
    private Date dateCreated = new Date();
    private Date dateEdit = new Date();

    public Note() {
    }

    public Note(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDateEdit(Date dateEdit) {
        this.dateEdit = dateEdit;
    }

    public void addTask(int size) {
        while (size > 20) {
            System.out.println("Số task tối đa là 20");
            size = Integer.parseInt(scanner.nextLine());
        }
        int index = 0;
        String task;
        while (index < size) {
            System.out.println(NHẬP_TASK + (index + 1));
            task = scanner.nextLine();
            while (isCheckTask(task)) {
                System.out.println(TASK_NÀY_CÓ_RỒI+". Nhập lại task mới");
                task = scanner.nextLine();
            }
            var length = tasks.length;
            for (int i = 0; i < length; i++) {
                if (tasks[i] == null) {
                    tasks[i] = task;
                    break;
                }
            }
            index++;
        }

    }

    public void editTask(int index) {
        System.out.println(NHẬP_TASK);
        String newTask = scanner.nextLine();
        while (isCheckTask(newTask)) {
            System.out.println(TASK_NÀY_CÓ_RỒI);
            newTask = scanner.nextLine();
        }
        tasks[index] = newTask;
        System.out.println("Sửa thành công");
    }

    public boolean isCheckTask(String newTask) {
        var length = tasks.length;
        for (String task : tasks) {
            if (newTask.equals(task)) {
                return true;
            }
        }
        return false;
    }

    public String displayTasks() {
        String text = "";
        var length = tasks.length;
        for (int i = 0; i < length; i++) {
            if (tasks[i] == null) {
                break;
            } else text += "-" + tasks[i] + "\n";
        }
        return text;
    }

    @Override
    public String toString() {
        return "Tiêu đề: " + name + "\n"
                + "Nội dung: " + content + "\n"
                + "Danh sách công việc:\n" + displayTasks()
                + "Ngày tạo: " + dateCreated + "\n"
                + "Ngày Sửa: " + dateEdit + "\n"
                + "---------------------------------------------------------------------";
    }
}


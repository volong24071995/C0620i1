
import java.util.Date;
import java.util.Scanner;

public class NotesManagement {
    public static final String KHÔNG_TIM_THẤY_NOTE = "Không tim thấy note";
    private Note[] notebook = new Note[128];
    private static int count = 0;
    Scanner scanner = new Scanner(System.in);

    public void addNote(Note note) {
        if (isCheckName(note.getName())) {
            System.out.println("Đã có ghi chú");
        } else {
            var length = notebook.length;
            if (count > length) {
                System.out.println("Ghi chú đã đầy không thêm được nữa");
            } else {
                for (int i = 0; i < length; i++) {
                    if (notebook[i] == null) {
                        notebook[i] = note;
                        count++;
                        break;
                    }
                }
                System.out.println("Bạn đã nhập ghi chú thành công\n");
            }
        }
    }

    public static void menuEdit() {
        System.out.println("1.Sửa tiêu đề:");
        System.out.println("2.Sửa nội dung");
        System.out.println("3.sủa danh sach:");
        System.out.println("0.Thoát");
    }

    public void editNote(String name) {
        if (isCheckName(name)) {
            for (int i = 0; i < count; i++) {
                var note = notebook[i];
                if (name.equals(note.getName())) {
                    System.out.println(note.toString());
                    menuEdit();
                    boolean check = true;
                    while (check) {
                        int chose = Integer.parseInt(scanner.nextLine());
                        switch (chose) {
                            case 1 -> {
                                System.out.println("Sửa tiêu đề:");
                                note.setName(scanner.nextLine());
                                note.setDateEdit(new Date());
                            }
                            case 2 -> {
                                System.out.println("Sửa nội dung:");
                                note.setContent(scanner.nextLine());
                                note.setDateEdit(new Date());
                            }
                            case 3 -> {
                                System.out.println("Sửa danh sách công việc:");
                                System.out.println(note.displayTasks());
                                System.out.println("Nhập vi tri cần sửa");
                                int index = Integer.parseInt(scanner.nextLine());
                                note.editTask(index);
                                note.setDateEdit(new Date());
                            }
                            case 0 -> check = false;
                        }
                    }
                    System.out.println("Đã update thanh cong");
                    break;
                }
            }
        } else System.out.println("Khong co tiêu đề này");
    }

    public static void menuDelete() {
        System.out.println("Bạn có xóa không");
        System.out.println("Bấm C để đồng ý");
        System.out.println("Bấm K để không");
    }

    public void deleteNote(String name) {
        if (isCheckName(name)) {
            for (int i = 0; i < count; i++) {
                if (name.equals(notebook[i].getName())) {
                    System.out.println(notebook[i].toString());
                    menuDelete();
                    System.out.println("Lựa chon");
                    String chose = scanner.nextLine();
                    switch (chose) {
                        case "C":
                            for (int j = i; j < count - 1; j++) {
                                notebook[j] = notebook[j + 1];
                            }
                            notebook[count - 1] = null;
                            count--;
                            System.out.println("Đã xóa thành công");
                            break;
                        case "K":
                            break;
                    }
                }
                break;
            }
        } else System.out.println(KHÔNG_TIM_THẤY_NOTE);
    }

    public String searchNote(String name) {
        String text = "";
        if (isCheckName(name)) {
            for (int i = 0; i < count; i++) {
                var note = notebook[i];
                if (name.equals(note.getName())) {
                    text += note.toString();
                    break;
                }
            }
        } else System.out.println(KHÔNG_TIM_THẤY_NOTE);
        return text;
    }

    public boolean isCheckName(String name) {
        for (int i = 0; i < count; i++) {
            var note = notebook[i];
            if (note == null) {
                return false;
            } else if (name.equals(note.getName())) {
                return true;
            }
        }
        return false;
    }

    public String displayMenu() {
        int countMenu = 0;
        String text = "";
        for (int i = count - 1; i >= 0; i--) {
            if (countMenu < 3) {
                var note = notebook[i];
                if (note != null) {
                    text += (countMenu + 1) + ". " + note.toString() + "\n";
                    countMenu++;
                }
            } else break;
        }
        return text;
    }

    public String displayAll() {
        String text = "";
        for (int i = 0; i < count; i++) {
            var note = notebook[i];
            if (note == null) {
                break;
            } else text += note.toString() + "\n";
        }
        return text;
    }
}

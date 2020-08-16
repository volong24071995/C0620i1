import java.util.Date;
import java.util.Scanner;

public class Screen {
    public static final String NHẬP_TÊN_GHI_CHÚ = "Nhập tên ghi chú";
    static Scanner scanner = new Scanner(System.in);
    private static NotesManagement noteBook = new NotesManagement();

    public static void menu() {
        System.out.println("Tạo ghi chú (Bấm C)");
        System.out.println("Sửa ghi chú (Bấm U)");
        System.out.println("Xóa ghi chú (Bấm D)");
        System.out.println("Xem danh sach (Bấm L)");
        System.out.println("Xem Ghi chu (Bấm F)");
        System.out.println();
        System.out.println(noteBook.displayMenu());
    }

    public static void add() {
        Note note = new Note();
        System.out.println(NHẬP_TÊN_GHI_CHÚ);
        note.setName(scanner.nextLine());
        System.out.println("Nhập nội dung:");
        note.setContent(scanner.nextLine());
        System.out.println("Nhập số công việc cần làm:");
        int size = Integer.parseInt(scanner.nextLine());
        note.addTask(size);
        noteBook.addNote(note);

    }

    public static void edit(){
        System.out.println(NHẬP_TÊN_GHI_CHÚ);
        String nameNote=scanner.nextLine();
        noteBook.editNote(nameNote);
    }

    public static void delete(){
        System.out.println(NHẬP_TÊN_GHI_CHÚ);
        String nameNote=scanner.nextLine();
        noteBook.deleteNote(nameNote);
    }

    public static void search() {
        System.out.println(NHẬP_TÊN_GHI_CHÚ);
        String name=scanner.nextLine();
        System.out.println(noteBook.searchNote(name));
    }
    public static void displayNoteBook(){
        System.out.println(noteBook.displayAll());
    }

    public static void main(String[] args) {
        String chose;
        while (true) {
            menu();
            System.out.println("Nhâp lưa chọn");
            chose = scanner.nextLine();
            switch (chose) {
                case "C":
                    add();
                    break;
                case "U":
                    System.out.println("Chỉnh sửa ghi chú");
                    edit();
                    break;
                case "D":
                    System.out.println("Xóa ghi chú");
                    delete();
                    break;
                case "L":
                    System.out.println("Danh sách ghi chú: \n");
                    displayNoteBook();
                    break;
                case "F":
                    System.out.println("Xem ghi chú:");
                    search();
                    break;
            }
        }
    }
}

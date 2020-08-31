public class Customer {
    private int taiKhoan=1000;

    public Customer(int taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
    public synchronized void ruttien(int soTienRut) {
        System.out.println("Giao dich ruts tien dang dc thuc hien voi: "+soTienRut+"...");
        if (taiKhoan<soTienRut){
            System.out.println("ko du tien");
          try{
              wait();
          }catch (InterruptedException e){
              System.out.println(e.toString());
          }
        }
        taiKhoan-=soTienRut;
        System.out.println("rut thanh cong tai khoan con: "+taiKhoan);
    }
    public synchronized void napTien(int sotiennap){
        System.out.println("Giao dich nop tien "+sotiennap);
        taiKhoan+=sotiennap;
        System.out.println("nop thanh cong "+taiKhoan);
        notify();
    }
}

//Bài tập Hiển thị số nguyên tố


public class BtHienThi20SoNguyenTo {
    public static void main(String[] args) {
        int count=0;
        for(int num=2;count<20;num++){
            if(kiemTraSoNguyenTo(num)){
                System.out.print(num+", ");
                count++;
            }
        }
    }

    public static boolean kiemTraSoNguyenTo(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

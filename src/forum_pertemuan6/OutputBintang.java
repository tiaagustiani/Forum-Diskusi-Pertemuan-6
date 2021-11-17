package forum_pertemuan6;
public class OutputBintang {
    
    public static void main(String[] args) {
        int x,y;
        for (x = 0; x <=5; x++) {
           //outer loop
            System.out.println();
            //Memberi garis baru atau enter
  
            for (int y1 = 0; y1 < x; y1++) {
                //inner loop
                System.out.print(" * ");
                //menampilkan bintang pada output  
            }
        }
    }  
}
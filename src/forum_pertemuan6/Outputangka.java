package forum_pertemuan6;
public class Outputangka {
    
    public static void main(String[] args) {
        int a,b;
        for (a = 1; a <=6; a++) {
           //outer loop
            System.out.println();
            //Memberi garis baru atau enter
  
            for (b = 1; b < a; b++) {
                //inner loop
                System.out.print(b + " ");
                //menampilkan bintang pada output  
            }
        }
    }  
} 
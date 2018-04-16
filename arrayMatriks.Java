package arraymatriks;

public class ArrayMatriks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriks1[][] = new int [3][3];          // ORDO MATRIKS 1
        matriks1 [0][0] = 1;                        //ELEMEN MATRIKS 1
        matriks1 [0][1] = 2;
        matriks1 [0][2] = 3;  
        matriks1 [1][0] = 4;
        matriks1 [1][1] = 5;
        matriks1 [1][2] = 6;
        matriks1 [2][0] = 7;
        matriks1 [2][1] = 8;
        matriks1 [2][2] = 9;
        
        int matriks2[][] = new int [3][3];          // ORDO MATRIKS 2
        matriks2 [0][0] = 10;                       // ELEMEN MATRIKS 2
        matriks2 [0][1] = 11;
        matriks2 [0][2] = 12;
        matriks2 [1][0] = 13;
        matriks2 [1][1] = 14;
        matriks2 [1][2] = 15;
        matriks2 [2][0] = 16;
        matriks2 [2][1] = 17;
        matriks2 [2][2] = 18;
        
        System.out.println("Matriks 1 : "); 
        for (int i=0; i<matriks1.length; i++){           // PERULANGAN MENAMPILKAN MATRIKS 1
            for (int j=0; j<matriks1[0].length; j++){
                System.out.print(matriks1 [i][j] + " "); // CETAK MATRIKS 1
            } 
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriks 2: ");
        for (int i=0; i<matriks2.length; i++){            // PERULANGAN MENAMPILKAN MATRIKS 2
            for (int j=0; j<matriks2[0].length; j++){
                System.out.print(matriks2 [i][j] + " ");  // CETAK MATRIKS 2
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("A. Penjumlahan Matriksnya adalah: ");
        for (int i=0; i<matriks1.length; i++){              // PROSES PENJUMLAHAN MATRIKS
            for (int j=0; j<matriks1[0].length; j++){
                int tambah = matriks1[i][j] + matriks2[i][j];
                
                System.out.print(tambah + " ");             // CETAK HASIL PENJUMLAHAN MATRIKS
            }
            System.out.println();
    }
        System.out.println();
        System.out.println("B. Pengurangan Matriksnya adalah: ");
        for (int i=0; i<matriks1.length; i++){              // PROSES PENGURANGAN MATRIKS
            for (int j=0; j<matriks1[0].length; j++){
                int kurang = matriks1[i][j] - matriks2[i][j];
                
                System.out.print(kurang + " ");             // CETAK HASIL PENGURANGAN MATRIKS
            }
            System.out.println();
    }
        System.out.println();
        System.out.println("C. Perkalian Matriknya adalah: ");
        for (int i=0; i<matriks1.length; i++){              // PROSES PERKALIAN MATRIKS
            for (int j=0; j<matriks1[0].length; j++){
                int kali = matriks1[i][j] * matriks2[i][j];
                
                System.out.print(kali + " ");               // CETAK HASIL PERKALIAN MATRIKS
            }
                    System.out.println();

    }
        System.out.println();
        System.out.println("D. Perkalian Matriks dengan skalar adalah: ");
        System.out.println("Matriks 1: ");
        for (int i=0; i<matriks1.length; i++){                              // PROSES PERKALIAN MATRIKS
            for (int j=0; j<matriks1[0].length; j++){
                int nilaiSkalar = 2;                                        // NILAI SKALAR
                System.out.print(matriks1[i][j] *  nilaiSkalar + " ");      // CETAK HASIL PERKALIAN MATRIKS
            }
            System.out.println();
    }
        System.out.println();
        System.out.println("Matriks 2: ");
        for (int i=0; i<matriks2.length; i++){                              // PROSES PERKALIAN MATRIKS
            for (int j=0; j<matriks2[0].length; j++){
                int nilaiSkalar = 2;
                System.out.print(matriks2[i][j] *  nilaiSkalar + " ");      // CETAK HASIL PERKALIAN MATRIKS
            }
            System.out.println();
    }
        System.out.println();
        System.out.println("E. Transpose Matriksnya adalah: ");
        System.out.println("Matriks 1 : ");
        for (int i=0; i<matriks1.length; i++){              // PROSES TRANSPOSE MATRIKS
            for (int j=0; j<matriks1[0].length; j++){
                System.out.print(matriks1 [j][i] + " ");    // CETAK HASIL TRANSPOSE MATRIKS
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriks 2: ");
        for (int i=0; i<matriks2.length; i++){              // PROSES TRANSPOSE MATRIKS
            for (int j=0; j<matriks2[0].length; j++){
                System.out.print(matriks2 [j][i] + " ");    // CETAK HASIL TRANSPOSE MATRIKS
            }
            System.out.println();
        }
        System.out.println();
    }
}

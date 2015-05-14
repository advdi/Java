import java.util.Scanner;
import java.util.Arrays;
public class Pojok {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Pojok summon = new Pojok();
        summon.run();
    }
    
    void run() {
        //kiriAtas();
        //kananAtas();
        //kiriBawah();
        //kananBawah();
        //bata();
        //invert();
        //linSearch();
        //searchRec();
        //arrayUmur();
        //vektor();
        //segitiga();
        //binSearch();
        //selection();
        //bubble();
        //System.out.println(faktorial(6));
        //System.out.println(fibonacci(6));
        searchmax();
    }
    
    void kiriAtas() {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    void kananAtas() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 10; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    void kiriBawah() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    void kananBawah() {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    void bata() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 4; l++) {
                        if(i%2 == 0) {
                            if(k%2 == 0)
                            System.out.print("x");
                        else
                            System.out.print(" ");
                        }
                        else {
                            if(k%2 == 0)
                            System.out.print(" ");
                        else
                            System.out.print("x");    
                        }
                    }
                }
                System.out.println("");
            }
        }
    }
    
    void invert() {
        String nama = "azmiadif";
        int panjang = nama.length();
        for (int i = 1; i <= panjang; i++) {
            System.out.print(nama.charAt(panjang-i));
        }
    }
    
    void linSearch() {
        int[] deret = {5,6,1,3,2,0,9,8,4,7};
        int panjang = deret.length;
        System.out.println("Sebuah deret adalah : ");
        for (int i = 0; i < panjang; i++) {
            System.out.printf("%d ", deret[i]);
        }
        System.out.println("");
        System.out.print("Masukkan angka yang akan dicari deret diatas : ");
        int angka = in.nextInt();
        int ketemu = search(angka, deret);
        System.out.printf("input berada di indeks %d", ketemu);
    }
    
    int search(int a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            if(a == b[i])
                return i;
        }
        return -1;
    }
    
    void searchRec() {
        int[] deret = {5,6,1,3,2,0,9,8,4,7};
        int panjang = deret.length;
        System.out.println("Sebuah deret adalah : ");
        for (int i = 0; i < panjang; i++) {
            System.out.printf("%d ", deret[i]);
        }
        System.out.println("");
        System.out.print("Masukkan angka yang akan dicari deret diatas : ");
        int input = in.nextInt();
        int value = rec(0,input,deret);
        System.out.printf("input berada di indeks %d", value);
    }
    
    int rec(int i, int find, int[] deret) {
        if (deret[i] == find)
            return i;
        else if(i == deret.length-1)
            return -1;
        else
            return rec(i+1, find, deret);
    }
    
    void arrayUmur() {
        int[] umur = {10, 23, 17, 45, 30};
        int jumlah = 0;
        for (int i = 0; i < umur.length; i++) {
            jumlah += umur[i];
        }
        System.out.printf("Jumlah umur keluarga saya adalah %d tahun", jumlah);
    }
    
    void vektor() {
        int[][] vektor = {{6,4},{-5,2},{3,-11},{2,9},{7,6},{-8,1}};
        int jumlah=0;
        for (int i = 0; i < vektor.length; i++) {
            jumlah += vektor[i][0]*vektor[i][1];
        }
        System.out.printf("Jumlah perkalian vektor = %d", jumlah);
    }
    
    void segitiga() {
        String blank = "  ";
        String fill  = "xx";
        
        int height   = 9;
        
        for (int i = 0; i < height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(blank);
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(fill);;
            }
            System.out.println("");
        }
    }
    
    void binSearch() {
        int[] deret = {5,6,1,3,2,0,9,8,4,7};
        Arrays.sort(deret);
        int panjang = deret.length;
        System.out.println("Sebuah deret adalah : ");
        for (int i = 0; i < panjang; i++) {
            System.out.printf("%d ", deret[i]);
        }
        System.out.println("");
        System.out.print("Masukkan angka yang akan dicari deret diatas : ");
        int input = in.nextInt();
        int value = bin(input,deret);
        System.out.printf("input berada di indeks %d", value);
    }
    
    int bin(int find, int[] deret) {
        int i = 0;
        int a = deret.length-1;
        while (i<=a) {
            int s = (i + a) >>> 1;
            int val = deret[s];
            if (val == find)
                return s;
            else if (find > val)
                i = val+1;
            else if (find < val)
                a = val-1;
        }
        return -1;
    }
    
    void selection() {
        int[] deret = {5,6,1,3,2,0,9,8,4,7};
        int panjang = deret.length;
        System.out.println("Sebuah deret adalah : ");
        for (int i = 0; i < panjang; i++) {
            System.out.printf("%d ", deret[i]);
        }
        System.out.println("\nSetelah diurutkan : ");
        for (int i = 0; i < deret.length; i++) {
            int min = i;
            
            for (int j = i+1; j < deret.length; j++) {
                if(deret[j] < deret[min])
                    min = j;
            }
            
            if(min != i) {
                int temp = deret[min];
                deret[min] = deret[i];
                deret[i] = temp;
            }
        }
        for (int i = 0; i < panjang; i++) {
            System.out.printf("%d ", deret[i]);
        }
    }
    
    void bubble() {
        int[] deret = {5,6,1,3,2,0,9,8,4,7};
        int panjang = deret.length;
        System.out.println("Sebuah deret adalah : ");
        for (int i = 0; i < panjang; i++) {
            System.out.printf("%d ", deret[i]);
        }
        System.out.println("\nSetelah diurutkan : ");
        
        boolean tukar = true;
        while(tukar) {
            tukar = false;
            for (int i = 0; i < deret.length-1; i++) {
                if(deret[i+1] < deret[i]) {
                    int temp = deret[i];
                    deret[i] = deret[i+1];
                    deret[i+1] = temp;
                    tukar = true;
                }  
            }
        }
        for (int i = 0; i < panjang; i++) {
            System.out.printf("%d ", deret[i]);
        }
    }
    
    int faktorial(int a) {
        if (a == 0)
            return 1;
        else
            return a*faktorial(a-1);
    }
    
    int fibonacci(int a) {
        if (a == 1 || a == 0)
            return a;
        else
            return fibonacci(a-1) + fibonacci(a-2);
    }
    
    void searchmax() {
        int[] deret = {5,6,1,3,2,0,-9,8,4,7};
        //Arrays.sort(deret);
        int panjang = deret.length;
        System.out.println("Sebuah deret adalah : ");
        for (int i = 0; i < panjang; i++) {
            System.out.printf("%d ", deret[i]);
        }
        int a = findmax(deret);
        System.out.printf("Nilai maksimm dari deret diatas : %d", a);
    }
    
    int findmax(int[] deret) {
        int max = 0;
        for (int i = 0; i < deret.length-1; i++) {
            if(deret[i] > deret[i+1])
                max = i;
            else
                max = i+1;
        }
        return max;
    }
}

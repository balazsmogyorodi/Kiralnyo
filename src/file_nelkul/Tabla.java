package file_nelkul;

//1
public class Tabla {

    //2
    private char[][] T;
    private char uresCella;

    //3
    public Tabla(char uresCella) {
        //a
        T = new char[8][8];
        //b
        this.uresCella = uresCella;
        //c
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                T[i][j] = uresCella;
            }
        }
    }

    //4
    void megjelenit() {
        for (char[] tomb : T) {
            for (char c : tomb) {
                System.out.print(c + "");
            }
            System.out.println("");
        }
    }

    //5
    void elhelyez(int n) {
        /* 1db 'K' elhelyezése 2. sor, 5. oszlop: */
//        int sor = 2;
//        int oszl = 5;
//        T[sor][oszl] = 'K';

        /* n-szer véletlenszerű helyre: */
//        for (int i = 0; i < n; i++) {
//            int sor = (int)(Math.random() * 8);
//            int oszl = (int)(Math.random() * 8);
//            T[sor][oszl] = 'K';
//        }
        /* ugyanoda már nem rakhat: */
        int joDb = 0;
        while (joDb < n) {
            int sor = (int) (Math.random() * 8);
            int oszl = (int) (Math.random() * 8);
            if (T[sor][oszl] != 'K') {
                T[sor][oszl] = 'K';
                joDb++;
            }
        }
    }

    //7
    boolean uresSor(int sor) {
        /* eldöntés tétele sablon: */
//        int i = 0;
//        while(i < N && !(keresett tulajdonság)){
//            i++;
//        }
//        boolean van = i < N || i >= N;

        /* eldöntés tétele a feladatra: */
        //i --> oszlop
        int i = 0;
        while (i < 8 && !(T[sor][i] == 'K')) {
            i++;
        }
        return i >= 8;
    }

    boolean uresOszlop(int oszlop) {
        //eldöntés tétele:
        //i --> sor
        int i = 0;
        while (i < 8 && !(T[i][oszlop] == 'K')) {
            i++;
        }
        return i >= 8;
    }

    //8
    int uresSorokSzama() {
        //megszámlálás tétele:
        int uresSorDb = 0;
        //i --> sor
        for (int i = 0; i < 8; i++) {
            if (uresSor(i)) {
                uresSorDb++;
            }
        }
        return uresSorDb;
    }

    int uresOszlopokSzama() {
        /* megszámlálás tétele sablon: */
//        int db = 0;
//        for (int i = 0; i < N; i++) {
//            if(jó){
//                db++;
//            }
//        }

        /* megszámlálás tétele  a feladatra: */
        int uresOszlopDb = 0;
        //i --> oszlop
        for (int i = 0; i < 8; i++) {
            if (uresOszlop(i)) {
                uresOszlopDb++;
            }
        }
        return uresOszlopDb;
    }
}

package file_nelkul;

import java.io.IOException;

public class Kiralynok {

    public static void main(String[] args) throws IOException {
        //4
        Tabla tabla = new Tabla('#');
        System.out.println("4. feladat: Az üres tábla:");
        tabla.megjelenit();
        
        //6
        System.out.println("6. feladat: A feltöltött tábla");
        tabla.elhelyez(8);
        tabla.megjelenit();
        
        //9
        System.out.println("9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + tabla.uresOszlopokSzama());
        System.out.println("Sorok: " + tabla.uresSorokSzama());
        
        //10
        for (int i = 1; i <= 64; i++) {
            Tabla t = new Tabla('*');
            t.elhelyez(i);
            t.megjelenit();
            System.out.println("");
        }
    }
    
}

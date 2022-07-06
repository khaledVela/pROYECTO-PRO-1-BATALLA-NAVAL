import java.util.Scanner;
public class DosPersonas {

    Scanner teclado = new Scanner(System.in);
    int barcosJug1[] = new int[17];
    int barcosJug2[] = new int[17];
    int a1 = 0;
    int b1 = 0;
    int c1 = 0; 
    int d1 = 0; 
    int e1 = 0;
    int f1 = 0; 
    int a2 = 0;
    int b2 = 0;
    int c2 = 0; 
    int d2 = 0; 
    int e2 = 0;
    int f2 = 0; 
    int hundidosJug1[] = new int[5];
    int hundidosJug2[] = new int[5];     
    int columna;
    int fila;
    int BRestantJug1 = 7;
    int BRestantJug2 = 7;
    double numero;
    boolean esLetra = false;
    String Jug1;
    String Jug2;
    String disparo;
    String arriba[] = {"| |", "1|", "2|", "3|", "4|", "5|", "6|", "7|", "8|", "9"};
    String mapaJug1[][] = new String[9][10];
    String mapaJug2[][] = new String[9][10];

    public DosPersonas() {
        System.out.println("Jugador 1 ingrese su nombre");
        Jug1=teclado.nextLine();
        System.out.println("Jugador 2 ingrese su nombre");
        Jug2=teclado.nextLine();
        Preparacion();
        BarcosJug1();
        BarcosJug2();
        Impacto();
    }

    private void Preparacion() {
        mapaJug2[0][0] = mapaJug1[0][0] = "a";
        mapaJug2[1][0] = mapaJug1[1][0] = "b";
        mapaJug2[2][0] = mapaJug1[2][0] = "c";
        mapaJug2[3][0] = mapaJug1[3][0] = "d";
        mapaJug2[4][0] = mapaJug1[4][0] = "e";
        mapaJug2[5][0] = mapaJug1[5][0] = "f";
        mapaJug2[6][0] = mapaJug1[6][0] = "g";
        mapaJug2[7][0] = mapaJug1[7][0] = "h";
        mapaJug2[8][0] = mapaJug1[8][0] = "i";
        //creo mapa inicial
        for (int column = 0; column < mapaJug1.length; column++) {
            for (int line = 1; line < mapaJug1[0].length; line++) {
                mapaJug1[column][line] = "\u001B[34m0\u001B[37m";
            }
        }
        for (int column = 0; column < mapaJug2.length; column++) {
            for (int line = 1; line < mapaJug2[0].length; line++) {
                mapaJug2[column][line] = "\u001B[34m0\u001B[37m";
            }
        }
    }

    private void BarcosJug1() {
        barcosJug1[0] = (int) Math.floor(Math.random() * (9) + 1);
        barcosJug1[1] = (int) Math.floor(Math.random() * (9) + 1);
        while (barcosJug1[0] == barcosJug1[1]) {
            barcosJug1[1] = (int) Math.floor(Math.random() * (9) + 1);
        }
        barcosJug1[2] = (int) Math.floor(Math.random() * (8) + 1);
        barcosJug1[3] = barcosJug1[2] + 1;
        barcosJug1[4] = (int) Math.floor(Math.random() * (7) + 1);
        barcosJug1[5] = barcosJug1[4] + 1;
        barcosJug1[6] = barcosJug1[5] + 1;
        barcosJug1[7] = (int) Math.floor(Math.random() * (7) + 1);
        barcosJug1[8] = barcosJug1[7] + 1;
        barcosJug1[9] = barcosJug1[8] + 1;
        barcosJug1[10] = (int) Math.floor(Math.random() * (7) + 1);
        barcosJug1[11] = barcosJug1[10] + 1;
        barcosJug1[12] = barcosJug1[11] + 1;
        barcosJug1[13] = (int) Math.floor(Math.random() * (6) + 1);
        barcosJug1[14] = barcosJug1[13] + 1;
        barcosJug1[15] = barcosJug1[14] + 1;
        barcosJug1[16] = barcosJug1[15] + 1;

        while ((a1 == b1) || (a1 == c1) || (a1 == d1) || (a1 == e1) || (a1 == f1)) {
            a1 = (int) Math.floor(Math.random() * 8 + 1);
        }
        while ((b1 == a1) || (b1 == c1) || (b1 == d1) || (b1 == e1) || (b1 == f1)) {
            b1 = (int) Math.floor(Math.random() * 8 + 1);
        }
        while ((c1 == a1) || (c1 == b1) || (c1 == d1) || (c1 == e1) || (c1 == f1)) {
            c1 = (int) Math.floor(Math.random() * 8 + 1);
        }
        while ((d1 == a1) || (d1 == b1) || (d1 == c1) || (d1 == e1) || (d1 == f1)) {
            d1 = (int) Math.floor(Math.random() * 8 + 1);
        }
        while ((e1 == a1) || (e1 == b1) || (e1 == c1) || (e1 == d1) || (e1 == f1)) {
            e1 = (int) Math.floor(Math.random() * 8 + 1);
        }
        f1 = (int) Math.floor(Math.random() * 8 + 1);
        while ((f1 == a1) || (f1 == b1) || (f1 == c1) || (f1 == d1) || (f1 == e1)) {
            f1 = (int) Math.floor(Math.random() * 8 + 1);
        }
    }
    private void BarcosJug2() {
        barcosJug2[0] = (int) Math.floor(Math.random() * (9) + 1);
        barcosJug2[1] = (int) Math.floor(Math.random() * (9) + 1);
        while (barcosJug2[0] == barcosJug2[1]) {
            barcosJug2[1] = (int) Math.floor(Math.random() * (9) + 1);
        }
        barcosJug2[2] = (int) Math.floor(Math.random() * (8) + 1);
        barcosJug2[3] = barcosJug2[2] + 1;
        barcosJug2[4] = (int) Math.floor(Math.random() * (7) + 1);
        barcosJug2[5] = barcosJug2[4] + 1;
        barcosJug2[6] = barcosJug2[5] + 1;
        barcosJug2[7] = (int) Math.floor(Math.random() * (7) + 1);
        barcosJug2[8] = barcosJug2[7] + 1;
        barcosJug2[9] = barcosJug2[8] + 1;
        barcosJug2[10] = (int) Math.floor(Math.random() * (7) + 1);
        barcosJug2[11] = barcosJug2[10] + 1;
        barcosJug2[12] = barcosJug2[11] + 1;
        barcosJug2[13] = (int) Math.floor(Math.random() * (6) + 1);
        barcosJug2[14] = barcosJug2[13] + 1;
        barcosJug2[15] = barcosJug2[14] + 1;
        barcosJug2[16] = barcosJug2[15] + 1;

        while ((a2 == b2) || (a2 == c2) || (a2 == d2) || (a2 == e2) || (a2 == f2)) {
            a2 = (int) Math.floor(Math.random() * 8 + 1);
        }
        while ((b2 == a2) || (b2 == c2) || (b2 == d2) || (b2 == e2) || (b2 == f2)) {
            b2 = (int) Math.floor(Math.random() * 8 + 1);
        }
        while ((c2 == a2) || (c2 == b2) || (c2 == d2) || (c2 == e2) || (c2 == f2)) {
            c2 = (int) Math.floor(Math.random() * 8 + 1);
        }
        while ((d2 == a2) || (d2 == b2) || (d2 == c2) || (d2 == e2) || (d2 == f2)) {
            d2 = (int) Math.floor(Math.random() * 8 + 1);
        }
        while ((e2 == a2) || (e2 == b2) || (e2 == c2) || (e2 == d2) || (e2 == f2)) {
            e2 = (int) Math.floor(Math.random() * 8 + 1);
        }
        f2 = (int) Math.floor(Math.random() * 8 + 1);
        while ((f2 == a2) || (f2 == b2) || (f2 == c2) || (f2 == d2) || (f2 == e2)) {
            f2 = (int) Math.floor(Math.random() * 8 + 1);
        }
    }
    
    private void Impacto() {
        while((BRestantJug1!=0)&&(BRestantJug2!=0)){
            // Jugador 1
            if ((BRestantJug1!=0)&&(BRestantJug2!=0)){
                System.out.println("\u001B[33mAlmirante 1: \u001B[37m"+Jug1);
                Ataque();    
                if(!disparo.toLowerCase().equals("me rindo")){
                    InterseccionJug1();
                }else{
                    System.out.println("\u001B[33mEl almirante 1 se a rendido\u001B[37m");
                    System.out.println("\u001B[32mGanaste ALMIRANTE: \u001B[37m" + Jug2);
                }
            }
            
            //jugador 2
            if ((BRestantJug1!=0)&&(BRestantJug2!=0)){
                System.out.println("\u001B[33mAlmirante 2: \u001B[37m"+Jug2);
                Ataque();  
                if (!disparo.toLowerCase().equals("me rindo")) {
                    InterseccionJug2();
                } else {
                    System.out.println("\u001B[33mEl almirante 2 se a rendido\u001B[37m");
                    System.out.println("\u001B[32mGanaste ALMIRANTE: \u001B[37m" + Jug1);
                }
            }            
            // caso no se rinda
            if ((BRestantJug2==0) && (!disparo.toLowerCase().equals("me rindo"))){
                System.out.println("\u001B[32mGanaste ALMIRANTE: \u001B[37m" + Jug2);
            }
            if ((BRestantJug1==0) && (!disparo.toLowerCase().equals("me rindo"))){
                System.out.println("\u001B[32mGanaste ALMIRANTE: \u001B[37m" + Jug1);
            }
        }
    }
     
    private void Ataque() {
        boolean impacto= false;
        System.out.println("\u001B[31mIndica la casilla a atacar!!");
        System.out.println("\u001B[31mPrimero la columna y luego la fila ej: 4g\u001B[37m");
        while(!impacto){
            disparo = teclado.nextLine();
            if(disparo.length() == 2) {
                try {
                    columna = Integer.parseInt(disparo.substring(0, 1));
                    if((columna>0)&&(columna<10)){
                        disparo = disparo.substring(1, 2);
                        switch (disparo.toLowerCase()) {
                            case "a":
                                fila = 0;                        
                                impacto = true;
                                break;
                            case "b":
                                fila = 1;
                                impacto = true;
                                break;
                            case "c":
                                fila = 2;
                                impacto = true;
                                break;
                            case "d":
                                fila = 3;
                                impacto = true;
                                break;
                            case "e":
                                fila = 4;
                                impacto = true;
                                break;
                            case "f":
                                fila = 5;
                                impacto = true;
                                break;
                            case "g":
                                fila = 6;
                                impacto = true;                            
                                break;
                            case "h":
                                fila = 7;
                                impacto = true;
                                break;
                            case "i":
                                fila = 8;
                                impacto = true;
                                break;
                            default:
                                System.out.println("\u001B[33mIngresa una letra entre a - i");
                                System.out.println("\u001B[33mIntente otra vez\u001B[37m");
                                break;
                        }
                    }
                }catch(NumberFormatException e){
                    System.out.println("\u001B[33mtiene que ser un numero entre el 1 y el 9");
                    System.out.println("\u001B[33mIntente otra vez\u001B[37m");
                }
            }if(disparo.toLowerCase().equals("me rindo")){
                impacto = true;
                BRestantJug1=0;
                BRestantJug2=0;
            }if((!disparo.toLowerCase().equals("me rindo")) && (disparo.length() != 2 )){
                System.out.println("\u001B[33mIngrese el comando como se le indico\u001B[37m");
            }
        }
    }    
    
    private void InterseccionJug1(){
        for (int i = 0; i < 17; i++) {
            if(i<2){
                if((columna==barcosJug1[i])&&(fila==a1)&&(mapaJug1[fila][columna]=="\u001B[34m0\u001B[37m")){
                    BRestantJug1--;
                    mapaJug1[fila][columna]="\u001B[36mF\u001B[37m";
                    System.out.println("\u001B[32mLe diste a un barco");
                    System.out.println("\u001B[32mHundiste una fragata\u001B[37m");
                }
            }
            if((i>1)&&(i<4)){
                if((columna==barcosJug1[i])&&(fila==b1)&&(mapaJug1[fila][columna]=="\u001B[34m0\u001B[37m")){
                    hundidosJug1[0]++;
                    mapaJug1[fila][columna]="\u001B[36mD\u001B[37m";
                    System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                } 
            }
            if((i>3)&&(i<7)){
                if((columna==barcosJug1[i])&&(fila==c1)&&(mapaJug1[fila][columna]=="\u001B[34m0\u001B[37m")){
                    hundidosJug1[1]++;
                    mapaJug1[fila][columna]="\u001B[36mS\u001B[37m";
                    System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                }
            }
            if ((i>6)&&(i<10)){
                if((columna==barcosJug1[i])&&(fila==d1)&&(mapaJug1[fila][columna]=="\u001B[34m0\u001B[37m")){
                    hundidosJug1[2]++;
                    mapaJug1[fila][columna]="\u001B[36mS\u001B[37m";
                    System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                }   
            }
            if((i>9)&&(i<13)){
                if((columna==barcosJug1[i])&&(fila==e1)&&(mapaJug1[fila][columna]=="\u001B[34m0\u001B[37m")){
                    hundidosJug1[3]++;
                    mapaJug1[fila][columna]="\u001B[36mA\u001B[37m";
                    System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                }  
            }
            if((i>12)&&(i<17)){
                if((columna==barcosJug1[i])&&(fila==f1)&&(mapaJug1[fila][columna]=="\u001B[34m0\u001B[37m")){
                    hundidosJug1[4]++;
                    mapaJug1[fila][columna]="\u001B[36mP\u001B[37m";
                    System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                }    
            }
        }
        if(mapaJug1[fila][columna]=="\u001B[34m0\u001B[37m"){
            mapaJug1[fila][columna]="X";
            System.out.println("\u001B[31mNo le diste a ningun barco\u001B[37m");
        }
        if(hundidosJug1[0]==2){
            System.out.println("\u001B[32mHundiste un destructor\u001B[37m");
            hundidosJug1[0]=0;
            BRestantJug1--;
        }
        if(hundidosJug1[1]==3){
            System.out.println("\u001B[32mHundiste un submarino\u001B[37m");
            hundidosJug1[1]=0;
            BRestantJug1--;
        }
        if(hundidosJug1[2]==3){
            System.out.println("\u001B[32mHundiste un submarino\u001B[37m");
            hundidosJug1[2]=0;
            BRestantJug1--;
        }
        if(hundidosJug1[3]==3){
            System.out.println("\u001B[32mHundiste un acorazado\u001B[37m");
            hundidosJug1[3]=0;
            BRestantJug1--;
        }
        if(hundidosJug1[4]==4){
            System.out.println("\u001B[32mHundiste un porta aviones\u001B[37m");
            hundidosJug1[4]=0;
            BRestantJug1--;
        }
            //imprimo los numeros de las columnas
            for (int i = 0; i < arriba.length; i++) {
                System.out.print(arriba[i]);
            }
            System.out.println("|");
            //imprimo el mapa
            for (int i = 0; i < mapaJug1.length; i++) {
                for (int j = 0; j < mapaJug1[0].length; j++) {
                    System.out.print("|" + mapaJug1[i][j]);
                }
                System.out.println("|");
            }
            System.out.println("\u001B[33mBarcos restantes: \u001B[37m" + BRestantJug1);  
    }
    
    private void InterseccionJug2(){
        for (int i = 0; i < 17; i++) {
            if(i<2){
                if((columna==barcosJug2[i])&&(fila==a2)&&(mapaJug2[fila][columna]=="\u001B[34m0\u001B[37m")){
                    BRestantJug2--;
                    mapaJug2[fila][columna]="\u001B[36mF\u001B[37m";
                    System.out.println("\u001B[32mLe diste a un barco");
                    System.out.println("\u001B[32mHundiste una fragata\u001B[37m");
                }
            }
            if((i>1)&&(i<4)){
                if((columna==barcosJug2[i])&&(fila==b2)&&(mapaJug2[fila][columna]=="\u001B[34m0\u001B[37m")){
                    hundidosJug2[0]++;
                    mapaJug2[fila][columna]="\u001B[36mD\u001B[37m";
                    System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                } 
            }
            if((i>3)&&(i<7)){
                if((columna==barcosJug2[i])&&(fila==c2)&&(mapaJug2[fila][columna]=="\u001B[34m0\u001B[37m")){
                    hundidosJug2[1]++;
                    mapaJug2[fila][columna]="\u001B[36mS\u001B[37m";
                    System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                }
            }
            if ((i>6)&&(i<10)){
                if((columna==barcosJug2[i])&&(fila==d2)&&(mapaJug2[fila][columna]=="\u001B[34m0\u001B[37m")){
                    hundidosJug2[2]++;
                    mapaJug2[fila][columna]="\u001B[36mS\u001B[37m";
                    System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                }   
            }
            if((i>9)&&(i<13)){
                if((columna==barcosJug2[i])&&(fila==e2)&&(mapaJug2[fila][columna]=="\u001B[34m0\u001B[37m")){
                    hundidosJug2[3]++;
                    mapaJug2[fila][columna]="\u001B[36mA\u001B[37m";
                    System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                }  
            }
            if((i>12)&&(i<17)){
                if((columna==barcosJug2[i])&&(fila==f2)&&(mapaJug2[fila][columna]=="\u001B[34m0\u001B[37m")){
                    hundidosJug2[4]++;
                    mapaJug2[fila][columna]="\u001B[36mP\u001B[37m";
                    System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                }    
            }
        }
        if(mapaJug2[fila][columna]=="\u001B[34m0\u001B[37m"){
            mapaJug2[fila][columna]="X";
            System.out.println("\u001B[31mNo le diste a ningun barco\u001B[37m");
        }
        if(hundidosJug2[0]==2){
            System.out.println("\u001B[32mHundiste un destructor\u001B[37m");
            hundidosJug2[0]=0;
            BRestantJug2--;
        }
        if(hundidosJug2[1]==3){
            System.out.println("\u001B[32mHundiste un submarino\u001B[37m");
            hundidosJug2[1]=0;
            BRestantJug2--;
        }
        if(hundidosJug2[2]==3){
            System.out.println("\u001B[32mHundiste un submarino\u001B[37m");
            hundidosJug2[2]=0;
            BRestantJug2--;
        }
        if(hundidosJug2[3]==3){
            System.out.println("\u001B[32mHundiste un acorazado\u001B[37m");
            hundidosJug2[3]=0;
            BRestantJug2--;
        }
        if(hundidosJug2[4]==4){
            System.out.println("\u001B[32mHundiste un porta aviones\u001B[37m");
            hundidosJug2[4]=0;
            BRestantJug2--;
        }
        //imprimo los numeros de las columnas
        for (int i = 0; i < arriba.length; i++) {
            System.out.print(arriba[i]);
        }
        System.out.println("|");
        //imprimo el mapa
        for (int i = 0; i < mapaJug2.length; i++) {
            for (int j = 0; j < mapaJug2[0].length; j++) {
                System.out.print("|" + mapaJug2[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("\u001B[33mBarcos restantes: \u001B[37m" + BRestantJug2);  
    }
}
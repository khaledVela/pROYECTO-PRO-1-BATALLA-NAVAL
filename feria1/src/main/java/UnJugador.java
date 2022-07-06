import java.util.Scanner;
public class UnJugador {
    Scanner teclado = new Scanner(System.in);
    int hundidos[] = new int[5];
    int barcos[] = new int[17];// base de los barcos
    int a = 0;
    int b = 0;
    int c = 0; 
    int d = 0; 
    int e = 0;
    int f = 0;    
    int casos;
    int columna;
    int fila;
    int BRestant = 7;
    int DRestant;
    double numero;
    boolean esLetra = false;
    String menu[] = {"\u001B[31mElige una de las 4 opciones", "\u001B[35m1.-Facil",
    "\u001B[35m2.-Medio", "\u001B[35m3.-Dificil", "\u001B[35m4.-Salir"};
    String arriba[] = {"| |", "1|", "2|", "3|", "4|", "5|", "6|", "7|", "8|", "9"};
    String mapa[][] = new String[9][10];
    String eleccion;
    String disparo;

    public UnJugador() {
        Preparacion();
        if (!eleccion.toLowerCase().equals("salir")) {
            Barcos();
            Impacto();
        }
    }

    private void Preparacion() {
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
        while (!esLetra) {
            try {
                System.out.print("\u001B[37m");
                eleccion = teclado.nextLine();
                numero = Double.parseDouble(eleccion);
                System.out.println("\u001B[33mEl valor no tiene que ser un numero");
                System.out.println("\u001B[33mIntente otra vez!!");
            } catch (NumberFormatException e) {
                if (eleccion.toLowerCase().equals("facil")) {
                    esLetra = true;
                    numero = 1;
                }
                if (eleccion.toLowerCase().equals("medio")) {
                    esLetra = true;
                    numero = 1;
                }
                if (eleccion.toLowerCase().equals("dificil")) {
                    esLetra = true;
                    numero = 1;
                }
                if (eleccion.toLowerCase().equals("salir")) {
                    esLetra = true;
                    numero = 1;
                }
                if (numero == 0) {
                    System.out.println("\u001B[33mEl valor tiene que ser uno de los tres niveles o la salida del juego");
                    System.out.println("\u001B[33mIntente otra vez!!");
                }
            }
        }
        if (!eleccion.toLowerCase().equals("salir")) {
            mapa[0][0] = "a";
            mapa[1][0] = "b";
            mapa[2][0] = "c";
            mapa[3][0] = "d";
            mapa[4][0] = "e";
            mapa[5][0] = "f";
            mapa[6][0] = "g";
            mapa[7][0] = "h";
            mapa[8][0] = "i";
            //creo mapa inicial
            for (int i = 0; i < hundidos.length; i++) {
                hundidos[1] =0;
            }
            for (int column = 0; column < mapa.length; column++) {
                for (int line = 1; line < mapa[0].length; line++) {
                    mapa[column][line] = "\u001B[34m0\u001B[37m";
                }
            }
            //imprimo los numeros de las columnas
            for (int i = 0; i < arriba.length; i++) {
                System.out.print(arriba[i]);
            }
            System.out.println("|");
            //imprimo el mapa
            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa[0].length; j++) {
                    System.out.print("|" + mapa[i][j]);
                }
                System.out.println("|");
            }
            System.out.println("\u001B[33mBarcos restantes: \u001B[37m" + BRestant);
            
        }
    }

    private void Barcos() {
        switch (eleccion.toLowerCase()) {
            case "facil":
                casos = 5;
                DRestant=41;
                break;
            case "medio":
                casos = 6;
                DRestant=36;
                break;
            case "dificil":
                casos = 8;
                DRestant=31;
                break;
        }
        System.out.println("\u001B[33mDisparos restantes: \u001B[37m"+(DRestant-1));
        barcos[0] = (int) Math.floor(Math.random() * (9) + 1);
        barcos[1] = (int) Math.floor(Math.random() * (9) + 1); 
        while (barcos[0] == barcos[1]){
            barcos[1] = (int) Math.floor(Math.random() * (9) + 1); 
        }
        barcos[2] = (int) Math.floor(Math.random() * (8) + 1);
        barcos[3] = barcos[2] + 1;
        barcos[4] = (int) Math.floor(Math.random() * (7) + 1);
        barcos[5] = barcos[4] + 1;
        barcos[6] = barcos[5] + 1;
        barcos[7] = (int) Math.floor(Math.random() * (7) + 1);
        barcos[8] = barcos[7] + 1;
        barcos[9] = barcos[8] + 1;
        barcos[10] = (int) Math.floor(Math.random() * (7) + 1);
        barcos[11] = barcos[10] + 1;
        barcos[12] = barcos[11] + 1;
        barcos[13] = (int) Math.floor(Math.random() * (6) + 1);
        barcos[14] = barcos[13] + 1;
        barcos[15] = barcos[14] + 1;
        barcos[16] = barcos[15] + 1;

        while ((a == b) || (a == c) || (a == d) || (a == e) || (a == f)) {
            a = (int) Math.floor(Math.random() * casos + 1);
        }
        while ((b == a) || (b == c) || (b == d) || (b == e) || (b == f)) {
            b = (int) Math.floor(Math.random() * casos + 1);
        }
        while ((c == a) || (c == b) || (c == d) || (c == e) || (c == f)) {
            c = (int) Math.floor(Math.random() * casos + 1);
        }
        while ((d == a) || (d == b) || (d == c) || (d == e) || (d == f)) {
            d = (int) Math.floor(Math.random() * casos + 1);
        }
        while ((e == a) || (e == b) || (e == c) || (e == d) || (e == f)) {
            e = (int) Math.floor(Math.random() * casos + 1);
        }
        if (casos!=5){
            f = (int) Math.floor(Math.random() * casos + 1);
        }
        while ((f == a) || (f == b) || (f == c) || (f == d) || (f == e)) {
            f = (int) Math.floor(Math.random() * casos + 1);
        }
    }
    private void Impacto() {
        while((BRestant!=0)&&(DRestant!=0)){
            Ataque();
            for (int i = 0; i < 17; i++) {
                if(i<2){
                    if((columna==barcos[i])&&(fila==f)&&(mapa[fila][columna]=="\u001B[34m0\u001B[37m")){
                        BRestant--;
                        mapa[fila][columna]="\u001B[36mF\u001B[37m";
                        System.out.println("\u001B[32mLe diste a un barco");
                        System.out.println("\u001B[32mHundiste una fragata\u001B[37m");
                    }
                }
                if((i>1)&&(i<4)){
                    if((columna==barcos[i])&&(fila==a)&&(mapa[fila][columna]=="\u001B[34m0\u001B[37m")){
                        hundidos[0]++;
                        mapa[fila][columna]="\u001B[36mD\u001B[37m";
                        System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                    } 
                }
                if((i>3)&&(i<7)){
                    if((columna==barcos[i])&&(fila==b)&&(mapa[fila][columna]=="\u001B[34m0\u001B[37m")){
                        hundidos[1]++;
                        mapa[fila][columna]="\u001B[36mS\u001B[37m";
                        System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                    }
                }
                if ((i>6)&&(i<10)){
                    if((columna==barcos[i])&&(fila==c)&&(mapa[fila][columna]=="\u001B[34m0\u001B[37m")){
                        hundidos[2]++;
                        mapa[fila][columna]="\u001B[36mS\u001B[37m";
                        System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                    }   
                }
                if((i>9)&&(i<13)){
                    if((columna==barcos[i])&&(fila==d)&&(mapa[fila][columna]=="\u001B[34m0\u001B[37m")){
                        hundidos[3]++;
                        mapa[fila][columna]="\u001B[36mA\u001B[37m";
                        System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                    }  
                }
                if((i>12)&&(i<17)){
                    if((columna==barcos[i])&&(fila==e)&&(mapa[fila][columna]=="\u001B[34m0\u001B[37m")){
                        hundidos[4]++;
                        mapa[fila][columna]="\u001B[36mP\u001B[37m";
                        System.out.println("\u001B[32mLe diste a un barco\u001B[37m");
                    }    
                }
            }
            if(mapa[fila][columna]=="\u001B[34m0\u001B[37m"){
                mapa[fila][columna]="X";
                System.out.println("\u001B[31mNo le diste a ningun barco\u001B[37m");
            }
            if(hundidos[0]==2){
                System.out.println("\u001B[32mHundiste un destructor\u001B[37m");
                hundidos[0]=0;
                BRestant--;
            }
            if(hundidos[1]==3){
                System.out.println("\u001B[32mHundiste un submarino\u001B[37m");
                hundidos[1]=0;
                BRestant--;
            }
            if(hundidos[2]==3){
                System.out.println("\u001B[32mHundiste un submarino\u001B[37m");
                hundidos[2]=0;
                BRestant--;
            }
            if(hundidos[3]==3){
                System.out.println("\u001B[32mHundiste un acorazado\u001B[37m");
                hundidos[3]=0;
                BRestant--;
            }
            if(hundidos[4]==4){
                System.out.println("\u001B[32mHundiste un porta aviones\u001B[37m");
                hundidos[4]=0;
                BRestant--;
            }
            if(!disparo.equals("fail")){
                //imprimo los numeros de las columnas
                for (int i = 0; i < arriba.length; i++) {
                    System.out.print(arriba[i]);
                }
                System.out.println("|");
                //imprimo el mapa
                for (int i = 0; i < mapa.length; i++) {
                    for (int j = 0; j < mapa[0].length; j++) {
                        System.out.print("|" + mapa[i][j]);
                    }
                    System.out.println("|");
                }
                System.out.println("\u001B[33mBarcos restantes: \u001B[37m" + BRestant);
                System.out.println("\u001B[33mDisparos restantes: \u001B[37m"+(DRestant-1));
            }
            if(DRestant==1){
               DRestant=0;
            }
        }
        if(DRestant==0){
                disparo="fail";
                System.out.println("\u001B[33mGame over!!\u001B[37m");
                System.out.println("\u001B[33mTe has quedado sin disparos Almirante!!\u001B[37m");
            }
            
        if(!disparo.equals("fail")){
            System.out.println("\u001B[32mTodos los barcos fueron Eliminados");
            System.out.println("\u001B[32mGanaste la GUERRA!!!");
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
            } if((disparo.toLowerCase().equals("fin"))||(disparo.toLowerCase().equals("me rindo"))){
                BRestant=0;
                DRestant=0;
                System.out.println("\u001B[33mTe has rendido Game over!!\u001B[37m");
                impacto = true;
                disparo="fail";
            }else{
                System.out.println("\u001B[33mIngrese el comando como se le indico\u001B[37m");
            }
        }
        DRestant--;
    }        
}
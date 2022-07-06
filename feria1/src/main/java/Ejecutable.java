import java.util.Scanner;
public class Ejecutable {

    private static void Titulo() {
        System.out.println("     ||================================================================================================================================================================||       ");
        System.out.println("||==========================================================================================================================================================================||  ");
        System.out.println("|| |OOOOOOOO|             |O|       |OOOOOOOOOOOOOO|    |OOOOOOOOOOOOOO|    |OO|           |OOOOOOOOO|        |OOOOO|      |OO|      |OO|   |OOOOOOOOOOOOOO|   |OOOOOOO|    ||  ");
        System.out.println("|| |OO     OO|           |OOO|            |OO|                |OO|          |OO|           |OO|             |OO|   |OO|    |OO|      |OO|         |OO|         |OO|    OO|  ||  ");
        System.out.println("|| |OO      OO|         |OO OO|           |OO|                |OO|          |OO|           |OO|           |OO|       |OO|  |OO|      |OO|         |OO|         |OO|     OO| ||  ");
        System.out.println("|| |OO     OO|         |OO   OO|          |OO|                |OO|          |OO|           |OO|            |OO|            |OO|      |OO|         |OO|         |OO|    OO|  ||  ");
        System.out.println("|| |OOOOOOOO|         |OOOOOOOOO|         |OO|                |OO|          |OO|           |OOOOOOO|         |OOOOOOO|     |OOOOOOOOOOOO|         |OO|         |OOOOOOO|    ||  ");
        System.out.println("|| |OO     OO|       |OO       OO|        |OO|                |OO|          |OO|           |OO|                   |OO|     |OO|      |OO|         |OO|         |OO|         ||  ");
        System.out.println("|| |OO      OO|     |OO         OO|       |OO|                |OO|          |OO|           |OO|           |OO|      |OO|   |OO|      |OO|         |OO|         |OO|         ||  ");
        System.out.println("|| |OO     OO|     |OO           OO|      |OO|                |OO|          |OO|           |OO|            |OO|   |OO|     |OO|      |OO|         |OO|         |OO|         ||  ");
        System.out.println("|| |OOOOOOOO|     |OO             OO|     |OO|                |OO|          |OOOOOOOOO|    |OOOOOOOOO|       |OOOOO|       |OO|      |OO|   |OOOOOOOOOOOOOO|   |OO|         ||  ");
        System.out.println("||==========================================================================================================================================================================||  ");
        System.out.println("     ||================================================================================================================================================================||       ");
    }

    public static void main(String[] args) {
        double numero = 0;
        Scanner teclado = new Scanner(System.in);
        String finalizar;
        String nombre;
        String Jugadores = "";
        boolean exit = false;
        boolean esLetra = false;
        while (!exit) {
            boolean fin = false;
            System.out.println("\u001B[31m¿Cuantos jugadores van a jugar?\u001B[37m");
            System.out.println("\u001B[35m        Un jugador\u001B[37m");
            System.out.println("\u001B[35m        Dos jugadores\u001B[37m");

            while (!esLetra) {
                try {
                    System.out.print("\u001B[37m");
                    Jugadores = teclado.nextLine();
                    numero = Double.parseDouble(Jugadores);
                    System.out.println("\u001B[33mEl valor no tiene que ser un numero");
                    System.out.println("\u001B[33mIntente otra vez!!");
                } catch (NumberFormatException e) {
                    if (Jugadores.toLowerCase().equals("un jugador")) {
                        esLetra = true;
                        numero = 1;
                    }
                    if (Jugadores.toLowerCase().equals("dos jugadores")) {
                        esLetra = true;
                        numero = 1;
                    }
                    if (numero == 0) {
                        System.out.println("\u001B[33mIngrese una de las dos opciones");
                        System.out.println("\u001B[33mIntente otra vez!!");
                    }
                }
            }

            if (Jugadores.toLowerCase().equals("un jugador")) {
                while (!fin) {
                    System.out.println("\u001B[31mIngresa tu nombre\u001B[37m");
                    nombre = teclado.nextLine();
                    for (int i = 0; i < 2; i++) {
                        System.out.println("");
                    }
                    Titulo();
                    teclado.nextLine();
                    for (int i = 0; i < 3; i++) {
                        System.out.println("");
                    }
                    System.out.println("Almirante " + nombre + ":");
                    System.out.println("El principio de esta guerra se basa en tácticas nabales modernas con el principio de ");
                    System.out.println("“disparar y moverse”, por esta razón tus barcos no van a poder ser eliminados; tienes la ");
                    System.out.println("obligación de detectar al enemigo ubicándolo y eliminándolo. Usando diferentes tipos de ");
                    System.out.println("estrategias. Así se podrá destruir las amenazas futuras que podrán traer graves  ");
                    System.out.println("consecuencias al planeta y a tu nación ");
                    System.out.println("Para la conservar la livertad y la gloria de tu nacion  ");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("");
                    }
                    System.out.println("                                                             Atentamente: El presidente");
                    teclado.nextLine();
                    for (int i = 0; i < 10; i++) {
                        System.out.println("");
                    }
                    UnJugador program = new UnJugador();
                    if (!program.eleccion.toLowerCase().equals("salir")) {
                        System.out.println("\u001B[31m¿Desea finalizar la prueba de 1 jugador?\u001B[37m");
                        finalizar = teclado.nextLine();
                        if (finalizar.toLowerCase().equals("si")) {
                            fin = true;
                        } else {
                            System.out.println("\u001B[33mVa a volver al menu de un jugador!!\u001B[37m");
                        }
                    } else {
                        fin = true;
                    }
                }
                System.out.println("\u001B[32mHa salido de la prueva de 1 jugador!!");
            }
            if (Jugadores.toLowerCase().equals("dos jugadores")) {
                while (!fin) {
                    for (int i = 0; i < 3; i++) {
                        System.out.println("");
                    }
                    Titulo();
                    teclado.nextLine();
                    DosPersonas program = new DosPersonas();
                    System.out.println("\u001B[31m¿Desea finalizar la prueba de 2 jugadores?\u001B[37m");
                    finalizar = teclado.nextLine();
                    if (finalizar.toLowerCase().equals("si")) {
                        fin = true;
                        System.out.println("\u001B[32mHa salido de la prueva de 2 jugadores!!");
                    } else {
                        System.out.println("\u001B[33mVan a volver a jugar!!\u001B[37m");
                    }
                }
            }
            System.out.println("\u001B[31m¿Desea finalizar el programa?\u001B[37m");
            finalizar = teclado.nextLine();
            if (finalizar.toLowerCase().equals("si")) {
                exit = true;
                System.out.println("\u001B[32mSe ha finalizado correctamente!!");
                System.out.println("\u001B[32mVuelva pronto");
            } else {
                System.out.println("\u001B[33mNo se va a finalizar volviendo al menu principal\u001B[37m");
            }
        }
    }
}
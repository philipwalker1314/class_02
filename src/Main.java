/*=================================================================================
Study Center....: Universidad TÃ©cnica Nacional
Campus..........: PacÃ­fico (JRMP)
College career..: IngenierÃ­a en TecnologÃ­as de InformaciÃ³n
Period..........: 2C-2024
Course..........: ITI-221 - ProgramaciÃ³n I
Document........: class_02 - main.java
Goals...........: Use the control structures to solve problems:
                    - If
                    - Switch
                    - While
                    - Do-While
                    - For
                    - For-Each
                    - Map
                    - HashMap
Professor.......: Jorge Ruiz (york)
Student.........:
=================================================================================*/
// Call external libraries
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero / 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }

        sc.close();
    }
}




//        // Switch case
//        int day = 4;
//        switch (day){
//            case 1:
//                System.out.println("Lunes");
//                break;
//            case 2:
//                System.out.println("Martes");
//                break;
//            case 3:
//                System.out.println("MiÃ©rcoles");
//                break;
//            case 4:
//                System.out.println("Jueves");
//                break;
//            case 5:
//                System.out.println("Viernes");
//                break;
//            case 6:
//                System.out.println("SÃ¡bado");
//                break;
//            case 7:
//                System.out.println("Domigo");
//                break;
//            default:
//                System.out.println("DÃ­a no vÃ¡lido");
//        } // end switch
//
//        // Print separator line
//        System.out.println("========================================");





// If - then - else
//        int a = 10;
//        int b = 20;
//        if (a > b) {
//            System.out.println("a es mayor que b");
//        }else if (a < b){
//            System.out.println("a es menor que b");
//        }else {
//            System.out.println("a es igual que b");
//        }
//
//        // Print separator line
//        System.out.println("========================================");



// While contidional
//        int i = 0;
//        while (i < 5){
//            System.out.println("Imprimiendo...: " + i);
//            i++;
//        } // end while
//
//        // Print separator line
//        System.out.println("========================================");
//
//        // Using two conditions
//        int j = 0;
//        while (j < 5){
//            System.out.println("Imprimiendo...: " + j);
//            j++;
//            if (j == 3){
//                break;
//            }
//        } // end while
//
//        // Print separator line
//        System.out.println("========================================");
//
//        // Using two conditions
//        int k = 0;
//        int l = 10;
//        while ((k <= 10) && (l >= 0)){
//            System.out.println("Imprimiendo...: " + k);
//            k++;
//            if (k < l){
//                break;
//            }
//            System.out.println("Imprimiendo...: " + l);
//            l--;
//        } // end while
//
//        // Print separator line
//        System.out.println("========================================");
//
//        // Do-While
//        int m = 0;
//        do {
//            System.out.println("Imprimiendo...: " + m);
//            m++;
//        } while (m < 5);
//
//        // Print separator line
//        System.out.println("========================================");





// For
//        for (int n = 0; n < 5; n++){
//            System.out.println("Imprimiendo...: " + n);
//        } // end for
//
//        // Print separator line
//        System.out.println("========================================");
//
//        for (int n = 0; n < 20; n+=2){
//            System.out.println("Imprimiendo...: " + n);
//        } // end for
//
//        // Print separator line
//        System.out.println("========================================");
//
//        int[] numbers = {10, 20, 30, 40, 50};
//        for (int o = 0; o < numbers.length; o++){
//            System.out.println("Imprimiendo...: " + numbers[o]);
//        } // end for
//
//        // Print separator line===================\n" +
//                "        System.out.println(\"=====================");



//        int[] numbers = {10, 20, 30, 40, 50};
//        // For-Each
//        for (int number : numbers){
//            System.out.println("Imprimiendo...: " + number);
//        } // end for-each
//        // Print separator line
//        System.out.println("========================================");



//        // Map - For-Each
//        String[] names = {"Morticia", "Merlina", "Homero", "Pericles", "Julian" };
//        Arrays.stream(names).map(name -> "Imprimiendo...: " + name).forEach(System.out::println);




//// Print separator line
//        System.out.println("========================================");
//
//HashMap<String, Float> Hortalizas = new HashMap<>();
//        Hortalizas.put("Brocoli", 850.0f);
//        Hortalizas.put("Lechuga", 745.0f);
//        Hortalizas.put("Remolacha", 385.0f);
//        Hortalizas.put("Papa", 790.0f);
//        Hortalizas.put("Zanahoria", 695.0f);
//
//        Hortalizas.forEach((key, value) -> System.out.println("Imprimiendo...: " + key + " - " + value));
//
//        System.out.println("El valor de la Brocoli es: " + Hortalizas.get("Brocoli"));
//
//
//        System.out.println("========================================");
//
//HashMap<String, Float> misCompras = new HashMap<>();
//        misCompras.put("Brocoli", 2.0f);
//        misCompras.put("Papa", 4.5f);
//        misCompras.put("Zanahoria", 3.25f);
//
//// Update the value of the key "Papa" and "Zanahoria"
//        Hortalizas.replace("Papa", 915.0f);
//        Hortalizas.replace("Zanahoria", 785.0f);
//
//
//float total = 0.0f;
//        for (String key : misCompras.keySet()){
//total += misCompras.get(key) * Hortalizas.get(key);
//        } // end for
//
//                System.out.println("El total de la compra es: " + total);
//
//HashMap<String, Float> detalleCompra = new HashMap<>();
//        for (String key : misCompras.keySet()){
//        detalleCompra.put(key, misCompras.get(key) * Hortalizas.get(key));
//        } // end for
//
//        detalleCompra.forEach((key, value) -> System.out.println("Imprimiendo...: " + key + " - " + value));
//
//// Print separator line
//        System.out.println("========================================");
//
//        System.out.println();
//
//// Print with format
//        System.out.printf("%-15s | %8s \n", "Producto", "Precio");
//        System.out.println("----------------+---------");
//        detalleCompra.forEach((key, value) -> System.out.printf("%-15s | %8.2f \n", key, value));
//        System.out.println("----------------+---------");
//        System.out.printf("%-15s | %8.2f \n", "Total", total);
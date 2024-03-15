/*
 * Se tiene la siguiente información de un empleado: · código del empleado, · nombres, · 
número de horas trabajadas al mes, · valor hora trabajada, · porcentaje de retención en la fuente. 
Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.
 */
package javaejercicio18;

import java.util.Scanner;

public class JavaEjercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos:
        System.out.println("Ingrese el código del empleado: ");
        int codigoEmpleado = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Ingrese el nombre del empleado: ");
        String nombres = scanner.nextLine();

        System.out.println("Ingrese el número de horas trabajadas al mes: ");
        double horasTrabajadas = scanner.nextDouble();

        System.out.println("Ingrese el valor por hora trabajada: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de retención en la fuente: ");
        double retencionFuente = scanner.nextDouble();

        // Cálculo del salario bruto
        double salarioBruto = horasTrabajadas * valorHora;

        // Cálculo del salario neto
        double rtf = salarioBruto * (retencionFuente / 100);
        double salarioNeto = salarioBruto - rtf;

        // Mostrar resultados
        System.out.println("\nInformación del empleado:");
        System.out.println("Código del empleado: " + codigoEmpleado);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Salario Neto: $" + salarioNeto);
    }
    
}

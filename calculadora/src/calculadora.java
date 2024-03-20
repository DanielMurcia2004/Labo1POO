import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class calculadora {
    public static void main(String[] args) {
        //logica del programa
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        double num1 = 0, num2 = 0;
        System.out.println("Ingrese la operacion que desea ejecutar: ");

        do {
            System.out.println("1.Suma.");
            System.out.println("2.Resta.");
            System.out.println("3.Multiplicacion.");
            System.out.println("4.Division.");
            System.out.println("0.Salir.");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("SUMA:");
                    System.out.println("Ingrese el primer numero: ");
                     num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                     num2 = sc.nextInt();

                    System.out.println("El resultado de la suma es: " + Suma(num1,num2));
                    break;

                case 2:
                    System.out.println("RESTA:");
                    System.out.println("SUMA:");
                    System.out.println("Ingrese el primer numero: ");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = sc.nextInt();

                    System.out.println("El resultado de la resta es: " + Resta(num1,num2));
                    break;

                case 3:
                    System.out.println("MULTIPLICACION");
                    System.out.println("RESTA:");
                    System.out.println("SUMA:");
                    System.out.println("Ingrese el primer numero: ");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = sc.nextInt();

                    System.out.println("El resultado de la multiplicacion es: " + Multiplicacion(num1,num2));
                    break;

                case 4:
                    System.out.println("DIVISION");
                    System.out.println("MULTIPLICACION");
                    System.out.println("RESTA:");
                    System.out.println("SUMA:");
                    System.out.println("Ingrese el primer numero: ");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = sc.nextInt();

                    System.out.println("El resultado de la multiplicacion es: " + Division(num1,num2));
                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
            }

        } while (opc != 0);


    }
    //metodos
    public static double Suma(double num1, double num2){
        return num1 + num2;

    }

    public static double Resta(double num1, double num2){
        return num1 - num2;
    }

    public static double Multiplicacion(double num1, double num2){
        return num1 * num2;
    }

    public static double Division(double num1,double num2){
        return num1 / num2;
    }
}
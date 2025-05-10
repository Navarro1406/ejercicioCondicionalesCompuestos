import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCompra, descuento;
        System.out.println("Por favor ingrese el valor de su compra en $: ");
        valorCompra = sc.nextDouble();
        if (valorCompra > 200000) {
            descuento = valorCompra * 0.15;
            System.out.println("El valor de su descuento es:  " + descuento + "$" );
        } else {
            System.out.println("Su compra no aplica para descuento.");
        }
    }
}
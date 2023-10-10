public class Main {
    public static void main(String[] args) {

        System.out.println("Variables");
        //nombres de variables y métodos en nomenclatura camello
        /*
        Este es otro tipo de comentario
         */
        byte numeroHermanos = 12;
        short cantidadCorta = 350;
        int numeroClientes = 1_234_234;
        long numeroLargo = 1_234_456_123L;

        System.out.println(numeroHermanos);
        System.out.println(cantidadCorta);
        System.out.println(numeroClientes);
        System.out.println(numeroLargo);

        //Numeros con decimales
        float numeroConDecimales = 5.5F;
        double numeroConDecimalDoble = 123_123_123.123;

        System.out.println(numeroConDecimales);
        System.out.println(numeroConDecimalDoble);

        boolean estaCasado = false;
        System.out.println(estaCasado);

        char letra = 'a';
        System.out.println(letra);

        //Calcular el area de un cuadrado cuyo lado mide 6
        byte lado = 6;
        int areaCuadrado = lado * lado;
        System.out.println(areaCuadrado);
        //Calcular el área de un círculo cuyo radio es 3
        int radio = 3;
        double areaCirculo = radio * radio * 3.14;
        System.out.println(areaCirculo);
        //Calcular el perimetro de un rectangulo cuya base es 4 y altura 3
        int base = 4;
        int altura = 3;
        int perimetroCuadrado = 2*base + 2*altura;
        System.out.println(perimetroCuadrado);
        /*
        Operadores aritmeticos
        +, -, *, / ,%
         */
        System.out.println(10%3);
        /*Operadores de comparación
        >, <, >=, <=, ==, !=
         */
        int num1=15, num2=7;
        System.out.println(num1==num2);

        //Oferta -> si compras más de 5 unidades se da el 10% de descuento
        //Decir si se compra 4 unidades si se obtiene el descuento
        //Definir una variable para las unidades
        //Hacer la comparacion
        int unidades = 4;
        System.out.println(unidades>5);

        //Oferta -> si compras un importe de más de 100€ se da el 5% de descuento
        //Se compraron 3 unidades de 15€
        //¿Le corresponde el descuento?
        byte unidades2 = 3;
        float precio = 15F;
        System.out.println(unidades*precio>100);

    }
}
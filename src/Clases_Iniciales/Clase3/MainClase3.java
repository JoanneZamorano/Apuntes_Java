package Clases_Iniciales.Clase3;

public class MainClase3 {
    public static void main(String[] args) {

    //1. Conversion explícita double a int

        int numeroEntero = 25;
        double numeroDecimal = numeroEntero;

        System.out.println("Numero entero : " + numeroEntero);
        System.out.println("Número conversion" + numeroDecimal);

    //2. Conversion explícita double a int con truncamiento

        double valorDecimal = 8.80;

        //conversión explícita, casting
        int valorEntero = (int)valorDecimal;

        System.out.println("Valor original, double: " + valorDecimal);
        System.out.println("Valor convertido con el int: " + valorEntero);

    //3. Desbordamiento Int a byte

        int numeroGrande = 190;

        //conversión explícita a byte
        byte numeroPequeño = (byte)numeroGrande;

        System.out.println("Numero original en int: " + numeroGrande);
        System.out.println("Numero convertido a byte: " + numeroPequeño);

    //4.Conversion de String a int von Integer.parseInt()

        String texto = "123";
        int numero = Integer.parseInt(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Numero convertido en texto: " + numero);

    //5. Convertir un int a String

        int numerito = 456;
        String textito = String.valueOf(numerito);

        System.out.println("Numero: " + numerito);
        System.out.println("Texto convertido" + textito);

    //6. Conversion double a String
        double precio = 99.99;
        String textoPrecio = Double.toString(precio);

        System.out.println("Precio: " + precio);
        System.out.println("Precio como String: " + textoPrecio);

    //7.Conversion de Boolean a String
        boolean activo = true;
        String estado = String.valueOf(activo);

        System.out.println("Valor: " + activo);
        System.out.println("Estado convertido: " + estado);

    //8. Conversion para operaciones matemáticas
        int a = 5, b = 2;

        System.out.println("Division entera: " + (a/b));

        //Conversión a Double para obtener decimales
        double resultado = (double)a/b;
        System.out.println("Division con casting: " + resultado);

    //9. Conversion de long a int y de float a int
        long numeroLargo = 1_000_000_000;

        //Conversion del long a Int
        int numeroEnterito = (int)numeroLargo;
        System.out.println("Numero con cambio de Long a int" + numeroEnterito);

    }
}

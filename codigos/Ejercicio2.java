public class pruebaDos {

    public static void main(String[] args) {
        int num = 400;
        double sumatoria = 0, factorial = 1;
        for (int i = 1; i <= num; i++){
            sumatoria += i;
        }
        System.out.println("El número es: "+ num);
        System.out.println("La sumatoria es: "+ sumatoria);
        // Al cuadrado
        System.out.println("La sumatoria al cuadrado es: "+(sumatoria*sumatoria));
        //Raiz cuadrada
        System.out.println("La raiz cuadrada de la sumatoria es: "+(Math.sqrt(sumatoria)));
        //Divisores
        String divisores = "";
        for (int i = 1; i <= sumatoria; i++){
            if (i == sumatoria){
                divisores += String.valueOf(i)+".";
            } else if (sumatoria%i == 0) {
                divisores += String.valueOf(i)+", ";
            }
        }
        System.out.println("Estos son los divisores de la sumatoria : "+divisores);

        // Factorial
        for (int i = 1; i <= sumatoria; i++){
            factorial*=i;
        }
        System.out.println("El factorial de la sumatoria "+sumatoria+" es: "+factorial);
    }
}

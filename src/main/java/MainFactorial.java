public class MainFactorial {

    public static void main(String[] args) {

        factorial hilo1 = new factorial();
        factorial hilo2 = new factorial();
        factorial hilo3 = new factorial();
        factorial hilo4 = new factorial();

        int num1, num2, num3, num4;
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        num3 = Integer.parseInt(args[2]);
        num4 = Integer.parseInt(args[3]);

        hilo1.valorCalc(num1);
        hilo2.valorCalc(num2);
        hilo3.valorCalc(num3);
        hilo4.valorCalc(num4);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

    }

}

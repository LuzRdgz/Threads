public class factorial extends Thread{

    int numeroInt;

    @Override
    public void run(){

        int fact = 0;

        for (int i = numeroInt; i < 0; i--) {
            fact = fact * i;
            System.out.println(this.getName()+ "->" + " El factorial de " + i + " es " + fact);
        }
        System.out.println("");
    }

    public void valorCalc(int val){
        this.numeroInt = val;
    }

}
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.addPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int firstFunction(int a, int b, int c) {
        return a + b + c;
    }
}
    class   Coche{
        public int puertas =0;
        public void addPuertas(){
            this.puertas++;
        }
    }


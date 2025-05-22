package SO.PetersonAlgoritmo;

public class PetersonAlgoritmo {
    static int x = 0;
    static volatile int turn = 0;
    static boolean[] interessado;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("\nx antes de executar as threads : " + x);

        Thread thread1 = new Thread(incrementa);
        thread1.start();
        Thread thread2 = new Thread(decrementa);
        thread2.start();
        Thread thread3 = new Thread(incrementaEmDois);
        thread3.start();

        // para que a thread principal espere o término das duas criadas
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("x depois de executar as threads: " + x);
    }

    private static final Runnable incrementa = new Runnable(){
        public void run(){
            for(var i=0;i<1000000;i++){

                x++;

            }
        };
    };

    private static Runnable decrementa = new Runnable(){
        public void run(){
            for(var i=0;i<1000000;i++){

                x--;

            }
        };
    };

    private static Runnable incrementaEmDois = new Runnable(){
        public void run(){
            for(var i=0;i<1000000;i++){
                x += 2;

            }
        };
    };
}




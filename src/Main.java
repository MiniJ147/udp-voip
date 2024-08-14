import sound.SoundPlayer;
import sound.SoundRecorder;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        final SoundRecorder recorder = new SoundRecorder();

//        Thread stopper = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try{
//                    Thread.sleep(20000);
//                }catch(InterruptedException ex){
//                    ex.printStackTrace();
//                }
//                recorder.finish();
//            }
//        });
//        stopper.start();

        recorder.start();
//        try {
//            new SoundPlayer();
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//
//        while(true){
//
//        }
    }
}

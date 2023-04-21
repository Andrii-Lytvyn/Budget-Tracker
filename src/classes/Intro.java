package classes;

import javax.sound.sampled.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Intro {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, AWTException {
        File file = new File("11.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        circle_1();
        Menu.delaySecond();
    }

    public static void circle_1() throws AWTException {
        Menu.clearAll();
        System.out.println();
        delayFirst();
        row_16();
        System.out.println();
        row_16();
        System.out.println();
        System.out.println();
        delayFirst();
        rowFirst();
        System.out.println();
        delayFirst();
        row_2();
        System.out.println();
        delayFirst();
        row_3();
        System.out.println();
        delayFirst();
        row_4();
        System.out.println();
        delayFirst();
        row_5();
        System.out.println();
        delayFirst();
        row_6();
        System.out.println();
        delayFirst();
        row_7();
        System.out.println();
        delayFirst();
        row_8();
        System.out.println();
        delayFirst();
        row_9();
        System.out.println();
        delayFirst();
        row_10();
        System.out.println();
        delayFirst();
        row_11();
        System.out.println();
        delayFirst();
        row_12();
        System.out.println();
        delayFirst();
        row_13();
        System.out.println();
        delayFirst();
        row_14();
        System.out.println();
        delayFirst();
        row_15();
        System.out.println();
        System.out.println();
        delayFirst();
        row_16();
        System.out.println();
        row_16();
    }
    public static void delayFirst(){
        int delay = 250; // number of milliseconds to sleep
        long start = System.currentTimeMillis();
        while (start >= System.currentTimeMillis() - delay) ; // do nothing
    }
    public static void rowFirst(){
        for (int i = 0; i<14; ++i){
            System.out.print(Colors.RESET + '*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<11; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<8; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<6; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<8; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<5; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<8; ++i){
            System.out.print(' ');
        }

        for (int i = 0; i<5; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<47; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<9; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }


    }
    public static void row_2(){
        for (int i = 0; i<14; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<11; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<8; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<7; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }

        for (int i = 0; i<7; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<46; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<10; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }
    public static void row_3(){
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<13; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<3; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<3; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }

        for (int i = 0; i<7; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<7; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<45; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }
    public static void row_4(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<12; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<1; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<3; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<2; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<3; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<1; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<44; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<12; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }
    public static void row_5(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<2; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<2; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<2; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<2; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<2; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<43; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<13; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }
    public static void row_6(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<2; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<6; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<2; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<42; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<5; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
        for (int i = 0; i<2; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }
    public static void row_7(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<3; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<3; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<41; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<5; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
        for (int i = 0; i<3; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }
    public static void row_8(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<8; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<14; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<2; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<40; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<5; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }
    public static void row_9(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<8; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<14; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<49; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }
    public static void row_10(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<49; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }
    public static void row_11(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<49; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }
    public static void row_12(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<49; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<7; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }
    public static void row_13(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<11; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<44; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<17; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }
    public static void row_14(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<11; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<42; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<21; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }
    public static void row_15(){
//        T
        for (int i = 0; i<5; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
//        E
        for (int i = 0; i<9; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<11; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
        //        A
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }

        for (int i = 0; i<6; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<4; ++i){
            System.out.print(' ');
        }
//M
        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<10; ++i) {
            System.out.print(' ');
        }

        for (int i = 0; i<4; ++i){
            System.out.print('*');
        }
        for (int i = 0; i<40; ++i){
            System.out.print(' ');
        }
        for (int i = 0; i<25; ++i){
            System.out.print(Colors.WHITE_BRIGHT + '*'+ Colors.RESET );
        }
    }

    public static void row_16(){
        for (int i = 0; i<69; ++i){
            System.out.print(Colors.BLUE_BRIGHT + '=' + Colors.RESET);
        }

    }
}

package Lesson_5;

// Склеивание потоков реализованно не правильно! Если склеивание вынести в метод myThread(),
// то появляеися ощибка Cannot resolve symbol. Предпологаю это связано с зоной видимости переменных.


public class ThreadTest {

    private static final int SIZE = 10_000_000;
    private static final int H = SIZE / 2;

    public static void main(String[] args) {
        oneThread(getArr());
        myThread();
    }

    // создаём исходный массив заполненный единицами
    private static float[] getArr() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0F;
        }
        return arr;
    }

    // преобразуем созданный массив по формуле и засекём время преобразования
    private static void oneThread(float[] arr) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения в один поток: " + (System.currentTimeMillis() - a));
    }

    // создаём отдельные методы для каждого потока
    private static void firstThread(float[] arr) {
        float[] halfArr1 = new float[H];
        System.arraycopy(arr, 0, halfArr1, 0, H);
        for (int i = 0; i < halfArr1.length; i++) {
            halfArr1[i] = (float) (halfArr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.arraycopy(halfArr1, 0, arr, 0, H); //склеиваем массивы
    }

    private static void secondThread(float[] arr) {
        float[] halfArr2 = new float[H];
        System.arraycopy(arr, H, halfArr2, 0, H);
        for (int i = 0; i < halfArr2.length; i++) {
            halfArr2[i] = (float) (halfArr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.arraycopy(halfArr2, 0, arr, H, H); //склеиваем массивы
    }

// создаём потоки и засекаем время
    private static void myThread() {
        long a = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                firstThread(getArr());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                secondThread(getArr());
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            System.out.println("Поток прервался");
            e.printStackTrace();
            return;
        }
        System.out.println("Время выполнения в два потока: " + (System.currentTimeMillis() - a));
    }
}



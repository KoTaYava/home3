public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte x = 127;
        short z = 32767;
        int c = 2147483647;
        long v = 9223372036854775806L;
        System.out.println(x);
        System.out.println(z);
        System.out.println(c);
        System.out.println(v);
        // Задача 2
        float e = 27.12f;
        long r = 987678965549L;
        float t = 2.786f;
        short y = 569;
        short u = -159;
        short i = 27897;
        byte o = 67;
        System.out.println(e);
        System.out.println(r);
        System.out.println(t);
        System.out.println(y);
        System.out.println(u);
        System.out.println(i);
        System.out.println(o);
        //Задача 3
        byte pavlovna = 23;
        byte sergeevna = 27;
        byte andreevna = 30;
        short list = 480;
        int listDis = list / (pavlovna + sergeevna + andreevna);
        System.out.println("На каждого ученика рассчитано " + listDis + " листов бумаги ");
        //Задача 4
        byte twoMinutes = 16;
        int minutes = twoMinutes / 2;
        byte twentyMinutes = 20;
        short day = 1440;
        short fryDays = 4320;
        int month = 43200;
        int proTwenty = minutes * twentyMinutes;
        int proDay = minutes * day;
        int proFry = minutes * fryDays;
        int proMonth = minutes * month;
        System.out.println("За " + twentyMinutes +  " машина произвела " + proTwenty + "штук бутылок");
        System.out.println("За " + day +  " машина произвела " + proDay + "штук бутылок");
        System.out.println("За " + fryDays + " машина произвела " + proFry + "штук бутылок");
        System.out.println("За " + month +  " машина произвела " + proMonth + "штук бутылок");
        //Задача 5
        byte paintBank = 120;
        byte paintWhite = 2;
        byte paintBrown = 4;
        int lass = paintBank / (paintWhite + paintBrown);
        int lassWhite = lass * paintWhite;
        int lassBrown = lass * paintBrown;
        System.out.println("В школе, где " + lass + " классов, нужно " + lassWhite + " банок белой краски и " + lassBrown + " банок коричневой краски");
        // Задача 6
        byte banan = 80;
        byte milk = 105;
        byte plombir = 100;
        byte egg = 70;
        int blender = (5 * banan) + (2 * milk) + (2 * plombir) + (4 * egg);
        float kilo = blender / 1000f;
        System.out.println(blender + " гр");
        System.out.println(kilo + " кг");
        //Задача 7
        short ves = 7000;
        short rationOne = 250;
        short tationTwo = 500;

        System.out.println(ves / rationOne + " дней при рационе с деффицитом в 250ккал");
        System.out.println(ves / tationTwo + " дней при рационе с дефецитом в 500ккал");
        System.out.println(((ves / rationOne)+(ves / tationTwo)) / 2 + " дней в среднем");
        // Задача 8
        int maha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float newMaha = (maha * 0.1f) + maha;
        float newDenis = (denis * 0.1f) + denis;
        float newKris = (kristina * 0.1f) + kristina;
        int godMaha = maha * 12;
        int godDenis = denis * 12;
        int godKris = kristina * 12;
        float godNew = newMaha * 12;
        float godNew1 = newDenis * 12;
        float godNew2 = newKris * 12;
        float razMaha = godNew - godMaha;
        float razDen = godNew1 - godDenis;
        float razKris = godNew2 - godKris;
        System.out.println("Маша теперь получает " + newMaha + " рублей. Годовой доход вырос на " + razMaha + " рублей!");
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + razDen + " рублей!");
        System.out.println("Кристина теперь получает " + newKris + " рублей. Годовой доход вырос на " + razKris + " рублей!");




    }
}
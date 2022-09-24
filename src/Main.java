public class Main {
    public static void main(String[] args) {
        // Задача 1
        int first = 30234;
        System.out.println(first);
        byte second = 2;
        System.out.println(second);
        short third = 308;
        System.out.println(third);
        long fourth = 4;
        System.out.println(fourth);
        float fifth = 2.2f;
        System.out.println(fifth);
        double sixth = 78.97;
        System.out.println(sixth);
        // Задача 2
        float one = 27.12f;
        long two = 987678965549L;
        double three = 2.786;
        boolean four = false;
        int five = 569;
        short six = -159;
        int seven = 27897;
        float eight = 67.0f;
        // Задача 3
        int firstTeacher = 23;
        int secondTeacher = 27;
        int thirdTecher = 30;
        int papers = 480;
        System.out.println("На каждого ученика рассчитано "+ papers/(firstTeacher+secondTeacher+thirdTecher)  +" листов бумаги");
        // Задча 4
        int efficiencyPerMinutes = 8;
        int firstTime = 20;
        System.out.println("За "+ firstTime +  " минут машина произвела бутылок "+ efficiencyPerMinutes*firstTime +" штук");
        int secondTime = 24;
        System.out.println("За "+ secondTime +  " сутки машина произвела бутылок "+ efficiencyPerMinutes*secondTime*60 +" штук");
        int thirdTime = 3;
        System.out.println("За "+ thirdTime +  " дней машина произвела бутылок "+ efficiencyPerMinutes*thirdTime*24*60 +" штук");
        int fourthTime = 1;
        System.out.println("За "+ fourthTime +  " месяц машина произвела бутылок "+ efficiencyPerMinutes*fourthTime*30*24*60 +" штук");
        // Задача 5
        int totalTin = 120;
        int whiteTin = 2;
        int blackTin = 4;
        System.out.println("В школе, где "+ totalTin/(whiteTin+blackTin) + " классов, нужно "+totalTin*whiteTin/(whiteTin+blackTin) +" банок белой краски и "+totalTin*blackTin/(whiteTin+blackTin) +" банок коричневой краски");
        // Задача 6
        int banans = 5*80;
        int milk = 2*105;
        int iceCream = 2*100;
        int eggs = 4*70;
        int totalWeight = banans + milk + iceCream + eggs;
        System.out.println(totalWeight/1000f);
        // Задача 7
        int total = 7000;
        int min = 250;
        System.out.println(total/min);
        int max = 500;
        System.out.println(total/max);
        System.out.println((total/max+total/min)/2);
        // Задача 8
        int maria = 67760;
        System.out.println("Маша теперь получат "+ maria*1.1f +" рублей. Годовой доход вырос на "+maria*12*0.1f + " рублей");
        int denis = 83690;
        System.out.println("Денис теперь получат "+ denis*1.1f +" рублей. Годовой доход вырос на "+denis*12*0.1f + " рублей");
        int christina = 76230;
        System.out.println("Кристина теперь получат "+ christina*1.1f +" рублей. Годовой доход вырос на "+christina*12*0.1f + " рублей");




    }
}
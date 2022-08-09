public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    }

    public static void task1() {
        int m = 1;
        while (m <= 10) {
            System.out.print(m + " ");
            m ++;
        }
        System.out.print("\n");
        for (int l = 10; l >= 0; l --) {
            System.out.print(l + " ");
        }
        System.out.print("\n");
    }

    public static void task2() {
        int day = 3;
        while (day <= 31) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            day = day + 7;
        }
    }

    public static void task3() {
        int year = 0;
        while (year <= 2122) {
            if (year >= 1822 && year <= 2122) {
                System.out.println(year);
            }
            year = year + 79;
        }
    }
}
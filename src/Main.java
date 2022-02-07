public class Main {
    public static void main(String[] args) {

        // Task 1//

        int i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");

        }

        // Task 2//

        int firstFriday = 1;
        int ongoingFriday;
        for (ongoingFriday = firstFriday; ongoingFriday <= 31; ongoingFriday += 7) {
            System.out.println(" \nСегодня пятница, " + ongoingFriday + " число. Необходимо подготовить отчет");
        }

        //Task 3//
        int todayYear = 2022;
        int start = todayYear - 200;
        int end = todayYear + 100;
        for (int a = start; a < end; a++) {
            if (a % 79 == 0) {
                System.out.println(a);
            }
        }

    }
}

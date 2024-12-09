public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 9");
        System.out.println();
        System.out.println("Задание №1");
        int[] monthlySalary = {35000, 32000, 38000, 36000, 45000};
        int totalSalary = 0;
        for (int i = 0; i < monthlySalary.length; i++) {
            totalSalary += monthlySalary[i];
        }
        System.out.println("Сумма трат за месяц составила" + totalSalary + " рублей");
        System.out.println();
        System.out.println("Задание 2");
        int[] cost = {586, 695, 458, 236, 547};
        int amountOfCosts = -1;
        for (int i = 0; i < cost.length; i++) {
            if (cost[i] > amountOfCosts) {
                amountOfCosts = cost[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + amountOfCosts + " рублей.");
        for (int i = 0; i < cost.length; i++) {
            if (cost[i] < amountOfCosts) {
                amountOfCosts = cost[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + amountOfCosts + " рублей.");
        System.out.println();
        System.out.println("Задание 3");
        int[] cost3 = {5863, 6695, 8458, 2236, 7547};
        int summ = 0;
        for (int i : cost3) {
            summ += i;
        }
        double average = (double) summ / cost3.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        System.out.println();
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

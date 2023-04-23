
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task4();
    }
    public static void task1() {
        System.out.println("Задача1");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int salarySum = 0;
        for (int salary: salaryArray){

           salarySum += salary;
        }
        System.out.println("Сумма трат составила " + salarySum + " рублей");
    }
    public static void task2() {
        System.out.println("Задача2");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int salaryMax = Integer.MAX_VALUE;
        int salaryMin = Integer.MIN_VALUE;
        for (int salary : salaryArray) {
            if (salary > salaryMax) {
                salaryMax = salary;
            }
            if (salary < salaryMin) {
                salaryMin = salary;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + salaryMin + " рублей." +
                " Максимальная сумма трат за день составила " + salaryMax + "… рублей.");
    }

    public static void task3() {
        System.out.println("Задача3");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int salarySum = 0;
        for (int salary : salaryArray) {

            salarySum += salary;
        }
        double salaryDub = (double) salarySum / salaryArray.length;
        System.out.println("Средняя сумма трат за месяц составила " + salaryDub + " рублей");
    }
    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName .length- 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int []arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;




    }
}
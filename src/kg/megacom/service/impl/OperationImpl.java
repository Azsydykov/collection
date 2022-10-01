package kg.megacom.service.impl;

import kg.megacom.service.Operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class OperationImpl implements Operation {
    ArrayList<Integer> list = new ArrayList<>();


    @Override
    public void creatRandomList() {
        System.out.println("* #1 *");
        for (int i = 0; i < 100; i++) {
            int numbers = (int) (Math.random() * 100);
            list.add(numbers);
        }
        System.out.println("Случайные числа: " + list);

    }

    @Override
    public void getMaxNum() {
        System.out.println("* #2 *");
        System.out.println("Максимальное число: " + Collections.max(list));
    }

    @Override
    public void getMinNum() {
        System.out.println("* #3 *");
        System.out.println("Минимальное число: " + Collections.min(list));

    }

    @Override
    public void getRepeatingNumber() {
        System.out.println("* #4 *");
        int maxFrequent = 0;
        int num = 0;
        for (int i = 0; i < list.size(); i++) {
            int frequent = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    frequent++;
                }
                if (frequent >= maxFrequent) {
                    maxFrequent = frequent;
                    num = list.get(i);
                }
            }
        }
        System.out.println("Число " + num + " повторялся " + maxFrequent + " раза");

    }

    @Override
    public void sortList() {
        System.out.println("* #5 *");
        Collections.sort(list);
        System.out.println("Сортировка" + list);
    }

    @Override
    public void findNumbers57() {
        System.out.println("* #6 *");
        int num5 = Collections.frequency(list, 5);
        System.out.println("Число 5 встречается " + num5 + " раз");

        int num7 = Collections.frequency(list, 7);
        System.out.println("Число 7 встречается " + num7 + " раз");

    }

    @Override
    public void creatListOf5elements() {
        System.out.println("* #7 *");
        try {
            ArrayList<Integer> srclist1 = new ArrayList<>();
            ArrayList<Integer> destList1 = new ArrayList<>(10);

            for (int i = 0; i < 5; i++) {
                int numbers5 = (int) (Math.random() * 100) + 1;
                srclist1.add(numbers5);
            }
            destList1.add(1);
            destList1.add(2);
            destList1.add(3);
            destList1.add(4);
            destList1.add(5);

            System.out.println("Случайные числа : " + srclist1);
            Collections.copy(destList1, srclist1);
            System.out.println("Копия списка: " + destList1);

            Collections.sort(srclist1);
            System.out.println("Отсортированный лист: " + srclist1);

            boolean result = false;
            while (result != true) {

                Collections.shuffle(destList1);
                // System.out.println("Попытки: " + destList1);
                if (srclist1.equals(destList1)) {

                    result = true;
                }
            }
            System.out.println("Перемешивали, пока не будет отсортирован по возрастанию: " + destList1);

        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Exception thrown : " + ex);
        }
    }

    @Override
    public void listsWithUniqueValue() {
        System.out.println("* #8 *");
        int chance = 0;
        ArrayList<Integer> uniqueList1 = createUniqueList();
        ArrayList<Integer> uniqueList2 = createUniqueList();
        boolean result = false;
        while (!result) {
            chance++;
            result = Collections.disjoint(uniqueList1, uniqueList2);
            System.out.println(result);
            if (!result) uniqueList2 = createUniqueList();//если есть совпадения обновляем 2й список

        }
        System.out.println("\n Result:\n");
        System.out.println(uniqueList1);
        System.out.println(uniqueList2);
        System.out.println("Количество попыток: " + chance);
    }

    public static ArrayList<Integer> createUniqueList() {
        //создает список с уникальными значениями
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            while (true) {
                int n = rand.nextInt(100) + 1;
                if (!list.contains(n)) {
                    list.add(n);
                    break;
                }
            }
        }
        System.out.println(list.toString());
        return list;
    }

}
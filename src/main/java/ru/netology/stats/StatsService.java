package ru.netology.stats;

public class StatsService {

    //сумма всех продаж
    public long sumSales(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }

        return sum;
    }

    //среднее по продажам
    public long calculateAverage(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum / 12;
    }

    //месяц с минимальными продажами
    public int findMinSaleMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    //месяц с максимальными продажами
    public int findPeakSaleMonth(long[] sales) {
        int peakMonth = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[peakMonth]) {
                peakMonth = i;
            }
        }

        return peakMonth + 1;
    }


    //сколько месяцев меньше среднего
    public int countMonthsBelowAverage(long[] sales) {
        int count = 0;
        long average = calculateAverage(sales);

        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }

        return count;
    }

    //сколько месяцев больше среднего
    public int countMonthsAboveAverage(long[] sales) {
        int count = 0;
        long average = calculateAverage(sales);

        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }

        return count;
    }

}
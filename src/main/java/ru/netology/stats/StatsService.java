package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) { // п. 1 - сумма всех продаж

        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long average(long[] sales) { // п. 2 - средняя сумма продаж в месяц

        return sumSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) { // п. 3 номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму

        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) { // п. 4 номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int bellowAverage(long[] sales) { // п. 5 количество месяцев, в которых продажи были ниже среднего
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverage(long[] sales) { // п. 6 количество месяцев, в которых продажи были выше среднего
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}

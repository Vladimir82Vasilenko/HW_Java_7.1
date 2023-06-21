package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public int averageSales(int[] sales) {
        int sumSales = sumSales(sales);

        int averageSales = sumSales / 12;

        return averageSales;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int minAverageSales(int[] sales){
        int month = 0;
        int averageSales = averageSales(sales);
        for (int sale : sales) {
            if(sale < averageSales){
                month++;
            }
        }
        return month;
    }

    public int maxAverageSales(int[] sales){
        int month = 0;
        int averageSales = averageSales(sales);
        for (int sale : sales) {
            if(sale > averageSales){
                month++;
            }
        }
        return month;
    }
}


package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverageSales(long[] purchases) {
        long sum = calculateSum (purchases);
        return sum / purchases.length;
    }

    public long findMax(long[] purchases) {
        long currentMax = purchases[0];
        long month = 0;
        long monthMax = 0;
        for (long purchase : purchases) {
            month += 1;
            if (currentMax <= purchase) {
                currentMax = purchase;
                monthMax = month;
            }
        }
        return monthMax;
    }

    public long findLow(long[] purchases) {
        long currentLow = purchases[0];
        long month = 0;
        long monthLow = 0;
        for (long purchase : purchases) {
            month += 1;
            if (currentLow >= purchase) {
                currentLow = purchase;
                monthLow = month;
            }
        }
        return monthLow;
    }

    public long findAverageMonthBelow(long[] purchases) {
        long sum = calculateAverageSales(purchases);
        long current = purchases[0];
        long monthMin = 0;
        for (long purchase : purchases) {
            if (sum < purchase) {
                monthMin += 1;
            }
        }
        return monthMin;
    }


    public long findAverageMonthAbove(long[] purchases) {
        long sum = calculateAverageSales(purchases);
        long current = purchases[0];
        long monthMax = 0;
        for (long purchase : purchases) {
            if (sum < purchase) {
                monthMax += 1;
            }
        }
        return monthMax;
    }
}


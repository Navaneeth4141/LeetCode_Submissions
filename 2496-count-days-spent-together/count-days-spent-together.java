class Solution {
    // Number of days in each month for a non-leap year
    private final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int arriveAliceDay = countDaysFromStart(arriveAlice);
        int leaveAliceDay = countDaysFromStart(leaveAlice);
        int arriveBobDay = countDaysFromStart(arriveBob);
        int leaveBobDay = countDaysFromStart(leaveBob);

        int startTogether = Math.max(arriveAliceDay, arriveBobDay);
        int endTogether = Math.min(leaveAliceDay, leaveBobDay);

        if (startTogether > endTogether) {
            return 0;
        }

        return endTogether - startTogether + 1;
    }

    private int countDaysFromStart(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int totalDays = day;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonths[i];
        }

        return totalDays;
    }
}
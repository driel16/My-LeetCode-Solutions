class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysSince1971(date1) - daysSince1971(date2));
    }

    private int daysSince1971(String date) {
        String[] p = date.split("-");
        int y = Integer.parseInt(p[0]), m = Integer.parseInt(p[1]), d = Integer.parseInt(p[2]);
        
        int totalDays = d;
        
        for (int i = 1971; i < y; i++) {
            totalDays += isLeap(i) ? 366 : 365;
        }
        
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 1; i < m; i++) {
            totalDays += months[i];
        }
        
        if (m > 2 && isLeap(y)) {
            totalDays++;
        }
        
        return totalDays;
    }

    private boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}

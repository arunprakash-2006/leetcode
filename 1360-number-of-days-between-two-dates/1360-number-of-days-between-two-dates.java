class Solution {
   
    public boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    
    public int daysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else
            return isLeap(year) ? 29 : 28;
    }

    
    public int dateToDays(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int days = 0;

        for (int y = 1971; y < year; y++) {
            days += isLeap(y) ? 366 : 365;
        }


        for (int m = 1; m < month; m++) {
            days += daysInMonth(year, m);
        }

        days += day;

        return days;
    }

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(dateToDays(date1) - dateToDays(date2));
    }
}

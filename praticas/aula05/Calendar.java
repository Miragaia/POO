package Aula05;

public class Calendar {
    private int y;
    private int yStart;
    private String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    private String[] monthDays = { "January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December" };

    public Calendar(int y, int yStart) {
        this.y = y;
        this.yStart = yStart;
    }

    public int getYear() {
        return y;
    }

    public String getFirstWeekdayOfYear() {
        return weekDays[yStart - 1];
    }

    public int firstWeekdayOfMonth(int m) {
        int weekDay = yStart;
        for (int i = 1; i < m; i++) {
            weekDay += Date.monthDays(i, y);
            weekDay %= 7;
            if (weekDay == 0) {
                weekDay = 7;
            }
        }
        return weekDay;
    }

    public String printMonth(int m) {
        int maxWidth = 20;
        String mString = monthDays[m - 1];
        int paddingLeft;
        int changeLine = 1; 
        paddingLeft = (maxWidth - (mString.length() + 3)) / 2;
        StringBuilder sb = new StringBuilder("");
        sb.append("\n");
        sb.append(String.format(" ".repeat(paddingLeft) + "%s %4d \n", mString, y));
        sb.append("Su Mo Tu We Th Fr Sa \n");
        for (int i = 1 - (firstWeekdayOfMonth(m) - 1); i <= Date.monthDays(m, y); i++) {
            if (i < 1) {
                sb.append("  ");
            } else {
                sb.append(String.format("%2d ", i));
            }
            if (changeLine++ % 7 == 0) {
                sb.append("\n");
            }
        }
        sb.append("\n");
        return sb.toString();

    }

    public static boolean validMonth(int m) {
        return m >= 1 && m <= 12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 1; i <= 12; i++) {
            sb.append(printMonth(i));
        }
        return sb.toString();
    }
}

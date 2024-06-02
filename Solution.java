class Solution {
    public String reformatDate(String date) {
        String day = "", month = "", year = "";
        String cur = "";
        for (char c : date.toCharArray()) {
            if (c == ' ') {
                if (day == "") {
                    day = cur;
                } else {
                    month = cur;
                }
                cur = "";
            } else {
                cur += c;
            }
        }
        year = cur;
        String ansDay = "";
        for (char c : day.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                ansDay += c;
            }
        }
        if (ansDay.length() == 1) {
            ansDay = "0" + ansDay;
        }
        String ansMonth = "";
        String[] monthNames = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < monthNames.length; i++) {
            if (month.equals(monthNames[i])) {
                ansMonth = String.valueOf(i + 1);
                if (i + 1 < 10) {
                    ansMonth = "0" + ansMonth;
                }
            }
        }
        return year + "-" + ansMonth + "-" + ansDay;
    }
}

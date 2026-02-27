class Solution {
    public String reformatDate(String date) {
        //Split the string by spaces
        String[] parts = date.split(" ");
        String dayStr = parts[0];
        String monthStr = parts[1];
        String year = parts[2];

        //Extract the numeric day (remove "st", "nd", "rd", or "th")
        // We take everything except the last two characters
        String day = dayStr.substring(0, dayStr.length() - 2);
        if (day.length() == 1) {
            day = "0" + day; // Ensure 2-digit format (DD)
        }

        //Convert Month string to 2-digit number (MM)
        String month = getMonth(monthStr);

        //Combine into YYYY-MM-DD
        return year + "-" + month + "-" + day;
    }

    private String getMonth(String m) {
        switch (m) {
            case "Jan": return "01";
            case "Feb": return "02";
            case "Mar": return "03";
            case "Apr": return "04";
            case "May": return "05";
            case "Jun": return "06";
            case "Jul": return "07";
            case "Aug": return "08";
            case "Sep": return "09";
            case "Oct": return "10";
            case "Nov": return "11";
            case "Dec": return "12";
            default: return "01";
        }
    }
}

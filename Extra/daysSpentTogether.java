class daysSpentTogether {
    public static int toDayNumber(String date) {
        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };
        int days = 0;
        int mm = 0;
        int dd = 0;
        for(int i = 0; i < date.length(); i++){
            if(i < date.length()/2){
                char ch = date.charAt(i);
                int digit = ch - '0';
                mm *= 10;
                mm += digit;
            }
            else{
                char ch = date.charAt(i);
                int digit = ch - '0';
                dd *= 10;
                dd += digit;
            }
        }
        if(mm == 1){
            return days + dd;
        }
        for(int i = 0; i < mm - 1; i++){
            days += daysInMonth[i];
        }
        return days + dd;
    }

    public static void main(String[] args) {
        String aAlice = "08-15";
        String lAlice = "08-18";
        String aBob = "08-16";
        String lBob = "08-19";
        int aAliceDays = toDayNumber(aAlice);
        int lAliceDays = toDayNumber(lAlice);
        int aBobDays = toDayNumber(aBob);
        int lBobDays = toDayNumber(lBob);
        int result = 0;
        int start = Math.max(aAliceDays, aBobDays);
        int end = Math.min(lAliceDays, lBobDays);
        if(start > end){
            System.out.println(result);
        }
        else{
            System.out.println(end - start + 1);
        }
    }
}
package co.incubytes;

public class LeapYear {
    public static String check(String s) {
        String[] str=s.split(",");
        if(str.length==1){
            int y=Integer.parseInt(str[0]);
            if((y%400)==0)
                return "Leap Year "+s;
        }else if(getYear(str)==0)
            return "Leap Year "+s;
        return "Not Leap Year "+s;
    }

    private static int getYear(String[] str) {
        for(String word:str){
            if((Integer.parseInt(word)%100)==0 && !((Integer.parseInt(word)%400)==0))
                return 1;
            else if((Integer.parseInt(word)%4)==0 && !((Integer.parseInt(word)%100)==0))
                return 0;
            else if((Integer.parseInt(word)%4)!=0)
                return 1;
            else
                return 0;
        }
        return 0;
    }
/*
    public static int check(int y) {
        if (y % 400 == 0) {
            return 1;
        } else if ((y % 100 == 0) && !(y % 400==0)) {
            return 0;
        } else if ((y % 4 == 0) && !(y % 100==0)) {
            return 1;
        }
        return 0;
    }
*/
}


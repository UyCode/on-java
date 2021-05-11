package southwind.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/11 22:20
 */

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy'年'MM'月'dd'日 'HH:mm:ss:SSS");
        String format1 = format.format(date);
        System.out.println(format1);
        System.out.println(date);

        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.getWeekYear());


        //计算今天所在的周是今年的第几周
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.YEAR, calendar1.getWeekYear());
        calendar1.set(Calendar.MONTH, calendar1.get(Calendar.MONTH));
        calendar1.set(Calendar.DAY_OF_MONTH, calendar1.get(Calendar.DAY_OF_MONTH));
        int week = calendar1.get(Calendar.WEEK_OF_YEAR);
        System.out.println("今天是这年的第"+week + "周");

        //今天之后的n天是几月几号
        Calendar calendar2 = Calendar.getInstance();
        int today = calendar2.get(Calendar.DAY_OF_YEAR);
        int future = today + 10000;
        calendar2.set(Calendar.DAY_OF_YEAR, future);
        Date time = calendar2.getTime();
        String futureTime = format.format(time);
        System.out.println(futureTime);

        //今天之前的n天
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(Calendar.DAY_OF_YEAR, calendar3.get(Calendar.DAY_OF_YEAR) - 10000);
        Date time1 = calendar3.getTime();
        String before = format.format(time1);
        System.out.println(before);


    }
}

package com.temp.demo;

import com.fresh.common.utils.ScanUtils;

import java.net.URL;
import java.net.URLClassLoader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Enumeration;
/**
 * Hello world!
 *
 */
public class Application {

    public static void main(String[] args) throws Exception {
        System.out.println("sun.boot.class.path: " + System.getProperty("sun.boot.class.path"));
        System.out.println("java.ext.dirs: " + System.getProperty("java.ext.dirs"));
        System.out.println("java.class.path: " + System.getProperty("java.class.path"));

        System.out.println(ScanUtils.scan("nothing"));
        Enumeration<URL> jarInsRes = Application.class.getClassLoader().getResources("com/fresh");
        while(jarInsRes.hasMoreElements()) {
            System.out.println(jarInsRes.nextElement());
        }

        URL re = Application.class.getClassLoader().getResource("sunec.jar");
        System.out.println(re);

        System.out.println(ScanUtils.class.getClassLoader());

        test_cls();

        URL nn = Application.class.getClassLoader().getResource(""); //user.dir
        System.out.println(nn);

    }

    private int calDatesBetween(int startDate, int endDate) {
        return endDate - startDate;
    }


    //计算两个日期之间的天数差值，参数为 LocalDate 类型
    private static long calDatesBetween(LocalDate startDate, LocalDate endDate) {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("startDate and endDate must not be null");
        }
        return ChronoUnit.DAYS.between(startDate, endDate);
    }
    public static void test_cls() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        while(classLoader != null) {
            if (classLoader instanceof URLClassLoader) {
                for (URL url : ((URLClassLoader) classLoader).getURLs()) {
                    System.out.println(url);
                }
            }
            System.out.println(classLoader + "############");
            classLoader = classLoader.getParent();
        }

    }

}




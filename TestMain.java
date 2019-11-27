import org.apache.commons.lang3.*;
import org.apache.commons.io.*;
import java.io.*;

public class TestMain {
    static String[] s1 = new String[]{"Software"};
    static String[] s2 = new String[]{" test"};
    static String[] s3 = new String[]{"s1","+","s2"};
    static String[] s;
    static int x,x1=3,x2=4,x3=12;
    static int flag = (int)(1+Math.random()*(3-1+1));
    public static void add12(){
        x=x1-x2;
        s = (String[])ArrayUtils.addAll(s1,s2);
    }
    public static void add13(){
        x=x1*x3;
        s = (String[])ArrayUtils.addAll(s1,s3);
    }
    public static void add23(){
        x=x3/x2;
        s = (String[])ArrayUtils.addAll(s2,s3);
    }

    public static void main(String args[]){
        System.out.println("软件测试-使用Apache Commons的小程序");
        System.out.println("Random Flag: "+flag);
        if(flag == 1){
            add12();
            System.out.println("s: "+s+" x: "+x);
        }else if(flag == 2){
            add13();
            System.out.println("s: "+s+" x: "+x);
        }else{
            add23();
            System.out.println("s: "+s+" x: "+x);
        }
    }
}

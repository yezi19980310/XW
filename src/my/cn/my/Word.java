package my.cn.my;

import java.util.ArrayList;
import java.util.List;

public class Word {
    public static void main(String[] args) {
        System.out.println("你个哥哥还是妹妹");
        System.out.println("打你哦");
        System.out.println("哼，你理你了");
        List<String> str=new ArrayList<>();
        String str1="111";
        String str2="222";
        String str3="333";
        str.add(str1);
        str.add(str2);
        str.add(str3);
        for (String s : str) {
            System.out.println(s);
        }
    }
}



/*
如果一个字符串由两个相同字符串连接而成,就称这个字符串是偶串。例如"xyzxyz"和"aaaaaa"是偶串,
但是"ababab"和"xyzxy"却不是。牛牛现在给你一个只包含小写字母的偶串s,你可以从字符串s的
末尾删除1和或者多个字符,保证删除之后的字符串还是一个偶串,牛牛想知道删除之后得到最长偶串长度是多少。

输入描述:
输入包括一个字符串s,字符串长度length(2 ≤ length ≤ 200),保证s是一个偶串且由小写字母构成


输出描述:
输出一个整数,表示删除之后能得到的最长偶串长度是多少。保证测试数据有非零解
示例1
输入
abaababaab
输出
6
*/
package bishi0619;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        while(len>2){
            String str = s;
            str = str.substring(0,len-=2);
            if(judge(str)){
                System.out.println(str.length());
                return;
            }
        }
    }
    public static boolean judge(String str){
        int len = str.length();
        int len1 = len /2;
        for(int i = 0;i<len1;i++){
            if(str.charAt(i) != str.charAt(i+len1)){
                return false;
            }
        }
        return true;
    }
}
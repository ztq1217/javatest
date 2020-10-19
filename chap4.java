//4-1-1

import java.util.Scanner;
 
public class chap4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数："+a);
        int b = s.nextInt();
        System.out.println("第二个整数："+b);
        System.out.println("两个叔的和是："+(a+b));
    }
}

//4-1-2
/*
int i = 1;
int j = ++i + i++ + ++i + ++i + i++;
问 j的结果是多少?
j=2+2+4+5+5=18

*/


//4-1-3
import java.util.Scanner;
 
public class chap4 {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("请输入身高(m)");
    	float height = s.nextFloat();
    	System.out.println("请输入体重(kg)");
    	float weight = s.nextFloat();
    	System.out.println("当前的BMI是"+(weight/height/height));
    }
}


//4-2
import java.util.Scanner;
 
public class chap4 {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int a = s.nextInt();
    	int b = s.nextInt();
    	System.out.println("比较"+a+">"+b+":"+(a>b));
    	System.out.println("比较"+a+">="+b+":"+(a>=b));
    	System.out.println("比较"+a+"<"+b+":"+(a<b));
    	System.out.println("比较"+a+"<="+b+":"+(a<=b));
    	System.out.println("比较"+a+"=="+b+":"+(a==b));
    	System.out.println("比较"+a+"!="+b+":"+(a!=b));
    }
}


//4-3
/*

int i = 1;
boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
System.out.println(b);
System.out.println(i);

b=false
i=3

*/




//4-4

/*
int i = 1;
i+=++i; 

i=3
*/

//4-5 通过Scanner输入一个1-7之间的整数，使用三元操作符判断是工作日还是周末？

public class chap4 {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int i = s.nextInt();
    	boolean weekend = i >= 6 ? true : false;

}
// 5-1-1
import java.util.Scanner;
 
public class chap5 {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("请输入身高(m)");
    	float height = s.nextFloat();
    	System.out.println("请输入体重(kg)");
    	float weight = s.nextFloat();
    	float bmi = weight/height/height;
    	System.out.println("当前的BMI是"+bmi);
    	if (bmi < 18.5)
    		System.out.println("身体状态是：体重过轻");
    	else if (bmi < 24)
    		System.out.println("身体状态是：正常范围");
    	else if (bmi < 27)
    		System.out.println("身体状态是：体重过重");
    	else if (bmi < 30)
    		System.out.println("身体状态是：轻度肥胖");
    	else if (bmi < 35)
    		System.out.println("身体状态是：中度肥胖");
    	else 
    		System.out.println("身体状态是：重度肥胖");
    }
}


//5-1-2 闰年

import java.util.Scanner;
 
public class chap5 {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("请输入年份");
    	int year = s.nextInt();
    	if (year % 400 == 0)
    		System.out.println(year+"年是闰年");
    	else if (year % 4 == 0 && year % 100 != 0)
    		System.out.println(year+"年是闰年");
    	else System.out.println(year+"年不是闰年");
    }
}

//5-2

import java.util.Scanner;
 
public class chap5 {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("请输入月份");
    	int month = s.nextInt();
    	switch (month) {
    		case 12:
    		case 1:
    		case 2:
    			System.out.println("冬天");
    			break;
    		case 3:
    		case 4:
    		case 5:
    			System.out.println("春天");
    			break;
    		case 6:
    		case 7:
    		case 8:
    			System.out.println("夏天");
    			break;
    		case 9:
    		case 10:
    		case 11:
    			System.out.println("秋天");
    			break;
    	}
    }
}


//5-3 阶乘
import java.util.Scanner;
 
public class chap5 {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("请输入一个整数");
    	int n = s.nextInt();
    	long sum = 1;
    	while(n>0){
    		sum = sum*n;
    		n--;
    	}
    	System.out.println("结果是"+sum);
    }
}

// 5-4 for
import java.util.Scanner;
 
public class chap5{
    public static void main(String[] args) {

    	int i = 1;
    	int n = 1;
    	int sum =1;
    	for (i=2;i<=10;i++) {
    		n=n*2;
    		sum=sum+n;
    	}
    	System.out.println("结果是"+sum);
    }
}


//5-5 continue
import java.util.Scanner;
 
public class chap5 {
    public static void main(String[] args) {
    	int i;
    	for(i=1;i<=100;i++) {
    		if(i%3 == 0 || i%5 ==0)
    			continue;
    		System.out.println(i);
    	}
    }
}
// 3-1

public class chap3 {
    public static void main(String[] args) {
	double a = 3.14;
	double b = 2.769343;
	int c = 365;
	int d = 12;
	char e = '吃';
	boolean f = false;
	String g = "不可描述";
   }
}
// 3-2

public class chap3 {
    public static void main(String[] args) {
    	byte b = 1;
    	short s = 12;
    	int i = 5;
    	long l = 12313214;
    	float f = 1.2345f;
    	double d = 1.141;
    	char c = 'c';
    	String str = "test";
    }
}

// 3-3
/*
short a = 1;
short b = 2;
那么 a+b 是什么类型？

A: int类型。
*/



// 3-4

/*
思考如下变量命名是否合法，如果不合法，为什么？
1. int a_;  		√
2. int a@;		× 包含@
3. int a3;		√
4. int 8@;		× 数字开头
5. int 9_;		× 数字开头
6. int X$_;		√
7. int y;		√
8. int _$_;		√
9. int $_$;		√
10. int $*$;	×包含*
11. int $1$;	√
12. int _1_;	√
13. int _@_;	× 包含@
14. int a#;		× 包含#
15. int a";		× 包含"
16. int 123a";	× 包含"、数字开头
17. int 123a_;	× 数字开头
18. int $123b_;	√

*/

//3-5

/*

public class HelloWorld {
    int i = 1; //属性名是i
    public void method1(int i){ //参数也是i
        System.out.println(i);
    }
     
    public static void main(String[] args) {
        new HelloWorld().method1(5);
        //结果打印出来是 1还是5?
    }
}

A：5，看起来是优先取参数。

*/


//3-6

/*

public class HelloWorld {
 
    public void method1(final int j) {
        j = 5; //这个能否执行？
    }
}

不能。

*/
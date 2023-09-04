package hw1_0831;

public class Hw1_1 {
	
    public static void main(String [] args) {
    	System.out.println("題目：請設計一隻Java程式,計算12,6這兩個數值的和與積") ;
    	
    	int a = 12 , b = 6 ;  
    	
    	System.out.println(a + b) ;
    	System.out.println(a * b) ;
    	System.out.println("========") ;
    	
    	
    	System.out.println("題目：請設計一隻Java程式,計算200顆蛋共是幾打幾顆?") ;
    	
    	int num1 = 200 / 12 , num2 = 200 % 12 ;    
    	
    	System.out.println( num1 + "打" + num2 + "顆" ) ;
    	System.out.println("========") ;
    	
    	
    	System.out.println("請由程式算出256559秒為多少天、多少小時、多少分與多少秒") ;
    	
    	int total = 256559 , hr = 24 , min = 60 , sec = 60 ;    // 
    	int daysec = hr*min*sec , hrsec = min*sec ;
    	int lefthr = total % daysec , leftmin = lefthr % hrsec , leftsec = leftmin % sec ;    // 
    			
    	System.out.println( (total / daysec) + "天" + (lefthr / hrsec) + "小時" + (leftmin / min) + "分" + leftsec + "秒" ) ;
    	System.out.println("========") ;
    	
    	
    	System.out.println("請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長") ;
    	int  half = 5 ;
    	final double PI = 3.1415 ;
    	double area = half * half * PI , circle = half *2 * PI ;
    	    	
    	System.out.println( "圓面積為" + area ) ;
    	System.out.println( "圓周長為" + circle ) ;
    	System.out.println("========") ;		
    	
    }
}

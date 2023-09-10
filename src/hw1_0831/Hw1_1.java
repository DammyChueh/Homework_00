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
    	
    	
    	System.out.println("某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)") ;
    	// 複利的計算公式是：S = P(I + i)*n次方，其中以I代表利息，P代表本金，n代表期數，i代表利率，S代表本利和
    	int p = 1_500_000 ;
    	double i = 0.02 ; 
    	double S = p * (1+i) ;
    	for (int n = 1 ; n <= 10 ; n++) {
    		S *=  (1 + i) ;
    	}
    	System.out.println((int)S + "元") ;
    	System.out.println("========") ;
    	
    	
    	System.out.println("請寫一隻程式,利用System.out.println()印出以下三個運算式結果:5" +  "+" + "5" + "、" + "5" + "‘5’" + "、" +"5 + “5”") ;
    	System.out.println(5 + 5) ; // 預設為int，為整數相加，結果為數字
    	System.out.println(5 + '5') ; // '5' 在unicode對照表橫軸為5，縱軸為48，相加後53 ，再加上原本的5，故為5+53
    	System.out.println(5 + "5") ; //數字5再加字串5
    	

    	


    	}
    	
    	
    }
}

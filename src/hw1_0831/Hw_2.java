package hw1_0831;

public class Hw_2 {

	public static void main(String[] args)  {
//			int i, j;    //這是老師寫的
//			for (i = 1; i <= 9; i++) {
//				for (j = 1; j <= 9; j++)
//					System.out.print(i + "*" + j + "=" + i * j + "\t");
//				System.out.println();
		//↓下面是回家作業，用不同迴圈寫九九乘法
			
		//第一種，用for+while迴圈
		for (int i = 1 ; i<=9 ; i++) {
			int j = 1;
			while (j<=9) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
				j++;
			}
			System.out.println();
		}
		
		System.out.println("==========");
		
		//第二種，for+do while迴圈	
		for (int i = 1 ; i<=9 ; i++) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;					
			} while (j <= 9) ;
			System.out.println();						
		}
			
		System.out.println("==========");
		
		//第三種，while+do while迴圈	
		int i = 1;
		while (i<=9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}while (j<=9);
			i++;
			System.out.println();
		}
			
		System.out.println("==========");
			
			
		System.out.println("請設計一隻Java程式,計算1~1000的偶數和(2+4+6+8+...+1000)");

		int sum = 0 ;
		for (int i1 = 0 ; i1<=1000 ; i1 += 2 )
			sum += i1;
			System.out.println(sum);
			
		System.out.println("==========");
		
		System.out.println("請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)");
		int sum2 = 1;
			for(int i2 = 1 ; i2<=10 ; i2++)
			sum2 *= i2;
			System.out.println(sum2);
		
		System.out.println("==========");
		
		System.out.println("請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)");
		int sum3 = 1;
		int i3 = 1;
		while(i3<=10) {
			sum3 *= i3;
			i3++;
		}
		System.out.println(sum3);
		
		System.out.println("==========");
		
		
		System.out.println("請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100");		
		for (int i4=1 ; i4<=10 ; i4++) 			
		System.out.println(i4 * i4);
		
		System.out.println("==========");
	
		System.out.println("阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？");		
		
		int count=0;
		for (int i5 = 1 ; i5 <= 49 ; i5++) {
			if (i5 % 10 != 4 && i5 < 40) {
				System.out.print(i5 + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("共" + count + "個");
				
		System.out.println("==========");
		
		System.out.println("請設計一隻Java程式，輸出結果為以下");
		for (int i6 = 10; i6 >= 1; i6--) {
			for (int j6 = 1; j6 <= i6 ; j6++) {
				System.out.print(j6+" ");
			}
			System.out.println();
		}
		System.out.println("==========");
		
		System.out.println("請設計一隻Java程式，輸出結果為以下");
		for (char i7 = 65; i7 <= 70 ; i7++) {
			for (char j7 = 65; j7 <= i7 ; j7++) {
				System.out.print(i7);
			}
			System.out.println();
		}
				
					
					
	}
	
	
}

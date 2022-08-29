package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A {
	
	public A() {
		Addition();
	}
	
	public void Addition() {
		int x;//你的答案
		int i=0;//答對題數
		int j=0;//答錯題數
		int k=0;//題數
		System.out.println("加法練習題，離開請輸入\"0\"結算成績");
		while(true) {
			int m=(int) (Math.random()*10)+1;
			int n=(int) (Math.random()*100)+1;
			k++;
			try {
				System.out.println("======================");
				System.out.println("第"+k+"題 : "+m+"+"+n+"=");
				Scanner s=new Scanner(System.in);
				x=s.nextInt();
				
				if(x==0) {
					System.out.println("結算成績!!答對題數 : "+i+"， 答錯題數 : "+j);
					if(i>j*2) {
						System.out.println(">_< 分數還不錯唷!!");
					}else {
						System.out.println("O_Q 分數差強人意!!該多多練習囉!!");
					}
					break;
				}else if(x==m+n) {
						System.out.println("正確!");
						i++;
						System.out.println("目前答對題數 : "+i+"， 答錯題數 : "+j);
						}else {
							System.out.println("錯誤!");
							System.out.println("正確的答案為 : "+(m+n));
							j++;
							System.out.println("目前答對題數 : "+i+"， 答錯題數 : "+j);
							}
			}catch(InputMismatchException e) {
				System.out.println("請輸入整數!! (#`A`)/");
				System.out.println("答錯題數+1!! (#ˋA`)/");
				j++;
				System.out.println("目前答對題數 : "+i+"， 答錯題數 : "+j);
			}

		}

	}

}

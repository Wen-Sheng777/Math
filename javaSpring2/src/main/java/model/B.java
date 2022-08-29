package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class B {
	
	public B() {
		perimeter();
	}

	public void perimeter() {
		int x;//你的答案
		int i=0;//答對題數
		int j=0;//答錯題數
		int k=0;//題數
		System.out.println("周長練習題，離開請輸入\"0\"結算成績");
		while(true) {
			int m=(int) (Math.random()*10)+1;
			int n=(int) (Math.random()*10)+1;
			int o=(int) (Math.random()*10)+1;
			Scanner s=new Scanner(System.in);
			k++;
			try {
				System.out.println("======================");
			if(o>5) {//決定題目類型
				System.out.println("第"+k+"題 : 長"+m+"cm，寬"+n+"cm的長方形周長為幾cm?");//題目類型1
				x=s.nextInt();
				if(x==0) {//離開判斷
					score(i,j);
					break;
				}else if(x==(m*2+n*2)) {//答對
					i++;
					add(i,j);
					}else {//答錯
						j++;
						error1(i,j,m,n);
					}
			}else{
			System.out.println("第"+k+"題 : 三邊長為"+m+"cm，"+n+"cm，"+o+"cm，的三角形周長為幾cm?");//題目類型2
			x=s.nextInt();
			if(x==0) {
				score(i,j);
				break;
			}else if(x==(m+n+o)) {//答對
				i++;
				add(i,j);
					}else {//答錯
						j++;
						error2(i,j,m,n,o);
						}
				}
			}catch(InputMismatchException e) {//防止奇怪的字
				System.out.println("請輸入整數!! (#`A`)/");
				System.out.println("答錯題數+1!! (#`A`)/");//懲罰
				j++;
				System.out.println("目前答對題數 : "+i+"， 答錯題數 : "+j);
			}
		}

	}
	
	public void add(int i,int j) {
		System.out.println("正確!");
		System.out.println("目前答對題數 : "+i+"， 答錯題數 : "+j);
	}
	public void error1(int i,int j,int m,int n) {
		System.out.println("錯誤!");
		System.out.println("正確的答案為 : "+(m*2+n*2)+"cm");
		System.out.println("目前答對題數 : "+i+"， 答錯題數 : "+j);
		
	}
	public void error2(int i,int j,int m,int n,int o) {
		System.out.println("錯誤!");
		System.out.println("正確的答案為 : "+(m+n+o)+"cm");
		System.out.println("目前答對題數 : "+i+"， 答錯題數 : "+j);
		
	}
	
	public void score(int i,int j) {//結算成績
		System.out.println("結算成績!!答對題數 : "+i+"， 答錯題數 : "+j);
		if(i>j*2) {
			System.out.println(">_< 分數還不錯唷!!");
		}else {
			System.out.println("O_Q 分數差強人意!!該多多練習囉!!");
		}
	}

}

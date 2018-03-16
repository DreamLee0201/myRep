package Day4;

import java.util.Scanner;

public class DoWhileDemo {
	

	/**
	 * do-while循环
	 * 语法结构：do｛
	 *          循环操作；
	 *          ｝while（条件语句）；
	 * 执行过程：首先执行循环操作，然后再进行条件语句的
	 * 判断，如果为true，则执行循环操作，如果为false
	 * ，则跳出循环。
	 * 循环操作之后，依然回到条件语句的判断
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("Please input your password:");
//		变量的作用域：就是变量的作用范围，即
//		变量生命开始的地方，到声明结束的地方。
//		只有在变量的作用域内，变量才可以被使用！！
//		变量声明的地方就是生命开始的地方。	
//		变量在那个花括号中声明，就在花括号结束是生命
//		随之结束
		int psw,count = 1;
		do{
			if(count == 1){
				System.out.println("Please input your password:");
			}else{
				System.out.println("WORNG!Please input your password\n(you have "+(4-count)+" chances left):");
			}
			psw = in.nextInt();
			count ++;
		}while(psw != 528491 && count < 4);
//		执行到此处，说明密码输入正确
		
		if(count == 4 && psw != 528491){
			System.out.println("Your card is LOCKED!");
		}else{
			System.out.println("Bingo!!!");
		}
	}

}

package Day4;

import java.util.Scanner;

public class DoWhileDemo {
	

	/**
	 * do-whileѭ��
	 * �﷨�ṹ��do��
	 *          ѭ��������
	 *          ��while��������䣩��
	 * ִ�й��̣�����ִ��ѭ��������Ȼ���ٽ�����������
	 * �жϣ����Ϊtrue����ִ��ѭ�����������Ϊfalse
	 * ��������ѭ����
	 * ѭ������֮����Ȼ�ص����������ж�
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("Please input your password:");
//		�����������򣺾��Ǳ��������÷�Χ����
//		����������ʼ�ĵط��������������ĵط���
//		ֻ���ڱ������������ڣ������ſ��Ա�ʹ�ã���
//		���������ĵط�����������ʼ�ĵط���	
//		�������Ǹ������������������ڻ����Ž���������
//		��֮����
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
//		ִ�е��˴���˵������������ȷ
		
		if(count == 4 && psw != 528491){
			System.out.println("Your card is LOCKED!");
		}else{
			System.out.println("Bingo!!!");
		}
	}

}

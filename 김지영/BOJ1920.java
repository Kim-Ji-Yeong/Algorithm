package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N]; // �迭����
		for(int i = 0; i < N; i++) { // �迭 ���� ��ŭ for�� ���� �迭���ֱ�
			A[i]  = sc.nextInt();
		}
		Arrays.sort(A); // ����
		int M = sc.nextInt();
		for(int i = 0; i<M; i++) {  // M�� ������ŭ �ݺ�
			boolean find = false; 
			int target = sc.nextInt(); //ã�ƾ��ϴ� ��
			//����Ž��
			int start =0; // �����ε���
			int end = A.length-1; // �����ε���
			while(start <= end) {
				int midi = (start + end)/2; //�߰��ε���
				int midV = A[midi];
				if(midV > target) {  //�߾Ӱ�>target
					end = midi -1; // �����ε��� = �߰��ε��� -1
				}else if (midV < target) { //�߾Ӱ� < target
					start = midi + 1; //�����ε��� = �߰� �ε��� +1
				}else {
					find = true; //ã�����Ƿ� �ݺ��� �����ϱ�
					break;
				}
			}
			if(find) {
				System.out.println(1); //ã����
			}else {
				System.out.println(0);
			}
		}
	}
}

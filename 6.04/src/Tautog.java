public class Tautog { // ������
	public static void main(String[] args) { // ������
		int arr2[][] = { { 4, 3 }, { 1, 9 } }; // �����ά����
		System.out.println("�����е�Ԫ���ǣ�"); // ��ʾ��Ϣ
		for (int x[] : arr2) { // ���ѭ������Ϊһά����
			System.out.print("��"); // �����Ϣ
			for (int e : x) { // ѭ������ÿһ������Ԫ��
				if (e == x[x.length-1]) { // �жϱ����Ƕ�ά�����е����һ��Ԫ��
					System.out.print(e); // �����ά��������һ��Ԫ��
				} else
					// ������Ƕ�ά�����е����һ��Ԫ��
					System.out.print(e + "��"); // �����Ϣ
			}
		}
	}
}

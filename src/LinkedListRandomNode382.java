import java.util.Random;

public class LinkedListRandomNode382 {
	private ListNode head;
	public LinkedListRandomNode382(ListNode head) {
		// TODO Auto-generated constructor stub
		this.head = head;
	}
	public int getRandom() {
		Random random = new Random();
		int res = head.val;//resΪ��СΪ1�ĳ���
		int cur = 2;//�ڼ����ڵ��Ƿ�������
		ListNode cur_node = head.next;
		while(cur_node != null){
			int temp = random.nextInt(cur);//��������������
			if (temp == 0) {
				//�滻�����
				res = cur_node.val;
			}
			cur_node = cur_node.next;
			cur++;
		}
		return res;
	}
	class ListNode {
		int val;
		ListNode next;
		public ListNode(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}
}

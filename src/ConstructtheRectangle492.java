import java.util.HashMap;

public class ConstructtheRectangle492 {
    public int[] constructRectangle(int area) {
    	int small_w = 0;
    	int small_l = 0;
    	int small_diff = 1000000000;
        int[] seq = new int[2];
        //forѭ����һ���ߵ�ʱ��int i = 1 -> i <= area/2�����жϣ��ٽ���ѭ���顣
        for(int i = 1;i <= area / 2 + 1;i++){
        	if (area % i == 0) {
				int temp = area / i;
				int small = Math.abs(i - temp);
				if (small < small_diff) {
					small_w = i < temp?i:temp;
					small_l = i > temp?i:temp;
				}
			}
        }
        seq[0] = small_l;
        seq[1] = small_w;
        return seq;
    }
}

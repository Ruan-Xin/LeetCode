import java.util.Arrays;
import java.util.Comparator;

public class AssignCookies455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;//��������ĺ���
        int i = 0;
        int j = 0;
        while(i < g.length && j < s.length){
        	if (g[i] > s[j]) {
				//������
				j++;
			}else {
				i++;
				j++;
				count++;
			}
        }
        //StringBuffer
        String str = new java.lang.String();
    	return count;
    }
}

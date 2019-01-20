package xust;

/*
1.ʵ�� strStr()
ʵ�� strStr() ������
����һ�� haystack �ַ�����һ�� needle �ַ������� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)����������ڣ��򷵻�  -1��

ʾ�� 1:
����: haystack = "hello", needle = "ll"
���: 2

ʾ�� 2:
����: haystack = "aaaaa", needle = "bba"
���: -1
˵��:
�� needle �ǿ��ַ���ʱ������Ӧ������ʲôֵ�أ�����һ���������кܺõ����⡣
���ڱ�����ԣ��� needle �ǿ��ַ���ʱ����Ӧ������ 0 ������C���Ե� strstr() �Լ� Java�� indexOf() ���������
 */

/*
 * �㷨˼�룺
 * ���ж�needle�ĳ��ȣ��������Ϊ0�����ַ��������򷵻�0��
 * ������ǿ��ַ����������haystack��ÿλ�ַ����ݣ��ҵ���needle��λ��ͬ��λ�ã�
 * �Ӵ�λ�ñȽ�needle�����ַ��Ƿ�ʹ�λ�ú������ַ���ͬ�����ǣ�����i�������ǣ���������²��ң�ֱ���ҵ�Ϊֹ
 * �������û���ҵ�������-1���ҵ��������ҵ���λ��
 */

//public class Test_0120 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		String haystack = "hello";
//		String needle = "ll";
//		System.out.println(So.strStr(haystack, needle));//���Ϊ2
//	}
//}
//class Solution {
//    public int strStr(String haystack, String needle) {
//    	if(needle.length() == 0){
//    		return 0;
//    	}
//    	int i = 0;
//    	for(; i<haystack.length(); i++){
//        	if(needle.charAt(0) == haystack.charAt(i)){//�ҵ����ַ���ͬ��λ��
//        		int j = 0;
//        		//�Ӵ�λ�ñȽ�needle�����ַ��Ƿ�ʹ�λ�ú������ַ���ͬ�����ǣ�����i�������ǣ���������²���
//        		for(int temp = i; j<needle.length() && temp<haystack.length()
//        				&& needle.charAt(j) == haystack.charAt(temp) ; j++){
//        			temp++;
//        		}
//        		if(j == needle.length()){
//        			break;
//        		}
//        	}
//        }
//    	//�������û���ҵ�������-1
//    	if(i == haystack.length()){
//    		return -1;
//    	}
//    	return i;
//    }
//}

/*
2.��������
����һ���������� nums ���ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ������������͡�

ʾ��:
����: [-2,1,-3,4,-1,2,1,-5,4],
���: 6
����: ���������� [4,-1,2,1] �ĺ����Ϊ 6��
 */
//public class Test_0120 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//	    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//	    System.out.println(So.maxSubArray(nums));
//	}
//}
///*
// * ��̬�滮��⣬���Ӷ�ΪO(n).
// */
//class Solution {
//    public int maxSubArray(int[] nums) {
//        if(nums.length == 0){
//        	return 0;
//        }
//        int cur_sum = 0;//��ʼ����ǰ���к�Ϊ0
//        int max_sum = nums[0];//��ʼ����������к�Ϊ��һ��Ԫ��
//        for(int i = 0; i<nums.length; i++){
//        	cur_sum += nums[i];
//        	//������������к�
//        	if(cur_sum > max_sum){
//        		max_sum = cur_sum;
//        	}
//        	//��������к�Ϊ��������
//        	if(cur_sum < 0){
//        		cur_sum = 0;
//        	}
//        }
//        return max_sum;
//    }
//}
/*
3.���һ�����ʵĳ���
����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�
������������һ�����ʣ��뷵�� 0 ��
˵����һ��������ָ����ĸ��ɣ����������κοո���ַ�����

ʾ��:
����: "Hello World"
���: 5
 */
/*
 * �㷨˼�룺
 * �ж��ַ����ĳ��ȣ��������Ϊ0�����ַ��������򷵻�0��������ǣ�
 * �ַ����Ӻ���ǰ�����������ַ�����������Сд��ĸ�Ϳո����ֻҪ��������һ�����ǿո��λ�ã�
 * �����ȷ�������һ�����ʣ��Ӵ�λ�ÿ�ʼ������ֱ����������һ���ո�ֹͣ�����ؼ���ֵ��
 */
public class Test_0120 {
	public static void main(String[] args) {
		Solution So = new Solution();
		String s = "Hello World";
		System.out.println(So.lengthOfLastWord(s));
	}
}
class Solution {
    public int lengthOfLastWord(String s) {
    	if(s.length() == 0){
    		return 0;
    	}
    	int count = 0;
    	for(int i = s.length()-1; i>=0; i--){
    		if(s.charAt(i) != ' '){
    			count++;
    		}
    		else{
    			if(count != 0){
    				break;
    			}
    		}
    	}
    	return count;
    }
}
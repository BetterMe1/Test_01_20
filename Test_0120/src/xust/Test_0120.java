package xust;

/*
1.实现 strStr()
实现 strStr() 函数。
给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

示例 1:
输入: haystack = "hello", needle = "ll"
输出: 2

示例 2:
输入: haystack = "aaaaa", needle = "bba"
输出: -1
说明:
当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */

/*
 * 算法思想：
 * 先判断needle的长度，如果长度为0（空字符串），则返回0；
 * 如果不是空字符串，则遍历haystack中每位字符内容，找到与needle首位相同的位置，
 * 从此位置比较needle其他字符是否和此位置后其他字符相同，若是，返回i，若不是，则接着往下查找，直到找到为止
 * 查找完毕没有找到，返回-1，找到，返回找到的位置
 */

//public class Test_0120 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		String haystack = "hello";
//		String needle = "ll";
//		System.out.println(So.strStr(haystack, needle));//结果为2
//	}
//}
//class Solution {
//    public int strStr(String haystack, String needle) {
//    	if(needle.length() == 0){
//    		return 0;
//    	}
//    	int i = 0;
//    	for(; i<haystack.length(); i++){
//        	if(needle.charAt(0) == haystack.charAt(i)){//找到首字符相同的位置
//        		int j = 0;
//        		//从此位置比较needle其他字符是否和此位置后其他字符相同，若是，返回i，若不是，则接着往下查找
//        		for(int temp = i; j<needle.length() && temp<haystack.length()
//        				&& needle.charAt(j) == haystack.charAt(temp) ; j++){
//        			temp++;
//        		}
//        		if(j == needle.length()){
//        			break;
//        		}
//        	}
//        }
//    	//查找完毕没有找到，返回-1
//    	if(i == haystack.length()){
//    		return -1;
//    	}
//    	return i;
//    }
//}

/*
2.最大子序和
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:
输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
//public class Test_0120 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//	    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//	    System.out.println(So.maxSubArray(nums));
//	}
//}
///*
// * 动态规划求解，复杂度为O(n).
// */
//class Solution {
//    public int maxSubArray(int[] nums) {
//        if(nums.length == 0){
//        	return 0;
//        }
//        int cur_sum = 0;//初始化当前序列和为0
//        int max_sum = nums[0];//初始化最大子序列和为第一个元素
//        for(int i = 0; i<nums.length; i++){
//        	cur_sum += nums[i];
//        	//更新最大子序列和
//        	if(cur_sum > max_sum){
//        		max_sum = cur_sum;
//        	}
//        	//如果子序列和为负，舍弃
//        	if(cur_sum < 0){
//        		cur_sum = 0;
//        	}
//        }
//        return max_sum;
//    }
//}
/*
3.最后一个单词的长度
给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
如果不存在最后一个单词，请返回 0 。
说明：一个单词是指由字母组成，但不包含任何空格的字符串。

示例:
输入: "Hello World"
输出: 5
 */
/*
 * 算法思想：
 * 判断字符串的长度，如果长度为0（空字符串），则返回0；如果不是，
 * 字符串从后向前遍历，由于字符串仅包含大小写字母和空格，因此只要遍历到第一个不是空格的位置，
 * 便可以确定是最后一个单词，从此位置开始计数，直到遍历到下一个空格停止，返回计数值。
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
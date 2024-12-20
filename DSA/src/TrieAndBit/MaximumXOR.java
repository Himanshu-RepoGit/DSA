package TrieAndBit;

public class MaximumXOR {
    class Trie {
     Trie[] children;
     public Trie() {
         children = new Trie[2];
     }
 }
 public static void main(String[] args) {
	MaximumXOR obj=new MaximumXOR();
	System.out.println(obj.findMaximumXOR(new int[] {3,5,25}));
}
 public int findMaximumXOR(int[] nums) {
     if(nums == null || nums.length == 0) {
         return 0;
     }
     Trie root = new Trie();
     for(int num: nums) {
         Trie curNode = root;
         for(int i = 5; i >= 0; i --) {
             int curBit = (num >>> i) & 1;
             if(curNode.children[curBit] == null) {
                 curNode.children[curBit] = new Trie();
             }
             curNode = curNode.children[curBit];
         }
     }
     int max = Integer.MIN_VALUE;
     //Label1
     for(int num:nums) {
         //int num=nums[j];
         Trie curNode = root;
         int curSum = 0;
         for(int  i= 5; i >= 0; i --) {
             int curBit = (num >>> i) & 1;
             if(curNode.children[curBit ^ 1] != null) {
                 curSum += (1 << i);
                 curNode = curNode.children[curBit ^ 1];
             }else {
                 curNode = curNode.children[curBit];
             }
         }
         max = Math.max(curSum, max);
     }
     return max;
 }
}
class Solution {
    public int maxScore(int[] cardPoints, int k) {

     int resultSum = 0;
     int leftSum = 0;
     int rightSum = 0;
     int rightPointer = cardPoints.length;

     for(int i=0;i<k;i++){
      leftSum+=cardPoints[i];  
     }

     resultSum = leftSum;

     for(int i=1;i<=k;i++){
      leftSum -= cardPoints[k-i];
      rightSum += cardPoints[rightPointer-i];
      
      resultSum = Math.max(resultSum,leftSum+rightSum);
     }

     return resultSum;
    }
}
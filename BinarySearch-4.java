// Q:Median of the array:
// Time Complexity : O(2N);
// Space Complexity : 0(N)
// Logic:Merge the arrays and then find median from the result array

public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
       int[] merged =  merge(nums1 , nums2);
        int length = merged.length;
        if(length%2==0){
           return ((double) (merged[length/2]+merged[(length/2)-1])/2);
        }else{
            return ((double) (merged[length/2]));
        }
    }

    
    int[] merge(int[] nums1, int[] nums2){
        int[] temp = new int[nums1.length+nums2.length];
        int k=0;
        
        int start =0;
        int mid =0;
        while(start<nums1.length && mid<nums2.length){
            if(nums1[start]<nums2[mid]){
                temp[k++] = nums1[start++];
                
            }else{
                 temp[k++] = nums2[mid++];
                
            }
            
            
        }
        
        while(start<nums1.length){
                temp[k++] = nums1[start++];
                
        }
        
         while(mid<nums2.length){
                 temp[k++] = nums2[mid++];
               
        }
        
        return temp;
        
    }
}


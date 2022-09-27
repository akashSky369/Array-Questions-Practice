public int[] intersect(int[] nums1, int[] nums2) {
      List<Integer> list = new ArrayList<>();
   int l1 = nums1.length;
      int l2 = nums2.length;

      Arrays.sort(nums1);
      Arrays.sort(nums2);
      
      int i =0;
      int j =0;
      
      while(i<l1 && j<l2){
          if(nums1[i]==nums2[j]){
              list.add(nums1[i]);
              i++;
              j++;
          }
          else if(nums1[i]<nums2[j]){
              i++;
          }
          else if(nums2[j]<nums1[i]){
              j++;
          }
      }
int[] arr = new int[list.size()];
      for( i =0; i<list.size(); i++){
          arr[i] = list.get(i);
      }
      return arr;
    }

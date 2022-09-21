  //move the -ve elements to right maintaining order
        //with extra space

  int[] arr = {-5,3,4,-7,8,-6};
        int[] helper = new int[arr.length];

        int j =0;
        for (int k : arr) {
            if (k > 0) {
                helper[j] = k;
                j++;
            }
        }

        for (int k : arr){
            if(k<0){
                helper[j] = k;
                j++;
            }
        }
        System.out.println(Arrays.toString(helper));

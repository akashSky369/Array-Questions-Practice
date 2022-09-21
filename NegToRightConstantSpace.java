//put all negatives to right constant space
        int l = 0;
        int h = l+1;
        while (h< arr.length){
            if (arr[l]<0 && arr[h]>0){
                int temp = arr[l];
                arr[l]= arr[h];
                arr[h] = temp;
                l++;
            }
            h++;
        }
        System.out.println(Arrays.toString(arr));

        //city with min no of people
        Scanner sc = new Scanner(System.in);

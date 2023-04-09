    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
                ArrayList<Integer> v = new ArrayList<>();
      int max=0;
      for(int i=n-1;i>=0;i--){
          if(arr[i]>=max){
              max=arr[i];
              v.add(arr[i]);
          }
      }
      Collections.reverse(v);
      return v;
    }
}

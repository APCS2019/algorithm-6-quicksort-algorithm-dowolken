public class QuickSort{
   public static void quicksort(int[] a, int start, int end){
     if(end - start < 1){
      return;
      }
     
     int s=start+1;
     int e=end;
     int m=0;
     int n=0;
     int j=a[0];
     while(e>s){
       if(a[s]>=j&&a[e]<=j){
          m=a[s];
          n=a[e];
          a[s]=n;
          a[e]=m;
          e++;
          s++;}
       else if(a[s]>=j){
               e++;}
       else if(a[e]<=j){
              s++;}
       else
       {e++;
        s++;}
     }
     
     if(j<=a[s]){
       for(int i=0;i<s;i++)
          {a[i]=a[i+1];}
       a[start]=j;
       }
     else if(j>=a[e]){
       for(int g=a.length-a-1;g<a.length;g++)
          {a[g]=a[g+1];}
       a[a.length]=j;
       }
     
    quickSort(a,start,key-1);
    quickSort(a,key + 1,end);
  }
  
  public static void quickSort(int[] a) {
	  quickSort(a,0,a.length-1);
}

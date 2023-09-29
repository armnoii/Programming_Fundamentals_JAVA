public class binarySearch {
    public static int binarySearch(int[] lst, int v) {
        int i = 0;
        int j = lst.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (v < lst[mid]) {
                j = mid - 1;
            } else if (v > lst[mid]) {
                i = mid + 1;
            } else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arry = {1,2,4,5,7,8,11,13};

        int search = binarySearch(arry,5);
        System.out.println(search);

        search = binarySearch(arry,13);
        System.out.println(search);

        search = binarySearch(arry,10);
        System.out.println(search);
    }
}

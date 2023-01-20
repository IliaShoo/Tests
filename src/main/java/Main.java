public class Main {
    public static void main(String[] args) throws Exception{

        int[] arr = {14, 16, 19, 32, 32, 32, 56, 69, 72};
        int newBook = -3;

        int result = bynarySearch(arr, newBook);

        System.out.println(result);

    }


    public static int bynarySearch(int arr[], int newBook) throws Exception {
        if (newBook<1) {
            throw new MyException("Number must be bigger than 0");
        }
        int low = 0;
        int high = arr.length - 1;
        int amountOfBooks = 0;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] <= newBook) {
                low = middle + 1;
            } else if (arr[middle] > newBook) {
                high = middle - 1;
            }
        }
        amountOfBooks = arr.length - low;
        return amountOfBooks;

    }

}



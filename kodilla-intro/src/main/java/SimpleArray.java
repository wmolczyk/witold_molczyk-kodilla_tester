public class SimpleArray {
    public static void main(String[] args){
        String [] friendNames = new String [] {"Aga Dudek", "Joanna Kowalska",
                "Maria Nowak", "Janko Walski", "Waldo Popek"};
        String singleFriend = friendNames[3];
        System.out.println(singleFriend);
        int elementsNumber = friendNames.length;
        System.out.println("Tablica friendNames ma " + elementsNumber + " elementów");

        for (int i = 0; i < elementsNumber; i++) {
            System.out.println(friendNames[i]);
        };
        for (int i = elementsNumber - 1; i >= 0; i--){
            System.out.println(friendNames[i]);
        }
        int[] numbers = new int [10];
      for(int i = 0; i<10; i++ ) {
          numbers[i] = i + 1;
          System.out.println(numbers[i]);
          int n = 0;
          for (int z=0; z < numbers.length; z++){
              n = n + numbers[z];
              System.out.println(n);

      }

      }

    }
}

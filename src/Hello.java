public class Hello {

    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 & i > 0) {
                System.out.println(i);
            }


        }


        int[] tablica = new int[]{1, 3, 5, 7, 0};

        int index = 0;

        for(int i=0; i<(tablica.length/2); i++){
            int temp = tablica[i]; //dla i=0 bedzie to 1//i =1 a wiec 3
            tablica[i] = tablica[tablica.length-1-i]; //dla 5-1-0=4, wiec dla elementu 4 bedzie to 0//druga iteracja to 7, bo 5-1-1=3indeks wiec 7
            tablica[tablica.length-1-i]= temp;//1//3



        }

        for (int i = 0; i <tablica.length ; i++) {
            System.out.println(tablica[i]);

        }


    }


}

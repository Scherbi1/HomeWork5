package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a =  {1,2,3};
        float[] b = {1.57f, 7.654f, 9.986f };
        double[] c ={5,357.7, 999  };
        System.out.println( );
        System.out.println( "Задание 1 и 2");
       for (int i=0; i<a.length; i++) {

            if (i == 2) {
                System.out.print(a[i] );
            } else {
                System.out.print(a[i]+ ", ");
            }
        }
        System.out.println();
        for (int v=0; v < b.length; v++) {
            if (v == 2) {
                System.out.print(b[v] );
            } else {
                System.out.print(b[v]+ ", ");
            }
        }
        System.out.println();
        for (int r=0; r < c.length; r++) {
            if (r == 2) {
                System.out.print(a[r] );
            } else {
                System.out.print(c[r]+ ", ");
            }
        }
        System.out.println();
        System.out.println( "Задание 3");

        for (int i=a.length-1; i>=0; i--) {

            if (i == 0) {
                System.out.print(a[i] );
            } else {
                System.out.print(a[i]+ ", ");
            }
        }

        System.out.println();

        for (int v=b.length-1; v >=0; v--) {
            if (v == 0) {
                System.out.print(b[v] );
            } else {
                System.out.print(b[v]+ ", ");
            }
        }
        System.out.println();
        for (int r=c.length-1; r >=0; r--) {

            System.out.print(c[r] + " ");
        }

        System.out.println();
        System.out.println( "Задание 4");
        for (int i=0 ; i<a.length; i++) {
            if (a[i]%2==1) {
                a[i] = a[i] + 1;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();System.out.println();System.out.println();System.out.println();
        System.out.println( "Задание 5");
         int matrix[][]=new int [3] [3];
        for (int row=0; row<=2; row++) {
            for (int column=0; column<=2; column++) {
                if (row==column || row==2 && column==0 || row==0 && column==2)  {
                    matrix[row][column]=1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }


        System.out.println();System.out.println();System.out.println();System.out.println();
        System.out.println( "Задание 9");
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i=0; i<array.length; i++) {
            for (int j=1; j<array.length; j++){
                if (array[i]+array[j]==-2) {
                    System.out.print(array[i] + " и " + array[j]);
                    System.out.println();
                }
            }
        }
    }
}

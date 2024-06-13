public class AnnualRevenue {
    public static void main(String[] args){
        /*annual Revenue using the each for loop to calculate the average monthly revenue for the year
        * The given code declares an array that holds the monthly revenues for a company for a year.
        * You need to calculate the average monthly revenue for the year.
        * For that, calculate the sum of the revenue for all the months and divide it by the number
        * of items in the array.
        * you can find the number of items in the array using the <b>length </b>property.
        * As the array is of type <b>double</b>, output the result as a double..*/

        double[] revenue={88750, 125430, 99700, 14500, 158000, 65000, 99000,189000, 210000, 42000,  165800, 258900};
        double sum = 0;
        for (double x: revenue){
            sum += x;
        }
        double average = sum / revenue.length;
        System.out.println(average);


        //learning Multidimensional arrays(2D Arrays)
        /*example= int [][] sample = { {1,2,3}, {4,5,6} };
        * Note that the array is created using two square brackets, specifying the two-dimensionality.*/

        int [][] sample = {
                {1,2,3},
                {4,5,6}
        };
        int x = sample[1][0];
        System.out.println(x);


        /*
        learning more examples. To loop over a 2-dimensional array,
        we need nested <b>for </b>loops:
        The first loop iterates over the rows, and the second one over their items.
          */
        int[][] guests = {
                {2,4,6},
                {8,10,12}
        };
        for (int r=0; r<guests.length; r++){
            for (int i=0; i<guests[r].length; i++){
                System.out.println(guests[r][i]);
            }
        }

        int arr[] = new int[3];
        for (int i = 0; i < 3; i++){
            arr[i]=i;
        }
        int res = arr[0] + arr[2];
        System.out.println(res);
    }

}

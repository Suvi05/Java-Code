package JavaTraining;

//arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
//dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
public class Time {
    public static void main(String[] args) {
        double[] arr = {9, 9.66, 9.83, 11, 11.33, 15, 18};
        double[] dep = {9.16, 12, 11.33, 11.50, 12, 19, 20};

        System.out.println(comparetime(arr, dep));

    }

    public static int comparetime(double arr[], double dep[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) { //arrival
            double result = dep[i] - arr[i + 1];
            if (result > 0) {
                count++;

            }
        }
        return count;
    }
}

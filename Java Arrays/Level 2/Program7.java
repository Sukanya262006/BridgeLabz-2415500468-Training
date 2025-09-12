import java.util.Scanner;
class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        for (int i = 0; i < n; i++) {
            personData[i][0] = sc.nextDouble();
            personData[i][1] = sc.nextDouble();
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25) weightStatus[i] = "Normal";
            else if (personData[i][2] < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("H=" + personData[i][1] + " W=" + personData[i][0] + " BMI=" + personData[i][2] + " " + weightStatus[i]);
        }
    }
}
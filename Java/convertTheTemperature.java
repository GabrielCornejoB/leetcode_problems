class Solution {
    public static double[] convertTemperature(double celsius) {
        return new double[] {celsius + 273.15, celsius* 1.8 + 32};
    }
    public static void main(String[] args) {
        System.out.println(convertTemperature(36.50)[1]);
    }
}
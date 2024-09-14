public class WaterOnTheMoon {
    public static void main (String[]args){
        int radiusInMeters = 1731 * 1000;
        //*Part 1 */
        double surfaceVolumeOfSection = 4 * Math.pow(radiusInMeters,2) * Math.PI * 0.001;
        System.out.println(surfaceVolumeOfSection);
        //*Part 2 */
        int density = 3000;
        double densityOfSection = surfaceVolumeOfSection * density / 1000;
        System.out.println(densityOfSection);
        //*Part 3 */
        double percentageOfMoon = 25.0 / 100;
        double waterInSection = percentageOfMoon * densityOfSection;
        System.out.println(waterInSection);
    }
}

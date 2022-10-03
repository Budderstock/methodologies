
public class Methodologies {

    public static double howFar(int xOne, int yOne, int xTwo, int yTwo )
    {
        return (Math.sqrt((yTwo - yOne)*(yTwo - yOne)+(xTwo - xOne)*(xTwo-xOne)));
    }

    public static double howFast( int distanceInMiles, int hours, int minutes )
    {
        double convertedMin = minutes/60.0;
        double totalHours = hours + convertedMin;
        return((Math.round(distanceInMiles/totalHours)));
    }



    public static double getRootAdd( int a, int b, int c )
    {
        int radicand = b*b - 4*a*c;
        return(-b + Math.sqrt(radicand)) /(2 * a);
    }

    public static double getRootSub( int a, int b, int c )
    {

        int radicand = b*b - 4*a*c;
        return(-b - Math.sqrt(radicand)) /(2 * a);
    }

}//end of class
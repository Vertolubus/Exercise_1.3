import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Point3D pointA = new Point3D();
        Point3D pointB = new Point3D();

        System.out.println("Enter the coordinates of point A: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        pointA.setX(x);
        pointA.setY(y);
        pointA.setZ(z);

        System.out.println("Enter the coordinates of point B: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();

        pointB.setX(x);
        pointB.setY(y);
        pointB.setZ(z);

        System.out.println("Point A: " + pointA.toString());
        System.out.println("Point B: " + pointB.toString());

        if(pointA.getX() == pointB.getX() && pointA.getY() == pointB.getY() && pointA.getZ() == pointB.getZ())
        {
            System.out.println("Yhe points have equal coordinates");
        }
        else
        {
            System.out.println("The points have different coordinates");
        }

        System.out.println(pointA.equals(pointB));


//        if(pointA == pointB)
//        {
//            System.out.println("Yhe points have equal coordinates");
//        }
//        else
//        {
//            System.out.println("The points have different coordinates");
//        }

        Vector3D vectorA = new Vector3D(1, 5, 2);
        Vector3D vectorB = new Vector3D(3, 2, 1);

        System.out.println("Vector A: " + vectorA.toString());
        System.out.println("Vector B: " + vectorB.toString());

        System.out.println("Lenght o vector A: " + vectorA.vectorLength());
        System.out.println("Lenght o vector B: " + vectorB.vectorLength());

        if(vectorA.equalityOfVectors(vectorB))
        {
            System.out.println("Vectors are equal");
        }
        else
        {
            System.out.println("Vectors are not equal");
        }



        Vector3DProcessor processor = new Vector3DProcessor();

        System.out.println("Vector sum: " + processor.sum(vectorA, vectorB));
        System.out.println("Vector subtraction: " + processor.subtraction(vectorA, vectorB));
        System.out.println("Vector scalar product: " + processor.scalarProduct(vectorA, vectorB));
        System.out.println("Vector vector product: " + processor.vectorProduct(vectorA, vectorB).toString());
        if(processor.collinearityOfvectors(vectorA, vectorB))
        {
            System.out.println("Vectors are collinear");
        }
        else
        {
            System.out.println("Vectors are not collinear");
        }

        System.out.println("Print array size: ");
        int size = in.nextInt();
        Vector3DArray array = new Vector3DArray(size);
        System.out.println("Print coordinate of vector: ");
        for (int i = 0; i < size; i++)
        {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            Vector3D vectorC = new Vector3D(a, b, c);
            array.vectorReplacement(vectorC, i);
            System.out.println("Vector " + (i + 1) + ": " + vectorC.toString());
        }

        System.out.println("Array length: " + array.arrayLength(array.getArrVector()));
        System.out.println("Max length of vectors: " + array.longestVectorLength());
        System.out.println("The vector to be found has an index: " + array.vectorSearch(vectorA));
        System.out.println("Sum of all vectors: " + array.sumOfAllVectors());

        double[] arr = new double[]{1, 2, 3};
        System.out.println("Linear combination: " + array.linearCombination(arr));

        System.out.println("Point shift: " + Arrays.toString(array.pointShift(pointA)));
    }
}
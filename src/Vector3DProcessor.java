public class Vector3DProcessor
{
    public Vector3D sum (Vector3D a, Vector3D b)
    {
        Vector3D sum = new Vector3D();
        sum.setX(a.getX() + b.getX());
        sum.setY(a.getY() + b.getY());
        sum.setZ(a.getZ() + b.getZ());
        return sum;
    }

    public Vector3D subtraction (Vector3D a, Vector3D b)
    {
        Vector3D subtraction = new Vector3D();
        subtraction.setX(b.getX() - a.getX());
        subtraction.setY(b.getY() - a.getY());
        subtraction.setZ(b.getZ() - a.getZ());
        return subtraction;
    }

    public double scalarProduct(Vector3D a, Vector3D b)
    {
        return (a.getX() * b.getX()) + (a.getY() * b.getY()) + (a.getZ() * b.getZ());
    }

    public Vector3D vectorProduct(Vector3D a, Vector3D b)
    {
        Vector3D vectorProduct = new Vector3D();
        vectorProduct.setX((a.getY() * b.getZ()) - (a.getZ() * b.getY()));
        vectorProduct.setY((a.getZ() * b.getX()) - (a.getX() * b.getZ()));
        vectorProduct.setZ((a.getX() * b.getY()) - (a.getY() * b.getX()));
        return vectorProduct;
    }

    public boolean collinearityOfvectors(Vector3D a, Vector3D b)
    {
        Vector3D vector = new Vector3D(0, 0, 0);
        if(vector.equalityOfVectors(vectorProduct(a, b)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Vector3D multiplyingAVectorByANumber(Vector3D a, double num)
    {
        Vector3D result = new Vector3D();

        result.setX(num * a.getX());
        result.setY(num * a.getY());
        result.setZ(num * a.getZ());

        return result;
    }
}

import java.util.Objects;

public class Vector3D
{
    double x, y, z;

    Vector3D(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Vector3D()
    {
        x = 0;
        y = 0;
        z = 0;
    }

    Vector3D(Point3D a, Point3D b)
    {
        x = b.getX() - a.getX();
        y = b.getY() - a.getY();
        z = b.getZ() - a.getZ();
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getZ()
    {
        return z;
    }

    public void setZ(double z)
    {
        this.z = z;
    }

    public double vectorLength()
    {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public boolean equalityOfVectors(Vector3D vector)
    {
        if(x == vector.getX() && y == vector.getY() && z == vector.getZ())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector3D vector3D)) return false;
        return Double.compare(getX(), vector3D.getX()) == 0 && Double.compare(getY(), vector3D.getY()) == 0 && Double.compare(getZ(), vector3D.getZ()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getZ());
    }
}


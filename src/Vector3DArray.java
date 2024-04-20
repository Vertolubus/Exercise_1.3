public class Vector3DArray {
    private Vector3D[] arrVector;

    Vector3DArray(int size)
    {
        arrVector = new Vector3D[size];

        for (int i = 0; i < size; i++) {
            arrVector[i] = new Vector3D();
        }
    }

    public int arrayLength(Vector3D[] arrVector) {
        return arrVector.length;
    }

    void vectorReplacement(Vector3D a, int element)
    {
        if(element < arrVector.length && element >= 0)
        {
            arrVector[element] = a;
        }
    }

    public Vector3D[] getArrVector() {
        return arrVector;
    }

    public double longestVectorLength()
    {
        double maxLength = arrVector[0].vectorLength();

        for(int i = 0; i < arrVector.length; i++)
        {
            if(arrVector[i].vectorLength() > maxLength)
            {
                maxLength = arrVector[i].vectorLength();
            }
        }
        return maxLength;
      }

      public double vectorSearch(Vector3D a)
      {
          int index = -1;
          for(int i = 0; i < arrVector.length; i++)
          {
              if (index == -1)
              {
                  if(a.equalityOfVectors(arrVector[i]))
                  {
                      index = i;
                  }
              }
          }
          return index;
      }

      public Vector3D sumOfAllVectors()
      {
          Vector3DProcessor processor = new Vector3DProcessor();
          Vector3D sum = new Vector3D();

          int i = 0;
          for(i = 0; i < arrVector.length; i++)
          {
              sum = processor.sum(sum, arrVector[i]);
          }
          return sum;
      }

      public Vector3D linearCombination (double [] arr)
      {
          Vector3D linearComb = new Vector3D();
          Vector3DProcessor processor = new Vector3DProcessor();
          if(arrVector.length != arr.length)
          {
              return linearComb;
          }
          else
          {
              for(int i = 0; i < arrVector.length; i++)
              {
                  linearComb = processor.sum(linearComb, processor.multiplyingAVectorByANumber(arrVector[i], arr[i]));
              }
          }
          return linearComb;
      }

      public Point3D[] pointShift(Point3D a)
      {
          Point3D[] point = new Point3D[arrVector.length];

          point[0] = new Point3D(a.getX() + arrVector[0].getX(), a.getY() + arrVector[0].getY(),a.getZ() + arrVector[0].getZ());
          for (int i = 1; i < arrVector.length; i++)
          {
              point[i] = new Point3D(point[i - 1].getX() + arrVector[i].getX(), point[i - 1].getY() + arrVector[i].getY(),point[i - 1].getZ() + arrVector[i].getZ());
          }
          return point;
      }
}

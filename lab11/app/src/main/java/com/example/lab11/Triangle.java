package com.example.lab11;

public class Triangle {

    // Class Attributes
    private int side1;
    private int side2;
    private int side3;

    // Methods

    // Boolean function that returns True if the Trianlge is Equilateral (all sides are equal)
    public Boolean Is_Equilateral(int s1, int s2, int s3)
    {
        side1=s1;
        side2=s2;
        side3=s3;

        // Check that nothing is negative
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
        {
            System.out.print("At least one length is less than 0!");
            return false;
        }

        // Check for side length

        if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1))
        {
            System.out.print("The lengths of the triangles do not form a valid triangle!");
            return false;
        }

        if (( side1 != side2) || (side2 != side3) || (side1 != side3))
            return true;
        else
            return false;
    }

    // Boolean function that returns True if the Trianlge is Isosceles (Two sides are equal)

    public Boolean Is_Isosceles(int s1, int s2, int s3)
    {
        side1=s1;
        side2=s2;
        side3=s3;

        // Check that nothing is negative
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.print("At least one length is less than 0!");
            return false;
        }

        // Check for side length
        if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            System.out.print("The lengths of the triangles do not form a valid triangle!");
            return false;
        }

        if (( side1 == side2) || (side2 == side3) || (side1 == side3))
            return true;
        else
            return false;
    }

    // Boolean function that returns True if the Trianlge is Scalene (Sides are not equal)
    public Boolean Is_Scalene(int s1, int s2, int s3) {
        side1=s1;
        side2=s2;
        side3=s3;

        // Check that nothing is negative
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.print("At least one length is less than 0!");
            return false;
        }

        // Check for side length
        if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            System.out.print("The lengths of the triangles do not form a valid triangle!");
            return false;
        }

        if (( side1 != side2) || (side2 == side3) || (side1 != side3))
            return true;
        else
            return false;
    }
}

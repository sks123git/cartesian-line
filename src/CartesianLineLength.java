import java.util.Scanner;
// Program to find length between two cartesian points.
public class CartesianLineLength {

    public static int line1,line2;
    public int lengthCalculate(int x1,int y1, int x2, int y2){ // Calculate length and return
        int length = (int)Math.pow((x2-x1),2) + (int)Math.pow((y2-y1),2);
        return (int)Math.sqrt(length);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CartesianLineLength length = new CartesianLineLength();
        int x1,y1,x2,y2;
        int x3,y3,x4,y4;
        System.out.println("Kindly enter first coordinates x1 and y1: ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.println("Kindly enter second coordinates x2 and y2: ");
        x2 = input.nextInt();
        y2 = input.nextInt();

        System.out.println("Enter coordinates of second line");
        System.out.println("Kindly enter first coordinates x3 and y3: ");
        x3 = input.nextInt();
        y3 = input.nextInt();
        System.out.println("Kindly enter second coordinates x4 and y4: ");
        x4 = input.nextInt();
        y4 = input.nextInt();
        line1 =  length.lengthCalculate(x1,y1,x2,y2);
        line2 =  length.lengthCalculate(x3,y3,x4,y4);
        // Check equality of lines
        if(line1==line2){
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }

    }
}
package educative.recursion;

public class SquaredNumber {

    private long squareNumber(int n) {
        if (n == 0)
            return 0;
        return squareNumber(n - 1) + (2 * n) - 1;
    }

    public static void main(String[] args) {
        SquaredNumber squaredNumber = new SquaredNumber();
        System.out.println(squaredNumber.squareNumber(7));

    }
}

/*

Let’s take a look at the mathematical operation required to perform n^2.
We need to decrement the value of n in such a way that we can use it to call the same method
but not change the mathematical formula. We get this:

(n-1)^2(n−1)

which opens up to be (n^2 - 2n + 1)(n−2n+1).

From the formula above, we get that (n-1)^2 = (n^2 - 2n + 1)(n−1) =(n−2n+1).
The laws of math say that we can rearrange this formula in a way such that
we isolate the n^2n by bringing everything to one side. We get this as a result:

n^2 = (n-1)^2 + 2n - 1n
=(n−1)+2n−1

That is how we get our formula to iterate recursively to get the square of a number.

 */
package com.company;

class SecantMethod {

    // returns function(x)
    static float function(float x) {

        // as x^3+x-1
        float f = (float) Math.pow(x, 3)
                + x - 1;

        return f;
    }

    static void secant(float x1, float x2, float E) {

        float n = 0, xm, x0, c;
        if (function(x1) * function(x2) < 0) {
            do {

                // intermediate

                x0 = (x1 * function(x2) - x2 * function(x1))
                        / (function(x2) - function(x1));

                // check if x0 is root of
                c = function(x1) * function(x0);

                // update the value of interval
                x1 = x2;
                x2 = x0;

                // update number of iteration
                n++;

                // if x0 is the root of equation
                // then break the loop
                if (c == 0)
                    break;
                xm = (x1 * function(x2) - x2 * function(x1))
                        / (function(x2) - function(x1));

                // repeat the loop until the convergence
            } while (Math.abs(xm - x0) >= E);

            System.out.println("Root of the" +
                    " given equation=" + x0);

            System.out.println("No. of "
                    + "iterations = " + n);
        } else
            System.out.print("Can not find a"
                    + " root in the given inteval");
    }
}

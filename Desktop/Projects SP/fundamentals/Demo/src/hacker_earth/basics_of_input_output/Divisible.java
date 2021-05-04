package hacker_earth.basics_of_input_output;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Divisible implements Runnable {
    public static void main(String[] args) {
        new Thread(null, new Divisible(), "Check2", 1 << 28).start();// to increse stack size in java
    }

    static long mod = (long) (1e9 + 9);

    public void run() {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);

        int n = in.nextInt();
        int odd = 0;
        int evn = 0;

        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            int first = -1;
            int last = -1;
            while (val > 0) {
                int rem = val % 10;
                if (first == -1) first = rem;
                last = rem;
                val /= 10;
            }
            int fin = last;

            if (i >= n / 2) {
                fin = first;
            }
            if (i % 2 == 0) odd += fin;
            else evn += fin;
        }

        if ((odd - evn) % 11 == 0) {
            w.println("OUI");
        } else {
            w.println("NON");
        }

        w.close();
    }

    void debug(Object... args) {
        System.out.println(Arrays.deepToString(args));
    }

    static class pair implements Comparable<pair> {

        int a;
        int b;

        pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int compareTo(pair o) {
            if (this.b != o.b) return this.b - o.b;
            return this.a - o.a;
        }

    }

    long modinv(long a, long b) {
        long p = power(b, mod - 2, mod);

        p = a % mod * p % mod;
        p %= mod;

        return p;

    }

    long power(long x, long y, long mod) {
        if (y == 0) return 1 % mod;
        if (y == 1) return x % mod;
        long res = 1;
        x = x % mod;
        while (y > 0) {
            if ((y % 2) != 0) {
                res = (res * x) % mod;
            }
            y = y / 2;
            x = (x * x) % mod;
        }
        return res;
    }

    long gcd(long a, long b) {

        if (b == 0) return a;
        return gcd(b, a % b);
    }

    void sev(int a[], int n) {

        for (int i = 2; i <= n; i++) a[i] = i;
        for (int i = 2; i <= n; i++) {

            if (a[i] != 0) {
                for (int j = 2 * i; j <= n; ) {

                    a[j] = 0;
                    j = j + i;
                }
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String stock = "";
            try {
                stock = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return stock;
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}
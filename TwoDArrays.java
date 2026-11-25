import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Task 1");
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Task 2");
        int[][] b = {{5, 10, 15}, {20, 25, 30}};
        System.out.println(b[1][2]);
        b[0][1] = 99;
        System.out.println(b[0][1]);


        System.out.println();
        System.out.println("Task 3");
        int[][] c = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int d = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                d += c[i][j];
            }
        }
        System.out.println(d);


        System.out.println();
        System.out.println("Task 4");
        int[][] e = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int odd = 0;
        int even = 0;
        int zero = 0;
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                if (e[i][j] == 0)
                    zero++;
                else if (e[i][j] % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }
        System.out.println("odd: " + odd + "\neven: " + even + "\nzero: " + zero);


        System.out.println();
        System.out.println("Task 5");
        int[][] f = {
                {1, 2, 3, 4},
                {4, 5, 6, 6},
                {7, 8, 9, 9}
        };
        int max = f[0][0];
        int min = f[0][0];
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                if (f[i][j] > max)
                    max = f[i][j];
                if (f[i][j] < min)
                    min = f[i][j];
            }
        }
        System.out.println("max: " + max + "\nmin: " + min);


        System.out.println();
        System.out.println("Task 6");
        int[][] g = new int[2][3];
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                System.out.print("Enter number with index " + i + "; " + j + " for 2 by 3 matrix: ");
                g[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < g.length; i++) {
            System.out.println();
            for (int j = 0; j < g[i].length; j++) {
                System.out.print(g[i][j] + " ");
            }
        }


        System.out.println();
        System.out.println();
        System.out.println("Task 7");
        int[][] h ={{2, 4, 6}, {3, 6, 9}, {5, 10, 15}};
        for(int i = 0; i < h.length; i++){
            int sum = 0;
            for(int j = 0; j < h[i].length; j++){
                sum += h[j][i];
            }
            System.out.println(sum);
        }


        System.out.println();
        System.out.println("Task 8");
        int[][] k = {{2, 4, 6}, {3, 6, 9}, {5, 10, 15}};
        int l = 0;
        System.out.print("Enter number: ");
        int n = s.nextInt();
        for(int i = 0; i < k.length; i++){
            for(int j = 0; j < k[i].length; j++){
                if (k[i][j] > n)
                    l++;
            }
        }
        System.out.println("The number of values in matrix greater than Your number: " + l);


        System.out.println();
        System.out.println("Task 9");
        int[][] m = {{2, 4, 6}, {3, 6, 9}, {5, 10, 15}};
        System.out.print("Enter number: ");
        int num = s.nextInt();
        boolean o = false;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if (num == m[i][j]){
                    System.out.println("First matching element: (" + (i+=1) + "; " + (j+=1) + ")");
                    o = true;
                    break;
                }
            }
        }
        if (!o)
            System.out.println("Value not found");


        System.out.println();
        System.out.println("Task 10");
        int[][] p = {{2, 4, 6}, {3, 6, 9}, {5, 10, 15}};
        int su = 0;
        for(int i = 0; i < p.length; i++){
            System.out.print(p[i][i] + "; ");
            su += p[i][i];
        }
        System.out.println("\nSum: " + su);

        System.out.println();
        System.out.println("Task 11");
        int[][] q = {{2, -4, 6}, {-3, 6, -9}, {5, -10, 15}};
        for(int i = 0; i < q.length; i++){
            System.out.println();
            for(int j = 0; j < q[i].length; j++){
                System.out.print(q[i][j] + "; ");
                }
            }
        System.out.println();


        for(int i = 0; i < q.length; i++){
            System.out.println();
            for(int j = 0; j < q[i].length; j++){
                if (q[i][j] < 0)
                    q[i][j] = 0;
                System.out.print(q[i][j] + "; ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Task 12");
        String[] r = {"", "", ""};
        int[][] z = new int[3][3];
        int maxi = 0;
        int ovever = 0;
        for(int i = 0; i < r.length; i++){
            System.out.print("Enter student name: ");
            String name = s.next();
            r[i] = name;
            System.out.println();
            for(int j = 0; j < z[i].length; j++){
                System.out.print("Enter Score: ");
                int score = s.nextInt();
                while (score < 0 || score > 100){
                    System.out.print("Invalid score! Score should be between 0 and 100: ");
                    score = s.nextInt();
                }
                z[i][j] = score;
            }
        }
        System.out.println();
        for(int i = 0; i < r.length; i++){
            int eachaver = 0;
            System.out.println("Student: " + r[i]);
            System.out.print("Score: ");
            for(int j = 0; j < z[i].length; j++){
                System.out.print(z[i][j] + " ");
                eachaver += z[i][j];
                ovever += z[i][j];
                if (z[i][j] > maxi)
                    maxi = z[i][j];
            }
            System.out.println();
            System.out.println("Average: " + (eachaver/3));
            System.out.println();
        }
        System.out.println("Students maximum: " + maxi);
        System.out.println("Overall average: " + (ovever/9));
    }



}
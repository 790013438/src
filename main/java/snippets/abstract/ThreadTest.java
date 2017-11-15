public class App {

    public static void merge (int[] a, int[] b, int[] c) {
        int aIndex = 0;
        int bIndex = 0;
        int cIndex = 0;
        while (aIndex < a.length && bIndex < b.length) {
            if (a[aIndex] <= b[bIndex]) {
                c[cIndex++] = a[aIndex++];
            } else {
                c[cIndex++] = b[bIndex++];
            }
        }
        while (aIndex < a.length) {
            c[cIndex++] = a[aIndex++];
        }
        while (bIndex < b.length) {
            c[cIndex++] = b[bIndex++];
        }
    }

    public static void main (String[] args) {
        int[] a = {12, 38, 44, 57, 90};
        int[] b = {9, 25, 30, 77, 88, 99, 100};
        int[] c = new int[a.length + b.length];
        merge(a, b, c);
        for (int x: c) {
            System.out.print(c[x]);
        }
    }

}

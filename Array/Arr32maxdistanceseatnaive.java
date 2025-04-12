public class Arr32maxdistanceseatnaive {
    static int maxDisttoclosest(int seats[]) {
        int n = seats.length;
        int distleft[] = new int[n];
        int distright[] = new int[n];
        int nearOcc = -n;

        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                nearOcc = i;
            } else {
                distleft[i] = i - nearOcc;
            }
        }

        nearOcc = 2 * n;
        for (int i = n - 1; i >= 0; i--) {
            if (seats[i] == 1) {
                nearOcc = i;
            } else {
                distright[i] = nearOcc - i;
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 0) {
                res = Math.max(res, Math.min(distleft[i], distright[i]));
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int seats[] = {1, 0, 0, 0, 1, 0, 1};
        System.out.println(maxDisttoclosest(seats)); 
    }
}

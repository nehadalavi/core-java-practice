class VarargsExample {
    static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum());           // 0
        System.out.println(sum(10));         // 10
        System.out.println(sum(10, 20, 30)); // 60
    }
}

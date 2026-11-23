class ProductOfNumbers {
    private List<Integer> al;

    public ProductOfNumbers() {
        al = new ArrayList<>();
        al.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            al = new ArrayList<>();
            al.add(1);
        } else {
            al.add(al.get(al.size() - 1) * num);
        }
    }

    public int getProduct(int k) {
        int n = al.size() - 1;
        if (k > n) return 0;
        return al.get(n) / al.get(n - k);
    }
}
class OverLoading {
    int add(int a, int b){
        return a+b;
    }
    int add (int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        OverLoading ol = new OverLoading();
        System.out.println("Sum of Two Numbers :"+ol.add(9, 5));
        System.out.println("Sum of Two Numbers :"+ol.add(9, 5, 6));
    }
}

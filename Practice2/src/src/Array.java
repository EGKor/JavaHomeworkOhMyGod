public class Array {
    public static void nan() {
        String[] array = new String[4];
        array[0]="xyz";
        array[1]= "abc";
        array[2]= "def";
        array[3]= "ghj";
        String n1,n2;
        for(int i=0;i<2;i++){
            n1 = array[i];
            n2=array[3-i];
            array[i]=n2;
            array[3-i]=n1;
        }
        for(int i=0;i<=3;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        nan();
    }
}

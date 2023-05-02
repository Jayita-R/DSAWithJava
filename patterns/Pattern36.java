package com.patterns;

/*


12345
1234
123
12
1

 */

public class Pattern36 {
    public static void main(String[] args) {
        pattern36(5);
    }
    static void pattern36(int n){
        for(int row=n;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

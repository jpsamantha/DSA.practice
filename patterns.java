public class patterns {
        public static void pattern1() {
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    
        public static void pattern2() {
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
        public static void pattern3() {
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    
        public static void pattern4() {
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i-1;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
        public static void pattern5(){
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    
        public static void pattern6() {
            int n=5;
            for(int i=1;i<=n;i++){
                int a=65;
                for(int j=1;j<=i;j++){
                    System.out.print((char)(a));
                    a++;
                }
                System.out.println();
                }
            }
    
        
        public static void pattern7() {
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    
        public static void pattern8() {
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    char ch=(char)('A'+1-1);
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
        public static void pattern9() {
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-1;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void pattern10() {
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<(2*(n-i));j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<2*(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void pattern11() {
            int n=5;
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
        public static void pattern12() {
            int n=5;
            for( int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void pattern13() {
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<i*2-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void pattern14() {
            int n=5;
            int k=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(k++ +" ");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args){
            pattern1();
            pattern2();
            pattern3();
            pattern4();
            pattern5();
            pattern6();
            pattern7();
            pattern8();
            pattern9();
            pattern10();
            pattern11();
            pattern12();
            pattern13();
            pattern14();
    }
    }
    



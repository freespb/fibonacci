public class Fibonacci {

    public Fibonacci(){
    }

    public int fibonacci(int n) {

        {
            if (n>1){
                return fibonacci(n-1) + fibonacci(n-2);
            }
            else if (n==1) {
                return 1;
            }
            else if (n==0){
                return 0;
            }
            else{ //error
               // System.out.println("Debes ingresar un tamaño mayor o igual a 1");
                return -1;
            }
        }

    }
    public int compute(int n) {
        //System.out.print("El numero "+n+" en la succesion de fibonacci corresponde a :"+fibonacci(n));
        return fibonacci(n-1);
    }

}

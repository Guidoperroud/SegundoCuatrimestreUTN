public class Calculadora {
    public int suma(int num1,int num2){
        return num1+num2;
    }

    public int resta (int num1, int num2){
        return num1-num2;
    }

    public int multiplicar(int num1,int num2){
        return num1*num2;
    }

    public int dividir(int num1, int num2){
        if (num2!=0) {
            return num1/num2;
        }
        else{
            System.out.println("Error: no se puede dividir por cero.");
            return 0;
        }
    }

}

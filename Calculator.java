import java.util.*;
public class Calculator{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
		System.out.println("ingrese valores a operar");
		int opcion,termino1,termino2;
		termino1=sc.nextInt();
		termino2=sc.nextInt();
		System.out.println("MENU: 1.SUMAR 2.SUSTRACCION 3.MULTIPLICAR 4.DIVIDIR 5.MODULO");
		opcion=sc.nextInt();
		switch(opcion) {
			case 1:System.out.println(add(termino1,termino2));break;
			case 2:System.out.println(sub(termino1,termino2));break;
			case 3:System.out.println(mul(termino1,termino2));break;
			case 4:System.out.println(div(termino1,termino2));break;
			case 5:System.out.println(mod(termino1,termino2));break;
		}

    }
    public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		if(b==0)
			return 0;
		else
			return a/b;
	}
	public static int mod(int a,int b) {
		if(b==0)
			return 0;
		else
			return a%b;
	}
}
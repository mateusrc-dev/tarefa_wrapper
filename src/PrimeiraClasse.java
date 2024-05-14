import java.util.Scanner;

public class PrimeiraClasse {
	public static void main(String[] args) {
        Scanner scannerValueUser = new Scanner(System.in);
        
        System.out.println("Por favor, digite um valor:");
        
        int valueUser = scannerValueUser.nextInt();
        
        Integer valueUserInteger = valueUser;
        
        System.out.println("Você digitou um dado inteiro que foi convertido para o tipo Integer: " + valueUserInteger);
        
        scannerValueUser.close();
	}
}

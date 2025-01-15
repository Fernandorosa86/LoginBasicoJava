import java.util.Scanner;

public class LoginBasico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "Admin";
        String password = "password";

        System.out.println("Digite o nome de usuario: ");
        String inputUsername = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login ou senha incorretos");
        }
        scanner.close();
    }
}
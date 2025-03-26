public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumeroConta(1234);
        conta1.setSaldo(500.00);

        System.out.println("Número da conta: " + conta1.getNumeroConta());
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());
    }
}

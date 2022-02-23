
public class TesteContas {

	public static void main(String[] args) {
	
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(1000.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(2000.0);
		
		cc.transfere(500.0, cp);
		
		cc.saca(10.0);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}

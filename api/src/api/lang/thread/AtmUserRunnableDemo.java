package api.lang.thread;

public class AtmUserRunnableDemo {
	public static void main(String[] args) {
		Atm atm = new Atm();
		Runnable hong = new AtmUser(atm, "홍길동");
		Runnable kim = new AtmUser(atm, "김길동");
		Runnable moon = new AtmUser(atm, "문길동");
		
		Thread thr1 = new Thread(hong);
		thr1.start();
		Thread thr2 = new Thread(kim);
		thr2.start();
		Thread thr3 = new Thread(moon);
		thr3.start();
	}
}
class Atm{
	public synchronized void inchul(String name){
		System.out.println(name + " 님이 인출요청함");
		for(int i=0; i<=100000000; i++){
			if(i == 10000){
				System.out.println(name + " 님 인출중...");
			}
		}
		System.out.println(name + " 님이 인출해 나감");
	}
}

class AtmUser implements Runnable{
	Atm atm;
	String name;

	public AtmUser(Atm atm, String name) {  // 기본생성자 생성 후 this(null,""); 로 호출한후 매개변수를 받는 생성자를 자동 생성한뒤 기본생성자는 삭제 함.
		super(); // 부모의 기능을 가져다 쓰기 위해 부모의 생성자를 자식의 생성자 내부에 호출함.
		this.atm = atm;
		this.name = name;
	}
	
	@Override
	public void run() {
		atm.inchul(name);
		
	}
	
}
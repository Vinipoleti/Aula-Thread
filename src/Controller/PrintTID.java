package Controller;

public class PrintTID extends Thread {

	private int IdThread;
	
	public PrintTID (int IdThread) {
		this.IdThread = IdThread;
	}


	public void run() {
		
		long id = getId();
		System.out.println("TID #" + id + "- para Id " + IdThread);
	}


	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
	
	
	
}

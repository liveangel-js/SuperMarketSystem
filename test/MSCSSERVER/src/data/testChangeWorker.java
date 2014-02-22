package data;

public class testChangeWorker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //AddNewWorker();
      //DelWorker();
//		ChangePosition();
		//ChangePassword();
		SetShopNumber();
	}
	public static void SetShopNumber(){
		Shop shop=(Shop)DataReader.read(Data.SHOPNUMBER);
		System.out.println("SHOPNUMBER:"+shop.getShopNumber());
		
	}
	public static void AddNewWorker(){
		WorkerData workerData=(WorkerData)DataReader.read(Data.WORKERS);
		WorkerRecord workerRecord1=workerData.getWorkerByID("1");
	    System.out.println(workerRecord1.getInfo());
	    WorkerRecord workerRecord2=workerData.getWorkerByID("2");
	    System.out.println(workerRecord2.getInfo());
	    WorkerRecord workerRecord3=workerData.getWorkerByID("5");
	    System.out.println(workerRecord3.getInfo());
	}
	public static void ChangePassword(){
		WorkerData workerData=(WorkerData)DataReader.read(Data.WORKERS);
		WorkerRecord workerRecord1=workerData.getWorkerByID("1");
	    System.out.println(workerRecord1);
	    WorkerRecord workerRecord2=workerData.getWorkerByID("2");
	    System.out.println(workerRecord2.getInfo());
	    WorkerRecord workerRecord3=workerData.getWorkerByID("5");
	    System.out.println(workerRecord3.getInfo());
	}
	public static void DelWorker(){
		WorkerData workerData=(WorkerData)DataReader.read(Data.WORKERS);
		WorkerRecord workerRecord1=workerData.getWorkerByID("1");
	    System.out.println(workerRecord1);
	    WorkerRecord workerRecord2=workerData.getWorkerByID("2");
	    System.out.println(workerRecord2.getInfo());
	    WorkerRecord workerRecord3=workerData.getWorkerByID("5");
	    System.out.println(workerRecord3.getInfo());
	}
	public static void ChangePosition(){
		WorkerData workerData=(WorkerData)DataReader.read(Data.WORKERS);
		WorkerRecord workerRecord1=workerData.getWorkerByID("1");
	    System.out.println(workerRecord1);
	    WorkerRecord workerRecord2=workerData.getWorkerByID("2");
	    System.out.println(workerRecord2.getInfo());
	    WorkerRecord workerRecord3=workerData.getWorkerByID("5");
	    System.out.println(workerRecord3.getInfo());
	}
	
}

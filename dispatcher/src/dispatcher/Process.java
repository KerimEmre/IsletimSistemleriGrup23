package dispatcher;



public class Process {
	int id; // proses idsini tutan değişken
    private int arrivalTime; // varış zamanını tutan değişken
    private int priority; // öncelik düzeyini tutan değişken
    private int burstTime; // patlama zamanını tutan değişken
    public int startingBurstTime; // başlangıçtaki patlama süresini tutan değişken
    
    public int memory;
    public int printer;
    public int tarayicilar;
    public int modemler;
    public int cdler;
    


    public Process(int arrivalTime, int priority, int burstTime, int memory, int printer, int tarayicilar,int modemler, int cdler) {
        this.arrivalTime = arrivalTime;
        this.priority = priority;
        this.burstTime = burstTime;
        startingBurstTime=burstTime;
        
        this.memory = memory;
        this.printer = printer;
        this.tarayicilar = tarayicilar;
        this.modemler = modemler;
        this.cdler = cdler;
    
        
        id=Dispatcher.idCounter;
        Dispatcher.idCounter++;
    }


	public int getArrivalTime() {
        return arrivalTime;
    }

    public int getPriority() {
        return priority;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }
    
    public int getBellekIhtiyaci() {
        return memory;
    }
    
    public int getYaziciIhtiyaci() {
        return printer;
    }
    
    public int getTarayiciIhtiyaci() {
        return tarayicilar;
    }
    
    public int getModemIhtiyaci() {
        return modemler;
    }
    
    public int getCDIhtiyaci() {
        return cdler;
    }
    
}

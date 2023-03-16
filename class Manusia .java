class Manusia {
    String nama;
    int amal_baik;
    int amal_buruk;
    
    void amal_baik() {
        this.amal_baik++;
        if(this.amal_baik>this.amal_buruk);
        System.out.println(this.nama + " masuk surga");
    }
    
    void amal_buruk() {
        this.amal_buruk++;
        if(this.amal_buruk>this.amal_baik);
        System.out.println(this.nama + " masuk neraka");
        } 
}

class Simulasiamalbaikburuk {
    public static void main(String[] args) {
        
        Manusia manusia1 = new Manusia();
        manusia1.nama = "Sami";
        
        manusia1.amal_baik();
        manusia1.amal_baik();
        manusia1.amal_baik();
        manusia1.amal_baik();
        manusia1.amal_buruk();

    }
}

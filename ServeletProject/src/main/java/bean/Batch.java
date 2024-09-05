package bean;

public class Batch {
    private int bid;
    private String typeOfBatch;
    private String time;

    // Construtor padrão
    public Batch() {
    }

    public Batch(String typeOfBatch, String time) {
        this.typeOfBatch = typeOfBatch;
        this.time = time;
    }

    // Construtor com parâmetros
    public Batch(int bid, String typeOfBatch, String time) {
        this.bid = bid;
        this.typeOfBatch = typeOfBatch;
        this.time = time;
    }

    // Getters e Setters para cada propriedade

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getTypeOfBatch() {
        return typeOfBatch;
    }

    public void setTypeOfBatch(String typeOfBatch) {
        this.typeOfBatch = typeOfBatch;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // Opcional: Sobrescrever toString() para depuração fácil

    @Override
    public String toString() {
        return "Batch [bid=" + bid + ", typeOfBatch=" + typeOfBatch + ", time=" + time + "]";
    }
}

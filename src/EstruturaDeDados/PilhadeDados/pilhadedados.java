public class pilhadedados {

    private int dado;
    private  pilhadedados refNo = null;

    public pilhadedados(int dado) {
        this.dado = dado;
    }

    public pilhadedados(){

    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public pilhadedados getrefNo() {
        return refNo;
    }

    public void setReNo(pilhadedados refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "pilhadedados{" +
                "dado=" + dado +
                '}';
    }
}
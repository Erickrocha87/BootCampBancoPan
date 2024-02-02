public class fila<T> {

    private No<T> refNoEntradaFila;

    public fila() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty(){
        if (refNoEntradaFila == null){
            return true;
        }
        return false;

    }

     public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setRefno(refNoEntradaFila);
        refNoEntradaFila = novoNo;
        //um nó apontando pra outro nó
     }

     public T first() {
         if (!this.isEmpty()) {
             No primeiroNo = refNoEntradaFila;
             while (true){
                 if(primeiroNo.getRefno() != null){
                     primeiroNo = primeiroNo.getRefno();
                 }else {
                     break;
                 }
             }
             return (T) primeiroNo.getObject();
         }
         return null;
     } public T dequeue() {
         if (!this.isEmpty()) {
             No primeiroNo = refNoEntradaFila;
             No noAuxiliar = refNoEntradaFila;
             while (true){
                 if(primeiroNo.getRefno() != null){
                     noAuxiliar = primeiroNo;
                     primeiroNo = primeiroNo.getRefno();
                 }else {
                     noAuxiliar.setRefno(null); //não vai perder o primeio nó, auxiliar vai receber o nó antes do primeiro nó
                     break;
                 }
             }
             return (T) primeiroNo.getObject();
         }
         return null;
     }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}] --->";
                if(noAuxiliar.getRefno() != null){
                    noAuxiliar = noAuxiliar.getRefno();
                }else{
                    stringRetorno += "null;";
                    break;
                }
            }
        }else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}

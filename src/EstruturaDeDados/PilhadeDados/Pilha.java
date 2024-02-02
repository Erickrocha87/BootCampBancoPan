public class Pilha {

    private pilhadedados refnoEntradaPilha;

    public Pilha(){
        this.refnoEntradaPilha = null;

    }

    public void push(pilhadedados novoNo){
        pilhadedados refAuxiliar = refnoEntradaPilha;
        refnoEntradaPilha = novoNo;
        refnoEntradaPilha.setReNo(refAuxiliar);

    }

    public  pilhadedados pop(){
        if (!this.isEmpty()){
            pilhadedados noPoped = refnoEntradaPilha;
            refnoEntradaPilha = refnoEntradaPilha.getrefNo();
            return noPoped;
        }
        return null;
    }
    public  pilhadedados top(){
         return  refnoEntradaPilha;
    }

    public  boolean isEmpty(){
        if (refnoEntradaPilha == null){
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        String stringRetorno = "----------------\n";
        stringRetorno += "       Pilha\n";
        stringRetorno += "----------------\n";

        pilhadedados noAuxiliar = refnoEntradaPilha;

        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado =" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getrefNo();
            }else {
                break;
            }
        }
        stringRetorno += "=================\n";
        return stringRetorno;
    }
}


package POO;

public class contaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("------------------------------------------");
        System.out.println("numero da conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("dono: " + this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("status: "+ this.getStatus());
        System.out.println("------------------------------------------");
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.status = true;
        if( t == "CC"){
            setSaldo(50);
        }else if ( t == "CP"){
            saldo = 150;
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Conta com dinheiro");
        }else if (saldo < 0){
            System.out.println("Conta em débito");
        }else{
            setStatus(false) ;
        }

    }
    public void depositar(float v){
        if (status == true){
            setSaldo(getSaldo()+ v);
            System.out.println("Deposito realizado na conta de "+ this.getDono());
        }else{
            System.out.println("Impossivel depositar!");
        }
    }
    public void sacar(int vl){
        if(getStatus()){
            if(this.getSaldo() >= vl){
                this.setSaldo(this.getSaldo() - vl);
                System.out.println("Saque realizado na conta de "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar");
        }

    }
    public void pagarMensal(){
        int v = 0;
        if(getTipo() == "CC"){
            v = 12;
        }else if(getTipo() == "CP"){
            v = 20;
        }
        if(getStatus() == true){
            if(getSaldo() > v){
                this.setSaldo(getSaldo() - v);
            }else{
                System.out.println("saldo insuficiente!");
            }
        }else{
            System.out.println("Impossivel pagar");
        }
    }
    public void contaBanco(){
        saldo = 0;
        status = false;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
        public int getNumConta(){
            return numConta;

    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setStatus(boolean st){
        this.status = st;
    }
    public boolean getStatus(){
        return status;
    }

}

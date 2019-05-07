
package aula05;
public class ContaBanco {
    // Atributos

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
// Metodos Personalizados
    
    
    public void estadoAtual(){
        
        System.out.println("---------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Stutus: " + this.getStatus());
    }
    
    public void abrirConta(String t){
     
        this.setTipo(t);
     this.setStatus(true);
     if (t == "CC"){
         this.setSaldo(50);
     }
     else if(t == "CP"){
         this.setSaldo(150);
     }
        System.out.println("Conta Aberta Com Sucesso!");
    }
    
    public void fecharConta(){
        
        if (this.getSaldo() > 0){
            System.out.println("A Conta não pode ser fechada, ainda tem saldo");
        } else if (this.getSaldo() < 0){
            System.out.println("A conta não pode ser fechada, ainda há debitos");
        } else  {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    
   public void depositar(float v){
       if (this.getStatus()){
           // this.saldo = this.saldo + v; // Altera os atributos diretamente
           this.setSaldo(this.getSaldo() + v); // Não altera diretamente os atributos
           System.out.println("Deposito realizado na conta de: " + this.getDono());
       } else {
           System.out.println("A conta fechada, ou não existe!");
       }
       
   } 
   public void sacar(float v){
       
       if (this.getStatus()){  
           if (this.getSaldo() >= v){
           this.setSaldo(this.getSaldo() - v);
           System.out.println("Sague realizado na conta de " + this.getDono());      
       } else {
           System.out.println("Saldo Insuficiente!");
       }  
       } else{
               System.out.println("Conta Inativa!");      
       }
     }
      
       
public void pagarMensal(){
       int v= 0;
       if(this.getTipo() == "CC"){
          v = 12; 
       } else if (this.getTipo() == "CP"){
         v = 20;  
       }
       if (this.getStatus()){
           this.setSaldo(this.getSaldo() - v);
           System.out.println("Mensalidade Paga por: " + this.getDono());
       } else {
           System.out.println("Conta Inativa!");
       }
   }
// Metodos Especiais
   
   public ContaBanco(){
   // Metodo Construtor    
       this.saldo = 0;
       this.status = false;
   }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
  
}



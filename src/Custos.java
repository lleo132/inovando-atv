public class Custos {

    //private double caso;
    private double total;
    private double imposto;
    private double dist;
    private double valor;
    private double porc;
    private double fabri;
    private double custoFab;

    public void Custos1(double imposto, double dist, double valor, double fabri) {
        this.imposto = imposto;
        this.dist = dist;
        this.valor = valor;
        this.fabri = fabri;
    }


    public double CustoFabri(double valor, double porc, double fabri) {

                porc = this.valor * this.fabri;
                
                return porc;

        } 
     
    
    public double CustosImpostos(double imposto, double dist, double total ){

        imposto = this.custoFab * 0.45;
        dist = this.custoFab * 0.28;
        total = this.custoFab + dist + imposto;
       
         return total;
    
} 
    public double getCustoFab() {
        return custoFab;
    }

    public void setCustoFab(double custoFab) {
        this.custoFab = custoFab;
    }
    public double getFabri() {
        return fabri;
    }

    public void setFabri(double fabri) {
        this.fabri = fabri;
    }

    public double getPorc() {
        return porc;
    }

    public void setPorc(double porc) {
        this.porc = porc;
    }
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    //public double getCaso() 
       // return caso;
    
    //public void setCaso(double caso) 
        //this.caso = caso;
    
  

  
}


    


public class Compra {
    private Double troco;
    private Double valorpago;
    private Double valor;
    private String produto;
    
//Atribuindo valor aos atributos de compra

    public void setTroco(){
        this.troco = this.valorpago - this.valor;
    }

    public void setValorPago(Double valorpago){
        if(valorpago < this.valor){
            throw new IllegalArgumentException("O valor pago deve ser maior ou igual ao valor do produto!");
        }
        else{
            this.valorpago = valorpago;
        }
       
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public void setProduto(String produto){
        this.produto = produto;
    }

    // Retornando os atributos salvos 

    public Double getTroco(){
        return this.troco;
    }

    public Double getValorPago(){
        return this.valorpago;
    }
    
    public Double getValor(){
        return this.valor;
    }

    public String getProduto(){
        return this.produto;
    }

    public boolean verifica_pagamento(Double valorpago){
        if(valorpago < this.valor){
            return false;
        }
        else{
            return true;
        }
    }



    public void Compra(String produto, Double valor,Double valorpago){

        setProduto(produto);
        setValor(valor);
        setValorPago(valorpago);
        setTroco();

    }

    
}


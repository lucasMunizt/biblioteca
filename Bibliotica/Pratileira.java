public class Pratileira {
    Obras[] obras;
    String numeroPrateleira;
    double tamanho;
    double somarPeso;

    boolean addObra(Obras obra) {

        if( somarPeso < tamanho){
            for (int i = 0; i < obras.length; i++){
                if(obras[i] != null) {
                    obras[i] = obra;
                    obra.codigo= i;
                    return true;
                }
            }
            return false;
        }
    }

  double somarPeso(){
    int peso = 0;
    double soma = 0;
    for(int i = 0; i < obras.length; i++){
      if(obras[i] != null){
        soma += obras[i].getpeso();
      }
    }
  }

  Pratileira(int capacidade){ // =10
    obras = new Obras[capacidade];
  }
}

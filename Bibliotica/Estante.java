public class Estante {
    double pesoSuportadoEstante;
    int quantidadePrateleiras;
    Pratileira[] pratileira;
  
    Estante(int capacidade){
    pratileira = new Pratileira[capacidade];
    }
}

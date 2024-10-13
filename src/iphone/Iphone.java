
package iphone;

public class Iphone {

    
    public static void main(String[] args) {
       ReprodutorMusical rp = new ReprodutorMusical();
       rp.tocar();
       rp.pausar();
       rp.selecionarMusica("hvyv");
       
       AparelhoTelefonico at = new AparelhoTelefonico();
       at.ligar("4844488");
       at.atender();
       at.iniciarCorreioVoz();
       
       NavegadorInternet ni = new NavegadorInternet();
       ni.exibirPagina("wrrvrvrv");
       ni.atualizarPagina();
       ni.adicionarNovaAba();
           
       
       
    }
    
}

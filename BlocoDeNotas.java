import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BlocoDeNotas
{
   private ArrayList <String> notas;
   private String mensagem;
   
   public BlocoDeNotas()
   {
      notas = new ArrayList<String>();
   }
   
   public void inserir(String mensagem)
   {
      this.mensagem = mensagem;
      notas.add(mensagem);
   }
   
   public void remover(String mensagem)
   {
      int posicao = buscar(mensagem);
      
      notas.remove(posicao);
   }
   
   public int buscar(String mensagem)
   {
      for(int i = 0; i < notas.size(); i++)
      {
         String temp = notas.get(i);
         
         if(mensagem.equals(temp))
         {
            return i;
         }
      }
      return -1; //Não achou
   }
   
   public void imprimir()
   {
      
      JOptionPane.showMessageDialog(null, "Notas " +notas);
      
   }
   
   public void alterar(String mensagem, String nova)
   {  
      notas.set(buscar(mensagem), nova);
   }
}
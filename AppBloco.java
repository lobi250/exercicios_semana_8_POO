import javax.swing.JOptionPane;

public class AppBloco
{
   public static void main(String[] args)
   {
      BlocoDeNotas blocoDeNotas = new BlocoDeNotas();
      
      int opcao;
      String mensagem, nova; 
      
      do{
         opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1.Inserir uma nota.\n2.Remover uma nota.\n3.Alterar uma nota.\n4.Listar todas as notas.\n5.Sair do Programa.\n\nInforme a opcao desejada: "));
         
         switch(opcao)
         {
            case 1:  mensagem = JOptionPane.showInputDialog("Digite o conteúdo da nota: ");
                     blocoDeNotas.inserir(mensagem);
                     break;
            case 2:  mensagem = JOptionPane.showInputDialog("Informe  o conteúdo da nota a ser removida: ");
                     blocoDeNotas.remover(mensagem);
                     break;
            case 3:  mensagem = JOptionPane.showInputDialog("Informe o conteúdo da mensagem a ser alterada: ");
                     nova = JOptionPane.showInputDialog("Informe a nova mensagem que deseja colocar: ");
                     blocoDeNotas.alterar(mensagem, nova);                     
                     break;
            case 4:  blocoDeNotas.imprimir();
                     break;
            case 5:
                     break;
            default: JOptionPane.showMessageDialog(null, "Opcao Inválida");
         }
      }while(opcao != 5);
   }
}

package principal2;


import javax.swing.JOptionPane;

/**
 *
 * @author micha
 */
public class Opcao1 extends Formas{

    

    
    public Opcao1(){
        setNome("A Famosa Da Casa");
        setSabor("---Morango Com Pedaços De Nutella E Amendoim---");
        setPreco(50.00f);
        JOptionPane.showMessageDialog(null, "Hoje Temos " + this.getNome() + " No Sabor De " + this.getSabor() +  " Por Apenas " + this.getPreco() + "$");
 }
    
    
    
    
    @Override
    public void Descricao() {
        JOptionPane.showMessageDialog(null,"Essa pizza é incrivel! o nome pizza ja é bom, agora de doce? HUMMM "); 
    }


    @Override
    public void Confirm() {
        int resposta;
        resposta = JOptionPane.showConfirmDialog(null, " Você Quer essa Delicia? " , "Confirmação " , JOptionPane.YES_NO_OPTION   , JOptionPane.WARNING_MESSAGE );
        int aprazoOuAvista = 0;
        if(resposta == JOptionPane.YES_OPTION){
            this.setQts(Float.parseFloat(JOptionPane.showInputDialog("Você quer quantas? ")));
            this.setSoma((this.getQts() * this.getPreco()));
            JOptionPane.showMessageDialog(null , " A Vista deu = " + this.getSoma() + "$ reais ");
            aprazoOuAvista = JOptionPane.showConfirmDialog(null, " Quer pagar a vista? se clicar em ''Sim'' voce vai efetuar o pagamento a vista! caso clicar em ''Não'' o pagamento será divido no cartão em 2x com 10% de juros " ," Modo de pagamento " ,  JOptionPane.YES_NO_OPTION , JOptionPane.WARNING_MESSAGE);
        
                if (aprazoOuAvista == JOptionPane.YES_OPTION  ) { 
                JOptionPane.showMessageDialog(null , "Ok, so colocar o cartão ! ");
                }
            
                else  if(aprazoOuAvista == JOptionPane.NO_OPTION  ) {
                float prazo;
                prazo = ((10 * this.getSoma()) /100 + this.getSoma()) ;
                JOptionPane.showMessageDialog(null , "Viu, rapidinho! o valor total a prazo é  " + prazo);
                }
        }
                
                    
        else{
            JOptionPane.showMessageDialog(null, " Tabomm, não sabe oque ta perdendo! ");
        }
        
        
        
       
    }


    } 
    

    

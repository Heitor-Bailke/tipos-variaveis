
public class Operadores {

    public static void main (String [] args) {
        
        //classe Operadores.java
        String nome = "Heitor Bailke de Bem";
        int idade = 22;
        double peso = 61.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();
        
        //operadores Aritiméticos

        Double Soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicação = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        //x repeticao
        int numero = 5;

        numero = numero + 2; // numero++;
        System.out.print(++ numero); //para quando quiser somar +1 numero 
        System.out.print (-- numero); //Para quando quiser diminuir -1 numero

        boolean variavel = true;

        variavel = !variavel; // Para inverter o valor boolean da variavel

        System.out.print(variavel); // resultado

        //if
        int a, b;
        a = 6;
        b = 5;

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.print(resultado);

        String nomeUm = "Heitor";
        String nomeDois = new String ("Heitor");

        System.out.println(nomeUm.equals(nomeDois)); // Para validar dois objetor caso uma New string fosse adicionada e quiser confirmar se e falso ou verdadeiro

        //Verificação de boolean com && e ||

        boolean condiacao1 = true;
        boolean condicao2 = false;

        if(condiacao1 && condicao2) {
            System.out.print("As duas condições são verdadeiras"); // aqui o "&&" esstá verificando se as duas condições sao verdadeiras, caso nao for nao ira imprimir nada na tela

    
        }

        if(condiacao1 || condicao2) {
            System.out.print("Uma Das condições é verdadeira"); // aqui o "||" esstá verificando se uma das condição é verdadeira, caso for  ira imprimir na tela
    }
    
}

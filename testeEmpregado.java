import java.util.ArrayList;
import java.util.Arrays;

public class testeEmpregado {
    
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", 30, 1, 5000, 0 , 0, "M"); /*Com construtor */
        Empregado empregado2 = new Empregado("Ana", 20, 2, 3000, 5, 0, "F");
        Empregado empregado3 = new Empregado("Carlos", 54, 3, 6800, 8, 100, "M");

       /* List<Empregado> empregados = Arrays.asList(empregado1, empregado2, empregado3);

        List<Empregado> empregados2 = empregados;/*  ----> a lista empregados2 só vai apontar p/ a lista empregados, sem herdar seus valores  --> OUTRO MODO DE FAZER LISTA, PORÉM NÃO DÁ PARA ADD MAIS DEPOIS DO CÓDIGO*/ 

        ArrayList<Empregado> empregados = new ArrayList<>(Arrays.asList(empregado1, empregado2, empregado3));
        ArrayList<Empregado> empregados2 = empregados;
        Empregado empregado4 = new Empregado("Flávio", 78, 2, 800, 0, 0, "M");
        empregados.add(empregado4); /* Adiciona na lista o empregado4 criado agr */

        for (Empregado empregado : empregados2) {
            System.out.println("Nome: " + empregado.getNome());
            System.out.println("Salário: " + empregado.CalcularSalario());
            System.out.println();
        }

        /*
        System.out.print("Nome empregado 1: "); 
        System.out.println(empregado1.getNome()); 

        System.out.print("Nome empregado 2: "); 
        System.out.println(empregado2.getNome());    ---> Maneira de printar os valores com getX */


        /* Sem construtor 
        Empregado empregado2 = new Empregado(); 
        empregado2.setNome("Ana");
        empregado2.setIdade(19);
        empregado2.setTipo(2);
        empregado2.setSalario(1500.00);
        empregado2.setComissao(150.00);
        */
    }


}

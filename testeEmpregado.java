public class testeEmpregado {
    
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", 30, 1, 5000, 0 , 0, "Masculino"); /*Com construtor */
        Empregado empregado2 = new Empregado("Ana", 20, 2, 3000, 5, 0, "Feminino");

        System.out.println(empregado1.getNome());
        System.out.println(empregado2.getNome());

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

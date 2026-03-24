public class testeEmpregado {
    
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", 30, 1, 5000, 0 , 0); /*Com construtor */

        Empregado empregado2 = new Empregado(); /*Sem construtor */
        empregado2.setNome("Ana");
        empregado2.setIdade(19);
        empregado2.setTipo(2);
        empregado2.setSalario(1500.00);
        empregado2.setComissao(150.00);

    }


}

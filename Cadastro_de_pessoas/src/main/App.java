package main;
import java.time.LocalDate;

import business.EstadoCivil;
import business.FormacaoAcademica;
import business.Pessoa;
import business.Profissao;
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setAltura(1.72f);
        System.out.println(pessoa.getAltura());
        pessoa.setNome("Lucas");
        System.out.println(pessoa.getNome());
        pessoa.setPeso(82.6f);
        System.out.println(pessoa.getPeso());
        pessoa.setDatanasc(LocalDate.of(2003, 4, 8));
        System.out.println(pessoa.getDatanasc());
        pessoa.setEstadoCivil(EstadoCivil.CASADO);
        System.out.println(pessoa.getEstadoCivil());
        pessoa.setFormacaoAcadem(FormacaoAcademica.SUPERIOR);
        System.out.println(pessoa.getFormacaoAcadem());
        pessoa.setProfissao(Profissao.CLT);
        System.out.println(pessoa.getProfissao());
        pessoa.setVidasocial(true);
        System.out.println(pessoa.getVidasocial());
        pessoa.setHobby(false);
        System.out.println(pessoa.getHobby());
        pessoa.setAtividadeFisica(5);
        System.out.println(pessoa.getAtividadeFisica());
        pessoa.setEstadoSaude(8);
        System.out.println(pessoa.getEstadoSaude());




        
    }
}

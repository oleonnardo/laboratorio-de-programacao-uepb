package lp.lab03;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @aluno: Leonardo Araujo Silva
 * @matrícula: 161080120
 */
public class Produto {

    /**
     * Ao visualizar um produto, um usuário deseja ver os 2 comentários mais
     * relevantes daquele produto e saber sua “Nota NaMosca”.
     */
    private String nome;
    private ArrayList<Opiniao> opinioes = new ArrayList();

    public Produto(String nome) {
        this.nome = nome;
    }

    public static void run(String nomeProduto, int nota, String comentario) throws Exception {
        Produto p = new Produto(nomeProduto);
        p.adicionaNota(nota, comentario);
        p.showEstrategiaSazonal();
        p.showEstrategiaSimples();
    }

    /**
     * @param nome.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @param nota
     * @param comentario
     * @param data
     * @throws Exception
     */
    public void adicionaNota(int nota, String comentario) throws Exception {
        Opiniao avaliacao = new Opiniao();
        avaliacao.setNota(nota);
        avaliacao.setComentario(comentario);

        Calendar calendar = new GregorianCalendar();
        Date trialTime = new Date();
        calendar.setTime(trialTime);

        avaliacao.setData(calendar);

        opinioes.add(avaliacao);
    }

    /**
     * Metodo Estrategia Simples.
     */
    public void showEstrategiaSimples() {
        if (opinioes.size() > 1) {
            notaMedia(opinioes.size());

            int menorNota = -1;
            int maiorNota = -1;
            for (int i = 0; i < opinioes.size(); i++) {
                if (opinioes.get(i).getNota() > opinioes.get(i + 1).getNota()) {
                    maiorNota = i;
                }
                if (opinioes.get(i).getNota() < opinioes.get(i + 1).getNota()) {
                    menorNota = i;
                }
            }
            System.out.print(opinioes.get(maiorNota).getData());
            System.out.println(opinioes.get(maiorNota).getComentario());
            showData(opinioes.get(menorNota).getData());
            System.out.println(opinioes.get(menorNota).getComentario());

        } else {
            System.out.println("Nota Na Mosca: " + opinioes.get(0).getNota());
            showData(opinioes.get(0).getData());
            System.out.println(opinioes.get(0).getComentario());
        }

    }

    /**
     * Metodo Estrategia Sazonal.
     */
    public void showEstrategiaSazonal() {
        if (opinioes.size() > 1) {
            notaMedia(opinioes.size());

            showData(opinioes.get(opinioes.size() - 1).getData());
            System.out.println(opinioes.get(opinioes.size() - 1).getComentario());

            showData(opinioes.get(opinioes.size() - 2).getData());
            System.out.println(opinioes.get(opinioes.size() - 2).getComentario());
        } else {
            System.out.println("Nota Na Mosca: " + opinioes.get(0).getNota());
            showData(opinioes.get(0).getData());
            System.out.println(opinioes.get(0).getComentario());
        }
    }

    private void notaMedia(int numNotas) {
        int media = 0;
        for (int i = 0; i < numNotas; i++) {
            media += opinioes.get(i).getNota();
        }
        System.out.println("Nota Na Mosca: " + media / numNotas);
    }

    private static void showData(Calendar c) {
        System.out.println(
                c.get(Calendar.DAY_OF_MONTH) + "-"
                + c.get(Calendar.MONTH) + "-"
                + c.get(Calendar.YEAR) + " "
                + c.getTime()
        );
    }

}

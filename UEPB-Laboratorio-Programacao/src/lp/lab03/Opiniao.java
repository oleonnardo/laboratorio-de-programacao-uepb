package lp.lab03;

import java.util.Calendar;

/**
 * @aluno: Leonardo Araujo Silva
 * @matrícula: 161080120
 */
public class Opiniao {

    /**
     * Cada opinião é composta de uma nota (que só pode ser -2, -1, 0, 1 ou 2),
     * um comentário de até 140 caracteres (não é possível criar opiniões com
     * comentário mais longos que isso) e a data em que foi escrita.
     */
    private int nota;
    private String comentario;
    private final int CARACTERES = 140;
    private final int NOTA_MINIMA = -2;
    private final int NOTA_MAXIMA = 2;
    private Calendar data;

    public void setNota(int nota) throws Exception {
        if (nota >= this.NOTA_MINIMA && nota <= this.NOTA_MAXIMA) {
            this.nota = nota;
        } else {
            throw new Exception("Nota inválida.");
        }
        this.nota = nota;
    }

    public void setComentario(String comentario) throws Exception {
        if (comentario.length() > this.CARACTERES) {
            throw new Exception("Numero de caracteres maior que 140.");
        } else {
            this.comentario = comentario;
        }

    }

    public void setData(Calendar data) throws Exception {
        this.data = data;
    }

    public int getNota() {
        return this.nota;
    }

    public String getComentario() {
        return this.comentario;
    }

    public Calendar getData() {
        return this.data;
    }

}

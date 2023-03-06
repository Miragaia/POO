package Treino.Exercicios2;

public class aluno {
    private int matricula;
    private double teste1;
    private double teste2;
    private double trabalho; 

    public double media(double teste1, double teste2, double trabalho) {
        double media = teste1 + teste2 + trabalho;

        return (media*10)/7;
    }

    public double tfinal(double teste1, double teste2, double trabalho) {
        if(media(teste1, teste2, trabalho) < 4) {
            return 4-media(teste1, teste2, trabalho);
        } else {
            return 0;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + matricula;
        long temp;
        temp = Double.doubleToLongBits(teste1);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(teste2);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(trabalho);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        aluno other = (aluno) obj;
        if (matricula != other.matricula)
            return false;
        if (Double.doubleToLongBits(teste1) != Double.doubleToLongBits(other.teste1))
            return false;
        if (Double.doubleToLongBits(teste2) != Double.doubleToLongBits(other.teste2))
            return false;
        if (Double.doubleToLongBits(trabalho) != Double.doubleToLongBits(other.trabalho))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "aluno [matricula=" + matricula + ", teste1=" + teste1 + ", teste2=" + teste2 + ", trabalho=" + trabalho
                + "]";
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setTeste1(double teste1) {
        this.teste1 = teste1;
    }

    public void setTeste2(double teste2) {
        this.teste2 = teste2;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getTeste1() {
        return teste1;
    }

    public double getTeste2() {
        return teste2;
    }

    public double getTrabalho() {
        return trabalho;
    }
}


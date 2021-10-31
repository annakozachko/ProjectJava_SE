package ua.intita.qa.homework12;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

public class Evaluation {
    private int[] evaluation;

    public Evaluation(int[] evolutions) {
        this.evaluation = evolutions;
    }

    public int[] getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int[] evolutions) {
        this.evaluation = evolutions;
    }
}

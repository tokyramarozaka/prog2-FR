package org.example;

import java.util.List;

public interface Evaluable {
    void ajouterEvaluation(Evaluation evaluation);
    List<Evaluation> obtenirEvaluations();
}

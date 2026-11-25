package problem;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;

public class Person {
    private ArrayList<Problem> listOfProblem = new ArrayList<>();
    public void addProblem(Problem problem){
        this.listOfProblem.add(problem);
    }
    public void solveProblem(Problem problem){
        for(int count = 0; count < this.listOfProblem.size(); count++){
            if(this.listOfProblem.get(count) == problem){
                this.listOfProblem.remove(count);
            }
        }
    }

    public int getAmountOfProblems(){
        return this.listOfProblem.size();
    }

}

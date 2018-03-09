/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Results;

import java.util.ArrayList;

/**
 *
 * @author omkar
 */
public class ResultsDir {

    private ArrayList<Result> ResultList;

    public ResultsDir() {
        ResultList = new ArrayList<Result>();
    }

    public ArrayList<Result> getResultList() {
        return ResultList;
    }

    public void setResultList(ArrayList<Result> ResultList) {
        this.ResultList = ResultList;
    }

    public void addResult(Result result) {

        ResultList.add(result);

    }

    public void removeesultR(Result result) {
        ResultList.remove(result);

    }

}

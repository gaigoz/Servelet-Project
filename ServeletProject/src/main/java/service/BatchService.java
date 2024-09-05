package service;

import bean.Batch;
import dao.BatchDao;

public class BatchService {

    BatchDao bd = new BatchDao();

    public String storeBatch(Batch batch){
        if(bd.storeBatch(batch) > 0){
            return "success";
        }else{
            return "fail";
        }
    }

    public String updateBatch(Batch batch){
        if(bd.updateBatch(batch) > 0){
            return "success";
        }else{
            return "fail";
        }
    }
}

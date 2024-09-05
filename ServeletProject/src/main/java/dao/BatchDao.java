package dao;

import bean.Batch;
import resource.DbResource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDao {

    public int storeBatch(Batch batch) {
        try {
            Connection con = DbResource.getDbConnection();
            PreparedStatement ps = con.prepareStatement("insert into batch (typeOfBatch, time) values (?, ?)");
            ps.setString(1, batch.getTypeOfBatch());
            ps.setString(2, batch.getTime());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        }
    }

    public int updateBatch(Batch batch) {
        try {
            Connection con = DbResource.getDbConnection();
            PreparedStatement ps = con.prepareStatement("update batch set typeOfBatch = ?, time = ? where bid = ?");
            ps.setString(1, batch.getTypeOfBatch());
            ps.setString(2, batch.getTime());
            ps.setInt(3, batch.getBid());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        }
    }
}

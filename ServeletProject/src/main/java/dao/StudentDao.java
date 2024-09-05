package dao;

import bean.Student;
import resource.DbResource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public int storeStudent(Student student) {
        try {
            Connection con = DbResource.getDbConnection();
            PreparedStatement ps = con.prepareStatement("insert into student (sname, age, bId) values (?, ?,?)");
            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setInt(3, student.getbId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        }
    }

    public int deleteStudent(int sid) {
        try {
            Connection con = DbResource.getDbConnection();
            PreparedStatement ps = con.prepareStatement("delete from student where sid = ?");
            ps.setInt(1, sid);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        }
    }

    public int updateStudent(Student student) {
        try {
            Connection con = DbResource.getDbConnection();
            PreparedStatement ps = con.prepareStatement("update student set sname = ?  where sid = ?");
            ps.setString(1, student.getName());
            ps.setInt(2, student.getsId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        }
    }

    public List<Student> getAllStudent() {
        List<Student> list = new ArrayList<Student>();
        try {
            Connection con = DbResource.getDbConnection();
            PreparedStatement ps = con.prepareStatement("select * from student");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student(rs.getString("sname"), rs.getInt("age"), rs.getInt("bId"));
                list.add(student);
            }

        } catch (SQLException e) {
            System.err.println(e);
        }
        return list;
    }

}

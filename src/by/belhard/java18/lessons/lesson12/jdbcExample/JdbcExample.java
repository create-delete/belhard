package by.belhard.java18.lessons.lesson12.jdbcExample;

import java.sql.*;

public class JdbcExample {

    private static final String PATH = "jdbc:mysql://localhost/bh18db?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";

    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(PATH,USER,PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws SQLException {


        Statement statement = connection.createStatement();

//        String name = "Oleg";
//        statement.execute(String.format(
//                "insert into employees value(null, '%s', '2019-01-01', %d, %d)", name, 1, 1500));

//        statement.executeUpdate("update employees set salary = salary + 100 where salary < 1500");

        ResultSet resultSet = statement.executeQuery("select * from employees");

        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString("name");
            Date date = resultSet.getDate(3);
            Speciality speciality =  getSpecialityEntity(resultSet.getInt("speciality_id"));
        }

        statement.close();
        connection.close();
    }

    private static Speciality getSpecialityEntity(int speciality_id) throws SQLException {
        PreparedStatement statement1 = connection.prepareStatement("select * from specialties where id = ?");

        statement1.setInt(1, speciality_id);

        ResultSet resultSet = statement1.executeQuery();

        Speciality result = null;

        while(resultSet.next()){
            //Тут должно быть что то написано
        }

        return result;
    }
}

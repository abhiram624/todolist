import java.sql.*;
import java.util.Scanner;

public class TaskOperations {

    Scanner sc = new Scanner(System.in);

    public void addTask() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print("Enter task: ");
            String task = sc.nextLine();

            String sql =
                    "INSERT INTO tasks(task_name) VALUES(?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, task);

            ps.executeUpdate();

            System.out.println("Task Added!");

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    public void viewTasks() {

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "SELECT * FROM tasks";

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery(sql);

            System.out.println();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id")
                        + " | "
                        + rs.getString("task_name")
                        + " | "
                        + rs.getString("status")
                );

            }

            System.out.println();

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    public void updateTask() {

        try {

            Connection con =
                    DBConnection.getConnection();

            System.out.print("Enter Task ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Status: ");
            String status = sc.nextLine();

            String sql =
                    "UPDATE tasks SET status=? WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, status);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Updated!");

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    public void deleteTask() {

        try {

            Connection con =
                    DBConnection.getConnection();

            System.out.print("Enter Task ID: ");

            int id = sc.nextInt();

            String sql =
                    "DELETE FROM tasks WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Deleted!");

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}
<%@ page import="java.sql.*" %>
<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalary = request.getParameter("basicsalary");

    Connection conn = null;
    PreparedStatement pst = null;
    Statement stmt = null;
    ResultSet rs = null;

    String url = "jdbc:mysql://localhost:3306/Employee?useSSL=false&serverTimezone=UTC";
    String user = "root"; // Change if needed
    String pass = ""; // Change to your actual MySQL password

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);

        // Update the employee record
        pst = conn.prepareStatement("UPDATE Emp SET empname = ?, basicsalary = ? WHERE empno = ?");
        pst.setString(1, empname);
        pst.setDouble(2, Double.parseDouble(basicsalary));
        pst.setInt(3, Integer.parseInt(empno));

        int updated = pst.executeUpdate();

        if (updated > 0) {
%>
            <p style="color:green;">Employee updated successfully!</p>
<%
        } else {
%>
            <p style="color:red;">Employee with Emp_No <%= empno %> not found!</p>
<%
        }

        // Show all records after update
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");
%>
        <h2>Employee Table</h2>
        <table border="1">
            <tr>
                <th>Emp No</th>
                <th>Emp Name</th>
                <th>Basic Salary</th>
            </tr>
<%
        while (rs.next()) {
%>
            <tr>
                <td><%= rs.getInt("empno") %></td>
                <td><%= rs.getString("empname") %></td>
                <td><%= rs.getDouble("basicsalary") %></td>
            </tr>
<%
        }
    } catch (Exception e) {
%>
        <p style="color:red;">Error: <%= e.getMessage() %></p>
<%
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (pst != null) pst.close(); } catch (Exception e) {}
        try { if (stmt != null) stmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>
        </table>
``

<%@ page import="java.sql.*" %>
<%
    String empnoStr = request.getParameter("empno");
    int empno = Integer.parseInt(empnoStr);

    Connection conn = null;
    PreparedStatement deleteStmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    String url = "jdbc:mysql://localhost:3306/Employee?useSSL=false&serverTimezone=UTC";
    String user = "root"; // your DB username
    String pass = ""; // your DB password

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);

        // Delete employee by empno
        deleteStmt = conn.prepareStatement("DELETE FROM Emp WHERE empno = ?");
        deleteStmt.setInt(1, empno);
        int deleted = deleteStmt.executeUpdate();
%>
        <p style="color:blue;"><%= deleted %> record(s) deleted with Emp_No = <%= empno %></p>
        <h2>Salary Report</h2>
        <pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>
<%
        // Display remaining records
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        double total = 0;
        while (rs.next()) {
            int id = rs.getInt("empno");
            String name = rs.getString("empname");
            double salary = rs.getDouble("basicsalary");
            total += salary;
%>
        <pre>
Emp_No    : <%= id %>
Emp_Name  : <%= name %>
Basic     : <%= salary %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>
<%
        }
%>
        <pre>Grand Salary : <%= total %></pre>
        <pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>
<%
    } catch (Exception e) {
%>
        <p style="color:red;">Error: <%= e.getMessage() %></p>
<%
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (stmt != null) stmt.close(); } catch (Exception e) {}
        try { if (deleteStmt != null) deleteStmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>

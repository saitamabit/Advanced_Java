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
    String user = "root"; // Your MySQL username
    String pass = ""; // Your MySQL password

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);

        // Insert record
        pst = conn.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
        pst.setInt(1, Integer.parseInt(empno));
        pst.setString(2, empname);
        pst.setDouble(3, Double.parseDouble(basicsalary));
        pst.executeUpdate();
%>
        <p style="color:green;">Employee added successfully!</p>
<%
        // Show report
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        double grandTotal = 0;
%>
        <h2>Salary Report</h2>
        <pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>
<%
        while (rs.next()) {
            int eno = rs.getInt("empno");
            String ename = rs.getString("empname");
            double sal = rs.getDouble("basicsalary");
            grandTotal += sal;
%>
        <pre>
Emp_No    : <%= eno %>
Emp_Name  : <%= ename %>
Basic     : <%= sal %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>
<%
        }
%>
        <pre>Grand Salary : <%= grandTotal %></pre>
        <pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>
<%
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

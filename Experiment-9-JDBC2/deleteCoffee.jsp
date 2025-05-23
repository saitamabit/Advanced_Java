<%@ page import="java.sql.*" %>
<%
    String id = request.getParameter("id");

    Connection conn = null;
    PreparedStatement pst = null;
    Statement stmt = null;
    ResultSet rs = null;

    String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    String user = "root"; // Change if necessary
    String pass = ""; // Replace with your MySQL password

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);

        // Delete the record
        pst = conn.prepareStatement("DELETE FROM coffee WHERE id = ?");
        pst.setInt(1, Integer.parseInt(id));
        int deleted = pst.executeUpdate();

        if (deleted > 0) {
%>
            <p style="color:green;">Coffee product with ID <%= id %> deleted successfully!</p>
<%
        } else {
%>
            <p style="color:red;">No record found with ID: <%= id %></p>
<%
        }

        // Display remaining records
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM coffee");
%>
        <h2>Remaining Coffee Products</h2>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Coffee Name</th>
                <th>Price</th>
            </tr>
<%
        while (rs.next()) {
%>
            <tr>
                <td><%= rs.getInt("id") %></td>
                <td><%= rs.getString("coffee_name") %></td>
                <td><%= rs.getDouble("price") %></td>
            </tr>
<%
        }
    } catch(Exception e) {
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

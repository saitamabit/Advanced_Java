<%@ page import="java.sql.*" %>
<%
    String id = request.getParameter("id");
    String name = request.getParameter("coffee_name");
    String price = request.getParameter("price");

    Connection conn = null;
    PreparedStatement pst = null;
    Statement stmt = null;
    ResultSet rs = null;

    String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    String user = "root"; // Change this if needed
    String pass = ""; // Change this to your MySQL password

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);

        // Update coffee record
        pst = conn.prepareStatement("UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?");
        pst.setString(1, name);
        pst.setDouble(2, Double.parseDouble(price));
        pst.setInt(3, Integer.parseInt(id));
        int updated = pst.executeUpdate();

        if (updated > 0) {
%>
            <p style="color: green;">Coffee product updated successfully!</p>
<%
        } else {
%>
            <p style="color: red;">No record found with ID: <%= id %></p>
<%
        }

        // Display all records
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM coffee");
%>
        <h2>All Coffee Products</h2>
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
        <p style="color: red;">Error: <%= e.getMessage() %></p>
<%
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (pst != null) pst.close(); } catch (Exception e) {}
        try { if (stmt != null) stmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>
</table>

<%@ page import="java.sql.*" %>
<%
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    String user = "root"; // Change to your DB username
    String pass = ""; // Change to your DB password

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);

        // Query coffee names starting with 'D'
        pst = conn.prepareStatement("SELECT * FROM coffee WHERE coffee_name LIKE 'D%'");
        rs = pst.executeQuery();
%>
        <h2>Coffee Products Starting with 'D'</h2>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Coffee Name</th>
                <th>Price</th>
            </tr>
<%
        boolean found = false;
        while (rs.next()) {
            found = true;
%>
            <tr>
                <td><%= rs.getInt("id") %></td>
                <td><%= rs.getString("coffee_name") %></td>
                <td><%= rs.getDouble("price") %></td>
            </tr>
<%
        }

        if (!found) {
%>
            <tr>
                <td colspan="3" style="color:red;">No coffee products found starting with 'D'</td>
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
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>
        </table>

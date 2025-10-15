import java.util.*;
import java.sql.*;
class A
{
public static void main(String args[])
{
try
{ 
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe");
if(con==null)
{
System.out.println("connection not established");
}

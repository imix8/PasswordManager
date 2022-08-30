package passwordmanagementia;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class db {
    public static void main (String args[]){
    }
    
    public boolean uniqueUsername(String username){
        //checks database to see whether username already exists
        boolean unique = true;
        Connection c = null;
        String uniqueUser = "SELECT * FROM \"user\""; //sql command selects all from user
        ResultSet rs = null;
        String user;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PasswordManager", "postgres", "secret8");
            Statement stmt = c.createStatement();
            rs = stmt.executeQuery(uniqueUser);
            while(rs.next()){ //goes through each set of values
                if(rs.getString("username") == username){
                unique = false;
                }
            }
        } catch (Exception e) {
                System.err.println(e.getClass().getName()+": "+ e.getMessage());
                System.exit(0);
        }
        System.out.println("Username registered: " + unique);
        return unique;
    }
    
    public void createAccount(String username, String email, String password, String secretKey){
        //creates account by passing all values into database
        Connection c = null;
        PreparedStatement stmt = null;
        String account = "insert into \"user\"(username,email,password,secretKey) values(?,?,?,?)"; //sql insert command
        
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PasswordManager", "postgres", "secret8");
            stmt = c.prepareStatement(account);
            stmt.setString(1, username); //first ? is username
            stmt.setString(2, email); //second ? is email
            stmt.setString(3, password); //third ? is password
            stmt.setString(4, secretKey); //fourth ? is secretKey
            stmt.executeUpdate();
            stmt.close();
        } catch (Exception e) {
                System.err.println(e.getClass().getName()+": "+ e.getMessage());
                System.exit(0);
        }
        System.out.println("Account created successfully");
    }
    
    public boolean loginAttempt(String username, String password){
        String login = "Select * from \"user\" where username = ? and password = ?"; //sql command to check user table for login credentials
        ResultSet rs = null;
        boolean loginB = false;
        Connection c = null;
        PreparedStatement stmt = null;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PasswordManager", "postgres", "secret8");
            stmt = c.prepareStatement(login);
            stmt.setString(1, username);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if(rs.next()){
                loginB = true; //true: matching username and password pair found, login successfully
            }
        }catch (Exception e) {
            System.err.println(e.getClass().getName()+": "+ e.getMessage());
        }  
    System.out.println("Login success status: " + loginB);
    return loginB;
    }
    
       public void insertPassword(String addPassUsername, String encryptedPassword){
        Connection c = null;
        PreparedStatement stmt = null;
        String username = addPassUsername;
        ResultSet rs = null;
        int id = 0;
        String findID = "SELECT id FROM \"user\" WHERE username = ?"; //id from user table is primary key
        String pass = "INSERT INTO \"inputPass\" (user_id, inputpass) values(?,?)";//inputPass table foreign key user_id -> id
        //one to many relationship
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PasswordManager", "postgres", "secret8");
            stmt = c.prepareStatement(findID);
            stmt.setString(1, username);
            rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt("id"); //finds id correlating with inputted username
            }
            stmt = c.prepareStatement(pass);
            stmt.setInt(1, id); //user_id -> id
            stmt.setString(2, encryptedPassword);
            stmt.executeUpdate();
            stmt.close(); //keeps it from continously updating
        } catch (Exception e) {
                System.err.println(e.getClass().getName()+": "+ e.getMessage());
                System.exit(0);
        }
        System.out.println("Input Password successfully");
    }
       
       public ArrayList<String> getEncryptedPassword(String username){
        //returns arraylist of encrypted passwords stored in databse for single user
        ArrayList<String> passwords = new ArrayList<String>();
        Connection c = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int id = 0;
        String findID = "SELECT id FROM \"user\" WHERE username = ?"; //sql command finds id associated with user
        String getInputPass = "SELECT inputpass FROM \"inputPass\" WHERE user_id = ?"; //user_id -> id
        
        try{

            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PasswordManager", "postgres", "secret8");
            stmt = c.prepareStatement(findID);
            stmt.setString(1, username);
            rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
            }
            stmt = c.prepareStatement(getInputPass);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while(rs.next()){
                passwords.add(rs.getString("inputPass")); //adds to arraylist
            }
            stmt.close();
        } catch (Exception e) {
                System.err.println(e.getClass().getName()+": "+ e.getMessage());
                System.exit(0);
        }
        System.out.println("Inputted Encrypted Passwords successfully retrieved");
        return passwords;
    }

    public String retrieveEmail(String username){
        //retrieves email from database that corresponds to the same id as inputted username
        String getEmail = "Select email from \"user\" where username = ?";
        ResultSet rs = null;
        Connection c = null;
        String email = "";
        PreparedStatement stmt = null;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PasswordManager", "postgres", "secret8");
            stmt = c.prepareStatement(getEmail);
            stmt.setString(1, username);
            rs = stmt.executeQuery();
            while(rs.next()){
                email = rs.getString("email");
            }
        }catch (Exception e) {
            System.err.println(e.getClass().getName()+": "+ e.getMessage());
        }
    System.out.println("Successfully linked email: " + email);
    return email;
    }
    
    public int retrieveSecretKey(String username){
        //retrieves secretKey from database that corresponds to the same id as inputted username
        String getSecretKey = "Select secretKey from \"user\" where username = ?";
        ResultSet rs = null;
        Connection c = null;
        int secretKey = 0;
        PreparedStatement stmt = null;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PasswordManager", "postgres", "secret8");
            stmt = c.prepareStatement(getSecretKey);
            stmt.setString(1, username);
            rs = stmt.executeQuery();
            while(rs.next()){
                secretKey = rs.getInt("secretKey");
            }
        }catch (Exception e) {
            System.err.println(e.getClass().getName()+": "+ e.getMessage());
        }
    System.out.println("Successfully retrieved secret key: " + secretKey);
    return secretKey;
    }
       
    public void editPassword(String editIndex, String editPass, String username){
        //updates existing stored password in inputpass table that corresponds to the same id as user_id -> id
        Connection c = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int id = 0;
        String findID = "SELECT id FROM \"user\" WHERE username = ?";
        String update = "Update \"inputPass\" set inputpass = ? where (user_id, inputpass) = (?,?)";
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PasswordManager", "postgres", "secret8");
            stmt = c.prepareStatement(findID);
            stmt.setString(1, username);
            rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
            }
            stmt = c.prepareStatement(update);
            stmt.setString(1, editPass);
            stmt.setInt(2, id);
            stmt.setString(3, editIndex);
            stmt.executeUpdate();
            stmt.close();            
        }catch (Exception e){
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
    }
}


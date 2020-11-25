package com.test.atm;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1.取款
 * 2.存款
 * 3.转账
 * 4.查询余额
 * 5.修改密码
 * 6.退卡
 */


/**
 * |card_id             |card_pwd  |user_name |balance     |
 * |--------------------|----------|----------|------------|
 * |6512425382          |147852    |王         |11110.0     |
 * |6515473334          |123456    |钱         |5300.0      |
 * |6515536334          |147852    |孙         |1230.0      |
 * |6515553345          |147852    |周         |9640.0      |
 * |6515555143          |147852    |李         |5550.0      |
 * |6545521562          |147852    |吴         |5330.0      |
 * |6554453562          |147852    |郑         |532.0       |
 */

public class MessageDB {
    private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/atmDB?useSSL=false";

    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static PreparedStatement preparedStatement = null;

    /**
     * 查询
     *
     * @param id
     * @param pwd
     * @return
     */
    public static ArrayList selectResult(String id, String pwd) {//String id,String pwd
        ResultSet resultSet = null;
        ArrayList userMessage = new ArrayList();
        Connection connection = null;
        try {
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(MYSQL_URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement("select * from user_message where card_id=? and card_pwd=?");
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, pwd);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
//                System.out.println(resultSet.getString("card_id"));
                userMessage.add(resultSet.getString("card_id"));
                userMessage.add("******");
                userMessage.add(resultSet.getString("user_name"));
                userMessage.add(resultSet.getFloat("balance"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException drawables) {
                drawables.printStackTrace();
            }
        }

        return userMessage;
    }

    /**
     * 存取款
     *
     * @param id
     * @param pwd
     */
    public static ArrayList updateContent(String id, String pwd, Float amount) {
        Connection connection = null;
        try {
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(MYSQL_URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement("update user_message set balance = balance + ? where card_id = ? and card_pwd = ?");
            preparedStatement.setFloat(1, amount);
            preparedStatement.setString(2, id);
            preparedStatement.setString(3, pwd);
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException drawables) {
                drawables.printStackTrace();
            }
        }
        return selectResult(id, pwd);
    }

    /**
     * 转账
     *
     * @param id
     * @param pwd
     * @param aimId
     * @param amount
     * @return
     */
    public static ArrayList transferAccounts(String id, String pwd, String aimId, Float amount) {
        Connection connection = null;
        try {
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(MYSQL_URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement("update user_message set balance = balance + ? where card_id = ? and card_pwd = ?");
            preparedStatement.setFloat(1, amount * (-1));
            preparedStatement.setString(2, id);
            preparedStatement.setString(3, pwd);
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("update user_message set balance = balance + ? where card_id = ?");
            preparedStatement.setFloat(1, amount);
            preparedStatement.setString(2, aimId);
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException drawables) {
                drawables.printStackTrace();
            }
        }
        return selectResult(id, pwd);
    }

    /**
     * 修改密码
     */
    public static void updatePassword(String id, String oldPwd, String newPwd) {
        Connection connection = null;
        try {
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(MYSQL_URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement("update user_message set card_pwd where card_id = ? and card_pwd = ?");
            preparedStatement.setString(1, newPwd);
            preparedStatement.setString(2, id);
            preparedStatement.setString(3, oldPwd);
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException drawables) {
                drawables.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList resultSet = new ArrayList();
        int count = 0;
        float money = 0;
        String userId = null;
        String userPwd = null;
        System.out.println(resultSet);
////        resultSet = updateContent("6515536334","147852", (float) -500);
//        resultSet = transferAccounts("6512425382","147852" ,"6515536334", (float) 1000);
//        System.out.println(resultSet);
//        resultSet = selectResult("6515536334","147852");
//        System.out.println(resultSet);
        Scanner scan = new Scanner(System.in);
        System.out.println("*************************");
        System.out.println("**********ATM机**********");
        System.out.println("*************************");
        while (count < 4) {
            userId = scan.nextLine();
            userPwd = scan.nextLine();
            resultSet = selectResult(userId, userPwd);
            count++;
            if (selectResult(userId, userPwd).size() <= 0) {
                System.out.println("账号或密码错误，请重新输入！");
                continue;
            }
            while (true) {
                System.out.println("-------------------------");
                System.out.println("|[1]存款|[2]取款|[3]查询余额|");
                System.out.println("-------------------------");
                System.out.println("|[4]转账|[5]退卡|[6]修改密码|");
                System.out.println("--------------------------");
                System.out.print("功能:");
                int func = scan.nextInt();
                scan.nextLine();
                switch (func) {
                    case 1://存款
                        System.out.print("存款金额:");
                        money = scan.nextFloat();
                        scan.nextLine();
                        resultSet = updateContent(userId, userPwd, money);
                        System.out.println("-------------------------");
                        System.out.println("|账号:" + resultSet.get(0) + "|");
                        System.out.println("-------------------------");
                        System.out.println("|用户:"+resultSet.get(2)+"|余额:"+resultSet);
                        System.out.println("--------------------------");
                        break;
                    case 2://取款
                        System.out.print("取款金额:");
                        money = scan.nextFloat();
                        scan.nextLine();
                        resultSet = updateContent(userId, userPwd, money * (-1));
                        break;
                    case 3://查询余额
                        resultSet = selectResult(userId, userPwd);
                        break;
                    case 4://转账
                        System.out.println("目标账户:");
                        String aimId = scan.nextLine();
                        System.out.println("转账金额:");
                        money = scan.nextFloat();
                        scan.nextLine();
                        resultSet = transferAccounts(userId, userPwd, aimId, money);
                        break;
                    case 5://退卡
                        System.exit(0);
                    case 6://修改密码
                        System.out.print("输入新密码:");
                        String newPwd = scan.nextLine();
                        System.out.print("确认新密码:");
                        String reNewPwd = scan.nextLine();
                        if (newPwd.equals(reNewPwd)) {
                            updatePassword(userId, userPwd, newPwd);
                        }
                        break;
                }
            }
        }
    }
}

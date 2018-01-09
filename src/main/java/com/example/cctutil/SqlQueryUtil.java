package com.example.cctutil;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * 通过sql公共查询方法
 */
public class SqlQueryUtil {

    /**
     * 查询语句
     */
    String querySQL;
    /**
     * 数据库连接
     */
    Connection conn;

    PreparedStatement statement = null;

    @Autowired
    private SqlSession sqlSession;

    public SqlQueryUtil() {
        super();
    }

    public Vector query() throws RuntimeException {
        Statement stmt = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        Vector rtnVector = new Vector();
        int cols;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(querySQL);
            rsmd = rs.getMetaData();
            cols = rsmd.getColumnCount();

            while (rs.next()) {
                HashMap hm = new HashMap();
                for (int j = 1; j <= cols; j++) {
                    if (rsmd.getColumnTypeName(j).equals("BLOB") || rsmd.getColumnTypeName(j).equals("CLOB"))
                        continue;
                    hm.put((rsmd.getColumnName(j)).toLowerCase(), rs.getString(j));
                }
                rtnVector.add(hm);
            }
        } catch (Exception e) {
            throw new RuntimeException("查询失败", e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex.toString());
            }
        }
        return rtnVector;
    }

    /**
     * @param sql 拼装的sql语句
     * @return List<HashMap>
     */
    @SuppressWarnings ( "unchecked" )
    public static List<HashMap> getQueryInfoByManulSQL(String sql) {
        SqlQueryUtil query = new SqlQueryUtil();
        query.setConnection(query.getSqlSession().getConnection());
        query.setQuerySQL(sql);
        Vector<?> vector = query.query();
        Iterator<?> iterator = vector.iterator();
        List<HashMap> hmLst = new java.util.ArrayList<HashMap>();
        while (iterator.hasNext()) {
            HashMap tmp = (HashMap) iterator.next();
            hmLst.add(tmp);
        }
        return hmLst;
    }

    /**
     * @param connection
     */
    public void setConnection(Connection connection) {
        conn = connection;
    }

    /**
     * @param string
     */
    public void setQuerySQL(String string) {
        querySQL = string;
    }


    public SqlSession getSqlSession() {
        return sqlSession;
    }
}

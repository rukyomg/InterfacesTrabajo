package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {
	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM usuarios");
			
			while (rs.next()) {
				String NOMBRE = rs.getString(1);
				String EMAIL = rs.getString(2);
				String TELLEFONO = rs.getString(3);
				String REGION = rs.getString(4);
				String CONTRASEÑA = rs.getString(4);
				
				System.out.println(NOMBRE + " - " + EMAIL + " - " + TELLEFONO +" - " + REGION + " - " + CONTRASEÑA );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("INSERT INTO usuarios(NOMBRE,EMAIL,TELLEFONO, REGION,CONTRASEÑA) VALUES (?,?,?,?)");
			stm2.setString(1 , "pepe");
			stm2.setString(2 , "Pepe@gmail.com");
			stm2.setString(3 , "123444435");
			stm2.setString(4, "Germany");
			stm2.setString(4, "holahola");
			
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("UPDATE usuarios SET Nombre = ?  WHERE DNI = ?");
			stm2.setString(1 , "Pepe");
			stm2.setString(2 , "12345h");
			
			
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
//		try {
//			cn = conexion.conectar();
//			PreparedStatement stm2 = cn.prepareStatement("DELETE FROM usuarios  WHERE DNI = ?");
//			stm2.setString(1 , "12345h");
//			
//			
//			stm2.executeUpdate();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			
//		} finally {
//			try {
//				if (rs!= null) {
//					rs.close();
//				}
//				
//				if (stm != null) {
//					stm.close();
//				}
//				
//				if (cn != null) {
//					cn.close();
//				}
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		
//	}
//}
